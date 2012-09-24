package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLDOMAttribute extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "nodeName"
   * </p>
   */

  @DISPID(1000)
  @PropGet
  java.lang.String nodeName();


  /**
   * <p>
   * Setter method for the COM property "nodeValue"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1002)
  @PropPut
  void nodeValue(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "nodeValue"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  java.lang.Object nodeValue();


  /**
   * <p>
   * Getter method for the COM property "specified"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  boolean specified();


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1004)
  @PropPut
  void value(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   */

  @DISPID(1004)
  @PropGet
  java.lang.String value();


  /**
   * <p>
   * Getter method for the COM property "expando"
   * </p>
   */

  @DISPID(1005)
  @PropGet
  boolean expando();


  /**
   * <p>
   * Getter method for the COM property "nodeType"
   * </p>
   */

  @DISPID(1006)
  @PropGet
  int nodeType();


  /**
   * <p>
   * Getter method for the COM property "parentNode"
   * </p>
   */

  @DISPID(1007)
  @PropGet
  ms.html.IHTMLDOMNode parentNode();


  /**
   * <p>
   * Getter method for the COM property "childNodes"
   * </p>
   */

  @DISPID(1008)
  @PropGet
  com4j.Com4jObject childNodes();


  /**
   * <p>
   * Getter method for the COM property "firstChild"
   * </p>
   */

  @DISPID(1009)
  @PropGet
  ms.html.IHTMLDOMNode firstChild();


  /**
   * <p>
   * Getter method for the COM property "lastChild"
   * </p>
   */

  @DISPID(1010)
  @PropGet
  ms.html.IHTMLDOMNode lastChild();


  /**
   * <p>
   * Getter method for the COM property "previousSibling"
   * </p>
   */

  @DISPID(1011)
  @PropGet
  ms.html.IHTMLDOMNode previousSibling();


  /**
   * <p>
   * Getter method for the COM property "nextSibling"
   * </p>
   */

  @DISPID(1012)
  @PropGet
  ms.html.IHTMLDOMNode nextSibling();


  /**
   * <p>
   * Getter method for the COM property "attributes"
   * </p>
   */

  @DISPID(1013)
  @PropGet
  com4j.Com4jObject attributes();


  /**
   * <p>
   * Getter method for the COM property "ownerDocument"
   * </p>
   */

  @DISPID(1014)
  @PropGet
  com4j.Com4jObject ownerDocument();


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param refChild Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1015)
  ms.html.IHTMLDOMNode insertBefore(
    ms.html.IHTMLDOMNode newChild,
    @Optional java.lang.Object refChild);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(1016)
  ms.html.IHTMLDOMNode replaceChild(
    ms.html.IHTMLDOMNode newChild,
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(1017)
  ms.html.IHTMLDOMNode removeChild(
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(1018)
  ms.html.IHTMLDOMNode appendChild(
    ms.html.IHTMLDOMNode newChild);


  /**
   */

  @DISPID(1019)
  boolean hasChildNodes();


  /**
   * @param fDeep Mandatory boolean parameter.
   */

  @DISPID(1020)
  ms.html.IHTMLDOMAttribute cloneNode(
    boolean fDeep);


  /**
   * <p>
   * Setter method for the COM property "ie8_nodeValue"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1153)
  @PropPut
  void ie8_nodeValue(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ie8_nodeValue"
   * </p>
   */

  @DISPID(1153)
  @PropGet
  java.lang.Object ie8_nodeValue();


  /**
   * <p>
   * Setter method for the COM property "ie8_value"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1154)
  @PropPut
  void ie8_value(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ie8_value"
   * </p>
   */

  @DISPID(1154)
  @PropGet
  java.lang.String ie8_value();


  /**
   * <p>
   * Getter method for the COM property "ie8_specified"
   * </p>
   */

  @DISPID(1150)
  @PropGet
  boolean ie8_specified();


  /**
   * <p>
   * Getter method for the COM property "ownerElement"
   * </p>
   */

  @DISPID(1151)
  @PropGet
  ms.html.IHTMLElement2 ownerElement();


  /**
   * <p>
   * Setter method for the COM property "ie9_nodeValue"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1159)
  @PropPut
  void ie9_nodeValue(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ie9_nodeValue"
   * </p>
   */

  @DISPID(1159)
  @PropGet
  java.lang.Object ie9_nodeValue();


  /**
   * <p>
   * Getter method for the COM property "ie9_nodeName"
   * </p>
   */

  @DISPID(1160)
  @PropGet
  java.lang.String ie9_nodeName();


  /**
   * <p>
   * Getter method for the COM property "ie9_name"
   * </p>
   */

  @DISPID(1161)
  @PropGet
  java.lang.String ie9_name();


  /**
   * <p>
   * Setter method for the COM property "ie9_value"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1162)
  @PropPut
  void ie9_value(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ie9_value"
   * </p>
   */

  @DISPID(1162)
  @PropGet
  java.lang.String ie9_value();


  /**
   * <p>
   * Getter method for the COM property "ie9_firstChild"
   * </p>
   */

  @DISPID(1163)
  @PropGet
  ms.html.IHTMLDOMNode ie9_firstChild();


  /**
   * <p>
   * Getter method for the COM property "ie9_lastChild"
   * </p>
   */

  @DISPID(1164)
  @PropGet
  ms.html.IHTMLDOMNode ie9_lastChild();


  /**
   * <p>
   * Getter method for the COM property "ie9_childNodes"
   * </p>
   */

  @DISPID(1165)
  @PropGet
  com4j.Com4jObject ie9_childNodes();


  /**
   */

  @DISPID(1166)
  boolean hasAttributes();


  /**
   */

  @DISPID(1167)
  boolean ie9_hasChildNodes();


  /**
   */

  @DISPID(1170)
  void normalize();


  /**
   * <p>
   * Getter method for the COM property "ie9_specified"
   * </p>
   */

  @DISPID(1171)
  @PropGet
  boolean ie9_specified();


  /**
   * <p>
   * Getter method for the COM property "constructor"
   * </p>
   */

  @DISPID(-2147417603)
  @PropGet
  com4j.Com4jObject constructor();


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


  // Properties:
}
