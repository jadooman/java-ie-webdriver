package ms.html  ;

import com4j.*;

@IID("{3050F48B-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLEventObj2 extends Com4jObject {
  // Methods:
  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param attributeValue Mandatory java.lang.Object parameter.
   * @param lFlags Optional parameter. Default value is 1
   */

  @DISPID(-2147417611) //= 0x800101f5. The runtime will prefer the VTID if present
  @VTID(7)
  void setAttribute(
    java.lang.String strAttributeName,
    @MarshalAs(NativeType.VARIANT) java.lang.Object attributeValue,
    @Optional @DefaultValue("1") int lFlags);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param lFlags Optional parameter. Default value is 0
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147417610) //= 0x800101f6. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getAttribute(
    java.lang.String strAttributeName,
    @Optional @DefaultValue("0") int lFlags);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param lFlags Optional parameter. Default value is 1
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417609) //= 0x800101f7. The runtime will prefer the VTID if present
  @VTID(9)
  boolean removeAttribute(
    java.lang.String strAttributeName,
    @Optional @DefaultValue("1") int lFlags);


  /**
   * <p>
   * Setter method for the COM property "propertyName"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1027) //= 0x403. The runtime will prefer the VTID if present
  @VTID(10)
  void propertyName(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "propertyName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1027) //= 0x403. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String propertyName();


  /**
   * <p>
   * Setter method for the COM property "bookmarks"
   * </p>
   * @param p Mandatory ms.html.IHTMLBookmarkCollection parameter.
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(12)
  void bookmarks(
    ms.html.IHTMLBookmarkCollection p);


  /**
   * <p>
   * Getter method for the COM property "bookmarks"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLBookmarkCollection
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.IHTMLBookmarkCollection bookmarks();


  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={ms.html.IHTMLBookmarkCollection.class})
  java.lang.Object bookmarks(
    int index);

  /**
   * <p>
   * Setter method for the COM property "recordset"
   * </p>
   * @param p Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1032) //= 0x408. The runtime will prefer the VTID if present
  @VTID(14)
  void recordset(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject p);


  /**
   * <p>
   * Getter method for the COM property "recordset"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1032) //= 0x408. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject recordset();


  /**
   * <p>
   * Setter method for the COM property "dataFld"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1033) //= 0x409. The runtime will prefer the VTID if present
  @VTID(16)
  void dataFld(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "dataFld"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1033) //= 0x409. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String dataFld();


  /**
   * <p>
   * Setter method for the COM property "boundElements"
   * </p>
   * @param p Mandatory ms.html.IHTMLElementCollection parameter.
   */

  @DISPID(1034) //= 0x40a. The runtime will prefer the VTID if present
  @VTID(18)
  void boundElements(
    ms.html.IHTMLElementCollection p);


  /**
   * <p>
   * Getter method for the COM property "boundElements"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1034) //= 0x40a. The runtime will prefer the VTID if present
  @VTID(19)
  ms.html.IHTMLElementCollection boundElements();


  @VTID(19)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject boundElements(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Setter method for the COM property "repeat"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1035) //= 0x40b. The runtime will prefer the VTID if present
  @VTID(20)
  void repeat(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "repeat"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1035) //= 0x40b. The runtime will prefer the VTID if present
  @VTID(21)
  boolean repeat();


  /**
   * <p>
   * Setter method for the COM property "srcUrn"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1036) //= 0x40c. The runtime will prefer the VTID if present
  @VTID(22)
  void srcUrn(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "srcUrn"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1036) //= 0x40c. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String srcUrn();


  /**
   * <p>
   * Setter method for the COM property "srcElement"
   * </p>
   * @param p Mandatory ms.html.IHTMLElement parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(24)
  void srcElement(
    ms.html.IHTMLElement p);


  /**
   * <p>
   * Getter method for the COM property "srcElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(25)
  ms.html.IHTMLElement srcElement();


  /**
   * <p>
   * Setter method for the COM property "altKey"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(26)
  void altKey(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "altKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(27)
  boolean altKey();


  /**
   * <p>
   * Setter method for the COM property "ctrlKey"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(28)
  void ctrlKey(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "ctrlKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(29)
  boolean ctrlKey();


  /**
   * <p>
   * Setter method for the COM property "shiftKey"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(30)
  void shiftKey(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "shiftKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(31)
  boolean shiftKey();


  /**
   * <p>
   * Setter method for the COM property "fromElement"
   * </p>
   * @param p Mandatory ms.html.IHTMLElement parameter.
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(32)
  void fromElement(
    ms.html.IHTMLElement p);


  /**
   * <p>
   * Getter method for the COM property "fromElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(33)
  ms.html.IHTMLElement fromElement();


  /**
   * <p>
   * Setter method for the COM property "toElement"
   * </p>
   * @param p Mandatory ms.html.IHTMLElement parameter.
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(34)
  void toElement(
    ms.html.IHTMLElement p);


  /**
   * <p>
   * Getter method for the COM property "toElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(35)
  ms.html.IHTMLElement toElement();


  /**
   * <p>
   * Setter method for the COM property "button"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(36)
  void button(
    int p);


  /**
   * <p>
   * Getter method for the COM property "button"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(37)
  int button();


  /**
   * <p>
   * Setter method for the COM property "type"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(38)
  void type(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String type();


  /**
   * <p>
   * Setter method for the COM property "qualifier"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(40)
  void qualifier(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "qualifier"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String qualifier();


  /**
   * <p>
   * Setter method for the COM property "reason"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(42)
  void reason(
    int p);


  /**
   * <p>
   * Getter method for the COM property "reason"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(43)
  int reason();


  /**
   * <p>
   * Setter method for the COM property "x"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(44)
  void x(
    int p);


  /**
   * <p>
   * Getter method for the COM property "x"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(45)
  int x();


  /**
   * <p>
   * Setter method for the COM property "y"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(46)
  void y(
    int p);


  /**
   * <p>
   * Getter method for the COM property "y"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(47)
  int y();


  /**
   * <p>
   * Setter method for the COM property "clientX"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(48)
  void clientX(
    int p);


  /**
   * <p>
   * Getter method for the COM property "clientX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(49)
  int clientX();


  /**
   * <p>
   * Setter method for the COM property "clientY"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1021) //= 0x3fd. The runtime will prefer the VTID if present
  @VTID(50)
  void clientY(
    int p);


  /**
   * <p>
   * Getter method for the COM property "clientY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1021) //= 0x3fd. The runtime will prefer the VTID if present
  @VTID(51)
  int clientY();


  /**
   * <p>
   * Setter method for the COM property "offsetX"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1022) //= 0x3fe. The runtime will prefer the VTID if present
  @VTID(52)
  void offsetX(
    int p);


  /**
   * <p>
   * Getter method for the COM property "offsetX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1022) //= 0x3fe. The runtime will prefer the VTID if present
  @VTID(53)
  int offsetX();


  /**
   * <p>
   * Setter method for the COM property "offsetY"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1023) //= 0x3ff. The runtime will prefer the VTID if present
  @VTID(54)
  void offsetY(
    int p);


  /**
   * <p>
   * Getter method for the COM property "offsetY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1023) //= 0x3ff. The runtime will prefer the VTID if present
  @VTID(55)
  int offsetY();


  /**
   * <p>
   * Setter method for the COM property "screenX"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(56)
  void screenX(
    int p);


  /**
   * <p>
   * Getter method for the COM property "screenX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(57)
  int screenX();


  /**
   * <p>
   * Setter method for the COM property "screenY"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1025) //= 0x401. The runtime will prefer the VTID if present
  @VTID(58)
  void screenY(
    int p);


  /**
   * <p>
   * Getter method for the COM property "screenY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1025) //= 0x401. The runtime will prefer the VTID if present
  @VTID(59)
  int screenY();


  /**
   * <p>
   * Setter method for the COM property "srcFilter"
   * </p>
   * @param p Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1026) //= 0x402. The runtime will prefer the VTID if present
  @VTID(60)
  void srcFilter(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject p);


  /**
   * <p>
   * Getter method for the COM property "srcFilter"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1026) //= 0x402. The runtime will prefer the VTID if present
  @VTID(61)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject srcFilter();


  /**
   * <p>
   * Getter method for the COM property "dataTransfer"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDataTransfer
   */

  @DISPID(1037) //= 0x40d. The runtime will prefer the VTID if present
  @VTID(62)
  ms.html.IHTMLDataTransfer dataTransfer();


  // Properties:
}
