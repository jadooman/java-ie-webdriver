package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLDOMRange extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "startContainer"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  ms.html.IHTMLDOMNode startContainer();


  /**
   * <p>
   * Getter method for the COM property "startOffset"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  int startOffset();


  /**
   * <p>
   * Getter method for the COM property "endContainer"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  ms.html.IHTMLDOMNode endContainer();


  /**
   * <p>
   * Getter method for the COM property "endOffset"
   * </p>
   */

  @DISPID(1004)
  @PropGet
  int endOffset();


  /**
   * <p>
   * Getter method for the COM property "collapsed"
   * </p>
   */

  @DISPID(1005)
  @PropGet
  boolean collapsed();


  /**
   * <p>
   * Getter method for the COM property "commonAncestorContainer"
   * </p>
   */

  @DISPID(1006)
  @PropGet
  ms.html.IHTMLDOMNode commonAncestorContainer();


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   * @param offset Mandatory int parameter.
   */

  @DISPID(1007)
  void setStart(
    com4j.Com4jObject refNode,
    int offset);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   * @param offset Mandatory int parameter.
   */

  @DISPID(1008)
  void setEnd(
    com4j.Com4jObject refNode,
    int offset);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1009)
  void setStartBefore(
    com4j.Com4jObject refNode);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1010)
  void setStartAfter(
    com4j.Com4jObject refNode);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1011)
  void setEndBefore(
    com4j.Com4jObject refNode);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1012)
  void setEndAfter(
    com4j.Com4jObject refNode);


  /**
   * @param toStart Mandatory boolean parameter.
   */

  @DISPID(1013)
  void collapse(
    boolean toStart);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1014)
  void selectNode(
    com4j.Com4jObject refNode);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1015)
  void selectNodeContents(
    com4j.Com4jObject refNode);


  /**
   * @param how Mandatory short parameter.
   * @param sourceRange Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1016)
  int compareBoundaryPoints(
    short how,
    com4j.Com4jObject sourceRange);


  /**
   */

  @DISPID(1017)
  void deleteContents();


  /**
   */

  @DISPID(1018)
  com4j.Com4jObject extractContents();


  /**
   */

  @DISPID(1019)
  com4j.Com4jObject cloneContents();


  /**
   * @param newNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1020)
  void insertNode(
    com4j.Com4jObject newNode);


  /**
   * @param newParent Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1021)
  void surroundContents(
    com4j.Com4jObject newParent);


  /**
   */

  @DISPID(1022)
  ms.html.IHTMLDOMRange cloneRange();


  /**
   */

  @DISPID(1023)
  java.lang.String toString_();


  /**
   */

  @DISPID(1024)
  void detach();


  /**
   */

  @DISPID(1025)
  ms.html.IHTMLRectCollection getClientRects();


  /**
   */

  @DISPID(1026)
  ms.html.IHTMLRect getBoundingClientRect();


  // Properties:
}
