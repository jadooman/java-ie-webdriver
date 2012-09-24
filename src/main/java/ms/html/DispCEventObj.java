package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispCEventObj extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "returnValue"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1007)
  @PropPut
  void returnValue(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "returnValue"
   * </p>
   */

  @DISPID(1007)
  @PropGet
  java.lang.Object returnValue();


  /**
   * <p>
   * Setter method for the COM property "cancelBubble"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1008)
  @PropPut
  void cancelBubble(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "cancelBubble"
   * </p>
   */

  @DISPID(1008)
  @PropGet
  boolean cancelBubble();


  /**
   * <p>
   * Setter method for the COM property "keyCode"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1011)
  @PropPut
  void keyCode(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "keyCode"
   * </p>
   */

  @DISPID(1011)
  @PropGet
  int keyCode();


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param attributeValue Mandatory java.lang.Object parameter.
   * @param lFlags Optional parameter. Default value is 1
   */

  @DISPID(-2147417611)
  void setAttribute(
    java.lang.String strAttributeName,
    java.lang.Object attributeValue,
    @Optional @DefaultValue("1") int lFlags);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param lFlags Optional parameter. Default value is 0
   */

  @DISPID(-2147417610)
  java.lang.Object getAttribute(
    java.lang.String strAttributeName,
    @Optional @DefaultValue("0") int lFlags);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param lFlags Optional parameter. Default value is 1
   */

  @DISPID(-2147417609)
  boolean removeAttribute(
    java.lang.String strAttributeName,
    @Optional @DefaultValue("1") int lFlags);


  /**
   * <p>
   * Setter method for the COM property "propertyName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1027)
  @PropPut
  void propertyName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "propertyName"
   * </p>
   */

  @DISPID(1027)
  @PropGet
  java.lang.String propertyName();


  /**
   * <p>
   * Setter method for the COM property "bookmarks"
   * </p>
   * @param rhs Mandatory ms.html.IHTMLBookmarkCollection parameter.
   */

  @DISPID(1031)
  @PropPut
  void bookmarks(
    ms.html.IHTMLBookmarkCollection rhs);


  /**
   * <p>
   * Getter method for the COM property "bookmarks"
   * </p>
   */

  @DISPID(1031)
  @PropGet
  ms.html.IHTMLBookmarkCollection bookmarks();


  /**
   * <p>
   * Setter method for the COM property "recordset"
   * </p>
   * @param rhs Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1032)
  @PropPut
  void recordset(
    com4j.Com4jObject rhs);


  /**
   * <p>
   * Getter method for the COM property "recordset"
   * </p>
   */

  @DISPID(1032)
  @PropGet
  com4j.Com4jObject recordset();


  /**
   * <p>
   * Setter method for the COM property "dataFld"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1033)
  @PropPut
  void dataFld(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "dataFld"
   * </p>
   */

  @DISPID(1033)
  @PropGet
  java.lang.String dataFld();


  /**
   * <p>
   * Setter method for the COM property "boundElements"
   * </p>
   * @param rhs Mandatory ms.html.IHTMLElementCollection parameter.
   */

  @DISPID(1034)
  @PropPut
  void boundElements(
    ms.html.IHTMLElementCollection rhs);


  /**
   * <p>
   * Getter method for the COM property "boundElements"
   * </p>
   */

  @DISPID(1034)
  @PropGet
  ms.html.IHTMLElementCollection boundElements();


  /**
   * <p>
   * Setter method for the COM property "repeat"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1035)
  @PropPut
  void repeat(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "repeat"
   * </p>
   */

  @DISPID(1035)
  @PropGet
  boolean repeat();


  /**
   * <p>
   * Setter method for the COM property "srcUrn"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1036)
  @PropPut
  void srcUrn(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "srcUrn"
   * </p>
   */

  @DISPID(1036)
  @PropGet
  java.lang.String srcUrn();


  /**
   * <p>
   * Setter method for the COM property "srcElement"
   * </p>
   * @param rhs Mandatory ms.html.IHTMLElement parameter.
   */

  @DISPID(1001)
  @PropPut
  void srcElement(
    ms.html.IHTMLElement rhs);


  /**
   * <p>
   * Getter method for the COM property "srcElement"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  ms.html.IHTMLElement srcElement();


  /**
   * <p>
   * Setter method for the COM property "altKey"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1002)
  @PropPut
  void altKey(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "altKey"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  boolean altKey();


  /**
   * <p>
   * Setter method for the COM property "ctrlKey"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1003)
  @PropPut
  void ctrlKey(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ctrlKey"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  boolean ctrlKey();


  /**
   * <p>
   * Setter method for the COM property "shiftKey"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1004)
  @PropPut
  void shiftKey(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "shiftKey"
   * </p>
   */

  @DISPID(1004)
  @PropGet
  boolean shiftKey();


  /**
   * <p>
   * Setter method for the COM property "fromElement"
   * </p>
   * @param rhs Mandatory ms.html.IHTMLElement parameter.
   */

  @DISPID(1009)
  @PropPut
  void fromElement(
    ms.html.IHTMLElement rhs);


  /**
   * <p>
   * Getter method for the COM property "fromElement"
   * </p>
   */

  @DISPID(1009)
  @PropGet
  ms.html.IHTMLElement fromElement();


  /**
   * <p>
   * Setter method for the COM property "toElement"
   * </p>
   * @param rhs Mandatory ms.html.IHTMLElement parameter.
   */

  @DISPID(1010)
  @PropPut
  void toElement(
    ms.html.IHTMLElement rhs);


  /**
   * <p>
   * Getter method for the COM property "toElement"
   * </p>
   */

  @DISPID(1010)
  @PropGet
  ms.html.IHTMLElement toElement();


  /**
   * <p>
   * Setter method for the COM property "button"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1012)
  @PropPut
  void button(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "button"
   * </p>
   */

  @DISPID(1012)
  @PropGet
  int button();


  /**
   * <p>
   * Setter method for the COM property "type"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1013)
  @PropPut
  void type(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   */

  @DISPID(1013)
  @PropGet
  java.lang.String type();


  /**
   * <p>
   * Setter method for the COM property "qualifier"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1014)
  @PropPut
  void qualifier(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "qualifier"
   * </p>
   */

  @DISPID(1014)
  @PropGet
  java.lang.String qualifier();


  /**
   * <p>
   * Setter method for the COM property "reason"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1015)
  @PropPut
  void reason(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "reason"
   * </p>
   */

  @DISPID(1015)
  @PropGet
  int reason();


  /**
   * <p>
   * Setter method for the COM property "x"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1005)
  @PropPut
  void x(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "x"
   * </p>
   */

  @DISPID(1005)
  @PropGet
  int x();


  /**
   * <p>
   * Setter method for the COM property "y"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1006)
  @PropPut
  void y(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "y"
   * </p>
   */

  @DISPID(1006)
  @PropGet
  int y();


  /**
   * <p>
   * Setter method for the COM property "clientX"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1020)
  @PropPut
  void clientX(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "clientX"
   * </p>
   */

  @DISPID(1020)
  @PropGet
  int clientX();


  /**
   * <p>
   * Setter method for the COM property "clientY"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1021)
  @PropPut
  void clientY(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "clientY"
   * </p>
   */

  @DISPID(1021)
  @PropGet
  int clientY();


  /**
   * <p>
   * Setter method for the COM property "offsetX"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1022)
  @PropPut
  void offsetX(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "offsetX"
   * </p>
   */

  @DISPID(1022)
  @PropGet
  int offsetX();


  /**
   * <p>
   * Setter method for the COM property "offsetY"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1023)
  @PropPut
  void offsetY(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "offsetY"
   * </p>
   */

  @DISPID(1023)
  @PropGet
  int offsetY();


  /**
   * <p>
   * Setter method for the COM property "screenX"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1024)
  @PropPut
  void screenX(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "screenX"
   * </p>
   */

  @DISPID(1024)
  @PropGet
  int screenX();


  /**
   * <p>
   * Setter method for the COM property "screenY"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1025)
  @PropPut
  void screenY(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "screenY"
   * </p>
   */

  @DISPID(1025)
  @PropGet
  int screenY();


  /**
   * <p>
   * Setter method for the COM property "srcFilter"
   * </p>
   * @param rhs Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1026)
  @PropPut
  void srcFilter(
    com4j.Com4jObject rhs);


  /**
   * <p>
   * Getter method for the COM property "srcFilter"
   * </p>
   */

  @DISPID(1026)
  @PropGet
  com4j.Com4jObject srcFilter();


  /**
   * <p>
   * Getter method for the COM property "dataTransfer"
   * </p>
   */

  @DISPID(1037)
  @PropGet
  ms.html.IHTMLDataTransfer dataTransfer();


  /**
   * <p>
   * Getter method for the COM property "contentOverflow"
   * </p>
   */

  @DISPID(1038)
  @PropGet
  boolean contentOverflow();


  /**
   * <p>
   * Setter method for the COM property "shiftLeft"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1039)
  @PropPut
  void shiftLeft(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "shiftLeft"
   * </p>
   */

  @DISPID(1039)
  @PropGet
  boolean shiftLeft();


  /**
   * <p>
   * Setter method for the COM property "altLeft"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1040)
  @PropPut
  void altLeft(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "altLeft"
   * </p>
   */

  @DISPID(1040)
  @PropGet
  boolean altLeft();


  /**
   * <p>
   * Setter method for the COM property "ctrlLeft"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1041)
  @PropPut
  void ctrlLeft(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ctrlLeft"
   * </p>
   */

  @DISPID(1041)
  @PropGet
  boolean ctrlLeft();


  /**
   * <p>
   * Getter method for the COM property "imeCompositionChange"
   * </p>
   */

  @DISPID(1042)
  @PropGet
  long imeCompositionChange();


  /**
   * <p>
   * Getter method for the COM property "imeNotifyCommand"
   * </p>
   */

  @DISPID(1043)
  @PropGet
  long imeNotifyCommand();


  /**
   * <p>
   * Getter method for the COM property "imeNotifyData"
   * </p>
   */

  @DISPID(1044)
  @PropGet
  long imeNotifyData();


  /**
   * <p>
   * Getter method for the COM property "imeRequest"
   * </p>
   */

  @DISPID(1046)
  @PropGet
  long imeRequest();


  /**
   * <p>
   * Getter method for the COM property "imeRequestData"
   * </p>
   */

  @DISPID(1047)
  @PropGet
  long imeRequestData();


  /**
   * <p>
   * Getter method for the COM property "keyboardLayout"
   * </p>
   */

  @DISPID(1045)
  @PropGet
  long keyboardLayout();


  /**
   * <p>
   * Getter method for the COM property "behaviorCookie"
   * </p>
   */

  @DISPID(1048)
  @PropGet
  int behaviorCookie();


  /**
   * <p>
   * Getter method for the COM property "behaviorPart"
   * </p>
   */

  @DISPID(1049)
  @PropGet
  int behaviorPart();


  /**
   * <p>
   * Getter method for the COM property "nextPage"
   * </p>
   */

  @DISPID(1050)
  @PropGet
  java.lang.String nextPage();


  /**
   * <p>
   * Getter method for the COM property "wheelDelta"
   * </p>
   */

  @DISPID(1051)
  @PropGet
  int wheelDelta();


  /**
   * <p>
   * Setter method for the COM property "url"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1052)
  @PropPut
  void url(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "url"
   * </p>
   */

  @DISPID(1052)
  @PropGet
  java.lang.String url();


  /**
   * <p>
   * Setter method for the COM property "data"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1054)
  @PropPut
  void data(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "data"
   * </p>
   */

  @DISPID(1054)
  @PropGet
  java.lang.String data();


  /**
   * <p>
   * Getter method for the COM property "source"
   * </p>
   */

  @DISPID(1055)
  @PropGet
  com4j.Com4jObject source();


  /**
   * <p>
   * Setter method for the COM property "origin"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1053)
  @PropPut
  void origin(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "origin"
   * </p>
   */

  @DISPID(1053)
  @PropGet
  java.lang.String origin();


  /**
   * <p>
   * Setter method for the COM property "issession"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1056)
  @PropPut
  void issession(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "issession"
   * </p>
   */

  @DISPID(1056)
  @PropGet
  boolean issession();


  /**
   * <p>
   * Getter method for the COM property "actionURL"
   * </p>
   */

  @DISPID(1058)
  @PropGet
  java.lang.String actionURL();


  /**
   * <p>
   * Getter method for the COM property "buttonID"
   * </p>
   */

  @DISPID(1057)
  @PropGet
  int buttonID();


  /**
   * <p>
   * Getter method for the COM property "constructor"
   * </p>
   */

  @DISPID(-2147417603)
  @PropGet
  com4j.Com4jObject constructor();


  // Properties:
}
