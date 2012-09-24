package ms.html  ;

import com4j.*;

@IID("{3050F69A-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDocument4 extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(1089) //= 0x441. The runtime will prefer the VTID if present
  @VTID(7)
  void focus();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1090) //= 0x442. The runtime will prefer the VTID if present
  @VTID(8)
  boolean hasFocus();


  /**
   * <p>
   * Setter method for the COM property "onselectionchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412032) //= 0x800117c0. The runtime will prefer the VTID if present
  @VTID(9)
  void onselectionchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onselectionchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412032) //= 0x800117c0. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onselectionchange();


  /**
   * <p>
   * Getter method for the COM property "namespaces"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1091) //= 0x443. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject namespaces();


  /**
   * @param bstrURL Mandatory java.lang.String parameter.
   * @param bstrOptions Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDocument2
   */

  @DISPID(1092) //= 0x444. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.IHTMLDocument2 createDocumentFromUrl(
    java.lang.String bstrURL,
    java.lang.String bstrOptions);


  /**
   * <p>
   * Setter method for the COM property "media"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1093) //= 0x445. The runtime will prefer the VTID if present
  @VTID(13)
  void media(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "media"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1093) //= 0x445. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String media();


  /**
   * @param pvarEventObject Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type ms.html.IHTMLEventObj
   */

  @DISPID(1094) //= 0x446. The runtime will prefer the VTID if present
  @VTID(15)
  ms.html.IHTMLEventObj createEventObject(
    @Optional java.lang.Object pvarEventObject);


  /**
   * @param bstrEventName Mandatory java.lang.String parameter.
   * @param pvarEventObject Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(1095) //= 0x447. The runtime will prefer the VTID if present
  @VTID(16)
  boolean fireEvent(
    java.lang.String bstrEventName,
    @Optional java.lang.Object pvarEventObject);


  /**
   * @param v Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLRenderStyle
   */

  @DISPID(1096) //= 0x448. The runtime will prefer the VTID if present
  @VTID(17)
  ms.html.IHTMLRenderStyle createRenderStyle(
    java.lang.String v);


  /**
   * <p>
   * Setter method for the COM property "oncontrolselect"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412033) //= 0x800117bf. The runtime will prefer the VTID if present
  @VTID(18)
  void oncontrolselect(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncontrolselect"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412033) //= 0x800117bf. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncontrolselect();


  /**
   * <p>
   * Getter method for the COM property "URLUnencoded"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1097) //= 0x449. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String urlUnencoded();


  // Properties:
}
