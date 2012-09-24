package ms.html  ;

import com4j.*;

@IID("{3050F673-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLElement3 extends Com4jObject {
  // Methods:
  /**
   * @param mergeThis Mandatory ms.html.IHTMLElement parameter.
   * @param pvarFlags Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-2147417016) //= 0x80010448. The runtime will prefer the VTID if present
  @VTID(7)
  void mergeAttributes(
    ms.html.IHTMLElement mergeThis,
    @Optional java.lang.Object pvarFlags);


  /**
   * <p>
   * Getter method for the COM property "isMultiLine"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417015) //= 0x80010449. The runtime will prefer the VTID if present
  @VTID(8)
  boolean isMultiLine();


  /**
   * <p>
   * Getter method for the COM property "canHaveHTML"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417014) //= 0x8001044a. The runtime will prefer the VTID if present
  @VTID(9)
  boolean canHaveHTML();


  /**
   * <p>
   * Setter method for the COM property "onlayoutcomplete"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412039) //= 0x800117b9. The runtime will prefer the VTID if present
  @VTID(10)
  void onlayoutcomplete(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onlayoutcomplete"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412039) //= 0x800117b9. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onlayoutcomplete();


  /**
   * <p>
   * Setter method for the COM property "onpage"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412038) //= 0x800117ba. The runtime will prefer the VTID if present
  @VTID(12)
  void onpage(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onpage"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412038) //= 0x800117ba. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onpage();


  /**
   * <p>
   * Setter method for the COM property "inflateBlock"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147417012) //= 0x8001044c. The runtime will prefer the VTID if present
  @VTID(14)
  void inflateBlock(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "inflateBlock"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417012) //= 0x8001044c. The runtime will prefer the VTID if present
  @VTID(15)
  boolean inflateBlock();


  /**
   * <p>
   * Setter method for the COM property "onbeforedeactivate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412035) //= 0x800117bd. The runtime will prefer the VTID if present
  @VTID(16)
  void onbeforedeactivate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforedeactivate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412035) //= 0x800117bd. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforedeactivate();


  /**
   */

  @DISPID(-2147417011) //= 0x8001044d. The runtime will prefer the VTID if present
  @VTID(18)
  void setActive();


  /**
   * <p>
   * Setter method for the COM property "contentEditable"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412950) //= 0x8001142a. The runtime will prefer the VTID if present
  @VTID(19)
  void contentEditable(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "contentEditable"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412950) //= 0x8001142a. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String contentEditable();


  /**
   * <p>
   * Getter method for the COM property "isContentEditable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417010) //= 0x8001044e. The runtime will prefer the VTID if present
  @VTID(21)
  boolean isContentEditable();


  /**
   * <p>
   * Setter method for the COM property "hideFocus"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147412949) //= 0x8001142b. The runtime will prefer the VTID if present
  @VTID(22)
  void hideFocus(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "hideFocus"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147412949) //= 0x8001142b. The runtime will prefer the VTID if present
  @VTID(23)
  boolean hideFocus();


  /**
   * <p>
   * Setter method for the COM property "disabled"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(24)
  void disabled(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "disabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(25)
  boolean disabled();


  /**
   * <p>
   * Getter method for the COM property "isDisabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417007) //= 0x80010451. The runtime will prefer the VTID if present
  @VTID(26)
  boolean isDisabled();


  /**
   * <p>
   * Setter method for the COM property "onmove"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412034) //= 0x800117be. The runtime will prefer the VTID if present
  @VTID(27)
  void onmove(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmove"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412034) //= 0x800117be. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmove();


  /**
   * <p>
   * Setter method for the COM property "oncontrolselect"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412033) //= 0x800117bf. The runtime will prefer the VTID if present
  @VTID(29)
  void oncontrolselect(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncontrolselect"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412033) //= 0x800117bf. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncontrolselect();


  /**
   * @param bstrEventName Mandatory java.lang.String parameter.
   * @param pvarEventObject Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417006) //= 0x80010452. The runtime will prefer the VTID if present
  @VTID(31)
  boolean fireEvent(
    java.lang.String bstrEventName,
    @Optional java.lang.Object pvarEventObject);


  /**
   * <p>
   * Setter method for the COM property "onresizestart"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412029) //= 0x800117c3. The runtime will prefer the VTID if present
  @VTID(32)
  void onresizestart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onresizestart"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412029) //= 0x800117c3. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onresizestart();


  /**
   * <p>
   * Setter method for the COM property "onresizeend"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412028) //= 0x800117c4. The runtime will prefer the VTID if present
  @VTID(34)
  void onresizeend(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onresizeend"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412028) //= 0x800117c4. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onresizeend();


  /**
   * <p>
   * Setter method for the COM property "onmovestart"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412031) //= 0x800117c1. The runtime will prefer the VTID if present
  @VTID(36)
  void onmovestart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmovestart"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412031) //= 0x800117c1. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmovestart();


  /**
   * <p>
   * Setter method for the COM property "onmoveend"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412030) //= 0x800117c2. The runtime will prefer the VTID if present
  @VTID(38)
  void onmoveend(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmoveend"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412030) //= 0x800117c2. The runtime will prefer the VTID if present
  @VTID(39)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmoveend();


  /**
   * <p>
   * Setter method for the COM property "onmouseenter"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412027) //= 0x800117c5. The runtime will prefer the VTID if present
  @VTID(40)
  void onmouseenter(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmouseenter"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412027) //= 0x800117c5. The runtime will prefer the VTID if present
  @VTID(41)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmouseenter();


  /**
   * <p>
   * Setter method for the COM property "onmouseleave"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412026) //= 0x800117c6. The runtime will prefer the VTID if present
  @VTID(42)
  void onmouseleave(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmouseleave"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412026) //= 0x800117c6. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmouseleave();


  /**
   * <p>
   * Setter method for the COM property "onactivate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412025) //= 0x800117c7. The runtime will prefer the VTID if present
  @VTID(44)
  void onactivate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onactivate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412025) //= 0x800117c7. The runtime will prefer the VTID if present
  @VTID(45)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onactivate();


  /**
   * <p>
   * Setter method for the COM property "ondeactivate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412024) //= 0x800117c8. The runtime will prefer the VTID if present
  @VTID(46)
  void ondeactivate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondeactivate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412024) //= 0x800117c8. The runtime will prefer the VTID if present
  @VTID(47)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondeactivate();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417005) //= 0x80010453. The runtime will prefer the VTID if present
  @VTID(48)
  boolean dragDrop();


  /**
   * <p>
   * Getter method for the COM property "glyphMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147417004) //= 0x80010454. The runtime will prefer the VTID if present
  @VTID(49)
  int glyphMode();


  // Properties:
}
