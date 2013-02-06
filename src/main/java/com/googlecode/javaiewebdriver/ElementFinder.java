package com.googlecode.javaiewebdriver;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import ms.html.IHTMLDOMChildrenCollection;
import ms.html.IHTMLDOMNode;
import ms.html.IHTMLDocument3;
import ms.html.IHTMLElement;
import ms.html.IHTMLElement2;
import ms.html.IHTMLElementCollection;

import org.apache.log4j.Logger;
import org.cyberneko.html.parsers.DOMParser;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import se.fishtank.css.selectors.dom.DOMNodeSelector;

import com4j.ComException;

/**
 * Implements all the element finder logic for this web driver. XPath and CSS
 * finds are done via Java and all other types of finds are done via the IE
 * API's.
 */
public class ElementFinder
{
  private Logger logger = Logger.getLogger(ElementFinder.class);
  protected static final int TEXT_NODE_TYPE = 3;
  private JavaIEDriver driver;
  private IHTMLElement elem;
  private XPath xpath = XPathFactory.newInstance().newXPath();

  public ElementFinder(JavaIEDriver driver)
  {
    this.driver = driver;
  }

  public ElementFinder(JavaIEDriver driver, IHTMLElement elem)
  {
    this.driver = driver;
    this.elem = elem;
  }

  public WebElement findElement(FindType type, String what, long implicitWait)
  {
    long end = System.currentTimeMillis() + implicitWait;
    do
    {
      try
      {
        List<WebElement> elems = findElementsNoSleep(type, what);
        if (elems.size() > 0)
        {
          return elems.get(0);
        }
      }
      catch (ComException e)
      {
        logger.warn("ComException while searching for element: " + what, e);
      }
      JavaIEDriver.sleep(JavaIEDriver.WAIT_FOR_IDLE_SLEEP);
    }
    while (System.currentTimeMillis() < end);
    throw new NoSuchElementException(type.name() + ":" + what);
  }

  public List<WebElement> findElements(FindType type, String what, long implicitWait)
  {
    try
    {
      long end = System.currentTimeMillis() + implicitWait;
      List<WebElement> elems = null;
      do
      {
        try
        {
          elems = findElementsNoSleep(type, what);
          if (elems.size() > 0)
          {
            return elems;
          }
        }
        catch (ComException e)
        {
          logger.warn("ComException while searching for element: " + what, e);
          throw new WebDriverException(e.getMessage(), e);
        }
        JavaIEDriver.sleep(JavaIEDriver.WAIT_FOR_IDLE_SLEEP);
      }
      while (System.currentTimeMillis() < end);
      return elems;
    }
    catch (Exception e)
    {
      throw new WebDriverException(e.getMessage(), e);
    }
  }

  public List<WebElement> findElementsNoSleep(FindType type, String what)
  {
    List<WebElement> retVal = new LinkedList<WebElement>();
    if (type == FindType.ID)
    {
      IHTMLElement htmlElem = driver.getDocument3().getElementById(what);
      if (htmlElem != null)
      {
        WebElement elem = new JavaIEWebElement(driver, htmlElem);
        retVal.add(elem);
      }
    }
    else if (type == FindType.TAG_NAME)
    {
      IHTMLElementCollection elems;
      if (elem != null)
      {
        elems = elem.queryInterface(IHTMLElement2.class).getElementsByTagName(what);
      }
      else
      {
        elems = driver.getDocument3().getElementsByTagName(what);
      }
      retVal.addAll(toList(elems));
    }
    else if (type == FindType.LINK_TEXT)
    {
      IHTMLElementCollection all = driver.getDocument2().all();
      List<WebElement> elems = findWithText(all, elem, what);
      retVal.addAll(elems);
    }
    else if (type == FindType.PARTIAL_LINK_TEXT)
    {
      IHTMLElementCollection all = driver.getDocument2().all();
      List<WebElement> elems = findWithPartialText(all, elem, what);
      retVal.addAll(elems);
    }
    else if (type == FindType.NAME)
    {
      IHTMLElementCollection elems = driver.getDocument3().getElementsByName(what);
      retVal.addAll(toList(elems));
    }
    else if (type == FindType.CSS)
    {
      try
      {
        IHTMLDocument3 doc3 = driver.getDocument3();
        String pageSource = driver.getPageSource();
        DOMParser parser = new DOMParser();
        parser.parse(new InputSource(new StringReader(pageSource)));
        Document htmlDoc = parser.getDocument();
        Element parentElem;
        if (elem == null)
        {
          parentElem = htmlDoc.getDocumentElement();
        }
        else
        {
          int index = elem.sourceIndex();
          parentElem = getAllElements(htmlDoc).get(index);
          if (!parentElem.getTagName().equals(elem.tagName()))
          {
            throw new WebDriverException("Unable to match IE DOM element to Java DOM element!");
          }
        }
        List<Element> elements = findCSS(parentElem, what);
        for (Element elem : elements)
        {
          WebElement webElem = findElement(doc3, htmlDoc, elem);
          if (webElem != null)
          {
            retVal.add(webElem);
          }
        }
      }
      catch (Exception e)
      {
        throw new WebDriverException(e.getMessage(), e);
      }
    }
    else if (type == FindType.XPATH)
    {
      try
      {
        IHTMLDocument3 doc3 = driver.getDocument3();
        String pageSource = driver.getPageSource();
        DOMParser parser = new DOMParser();
        parser.parse(new InputSource(new StringReader(pageSource)));
        Document htmlDoc = parser.getDocument();
        Element parentElem;
        if (elem == null)
        {
          parentElem = htmlDoc.getDocumentElement();
        }
        else
        {
          int index = elem.sourceIndex();
          parentElem = getAllElements(htmlDoc).get(index);
          if (!elem.tagName().equals(parentElem.getTagName()))
          {
            String id = elem.id();
            if (id != null && !id.equals(""))
            {
              parentElem = htmlDoc.getElementById(id);
            }
            else
            {
              throw new WebDriverException("Fatal Error: IE/Java DOM Element mismatch!");
            }
          }
        }
        List<Element> elements = findXPath(parentElem, what);
        for (Element elem : elements)
        {
          WebElement webElem = findElement(doc3, htmlDoc, elem);
          if (webElem != null)
          {
            retVal.add(webElem);
          }
        }
      }
      catch (Exception e)
      {
        throw new WebDriverException(e.getMessage(), e);
      }
    }
    return retVal;
  }

  protected List<Element> getAllElements(Document javaDoc)
  {
    List<Element> returnList = new LinkedList<Element>();
    NodeList list = javaDoc.getElementsByTagName("*");
    for (int i = 0; i < list.getLength(); i++)
    {
      Node node = list.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE)
      {
        returnList.add((Element) node);
      }
    }
    return returnList;
  }

  protected WebElement findElement(IHTMLDocument3 ieDoc, Document javaDoc, Element elem)
  {
    try
    {
      IHTMLElementCollection ieElems = ieDoc.getElementsByTagName(elem.getTagName());
      NodeList list = javaDoc.getElementsByTagName(elem.getTagName());
      int index = -1;
      for (int i = 0; i < list.getLength(); i++)
      {
        if (elem.equals(list.item(i)))
        {
          index = i;
          break;
        }
      }
      IHTMLElement htmlElem = ieElems.item(index, null).queryInterface(IHTMLElement.class);
      return new JavaIEWebElement(driver, htmlElem);
    }
    catch (NullPointerException e)
    {
      return null;
    }
  }

  protected List<WebElement> toList(IHTMLElementCollection elems)
  {
    List<WebElement> list = new LinkedList<WebElement>();
    for (int i = 0; i < elems.length(); i++)
    {
      IHTMLElement elem = elems.item(i, null).queryInterface(IHTMLElement.class);
      list.add(new JavaIEWebElement(driver, elem));
    }
    return list;
  }

  /**
   * Only searches one DOM level deep to find the element text.
   */
  private String findFirstLevelInnerText(IHTMLElement elem)
  {
    IHTMLDOMNode domNode = elem.queryInterface(IHTMLDOMNode.class);
    IHTMLDOMChildrenCollection children = domNode.childNodes().queryInterface(
      IHTMLDOMChildrenCollection.class);
    StringBuilder text = new StringBuilder();
    for (int i = 0; i < children.length(); i++)
    {
      IHTMLDOMNode childNode = children.item(0).queryInterface(IHTMLDOMNode.class);
      if (childNode.nodeType() == TEXT_NODE_TYPE)
      {
        Object nodeValue = childNode.nodeValue();
        if (nodeValue != null)
        {
          text.append(childNode.nodeValue().toString());
        }
      }
    }
    return text.toString();
  }

  private List<WebElement> findWithPartialText(
    IHTMLElementCollection elems,
    IHTMLElement searchElement,
    String searchText)
  {
    List<WebElement> found = new LinkedList<WebElement>();
    for (int i = 0; i < elems.length(); i++)
    {
      IHTMLElement elem = elems.item(i, null).queryInterface(IHTMLElement.class);
      String elementText = findFirstLevelInnerText(elem);
      boolean matchesLinkText = elementText.contains(searchText);
      boolean elementContains = searchElement == null || searchElement.contains(elem);
      if (matchesLinkText && elementContains)
      {
        found.add(new JavaIEWebElement(driver, elem));
      }
    }
    return found;
  }

  private List<WebElement> findWithText(
    IHTMLElementCollection elems,
    IHTMLElement searchElement,
    String searchText)
  {
    List<WebElement> found = new LinkedList<WebElement>();
    for (int i = 0; i < elems.length(); i++)
    {
      IHTMLElement elem = elems.item(i, null).queryInterface(IHTMLElement.class);
      String elementText = findFirstLevelInnerText(elem);
      boolean matchesLinkText = elementText.equals(searchText);
      boolean elementContains = searchElement == null || searchElement.contains(elem);
      if (matchesLinkText && elementContains)
      {
        found.add(new JavaIEWebElement(driver, elem));
      }
    }
    return found;
  }

  public List<Element> findCSS(Element element, String what) throws Exception
  {
    List<Element> list = new ArrayList<Element>();
    DOMNodeSelector selector = new DOMNodeSelector(element);
    Set<Node> nodes = selector.querySelectorAll(what);
    for (Node node : nodes)
    {
      if (node.getNodeType() == Node.ELEMENT_NODE)
      {
        list.add((Element) node);
      }
    }
    return list;
  }

  public List<Element> findXPath(Element element, String what) throws Exception
  {
    List<Element> list = new ArrayList<Element>();
    NodeList nodeList = (NodeList) xpath.evaluate(what, element, XPathConstants.NODESET);
    for (int i = 0; i < nodeList.getLength(); i++)
    {
      Node node = nodeList.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE)
      {
        list.add((Element) node);
      }
    }
    return list;
  }
}
