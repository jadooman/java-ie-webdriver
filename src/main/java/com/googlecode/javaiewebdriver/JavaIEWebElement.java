package com.googlecode.javaiewebdriver;

import java.util.List;

import ms.html.IHTMLElement;
import ms.html.IHTMLElement2;
import ms.html.IHTMLElement3;
import ms.html.IHTMLFormElement;
import ms.html.IHTMLInputElement;
import ms.html.IHTMLOptionElement;
import ms.html.IHTMLRect;
import ms.html.IHTMLTextAreaElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByCssSelector;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.internal.FindsByLinkText;
import org.openqa.selenium.internal.FindsByTagName;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.internal.WrapsDriver;


import com4j.ComException;

public class JavaIEWebElement
  implements WrapsDriver, FindsById, FindsByLinkText, FindsByXPath, FindsByTagName,
  FindsByCssSelector, WebElement
{
  protected static final int RETURN_AS_BSTR = 2;
  protected static final String HIDDEN_VISIBLE_STYLE = "none";

  private IHTMLElement watijElem;
  private ElementFinder finder;
  private JavaIEDriver driver;

  public JavaIEWebElement(JavaIEDriver driver, IHTMLElement watijElem)
  {
    this.driver = driver;
    this.watijElem = watijElem;
    this.finder = new ElementFinder(driver, watijElem);
  }

  public void focus()
  {
    watijElem.queryInterface(IHTMLElement2.class).focus();
  }

  @Override
  public void clear()
  {
    if ("textarea".equalsIgnoreCase(watijElem.tagName()))
    {
      watijElem.queryInterface(IHTMLTextAreaElement.class).value("");
    }
    else
    {
      watijElem.queryInterface(IHTMLInputElement.class).value("");
    }
  }

  @Override
  public void click()
  {
    try
    {
      if (isDisplayed())
      {
        if ("option".equalsIgnoreCase(watijElem.tagName()))
        {
          watijElem.parentElement().queryInterface(IHTMLElement2.class).focus();
          watijElem.queryInterface(IHTMLOptionElement.class).selected(true);
        }
        else
        {
          focus();
          watijElem.click();
        }
        driver.waitForIdle();
      }
    }
    catch (ComException e)
    {
      throw new WebDriverException(e.getMessage(), e);
    }
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
  public String getAttribute(String attr)
  {
    String value = null;
    if ("index".equals(attr))
    {
      IHTMLOptionElement option = watijElem.queryInterface(IHTMLOptionElement.class);
      value = Integer.toString(option.index());
    }
    else if ("text".equals(attr))
    {
      value = watijElem.innerText();
    }
    else if ("value".equals(attr))
    {
      if ("OPTION".equalsIgnoreCase(watijElem.tagName()))
      {
        value = watijElem.queryInterface(IHTMLOptionElement.class).value();
      }
      else if ("INPUT".equalsIgnoreCase(watijElem.tagName()))
      {
        watijElem.queryInterface(IHTMLInputElement.class).value();
      }
    }
    else
    {
      value = watijElem.getAttribute(attr, RETURN_AS_BSTR).toString();
    }
    return value;
  }

  @Override
  public String getCssValue(String cssAttr)
  {
    return watijElem.style().getAttribute(cssAttr, RETURN_AS_BSTR).toString();
  }

  @Override
  public Point getLocation()
  {
    IHTMLElement2 elem2 = watijElem.queryInterface(IHTMLElement2.class);
    IHTMLRect bounds = elem2.getBoundingClientRect();
    return new Point(bounds.left(), bounds.top());
  }

  @Override
  public Dimension getSize()
  {
    IHTMLElement2 elem2 = watijElem.queryInterface(IHTMLElement2.class);
    IHTMLRect bounds = elem2.getBoundingClientRect();
    return new Dimension(bounds.right() - bounds.left(), bounds.bottom() - bounds.top());
  }

  @Override
  public String getTagName()
  {
    return watijElem.tagName();
  }

  @Override
  public String getText()
  {
    return watijElem.innerText();
  }

  protected boolean isVisible(IHTMLElement elem)
  {
    if (elem.style() != null && HIDDEN_VISIBLE_STYLE.equals(elem.style().display()))
    {
      return false;
    }
    else
    {
      if (elem.parentElement() == null)
      {
        return true;
      }
      else
      {
        return isVisible(elem.parentElement());
      }
    }
  }

  @Override
  public boolean isDisplayed()
  {
    return isVisible(watijElem);
  }

  @Override
  public boolean isEnabled()
  {
    return !watijElem.queryInterface(IHTMLElement3.class).disabled();
  }

  @Override
  public boolean isSelected()
  {
    if ("input".equalsIgnoreCase(watijElem.tagName()))
    {
      return watijElem.queryInterface(IHTMLInputElement.class).checked();
    }
    else if ("option".equalsIgnoreCase(watijElem.tagName()))
    {
      return watijElem.queryInterface(IHTMLOptionElement.class).selected();
    }
    throw new UnsupportedOperationException(
      "Unable to determine if element is selected. Tag name is: " + watijElem.tagName());
  }

  @Override
  public void sendKeys(CharSequence... seqs)
  {
    StringBuilder builder = new StringBuilder();
    for (CharSequence seq : seqs)
    {
      builder.append(seq);
    }
    if ("textarea".equalsIgnoreCase(watijElem.tagName()))
    {
      IHTMLTextAreaElement textarea = watijElem.queryInterface(IHTMLTextAreaElement.class);
      textarea.value(builder.toString());
    }
    else if ("file".equals(watijElem.queryInterface(IHTMLInputElement.class).type()))
    {
      String path = builder.toString();
      ScriptRunner.runFileOkScript(path);
      watijElem.click();
    }
    else
    {
      IHTMLInputElement input = watijElem.queryInterface(IHTMLInputElement.class);
      input.value(builder.toString());
    }
  }

  @Override
  public void submit()
  {
    watijElem.queryInterface(IHTMLFormElement.class).submit();
  }

  @Override
  public WebElement findElementByCssSelector(String css)
  {
    return finder.findElement(FindType.CSS, css, driver.getImplicitWait());
  }

  @Override
  public List<WebElement> findElementsByCssSelector(String css)
  {
    return finder.findElements(FindType.CSS, css, driver.getImplicitWait());
  }

  @Override
  public WebElement findElementByTagName(String tagName)
  {
    return finder.findElement(FindType.TAG_NAME, tagName, driver.getImplicitWait());
  }

  @Override
  public List<WebElement> findElementsByTagName(String tagName)
  {
    return finder.findElements(FindType.TAG_NAME, tagName, driver.getImplicitWait());
  }

  @Override
  public WebElement findElementByXPath(String xpath)
  {
    xpath = XPathUtils.convertXPath(xpath);
    return finder.findElement(FindType.XPATH, xpath, driver.getImplicitWait());
  }

  @Override
  public List<WebElement> findElementsByXPath(String xpath)
  {
    xpath = XPathUtils.convertXPath(xpath);
    return finder.findElements(FindType.XPATH, xpath, driver.getImplicitWait());
  }

  @Override
  public WebElement findElementByLinkText(String linkText)
  {
    return finder.findElement(FindType.LINK_TEXT, linkText, driver.getImplicitWait());
  }

  @Override
  public WebElement findElementByPartialLinkText(String partialLinkText)
  {
    return finder.findElement(FindType.PARTIAL_LINK_TEXT, partialLinkText, driver.getImplicitWait());
  }

  @Override
  public List<WebElement> findElementsByLinkText(String linkText)
  {
    return finder.findElements(FindType.XPATH, linkText, driver.getImplicitWait());
  }

  @Override
  public List<WebElement> findElementsByPartialLinkText(String partialLinkText)
  {
    return finder.findElements(FindType.PARTIAL_LINK_TEXT, partialLinkText, driver.getImplicitWait());
  }

  @Override
  public WebElement findElementById(String id)
  {
    return finder.findElement(FindType.ID, id, driver.getImplicitWait());
  }

  @Override
  public List<WebElement> findElementsById(String id)
  {
    return finder.findElements(FindType.XPATH, id, driver.getImplicitWait());
  }

  @Override
  public WebDriver getWrappedDriver()
  {
    return driver;
  }
}
