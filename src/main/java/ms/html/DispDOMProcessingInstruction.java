package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispDOMProcessingInstruction extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "nodeType"
   * </p>
   */

  @DISPID(-2147417066)
  @PropGet
  int nodeType();


  /**
   * <p>
   * Getter method for the COM property "parentNode"
   * </p>
   */

  @DISPID(-2147417065)
  @PropGet
  ms.html.IHTMLDOMNode parentNode();


  /**
   */

  @DISPID(-2147417064)
  boolean hasChildNodes();


  /**
   * <p>
   * Getter method for the COM property "childNodes"
   * </p>
   */

  @DISPID(-2147417063)
  @PropGet
  com4j.Com4jObject childNodes();


  /**
   * <p>
   * Getter method for the COM property "attributes"
   * </p>
   */

  @DISPID(-2147417062)
  @PropGet
  com4j.Com4jObject attributes();


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param refChild Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-2147417061)
  ms.html.IHTMLDOMNode insertBefore(
    ms.html.IHTMLDOMNode newChild,
    @Optional java.lang.Object refChild);


  /**
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147417060)
  ms.html.IHTMLDOMNode removeChild(
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147417059)
  ms.html.IHTMLDOMNode replaceChild(
    ms.html.IHTMLDOMNode newChild,
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param fDeep Mandatory boolean parameter.
   */

  @DISPID(-2147417051)
  ms.html.IHTMLDOMNode cloneNode(
    boolean fDeep);


  /**
   * @param fDeep Optional parameter. Default value is false
   */

  @DISPID(-2147417046)
  ms.html.IHTMLDOMNode removeNode(
    @Optional @DefaultValue("0") boolean fDeep);


  /**
   * @param otherNode Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147417044)
  ms.html.IHTMLDOMNode swapNode(
    ms.html.IHTMLDOMNode otherNode);


  /**
   * @param replacement Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147417045)
  ms.html.IHTMLDOMNode replaceNode(
    ms.html.IHTMLDOMNode replacement);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147417039)
  ms.html.IHTMLDOMNode appendChild(
    ms.html.IHTMLDOMNode newChild);


  /**
   * <p>
   * Getter method for the COM property "nodeName"
   * </p>
   */

  @DISPID(-2147417038)
  @PropGet
  java.lang.String nodeName();


  /**
   * <p>
   * Setter method for the COM property "nodeValue"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147417037)
  @PropPut
  void nodeValue(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "nodeValue"
   * </p>
   */

  @DISPID(-2147417037)
  @PropGet
  java.lang.Object nodeValue();


  /**
   * <p>
   * Getter method for the COM property "firstChild"
   * </p>
   */

  @DISPID(-2147417036)
  @PropGet
  ms.html.IHTMLDOMNode firstChild();


  /**
   * <p>
   * Getter method for the COM property "lastChild"
   * </p>
   */

  @DISPID(-2147417035)
  @PropGet
  ms.html.IHTMLDOMNode lastChild();


  /**
   * <p>
   * Getter method for the COM property "previousSibling"
   * </p>
   */

  @DISPID(-2147417034)
  @PropGet
  ms.html.IHTMLDOMNode previousSibling();


  /**
   * <p>
   * Getter method for the COM property "nextSibling"
   * </p>
   */

  @DISPID(-2147417033)
  @PropGet
  ms.html.IHTMLDOMNode nextSibling();


  /**
   * <p>
   * Getter method for the COM property "ownerDocument"
   * </p>
   */

  @DISPID(-2147416999)
  @PropGet
  com4j.Com4jObject ownerDocument();


  /**
   * <p>
   * Setter method for the COM property "prefix"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416992)
  @PropPut
  void prefix(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "prefix"
   * </p>
   */

  @DISPID(-2147416992)
  @PropGet
  java.lang.Object prefix();


  /**
   * <p>
   * Getter method for the COM property "localName"
   * </p>
   */

  @DISPID(-2147416994)
  @PropGet
  java.lang.Object localName();


  /**
   * <p>
   * Getter method for the COM property "namespaceURI"
   * </p>
   */

  @DISPID(-2147416993)
  @PropGet
  java.lang.Object namespaceURI();


  /**
   * <p>
   * Setter method for the COM property "textContent"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416985)
  @PropPut
  void textContent(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "textContent"
   * </p>
   */

  @DISPID(-2147416985)
  @PropGet
  java.lang.Object textContent();


  /**
   * @param otherNode Mandatory ms.html.IHTMLDOMNode3 parameter.
   */

  @DISPID(-2147416991)
  boolean isEqualNode(
    ms.html.IHTMLDOMNode3 otherNode);


  /**
   * @param pvarPrefix Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416990)
  java.lang.Object lookupNamespaceURI(
    java.lang.Object pvarPrefix);


  /**
   * @param pvarNamespaceURI Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416989)
  java.lang.Object lookupPrefix(
    java.lang.Object pvarNamespaceURI);


  /**
   * @param pvarNamespace Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416988)
  boolean isDefaultNamespace(
    java.lang.Object pvarNamespace);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147416844)
  ms.html.IHTMLDOMNode ie9_appendChild(
    ms.html.IHTMLDOMNode newChild);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param refChild Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-2147416843)
  ms.html.IHTMLDOMNode ie9_insertBefore(
    ms.html.IHTMLDOMNode newChild,
    @Optional java.lang.Object refChild);


  /**
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147416842)
  ms.html.IHTMLDOMNode ie9_removeChild(
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147416841)
  ms.html.IHTMLDOMNode ie9_replaceChild(
    ms.html.IHTMLDOMNode newChild,
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param otherNode Mandatory ms.html.IHTMLDOMNode3 parameter.
   */

  @DISPID(-2147416987)
  boolean isSameNode(
    ms.html.IHTMLDOMNode3 otherNode);


  /**
   * @param otherNode Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147416986)
  short compareDocumentPosition(
    ms.html.IHTMLDOMNode otherNode);


  /**
   * @param feature Mandatory java.lang.String parameter.
   * @param version Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416835)
  boolean isSupported(
    java.lang.String feature,
    java.lang.Object version);


  /**
   * <p>
   * Getter method for the COM property "target"
   * </p>
   */

  @DISPID(1000)
  @PropGet
  java.lang.String target();


  /**
   * <p>
   * Setter method for the COM property "data"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1001)
  @PropPut
  void data(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "data"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  java.lang.String data();


  // Properties:
}
