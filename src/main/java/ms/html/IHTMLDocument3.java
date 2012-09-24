package ms.html  ;

import com4j.*;

@IID("{3050F485-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDocument3 extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(1072) //= 0x430. The runtime will prefer the VTID if present
  @VTID(7)
  void releaseCapture();


  /**
   * @param fForce Optional parameter. Default value is false
   */

  @DISPID(1073) //= 0x431. The runtime will prefer the VTID if present
  @VTID(8)
  void recalc(
    @Optional @DefaultValue("0") boolean fForce);


  /**
   * @param text Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1074) //= 0x432. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLDOMNode createTextNode(
    java.lang.String text);


  /**
   * <p>
   * Getter method for the COM property "documentElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1075) //= 0x433. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLElement documentElement();


  /**
   * <p>
   * Getter method for the COM property "uniqueID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1077) //= 0x435. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String uniqueID();


  /**
   * @param event Mandatory java.lang.String parameter.
   * @param pdisp Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417605) //= 0x800101fb. The runtime will prefer the VTID if present
  @VTID(12)
  boolean attachEvent(
    java.lang.String event,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pdisp);


  /**
   * @param event Mandatory java.lang.String parameter.
   * @param pdisp Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147417604) //= 0x800101fc. The runtime will prefer the VTID if present
  @VTID(13)
  void detachEvent(
    java.lang.String event,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pdisp);


  /**
   * <p>
   * Setter method for the COM property "onrowsdelete"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412050) //= 0x800117ae. The runtime will prefer the VTID if present
  @VTID(14)
  void onrowsdelete(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onrowsdelete"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412050) //= 0x800117ae. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onrowsdelete();


  /**
   * <p>
   * Setter method for the COM property "onrowsinserted"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412049) //= 0x800117af. The runtime will prefer the VTID if present
  @VTID(16)
  void onrowsinserted(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onrowsinserted"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412049) //= 0x800117af. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onrowsinserted();


  /**
   * <p>
   * Setter method for the COM property "oncellchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412048) //= 0x800117b0. The runtime will prefer the VTID if present
  @VTID(18)
  void oncellchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncellchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412048) //= 0x800117b0. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncellchange();


  /**
   * <p>
   * Setter method for the COM property "ondatasetchanged"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412072) //= 0x80011798. The runtime will prefer the VTID if present
  @VTID(20)
  void ondatasetchanged(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondatasetchanged"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412072) //= 0x80011798. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondatasetchanged();


  /**
   * <p>
   * Setter method for the COM property "ondataavailable"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412071) //= 0x80011799. The runtime will prefer the VTID if present
  @VTID(22)
  void ondataavailable(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondataavailable"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412071) //= 0x80011799. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondataavailable();


  /**
   * <p>
   * Setter method for the COM property "ondatasetcomplete"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412070) //= 0x8001179a. The runtime will prefer the VTID if present
  @VTID(24)
  void ondatasetcomplete(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondatasetcomplete"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412070) //= 0x8001179a. The runtime will prefer the VTID if present
  @VTID(25)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondatasetcomplete();


  /**
   * <p>
   * Setter method for the COM property "onpropertychange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412065) //= 0x8001179f. The runtime will prefer the VTID if present
  @VTID(26)
  void onpropertychange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onpropertychange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412065) //= 0x8001179f. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onpropertychange();


  /**
   * <p>
   * Setter method for the COM property "dir"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412995) //= 0x800113fd. The runtime will prefer the VTID if present
  @VTID(28)
  void dir(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "dir"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412995) //= 0x800113fd. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String dir();


  /**
   * <p>
   * Setter method for the COM property "oncontextmenu"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412047) //= 0x800117b1. The runtime will prefer the VTID if present
  @VTID(30)
  void oncontextmenu(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncontextmenu"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412047) //= 0x800117b1. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncontextmenu();


  /**
   * <p>
   * Setter method for the COM property "onstop"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412044) //= 0x800117b4. The runtime will prefer the VTID if present
  @VTID(32)
  void onstop(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onstop"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412044) //= 0x800117b4. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onstop();


  /**
   * @return  Returns a value of type ms.html.IHTMLDocument2
   */

  @DISPID(1076) //= 0x434. The runtime will prefer the VTID if present
  @VTID(34)
  ms.html.IHTMLDocument2 createDocumentFragment();


  /**
   * <p>
   * Getter method for the COM property "parentDocument"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDocument2
   */

  @DISPID(1078) //= 0x436. The runtime will prefer the VTID if present
  @VTID(35)
  ms.html.IHTMLDocument2 parentDocument();


  /**
   * <p>
   * Setter method for the COM property "enableDownload"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1079) //= 0x437. The runtime will prefer the VTID if present
  @VTID(36)
  void enableDownload(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "enableDownload"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1079) //= 0x437. The runtime will prefer the VTID if present
  @VTID(37)
  boolean enableDownload();


  /**
   * <p>
   * Setter method for the COM property "baseUrl"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1080) //= 0x438. The runtime will prefer the VTID if present
  @VTID(38)
  void baseUrl(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "baseUrl"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1080) //= 0x438. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String baseUrl();


  /**
   * <p>
   * Getter method for the COM property "childNodes"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147417063) //= 0x80010419. The runtime will prefer the VTID if present
  @VTID(40)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject childNodes();


  /**
   * <p>
   * Setter method for the COM property "inheritStyleSheets"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1082) //= 0x43a. The runtime will prefer the VTID if present
  @VTID(41)
  void inheritStyleSheets(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "inheritStyleSheets"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1082) //= 0x43a. The runtime will prefer the VTID if present
  @VTID(42)
  boolean inheritStyleSheets();


  /**
   * <p>
   * Setter method for the COM property "onbeforeeditfocus"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412043) //= 0x800117b5. The runtime will prefer the VTID if present
  @VTID(43)
  void onbeforeeditfocus(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforeeditfocus"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412043) //= 0x800117b5. The runtime will prefer the VTID if present
  @VTID(44)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforeeditfocus();


  /**
   * @param v Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1086) //= 0x43e. The runtime will prefer the VTID if present
  @VTID(45)
  ms.html.IHTMLElementCollection getElementsByName(
    java.lang.String v);


  /**
   * @param v Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1088) //= 0x440. The runtime will prefer the VTID if present
  @VTID(46)
  ms.html.IHTMLElement getElementById(
    java.lang.String v);


  /**
   * @param v Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1087) //= 0x43f. The runtime will prefer the VTID if present
  @VTID(47)
  ms.html.IHTMLElementCollection getElementsByTagName(
    java.lang.String v);


  // Properties:
}
