package com.googlecode.javaiewebdriver;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import ms.html.IHTMLDocument2;
import ms.html.IHTMLDocument3;
import ms.html.IHTMLElement;
import ms.ie.ClassFactory;
import ms.ie.IWebBrowser2;
import ms.ie.tagREADYSTATE;

import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByCssSelector;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.internal.FindsByLinkText;
import org.openqa.selenium.internal.FindsByName;
import org.openqa.selenium.internal.FindsByTagName;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinDef.HWND;
import com4j.ComException;

public class JavaIEDriver
  implements WebDriver, FindsById, FindsByLinkText, FindsByXPath, FindsByName, FindsByCssSelector,
  FindsByTagName, JavascriptExecutor, TakesScreenshot
{
  private ScreenshotTaker screenTaker = new ScreenshotTaker();
  private ElementFinder finder = new ElementFinder(this);
  private IWebBrowser2 ie;
  protected static final int WAIT_FOR_IDLE_SLEEP = 500;
  protected static final int MAX_BUSY_LOOPS = 10;
  private long implicitWait = 0;
  private long scriptTimeout = 0;
  private long pageLoadTimeout = 0;

  public JavaIEDriver()
  {
    int retryCount = 0;
    boolean createSuccess = false;
    while (!createSuccess)
    {
      try
      {
        ie = ClassFactory.createInternetExplorerMedium();
        createSuccess = true;
      }
      catch (ComException e)
      {
        retryCount++;
        if (retryCount > 3)
        {
          throw e;
        }
        sleep(WAIT_FOR_IDLE_SLEEP);
      }
    }
    ie.visible(true);
    bringToFront();
  }

  public IWebBrowser2 getIE()
  {
    return ie;
  }

  public void bringToFront()
  {
    User32.INSTANCE.SetForegroundWindow(new WinDef.HWND(new Pointer(ie.hwnd())));
  }

  public void unminimize(HWND hwnd)
  {
    int SW_RESTORE = 9;
    if (User32Plus.INSTANCE.IsIconic(hwnd))
    {
      User32.INSTANCE.ShowWindow(hwnd, SW_RESTORE);
    }
  }

  protected long getImplicitWait()
  {
    return implicitWait;
  }

  public static Capabilities getCapabilities()
  {
    DesiredCapabilities capabilities = new DesiredCapabilities("ie", "1.0", Platform.getCurrent());

    capabilities.setJavascriptEnabled(true);
    capabilities.setCapability(CapabilityType.SUPPORTS_FINDING_BY_CSS, true);

    return capabilities;
  }

  protected void sleep(long sleepTime)
  {
    try
    {
      Thread.sleep(sleepTime);
    }
    catch (InterruptedException e)
    {
      throw new WebDriverException(e.getMessage(), e);
    }
  }

  @Override
  public void close()
  {
    getDocument2().parentWindow().close();
  }

  @Override
  public WebElement findElement(By by)
  {
    return by.findElement(this);
  }

  @Override
  public List<WebElement> findElements(By by)
  {
    return by.findElements(this);
  }

  @Override
  public void get(String url)
  {
    try
    {
      waitForIdle();
      ie.navigate(url, null, null, null, null);
    }
    catch (Exception e)
    {
      throw new WebDriverException(e.getMessage(), e);
    }
  }

  @Override
  public String getCurrentUrl()
  {
    try
    {
      return ie.locationURL();
    }
    catch (Exception e)
    {
      throw new WebDriverException(e.getMessage(), e);
    }
  }

  public IHTMLDocument2 getDocument2()
  {
    waitForIdle();
    return ie.document().queryInterface(IHTMLDocument2.class);
  }

  public IHTMLDocument3 getDocument3()
  {
    waitForIdle();
    return ie.document().queryInterface(IHTMLDocument3.class);
  }

  public void waitForIdle()
  {
    try
    {
      int loopCount = 0; // sometimes ie gets 'stuck'
      boolean ieReady = ie.readyState() == tagREADYSTATE.READYSTATE_COMPLETE;
      while ((ie.busy() || !ieReady) && loopCount < MAX_BUSY_LOOPS)
      {
        Thread.sleep(WAIT_FOR_IDLE_SLEEP);
        ieReady = ie.readyState() == tagREADYSTATE.READYSTATE_COMPLETE;
        loopCount++;
      }
    }
    catch (InterruptedException e)
    {
      throw new WebDriverException(e.getMessage(), e);
    }
  }

  @Override
  public String getPageSource()
  {
    try
    {
      waitForIdle();
      IHTMLDocument3 doc3 = getDocument3();
      return doc3.documentElement().outerHTML();
    }
    catch (NullPointerException e)
    {
      return "";
    }
  }

  @Override
  public String getTitle()
  {
    if (getDocument2() != null)
    {
      return getDocument2().title();
    }
    else
    {
      return "";
    }
  }

  @Override
  public Object executeScript(String script, Object... args)
  {
    try
    {
      waitForIdle();
      System.out.println("Executing script: " + script);
      for (Object obj : args)
      {
        System.out.println("arg: " + obj.getClass().getName() + " -> " + obj);
      }
      StringBuilder argsJS = new StringBuilder();
      argsJS.append("var arguments = [");
      for (int i = 0; i < args.length; i++)
      {
        if (args[0] instanceof JavaIEWebElement)
        {
          int index = 0; // sourceIndex
          argsJS.append("document.all[" + index + "]");
          if (i < args.length - 1)
          {
            argsJS.append(", ");
          }
        }
      }
      argsJS.append("];");
      if ("arguments[0].focus();".equals(script))
      {
        JavaIEWebElement webElement = (JavaIEWebElement) args[0];
        webElement.focus();
        return null;
      }
      else
      {
        waitForIdle();
        script = "function WEBDRIVER_EXEC_FUNC() {\n" + script + "\n}\n";
        script += "try { ";
        script += "document.documentElement.setAttribute('WEBDRIVER_EXEC_RESULTS', '' + WEBDRIVER_EXEC_FUNC())";
        script += " } catch (err) {}";
        getDocument2().parentWindow().execScript(script, "javascript");
        IHTMLDocument3 doc3 = getDocument3();
        Object results = null;
        if (doc3 != null)
        {
          IHTMLElement docElem = doc3.documentElement();
          if (docElem != null)
          {
            results = docElem.getAttribute("WEBDRIVER_EXEC_RESULTS", 2);
            if (results != null)
            {
              results = results.toString();
            }
            if ("true".equals(results))
            {
              results = Boolean.TRUE;
            }
            else if ("false".equals(results))
            {
              results = Boolean.FALSE;
            }
          }
        }
        return results;
      }
    }
    catch (Exception e)
    {
      throw new WebDriverException(e.getMessage(), e);
    }
  }

  @Override
  public Object executeAsyncScript(String script, Object... args)
  {
    return executeScript(script, args);
  }

  @Override
  public String getWindowHandle()
  {
    try
    {
      return String.valueOf(0);
    }
    catch (Exception e)
    {
      throw new WebDriverException(e.getMessage(), e);
    }
  }

  @Override
  public Set<String> getWindowHandles()
  {
    final Set<String> allHandles = new HashSet<String>();
    allHandles.add(String.valueOf(0));
    return allHandles;
  }

  @Override
  public Options manage()
  {
    return new WatijOptions();
  }

  private class WatijOptions implements Options
  {

    @Override
    public void addCookie(Cookie cookie)
    {
      throw new UnsupportedOperationException("cookies");
    }

    @Override
    public void deleteCookieNamed(String name)
    {
      throw new UnsupportedOperationException("cookies");
    }

    @Override
    public void deleteCookie(Cookie cookie)
    {
      throw new UnsupportedOperationException("cookies");
    }

    @Override
    public void deleteAllCookies()
    {
      throw new UnsupportedOperationException("cookies");
    }

    @Override
    public Set<Cookie> getCookies()
    {
      throw new UnsupportedOperationException("cookies");
    }

    @Override
    public Cookie getCookieNamed(String name)
    {
      throw new UnsupportedOperationException("cookies");
    }

    @Override
    public Timeouts timeouts()
    {
      return new WatijTimeouts();
    }

    @Override
    public ImeHandler ime()
    {
      throw new UnsupportedOperationException("ImeHandle not supported");
    }

    @Override
    public Window window()
    {
      return new WatijWindow();
    }

    private class WatijWindow implements Window
    {
      @Override
      public void setSize(Dimension targetSize)
      {
        try
        {
          ie.width(targetSize.width);
          ie.height(targetSize.height);
        }
        catch (Exception e)
        {
          throw new WebDriverException(e.getMessage(), e);
        }
      }

      @Override
      public void setPosition(Point targetPosition)
      {
        try
        {
          ie.left(targetPosition.x);
          ie.top(targetPosition.y);
        }
        catch (Exception e)
        {
          throw new WebDriverException(e.getMessage(), e);
        }
      }

      @Override
      public Dimension getSize()
      {
        try
        {
          return new Dimension(ie.width(), ie.height());
        }
        catch (Exception e)
        {
          throw new WebDriverException(e.getMessage(), e);
        }
      }

      @Override
      public Point getPosition()
      {
        try
        {
          return new Point(ie.left(), ie.top());
        }
        catch (Exception e)
        {
          throw new WebDriverException(e.getMessage(), e);
        }
      }

      @Override
      public void maximize()
      {
        try
        {
          Pointer p = new Pointer(ie.hwnd());
          int SW_MAXIMIZE = 3;
          User32.INSTANCE.ShowWindow(new HWND(p), SW_MAXIMIZE);
        }
        catch (Exception e)
        {
          throw new WebDriverException(e.getMessage(), e);
        }
      }
    }

    @Override
    public Logs logs()
    {
      throw new UnsupportedOperationException("logs");
    }
  }

  class WatijTimeouts implements Timeouts
  {
    public Timeouts implicitlyWait(long time, TimeUnit unit)
    {
      JavaIEDriver.this.implicitWait = TimeUnit.MILLISECONDS.convert(Math.max(0, time), unit);
      return this;
    }

    public Timeouts setScriptTimeout(long time, TimeUnit unit)
    {
      JavaIEDriver.this.scriptTimeout = TimeUnit.MILLISECONDS.convert(time, unit);
      return this;
    }

    public Timeouts pageLoadTimeout(long time, TimeUnit unit)
    {
      JavaIEDriver.this.pageLoadTimeout = TimeUnit.MILLISECONDS.convert(time, unit);
      return this;
    }
  }

  @Override
  public Navigation navigate()
  {
    return new WatijNavigation();
  }

  private class WatijNavigation implements Navigation
  {

    @Override
    public void back()
    {
      ie.goBack();
    }

    @Override
    public void forward()
    {
      ie.goForward();
    }

    @Override
    public void to(String url)
    {
      ie.navigate(url, null, null, null, null);
    }

    @Override
    public void to(URL url)
    {
      to(url.toString());
    }

    @Override
    public void refresh()
    {
      ie.refresh();
      waitForIdle();
    }
  }

  @Override
  public void quit()
  {
    ie.quit();
    ie.dispose();
    ie = null;
  }

  @Override
  public TargetLocator switchTo()
  {
    return new WatijTargetLocator();
  }

  private class WatijTargetLocator implements TargetLocator
  {
    @Override
    public WebDriver frame(int index)
    {
      return JavaIEDriver.this;
    }

    @Override
    public WebDriver frame(String nameOrId)
    {
      return JavaIEDriver.this;
    }

    @Override
    public WebDriver frame(WebElement frameElement)
    {
      return JavaIEDriver.this;
    }

    @Override
    public WebDriver window(String nameOrHandle)
    {
      return JavaIEDriver.this;
    }

    @Override
    public WebDriver defaultContent()
    {
      return JavaIEDriver.this;
    }

    @Override
    public WebElement activeElement()
    {
      try
      {
        IHTMLElement htmlElem = getDocument2().activeElement();
        if (htmlElem != null)
        {
          return new JavaIEWebElement(JavaIEDriver.this, htmlElem);
        }
        else
        {
          WebElement elem = findElementByTagName("body");
          if (elem != null)
          {
            return elem;
          }
        }
      }
      catch (Exception e)
      {
        throw new WebDriverException(e.getMessage(), e);
      }
      throw new NoSuchElementException("Unable to locate element with focus or body tag");
    }

    @Override
    public Alert alert()
    {
      throw new UnsupportedOperationException("alert()");
    }
  }

  @Override
  public WebElement findElementByTagName(String tagName)
  {
    return finder.findElement(FindType.TAG_NAME, tagName, implicitWait);
  }

  @Override
  public List<WebElement> findElementsByTagName(String tagName)
  {
    return finder.findElements(FindType.TAG_NAME, tagName, implicitWait);
  }

  @Override
  public WebElement findElementByCssSelector(String css)
  {
    return finder.findElement(FindType.CSS, css, implicitWait);
  }

  @Override
  public List<WebElement> findElementsByCssSelector(String css)
  {
    return finder.findElements(FindType.CSS, css, implicitWait);
  }

  @Override
  public WebElement findElementByName(String name)
  {
    return finder.findElement(FindType.NAME, name, implicitWait);
  }

  @Override
  public List<WebElement> findElementsByName(String name)
  {
    return finder.findElements(FindType.NAME, name, implicitWait);
  }

  @Override
  public WebElement findElementByXPath(String xpath)
  {
    xpath = XPathUtils.convertXPath(xpath);
    return finder.findElement(FindType.XPATH, xpath, implicitWait);
  }

  @Override
  public List<WebElement> findElementsByXPath(String xpath)
  {
    xpath = XPathUtils.convertXPath(xpath);
    return finder.findElements(FindType.XPATH, xpath, implicitWait);
  }

  @Override
  public WebElement findElementByLinkText(String linkText)
  {
    return finder.findElement(FindType.LINK_TEXT, linkText, implicitWait);
  }

  @Override
  public WebElement findElementByPartialLinkText(String partialLinkText)
  {
    return finder.findElement(FindType.PARTIAL_LINK_TEXT, partialLinkText, implicitWait);
  }

  @Override
  public List<WebElement> findElementsByLinkText(String linkText)
  {
    return finder.findElements(FindType.LINK_TEXT, linkText, implicitWait);
  }

  @Override
  public List<WebElement> findElementsByPartialLinkText(String partialLinkText)
  {
    return finder.findElements(FindType.PARTIAL_LINK_TEXT, partialLinkText, implicitWait);
  }

  @Override
  public WebElement findElementById(String id)
  {
    return finder.findElement(FindType.ID, id, implicitWait);
  }

  @Override
  public List<WebElement> findElementsById(String id)
  {
    return finder.findElements(FindType.ID, id, implicitWait);
  }

  @Override
  public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException
  {
    try
    {
      HWND winHandle = new HWND(new Pointer(ie.hwnd()));
      unminimize(winHandle);
      WindowFinder tabWindowClass = new WindowFinder("Internet Explorer_Server");
      User32Plus.INSTANCE.EnumChildWindows(winHandle, tabWindowClass, null);
      BufferedImage img = screenTaker.getScreenshot(tabWindowClass.getHwnd());
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      ImageIO.write(img, "png", baos);
      byte imgBytes[] = baos.toByteArray();
      byte img64[] = Base64.encodeBase64(imgBytes);
      return target.convertFromBase64Png(new String(img64, CharEncoding.US_ASCII));
    }
    catch (Exception e)
    {
      throw new WebDriverException(e.getMessage(), e);
    }
  }
}
