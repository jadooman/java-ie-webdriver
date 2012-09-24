package ms.html  ;

import com4j.*;

@IID("{30510740-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLCSSStyleDeclaration extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147413611) //= 0x80011195. The runtime will prefer the VTID if present
  @VTID(7)
  int length();


  /**
   * <p>
   * Getter method for the COM property "parentRule"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413610) //= 0x80011196. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object parentRule();


  /**
   * @param bstrPropertyName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413609) //= 0x80011197. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String getPropertyValue(
    java.lang.String bstrPropertyName);


  /**
   * @param bstrPropertyName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413608) //= 0x80011198. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String getPropertyPriority(
    java.lang.String bstrPropertyName);


  /**
   * @param bstrPropertyName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413607) //= 0x80011199. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String removeProperty(
    java.lang.String bstrPropertyName);


  /**
   * @param bstrPropertyName Mandatory java.lang.String parameter.
   * @param pvarPropertyValue Mandatory java.lang.Object parameter.
   * @param pvarPropertyPriority Optional parameter. Default value is ""
   */

  @DISPID(-2147413606) //= 0x8001119a. The runtime will prefer the VTID if present
  @VTID(12)
  void setProperty(
    java.lang.String bstrPropertyName,
    java.lang.Object pvarPropertyValue,
    @Optional @DefaultValue("") java.lang.Object pvarPropertyPriority);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(13)
  @DefaultMethod
  java.lang.String item(
    int index);


  /**
   * <p>
   * Setter method for the COM property "fontFamily"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413094) //= 0x8001139a. The runtime will prefer the VTID if present
  @VTID(14)
  void fontFamily(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "fontFamily"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413094) //= 0x8001139a. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String fontFamily();


  /**
   * <p>
   * Setter method for the COM property "fontStyle"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413088) //= 0x800113a0. The runtime will prefer the VTID if present
  @VTID(16)
  void fontStyle(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "fontStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413088) //= 0x800113a0. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String fontStyle();


  /**
   * <p>
   * Setter method for the COM property "fontVariant"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413087) //= 0x800113a1. The runtime will prefer the VTID if present
  @VTID(18)
  void fontVariant(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "fontVariant"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413087) //= 0x800113a1. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String fontVariant();


  /**
   * <p>
   * Setter method for the COM property "fontWeight"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413085) //= 0x800113a3. The runtime will prefer the VTID if present
  @VTID(20)
  void fontWeight(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "fontWeight"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413085) //= 0x800113a3. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String fontWeight();


  /**
   * <p>
   * Setter method for the COM property "fontSize"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413093) //= 0x8001139b. The runtime will prefer the VTID if present
  @VTID(22)
  void fontSize(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "fontSize"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413093) //= 0x8001139b. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fontSize();


  /**
   * <p>
   * Setter method for the COM property "font"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413071) //= 0x800113b1. The runtime will prefer the VTID if present
  @VTID(24)
  void font(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "font"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413071) //= 0x800113b1. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String font();


  /**
   * <p>
   * Setter method for the COM property "color"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413110) //= 0x8001138a. The runtime will prefer the VTID if present
  @VTID(26)
  void color(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "color"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413110) //= 0x8001138a. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object color();


  /**
   * <p>
   * Setter method for the COM property "background"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413080) //= 0x800113a8. The runtime will prefer the VTID if present
  @VTID(28)
  void background(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "background"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413080) //= 0x800113a8. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String background();


  /**
   * <p>
   * Setter method for the COM property "backgroundColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(30)
  void backgroundColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "backgroundColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object backgroundColor();


  /**
   * <p>
   * Setter method for the COM property "backgroundImage"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413111) //= 0x80011389. The runtime will prefer the VTID if present
  @VTID(32)
  void backgroundImage(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "backgroundImage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413111) //= 0x80011389. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String backgroundImage();


  /**
   * <p>
   * Setter method for the COM property "backgroundRepeat"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413068) //= 0x800113b4. The runtime will prefer the VTID if present
  @VTID(34)
  void backgroundRepeat(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "backgroundRepeat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413068) //= 0x800113b4. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String backgroundRepeat();


  /**
   * <p>
   * Setter method for the COM property "backgroundAttachment"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413067) //= 0x800113b5. The runtime will prefer the VTID if present
  @VTID(36)
  void backgroundAttachment(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "backgroundAttachment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413067) //= 0x800113b5. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String backgroundAttachment();


  /**
   * <p>
   * Setter method for the COM property "backgroundPosition"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413066) //= 0x800113b6. The runtime will prefer the VTID if present
  @VTID(38)
  void backgroundPosition(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "backgroundPosition"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413066) //= 0x800113b6. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String backgroundPosition();


  /**
   * <p>
   * Setter method for the COM property "backgroundPositionX"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413079) //= 0x800113a9. The runtime will prefer the VTID if present
  @VTID(40)
  void backgroundPositionX(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "backgroundPositionX"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413079) //= 0x800113a9. The runtime will prefer the VTID if present
  @VTID(41)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object backgroundPositionX();


  /**
   * <p>
   * Setter method for the COM property "backgroundPositionY"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413078) //= 0x800113aa. The runtime will prefer the VTID if present
  @VTID(42)
  void backgroundPositionY(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "backgroundPositionY"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413078) //= 0x800113aa. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object backgroundPositionY();


  /**
   * <p>
   * Setter method for the COM property "wordSpacing"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413065) //= 0x800113b7. The runtime will prefer the VTID if present
  @VTID(44)
  void wordSpacing(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "wordSpacing"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413065) //= 0x800113b7. The runtime will prefer the VTID if present
  @VTID(45)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object wordSpacing();


  /**
   * <p>
   * Setter method for the COM property "letterSpacing"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413104) //= 0x80011390. The runtime will prefer the VTID if present
  @VTID(46)
  void letterSpacing(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "letterSpacing"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413104) //= 0x80011390. The runtime will prefer the VTID if present
  @VTID(47)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object letterSpacing();


  /**
   * <p>
   * Setter method for the COM property "textDecoration"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413077) //= 0x800113ab. The runtime will prefer the VTID if present
  @VTID(48)
  void textDecoration(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textDecoration"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413077) //= 0x800113ab. The runtime will prefer the VTID if present
  @VTID(49)
  java.lang.String textDecoration();


  /**
   * <p>
   * Setter method for the COM property "verticalAlign"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413064) //= 0x800113b8. The runtime will prefer the VTID if present
  @VTID(50)
  void verticalAlign(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "verticalAlign"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413064) //= 0x800113b8. The runtime will prefer the VTID if present
  @VTID(51)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object verticalAlign();


  /**
   * <p>
   * Setter method for the COM property "textTransform"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413108) //= 0x8001138c. The runtime will prefer the VTID if present
  @VTID(52)
  void textTransform(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textTransform"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413108) //= 0x8001138c. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String textTransform();


  /**
   * <p>
   * Setter method for the COM property "textAlign"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418040) //= 0x80010048. The runtime will prefer the VTID if present
  @VTID(54)
  void textAlign(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textAlign"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418040) //= 0x80010048. The runtime will prefer the VTID if present
  @VTID(55)
  java.lang.String textAlign();


  /**
   * <p>
   * Setter method for the COM property "textIndent"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413105) //= 0x8001138f. The runtime will prefer the VTID if present
  @VTID(56)
  void textIndent(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "textIndent"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413105) //= 0x8001138f. The runtime will prefer the VTID if present
  @VTID(57)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object textIndent();


  /**
   * <p>
   * Setter method for the COM property "lineHeight"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413106) //= 0x8001138e. The runtime will prefer the VTID if present
  @VTID(58)
  void lineHeight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "lineHeight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413106) //= 0x8001138e. The runtime will prefer the VTID if present
  @VTID(59)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object lineHeight();


  /**
   * <p>
   * Setter method for the COM property "marginTop"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413075) //= 0x800113ad. The runtime will prefer the VTID if present
  @VTID(60)
  void marginTop(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "marginTop"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413075) //= 0x800113ad. The runtime will prefer the VTID if present
  @VTID(61)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object marginTop();


  /**
   * <p>
   * Setter method for the COM property "marginRight"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413074) //= 0x800113ae. The runtime will prefer the VTID if present
  @VTID(62)
  void marginRight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "marginRight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413074) //= 0x800113ae. The runtime will prefer the VTID if present
  @VTID(63)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object marginRight();


  /**
   * <p>
   * Setter method for the COM property "marginBottom"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413073) //= 0x800113af. The runtime will prefer the VTID if present
  @VTID(64)
  void marginBottom(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "marginBottom"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413073) //= 0x800113af. The runtime will prefer the VTID if present
  @VTID(65)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object marginBottom();


  /**
   * <p>
   * Setter method for the COM property "marginLeft"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413072) //= 0x800113b0. The runtime will prefer the VTID if present
  @VTID(66)
  void marginLeft(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "marginLeft"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413072) //= 0x800113b0. The runtime will prefer the VTID if present
  @VTID(67)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object marginLeft();


  /**
   * <p>
   * Setter method for the COM property "margin"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413076) //= 0x800113ac. The runtime will prefer the VTID if present
  @VTID(68)
  void margin(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "margin"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413076) //= 0x800113ac. The runtime will prefer the VTID if present
  @VTID(69)
  java.lang.String margin();


  /**
   * <p>
   * Setter method for the COM property "paddingTop"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413100) //= 0x80011394. The runtime will prefer the VTID if present
  @VTID(70)
  void paddingTop(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "paddingTop"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413100) //= 0x80011394. The runtime will prefer the VTID if present
  @VTID(71)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object paddingTop();


  /**
   * <p>
   * Setter method for the COM property "paddingRight"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413099) //= 0x80011395. The runtime will prefer the VTID if present
  @VTID(72)
  void paddingRight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "paddingRight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413099) //= 0x80011395. The runtime will prefer the VTID if present
  @VTID(73)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object paddingRight();


  /**
   * <p>
   * Setter method for the COM property "paddingBottom"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413098) //= 0x80011396. The runtime will prefer the VTID if present
  @VTID(74)
  void paddingBottom(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "paddingBottom"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413098) //= 0x80011396. The runtime will prefer the VTID if present
  @VTID(75)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object paddingBottom();


  /**
   * <p>
   * Setter method for the COM property "paddingLeft"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413097) //= 0x80011397. The runtime will prefer the VTID if present
  @VTID(76)
  void paddingLeft(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "paddingLeft"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413097) //= 0x80011397. The runtime will prefer the VTID if present
  @VTID(77)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object paddingLeft();


  /**
   * <p>
   * Setter method for the COM property "padding"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413101) //= 0x80011393. The runtime will prefer the VTID if present
  @VTID(78)
  void padding(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "padding"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413101) //= 0x80011393. The runtime will prefer the VTID if present
  @VTID(79)
  java.lang.String padding();


  /**
   * <p>
   * Setter method for the COM property "border"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413063) //= 0x800113b9. The runtime will prefer the VTID if present
  @VTID(80)
  void border(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "border"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413063) //= 0x800113b9. The runtime will prefer the VTID if present
  @VTID(81)
  java.lang.String border();


  /**
   * <p>
   * Setter method for the COM property "borderTop"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413062) //= 0x800113ba. The runtime will prefer the VTID if present
  @VTID(82)
  void borderTop(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderTop"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413062) //= 0x800113ba. The runtime will prefer the VTID if present
  @VTID(83)
  java.lang.String borderTop();


  /**
   * <p>
   * Setter method for the COM property "borderRight"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413061) //= 0x800113bb. The runtime will prefer the VTID if present
  @VTID(84)
  void borderRight(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderRight"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413061) //= 0x800113bb. The runtime will prefer the VTID if present
  @VTID(85)
  java.lang.String borderRight();


  /**
   * <p>
   * Setter method for the COM property "borderBottom"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413060) //= 0x800113bc. The runtime will prefer the VTID if present
  @VTID(86)
  void borderBottom(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderBottom"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413060) //= 0x800113bc. The runtime will prefer the VTID if present
  @VTID(87)
  java.lang.String borderBottom();


  /**
   * <p>
   * Setter method for the COM property "borderLeft"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413059) //= 0x800113bd. The runtime will prefer the VTID if present
  @VTID(88)
  void borderLeft(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderLeft"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413059) //= 0x800113bd. The runtime will prefer the VTID if present
  @VTID(89)
  java.lang.String borderLeft();


  /**
   * <p>
   * Setter method for the COM property "borderColor"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413058) //= 0x800113be. The runtime will prefer the VTID if present
  @VTID(90)
  void borderColor(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderColor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413058) //= 0x800113be. The runtime will prefer the VTID if present
  @VTID(91)
  java.lang.String borderColor();


  /**
   * <p>
   * Setter method for the COM property "borderTopColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413057) //= 0x800113bf. The runtime will prefer the VTID if present
  @VTID(92)
  void borderTopColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderTopColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413057) //= 0x800113bf. The runtime will prefer the VTID if present
  @VTID(93)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderTopColor();


  /**
   * <p>
   * Setter method for the COM property "borderRightColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413056) //= 0x800113c0. The runtime will prefer the VTID if present
  @VTID(94)
  void borderRightColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderRightColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413056) //= 0x800113c0. The runtime will prefer the VTID if present
  @VTID(95)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderRightColor();


  /**
   * <p>
   * Setter method for the COM property "borderBottomColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413055) //= 0x800113c1. The runtime will prefer the VTID if present
  @VTID(96)
  void borderBottomColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderBottomColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413055) //= 0x800113c1. The runtime will prefer the VTID if present
  @VTID(97)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderBottomColor();


  /**
   * <p>
   * Setter method for the COM property "borderLeftColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413054) //= 0x800113c2. The runtime will prefer the VTID if present
  @VTID(98)
  void borderLeftColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderLeftColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413054) //= 0x800113c2. The runtime will prefer the VTID if present
  @VTID(99)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderLeftColor();


  /**
   * <p>
   * Setter method for the COM property "borderWidth"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413053) //= 0x800113c3. The runtime will prefer the VTID if present
  @VTID(100)
  void borderWidth(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderWidth"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413053) //= 0x800113c3. The runtime will prefer the VTID if present
  @VTID(101)
  java.lang.String borderWidth();


  /**
   * <p>
   * Setter method for the COM property "borderTopWidth"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413052) //= 0x800113c4. The runtime will prefer the VTID if present
  @VTID(102)
  void borderTopWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderTopWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413052) //= 0x800113c4. The runtime will prefer the VTID if present
  @VTID(103)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderTopWidth();


  /**
   * <p>
   * Setter method for the COM property "borderRightWidth"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413051) //= 0x800113c5. The runtime will prefer the VTID if present
  @VTID(104)
  void borderRightWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderRightWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413051) //= 0x800113c5. The runtime will prefer the VTID if present
  @VTID(105)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderRightWidth();


  /**
   * <p>
   * Setter method for the COM property "borderBottomWidth"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413050) //= 0x800113c6. The runtime will prefer the VTID if present
  @VTID(106)
  void borderBottomWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderBottomWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413050) //= 0x800113c6. The runtime will prefer the VTID if present
  @VTID(107)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderBottomWidth();


  /**
   * <p>
   * Setter method for the COM property "borderLeftWidth"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413049) //= 0x800113c7. The runtime will prefer the VTID if present
  @VTID(108)
  void borderLeftWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderLeftWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413049) //= 0x800113c7. The runtime will prefer the VTID if present
  @VTID(109)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderLeftWidth();


  /**
   * <p>
   * Setter method for the COM property "borderStyle"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413048) //= 0x800113c8. The runtime will prefer the VTID if present
  @VTID(110)
  void borderStyle(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413048) //= 0x800113c8. The runtime will prefer the VTID if present
  @VTID(111)
  java.lang.String borderStyle();


  /**
   * <p>
   * Setter method for the COM property "borderTopStyle"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413047) //= 0x800113c9. The runtime will prefer the VTID if present
  @VTID(112)
  void borderTopStyle(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderTopStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413047) //= 0x800113c9. The runtime will prefer the VTID if present
  @VTID(113)
  java.lang.String borderTopStyle();


  /**
   * <p>
   * Setter method for the COM property "borderRightStyle"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413046) //= 0x800113ca. The runtime will prefer the VTID if present
  @VTID(114)
  void borderRightStyle(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderRightStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413046) //= 0x800113ca. The runtime will prefer the VTID if present
  @VTID(115)
  java.lang.String borderRightStyle();


  /**
   * <p>
   * Setter method for the COM property "borderBottomStyle"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413045) //= 0x800113cb. The runtime will prefer the VTID if present
  @VTID(116)
  void borderBottomStyle(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderBottomStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413045) //= 0x800113cb. The runtime will prefer the VTID if present
  @VTID(117)
  java.lang.String borderBottomStyle();


  /**
   * <p>
   * Setter method for the COM property "borderLeftStyle"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413044) //= 0x800113cc. The runtime will prefer the VTID if present
  @VTID(118)
  void borderLeftStyle(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderLeftStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413044) //= 0x800113cc. The runtime will prefer the VTID if present
  @VTID(119)
  java.lang.String borderLeftStyle();


  /**
   * <p>
   * Setter method for the COM property "width"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(120)
  void width(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(121)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object width();


  /**
   * <p>
   * Setter method for the COM property "height"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(122)
  void height(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(123)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object height();


  /**
   * <p>
   * Setter method for the COM property "styleFloat"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413042) //= 0x800113ce. The runtime will prefer the VTID if present
  @VTID(124)
  void styleFloat(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "styleFloat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413042) //= 0x800113ce. The runtime will prefer the VTID if present
  @VTID(125)
  java.lang.String styleFloat();


  /**
   * <p>
   * Setter method for the COM property "clear"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413096) //= 0x80011398. The runtime will prefer the VTID if present
  @VTID(126)
  void clear(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "clear"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413096) //= 0x80011398. The runtime will prefer the VTID if present
  @VTID(127)
  java.lang.String clear();


  /**
   * <p>
   * Setter method for the COM property "display"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413041) //= 0x800113cf. The runtime will prefer the VTID if present
  @VTID(128)
  void display(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "display"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413041) //= 0x800113cf. The runtime will prefer the VTID if present
  @VTID(129)
  java.lang.String display();


  /**
   * <p>
   * Setter method for the COM property "visibility"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413032) //= 0x800113d8. The runtime will prefer the VTID if present
  @VTID(130)
  void visibility(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "visibility"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413032) //= 0x800113d8. The runtime will prefer the VTID if present
  @VTID(131)
  java.lang.String visibility();


  /**
   * <p>
   * Setter method for the COM property "listStyleType"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413040) //= 0x800113d0. The runtime will prefer the VTID if present
  @VTID(132)
  void listStyleType(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "listStyleType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413040) //= 0x800113d0. The runtime will prefer the VTID if present
  @VTID(133)
  java.lang.String listStyleType();


  /**
   * <p>
   * Setter method for the COM property "listStylePosition"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413039) //= 0x800113d1. The runtime will prefer the VTID if present
  @VTID(134)
  void listStylePosition(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "listStylePosition"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413039) //= 0x800113d1. The runtime will prefer the VTID if present
  @VTID(135)
  java.lang.String listStylePosition();


  /**
   * <p>
   * Setter method for the COM property "listStyleImage"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413038) //= 0x800113d2. The runtime will prefer the VTID if present
  @VTID(136)
  void listStyleImage(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "listStyleImage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413038) //= 0x800113d2. The runtime will prefer the VTID if present
  @VTID(137)
  java.lang.String listStyleImage();


  /**
   * <p>
   * Setter method for the COM property "listStyle"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413037) //= 0x800113d3. The runtime will prefer the VTID if present
  @VTID(138)
  void listStyle(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "listStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413037) //= 0x800113d3. The runtime will prefer the VTID if present
  @VTID(139)
  java.lang.String listStyle();


  /**
   * <p>
   * Setter method for the COM property "whiteSpace"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413036) //= 0x800113d4. The runtime will prefer the VTID if present
  @VTID(140)
  void whiteSpace(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "whiteSpace"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413036) //= 0x800113d4. The runtime will prefer the VTID if present
  @VTID(141)
  java.lang.String whiteSpace();


  /**
   * <p>
   * Setter method for the COM property "top"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418108) //= 0x80010004. The runtime will prefer the VTID if present
  @VTID(142)
  void top(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "top"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418108) //= 0x80010004. The runtime will prefer the VTID if present
  @VTID(143)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object top();


  /**
   * <p>
   * Setter method for the COM property "left"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418109) //= 0x80010003. The runtime will prefer the VTID if present
  @VTID(144)
  void left(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "left"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418109) //= 0x80010003. The runtime will prefer the VTID if present
  @VTID(145)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object left();


  /**
   * <p>
   * Setter method for the COM property "zIndex"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413021) //= 0x800113e3. The runtime will prefer the VTID if present
  @VTID(146)
  void zIndex(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "zIndex"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413021) //= 0x800113e3. The runtime will prefer the VTID if present
  @VTID(147)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object zIndex();


  /**
   * <p>
   * Setter method for the COM property "overflow"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413102) //= 0x80011392. The runtime will prefer the VTID if present
  @VTID(148)
  void overflow(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "overflow"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413102) //= 0x80011392. The runtime will prefer the VTID if present
  @VTID(149)
  java.lang.String overflow();


  /**
   * <p>
   * Setter method for the COM property "pageBreakBefore"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413035) //= 0x800113d5. The runtime will prefer the VTID if present
  @VTID(150)
  void pageBreakBefore(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "pageBreakBefore"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413035) //= 0x800113d5. The runtime will prefer the VTID if present
  @VTID(151)
  java.lang.String pageBreakBefore();


  /**
   * <p>
   * Setter method for the COM property "pageBreakAfter"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413034) //= 0x800113d6. The runtime will prefer the VTID if present
  @VTID(152)
  void pageBreakAfter(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "pageBreakAfter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413034) //= 0x800113d6. The runtime will prefer the VTID if present
  @VTID(153)
  java.lang.String pageBreakAfter();


  /**
   * <p>
   * Setter method for the COM property "cssText"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413013) //= 0x800113eb. The runtime will prefer the VTID if present
  @VTID(154)
  void cssText(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "cssText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413013) //= 0x800113eb. The runtime will prefer the VTID if present
  @VTID(155)
  java.lang.String cssText();


  /**
   * <p>
   * Setter method for the COM property "cursor"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413010) //= 0x800113ee. The runtime will prefer the VTID if present
  @VTID(156)
  void cursor(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "cursor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413010) //= 0x800113ee. The runtime will prefer the VTID if present
  @VTID(157)
  java.lang.String cursor();


  /**
   * <p>
   * Setter method for the COM property "clip"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413020) //= 0x800113e4. The runtime will prefer the VTID if present
  @VTID(158)
  void clip(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "clip"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413020) //= 0x800113e4. The runtime will prefer the VTID if present
  @VTID(159)
  java.lang.String clip();


  /**
   * <p>
   * Setter method for the COM property "filter"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413030) //= 0x800113da. The runtime will prefer the VTID if present
  @VTID(160)
  void filter(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "filter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413030) //= 0x800113da. The runtime will prefer the VTID if present
  @VTID(161)
  java.lang.String filter();


  /**
   * <p>
   * Setter method for the COM property "tableLayout"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413014) //= 0x800113ea. The runtime will prefer the VTID if present
  @VTID(162)
  void tableLayout(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "tableLayout"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413014) //= 0x800113ea. The runtime will prefer the VTID if present
  @VTID(163)
  java.lang.String tableLayout();


  /**
   * <p>
   * Setter method for the COM property "borderCollapse"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413028) //= 0x800113dc. The runtime will prefer the VTID if present
  @VTID(164)
  void borderCollapse(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderCollapse"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413028) //= 0x800113dc. The runtime will prefer the VTID if present
  @VTID(165)
  java.lang.String borderCollapse();


  /**
   * <p>
   * Setter method for the COM property "direction"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412993) //= 0x800113ff. The runtime will prefer the VTID if present
  @VTID(166)
  void direction(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "direction"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412993) //= 0x800113ff. The runtime will prefer the VTID if present
  @VTID(167)
  java.lang.String direction();


  /**
   * <p>
   * Setter method for the COM property "behavior"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412997) //= 0x800113fb. The runtime will prefer the VTID if present
  @VTID(168)
  void behavior(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "behavior"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412997) //= 0x800113fb. The runtime will prefer the VTID if present
  @VTID(169)
  java.lang.String behavior();


  /**
   * <p>
   * Setter method for the COM property "position"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413022) //= 0x800113e2. The runtime will prefer the VTID if present
  @VTID(170)
  void position(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "position"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413022) //= 0x800113e2. The runtime will prefer the VTID if present
  @VTID(171)
  java.lang.String position();


  /**
   * <p>
   * Setter method for the COM property "unicodeBidi"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412994) //= 0x800113fe. The runtime will prefer the VTID if present
  @VTID(172)
  void unicodeBidi(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "unicodeBidi"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412994) //= 0x800113fe. The runtime will prefer the VTID if present
  @VTID(173)
  java.lang.String unicodeBidi();


  /**
   * <p>
   * Setter method for the COM property "bottom"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418034) //= 0x8001004e. The runtime will prefer the VTID if present
  @VTID(174)
  void bottom(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "bottom"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418034) //= 0x8001004e. The runtime will prefer the VTID if present
  @VTID(175)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object bottom();


  /**
   * <p>
   * Setter method for the COM property "right"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418035) //= 0x8001004d. The runtime will prefer the VTID if present
  @VTID(176)
  void right(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "right"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418035) //= 0x8001004d. The runtime will prefer the VTID if present
  @VTID(177)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object right();


  /**
   * <p>
   * Setter method for the COM property "imeMode"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412992) //= 0x80011400. The runtime will prefer the VTID if present
  @VTID(178)
  void imeMode(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "imeMode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412992) //= 0x80011400. The runtime will prefer the VTID if present
  @VTID(179)
  java.lang.String imeMode();


  /**
   * <p>
   * Setter method for the COM property "rubyAlign"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412991) //= 0x80011401. The runtime will prefer the VTID if present
  @VTID(180)
  void rubyAlign(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "rubyAlign"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412991) //= 0x80011401. The runtime will prefer the VTID if present
  @VTID(181)
  java.lang.String rubyAlign();


  /**
   * <p>
   * Setter method for the COM property "rubyPosition"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412990) //= 0x80011402. The runtime will prefer the VTID if present
  @VTID(182)
  void rubyPosition(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "rubyPosition"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412990) //= 0x80011402. The runtime will prefer the VTID if present
  @VTID(183)
  java.lang.String rubyPosition();


  /**
   * <p>
   * Setter method for the COM property "rubyOverhang"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412989) //= 0x80011403. The runtime will prefer the VTID if present
  @VTID(184)
  void rubyOverhang(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "rubyOverhang"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412989) //= 0x80011403. The runtime will prefer the VTID if present
  @VTID(185)
  java.lang.String rubyOverhang();


  /**
   * <p>
   * Setter method for the COM property "layoutGridChar"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412985) //= 0x80011407. The runtime will prefer the VTID if present
  @VTID(186)
  void layoutGridChar(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "layoutGridChar"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412985) //= 0x80011407. The runtime will prefer the VTID if present
  @VTID(187)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object layoutGridChar();


  /**
   * <p>
   * Setter method for the COM property "layoutGridLine"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412984) //= 0x80011408. The runtime will prefer the VTID if present
  @VTID(188)
  void layoutGridLine(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "layoutGridLine"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412984) //= 0x80011408. The runtime will prefer the VTID if present
  @VTID(189)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object layoutGridLine();


  /**
   * <p>
   * Setter method for the COM property "layoutGridMode"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412983) //= 0x80011409. The runtime will prefer the VTID if present
  @VTID(190)
  void layoutGridMode(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "layoutGridMode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412983) //= 0x80011409. The runtime will prefer the VTID if present
  @VTID(191)
  java.lang.String layoutGridMode();


  /**
   * <p>
   * Setter method for the COM property "layoutGridType"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412982) //= 0x8001140a. The runtime will prefer the VTID if present
  @VTID(192)
  void layoutGridType(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "layoutGridType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412982) //= 0x8001140a. The runtime will prefer the VTID if present
  @VTID(193)
  java.lang.String layoutGridType();


  /**
   * <p>
   * Setter method for the COM property "layoutGrid"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412981) //= 0x8001140b. The runtime will prefer the VTID if present
  @VTID(194)
  void layoutGrid(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "layoutGrid"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412981) //= 0x8001140b. The runtime will prefer the VTID if present
  @VTID(195)
  java.lang.String layoutGrid();


  /**
   * <p>
   * Setter method for the COM property "textAutospace"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412980) //= 0x8001140c. The runtime will prefer the VTID if present
  @VTID(196)
  void textAutospace(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textAutospace"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412980) //= 0x8001140c. The runtime will prefer the VTID if present
  @VTID(197)
  java.lang.String textAutospace();


  /**
   * <p>
   * Setter method for the COM property "wordBreak"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412978) //= 0x8001140e. The runtime will prefer the VTID if present
  @VTID(198)
  void wordBreak(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "wordBreak"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412978) //= 0x8001140e. The runtime will prefer the VTID if present
  @VTID(199)
  java.lang.String wordBreak();


  /**
   * <p>
   * Setter method for the COM property "lineBreak"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412979) //= 0x8001140d. The runtime will prefer the VTID if present
  @VTID(200)
  void lineBreak(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "lineBreak"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412979) //= 0x8001140d. The runtime will prefer the VTID if present
  @VTID(201)
  java.lang.String lineBreak();


  /**
   * <p>
   * Setter method for the COM property "textJustify"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412977) //= 0x8001140f. The runtime will prefer the VTID if present
  @VTID(202)
  void textJustify(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textJustify"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412977) //= 0x8001140f. The runtime will prefer the VTID if present
  @VTID(203)
  java.lang.String textJustify();


  /**
   * <p>
   * Setter method for the COM property "textJustifyTrim"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412976) //= 0x80011410. The runtime will prefer the VTID if present
  @VTID(204)
  void textJustifyTrim(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textJustifyTrim"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412976) //= 0x80011410. The runtime will prefer the VTID if present
  @VTID(205)
  java.lang.String textJustifyTrim();


  /**
   * <p>
   * Setter method for the COM property "textKashida"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412975) //= 0x80011411. The runtime will prefer the VTID if present
  @VTID(206)
  void textKashida(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "textKashida"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412975) //= 0x80011411. The runtime will prefer the VTID if present
  @VTID(207)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object textKashida();


  /**
   * <p>
   * Setter method for the COM property "overflowX"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412973) //= 0x80011413. The runtime will prefer the VTID if present
  @VTID(208)
  void overflowX(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "overflowX"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412973) //= 0x80011413. The runtime will prefer the VTID if present
  @VTID(209)
  java.lang.String overflowX();


  /**
   * <p>
   * Setter method for the COM property "overflowY"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412972) //= 0x80011414. The runtime will prefer the VTID if present
  @VTID(210)
  void overflowY(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "overflowY"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412972) //= 0x80011414. The runtime will prefer the VTID if present
  @VTID(211)
  java.lang.String overflowY();


  /**
   * <p>
   * Setter method for the COM property "accelerator"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412965) //= 0x8001141b. The runtime will prefer the VTID if present
  @VTID(212)
  void accelerator(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "accelerator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412965) //= 0x8001141b. The runtime will prefer the VTID if present
  @VTID(213)
  java.lang.String accelerator();


  /**
   * <p>
   * Setter method for the COM property "layoutFlow"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412957) //= 0x80011423. The runtime will prefer the VTID if present
  @VTID(214)
  void layoutFlow(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "layoutFlow"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412957) //= 0x80011423. The runtime will prefer the VTID if present
  @VTID(215)
  java.lang.String layoutFlow();


  /**
   * <p>
   * Setter method for the COM property "zoom"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412959) //= 0x80011421. The runtime will prefer the VTID if present
  @VTID(216)
  void zoom(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "zoom"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412959) //= 0x80011421. The runtime will prefer the VTID if present
  @VTID(217)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object zoom();


  /**
   * <p>
   * Setter method for the COM property "wordWrap"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412954) //= 0x80011426. The runtime will prefer the VTID if present
  @VTID(218)
  void wordWrap(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "wordWrap"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412954) //= 0x80011426. The runtime will prefer the VTID if present
  @VTID(219)
  java.lang.String wordWrap();


  /**
   * <p>
   * Setter method for the COM property "textUnderlinePosition"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412953) //= 0x80011427. The runtime will prefer the VTID if present
  @VTID(220)
  void textUnderlinePosition(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textUnderlinePosition"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412953) //= 0x80011427. The runtime will prefer the VTID if present
  @VTID(221)
  java.lang.String textUnderlinePosition();


  /**
   * <p>
   * Setter method for the COM property "scrollbarBaseColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412932) //= 0x8001143c. The runtime will prefer the VTID if present
  @VTID(222)
  void scrollbarBaseColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "scrollbarBaseColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412932) //= 0x8001143c. The runtime will prefer the VTID if present
  @VTID(223)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object scrollbarBaseColor();


  /**
   * <p>
   * Setter method for the COM property "scrollbarFaceColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412931) //= 0x8001143d. The runtime will prefer the VTID if present
  @VTID(224)
  void scrollbarFaceColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "scrollbarFaceColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412931) //= 0x8001143d. The runtime will prefer the VTID if present
  @VTID(225)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object scrollbarFaceColor();


  /**
   * <p>
   * Setter method for the COM property "scrollbar3dLightColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412930) //= 0x8001143e. The runtime will prefer the VTID if present
  @VTID(226)
  void scrollbar3dLightColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "scrollbar3dLightColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412930) //= 0x8001143e. The runtime will prefer the VTID if present
  @VTID(227)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object scrollbar3dLightColor();


  /**
   * <p>
   * Setter method for the COM property "scrollbarShadowColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412929) //= 0x8001143f. The runtime will prefer the VTID if present
  @VTID(228)
  void scrollbarShadowColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "scrollbarShadowColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412929) //= 0x8001143f. The runtime will prefer the VTID if present
  @VTID(229)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object scrollbarShadowColor();


  /**
   * <p>
   * Setter method for the COM property "scrollbarHighlightColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412928) //= 0x80011440. The runtime will prefer the VTID if present
  @VTID(230)
  void scrollbarHighlightColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "scrollbarHighlightColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412928) //= 0x80011440. The runtime will prefer the VTID if present
  @VTID(231)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object scrollbarHighlightColor();


  /**
   * <p>
   * Setter method for the COM property "scrollbarDarkShadowColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412927) //= 0x80011441. The runtime will prefer the VTID if present
  @VTID(232)
  void scrollbarDarkShadowColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "scrollbarDarkShadowColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412927) //= 0x80011441. The runtime will prefer the VTID if present
  @VTID(233)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object scrollbarDarkShadowColor();


  /**
   * <p>
   * Setter method for the COM property "scrollbarArrowColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412926) //= 0x80011442. The runtime will prefer the VTID if present
  @VTID(234)
  void scrollbarArrowColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "scrollbarArrowColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412926) //= 0x80011442. The runtime will prefer the VTID if present
  @VTID(235)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object scrollbarArrowColor();


  /**
   * <p>
   * Setter method for the COM property "scrollbarTrackColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412916) //= 0x8001144c. The runtime will prefer the VTID if present
  @VTID(236)
  void scrollbarTrackColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "scrollbarTrackColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412916) //= 0x8001144c. The runtime will prefer the VTID if present
  @VTID(237)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object scrollbarTrackColor();


  /**
   * <p>
   * Setter method for the COM property "writingMode"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412920) //= 0x80011448. The runtime will prefer the VTID if present
  @VTID(238)
  void writingMode(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "writingMode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412920) //= 0x80011448. The runtime will prefer the VTID if present
  @VTID(239)
  java.lang.String writingMode();


  /**
   * <p>
   * Setter method for the COM property "textAlignLast"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412909) //= 0x80011453. The runtime will prefer the VTID if present
  @VTID(240)
  void textAlignLast(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textAlignLast"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412909) //= 0x80011453. The runtime will prefer the VTID if present
  @VTID(241)
  java.lang.String textAlignLast();


  /**
   * <p>
   * Setter method for the COM property "textKashidaSpace"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412908) //= 0x80011454. The runtime will prefer the VTID if present
  @VTID(242)
  void textKashidaSpace(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "textKashidaSpace"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412908) //= 0x80011454. The runtime will prefer the VTID if present
  @VTID(243)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object textKashidaSpace();


  /**
   * <p>
   * Setter method for the COM property "textOverflow"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412903) //= 0x80011459. The runtime will prefer the VTID if present
  @VTID(244)
  void textOverflow(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textOverflow"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412903) //= 0x80011459. The runtime will prefer the VTID if present
  @VTID(245)
  java.lang.String textOverflow();


  /**
   * <p>
   * Setter method for the COM property "minHeight"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412901) //= 0x8001145b. The runtime will prefer the VTID if present
  @VTID(246)
  void minHeight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "minHeight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412901) //= 0x8001145b. The runtime will prefer the VTID if present
  @VTID(247)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object minHeight();


  /**
   * <p>
   * Setter method for the COM property "msInterpolationMode"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412899) //= 0x8001145d. The runtime will prefer the VTID if present
  @VTID(248)
  void msInterpolationMode(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "msInterpolationMode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412899) //= 0x8001145d. The runtime will prefer the VTID if present
  @VTID(249)
  java.lang.String msInterpolationMode();


  /**
   * <p>
   * Setter method for the COM property "maxHeight"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412898) //= 0x8001145e. The runtime will prefer the VTID if present
  @VTID(250)
  void maxHeight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "maxHeight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412898) //= 0x8001145e. The runtime will prefer the VTID if present
  @VTID(251)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object maxHeight();


  /**
   * <p>
   * Setter method for the COM property "minWidth"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412897) //= 0x8001145f. The runtime will prefer the VTID if present
  @VTID(252)
  void minWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "minWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412897) //= 0x8001145f. The runtime will prefer the VTID if present
  @VTID(253)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object minWidth();


  /**
   * <p>
   * Setter method for the COM property "maxWidth"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412896) //= 0x80011460. The runtime will prefer the VTID if present
  @VTID(254)
  void maxWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "maxWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412896) //= 0x80011460. The runtime will prefer the VTID if present
  @VTID(255)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object maxWidth();


  /**
   * <p>
   * Setter method for the COM property "content"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412894) //= 0x80011462. The runtime will prefer the VTID if present
  @VTID(256)
  void content(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "content"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412894) //= 0x80011462. The runtime will prefer the VTID if present
  @VTID(257)
  java.lang.String content();


  /**
   * <p>
   * Setter method for the COM property "captionSide"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412893) //= 0x80011463. The runtime will prefer the VTID if present
  @VTID(258)
  void captionSide(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "captionSide"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412893) //= 0x80011463. The runtime will prefer the VTID if present
  @VTID(259)
  java.lang.String captionSide();


  /**
   * <p>
   * Setter method for the COM property "counterIncrement"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412892) //= 0x80011464. The runtime will prefer the VTID if present
  @VTID(260)
  void counterIncrement(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "counterIncrement"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412892) //= 0x80011464. The runtime will prefer the VTID if present
  @VTID(261)
  java.lang.String counterIncrement();


  /**
   * <p>
   * Setter method for the COM property "counterReset"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412891) //= 0x80011465. The runtime will prefer the VTID if present
  @VTID(262)
  void counterReset(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "counterReset"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412891) //= 0x80011465. The runtime will prefer the VTID if present
  @VTID(263)
  java.lang.String counterReset();


  /**
   * <p>
   * Setter method for the COM property "outline"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412890) //= 0x80011466. The runtime will prefer the VTID if present
  @VTID(264)
  void outline(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "outline"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412890) //= 0x80011466. The runtime will prefer the VTID if present
  @VTID(265)
  java.lang.String outline();


  /**
   * <p>
   * Setter method for the COM property "outlineWidth"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412889) //= 0x80011467. The runtime will prefer the VTID if present
  @VTID(266)
  void outlineWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "outlineWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412889) //= 0x80011467. The runtime will prefer the VTID if present
  @VTID(267)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object outlineWidth();


  /**
   * <p>
   * Setter method for the COM property "outlineStyle"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412888) //= 0x80011468. The runtime will prefer the VTID if present
  @VTID(268)
  void outlineStyle(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "outlineStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412888) //= 0x80011468. The runtime will prefer the VTID if present
  @VTID(269)
  java.lang.String outlineStyle();


  /**
   * <p>
   * Setter method for the COM property "outlineColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412887) //= 0x80011469. The runtime will prefer the VTID if present
  @VTID(270)
  void outlineColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "outlineColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412887) //= 0x80011469. The runtime will prefer the VTID if present
  @VTID(271)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object outlineColor();


  /**
   * <p>
   * Setter method for the COM property "boxSizing"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412886) //= 0x8001146a. The runtime will prefer the VTID if present
  @VTID(272)
  void boxSizing(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "boxSizing"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412886) //= 0x8001146a. The runtime will prefer the VTID if present
  @VTID(273)
  java.lang.String boxSizing();


  /**
   * <p>
   * Setter method for the COM property "borderSpacing"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412885) //= 0x8001146b. The runtime will prefer the VTID if present
  @VTID(274)
  void borderSpacing(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderSpacing"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412885) //= 0x8001146b. The runtime will prefer the VTID if present
  @VTID(275)
  java.lang.String borderSpacing();


  /**
   * <p>
   * Setter method for the COM property "orphans"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412884) //= 0x8001146c. The runtime will prefer the VTID if present
  @VTID(276)
  void orphans(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "orphans"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412884) //= 0x8001146c. The runtime will prefer the VTID if present
  @VTID(277)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object orphans();


  /**
   * <p>
   * Setter method for the COM property "widows"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412883) //= 0x8001146d. The runtime will prefer the VTID if present
  @VTID(278)
  void widows(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "widows"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412883) //= 0x8001146d. The runtime will prefer the VTID if present
  @VTID(279)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object widows();


  /**
   * <p>
   * Setter method for the COM property "pageBreakInside"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412882) //= 0x8001146e. The runtime will prefer the VTID if present
  @VTID(280)
  void pageBreakInside(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "pageBreakInside"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412882) //= 0x8001146e. The runtime will prefer the VTID if present
  @VTID(281)
  java.lang.String pageBreakInside();


  /**
   * <p>
   * Setter method for the COM property "emptyCells"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412862) //= 0x80011482. The runtime will prefer the VTID if present
  @VTID(282)
  void emptyCells(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "emptyCells"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412862) //= 0x80011482. The runtime will prefer the VTID if present
  @VTID(283)
  java.lang.String emptyCells();


  /**
   * <p>
   * Setter method for the COM property "msBlockProgression"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412861) //= 0x80011483. The runtime will prefer the VTID if present
  @VTID(284)
  void msBlockProgression(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "msBlockProgression"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412861) //= 0x80011483. The runtime will prefer the VTID if present
  @VTID(285)
  java.lang.String msBlockProgression();


  /**
   * <p>
   * Setter method for the COM property "quotes"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412860) //= 0x80011484. The runtime will prefer the VTID if present
  @VTID(286)
  void quotes(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "quotes"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412860) //= 0x80011484. The runtime will prefer the VTID if present
  @VTID(287)
  java.lang.String quotes();


  /**
   * <p>
   * Setter method for the COM property "alignmentBaseline"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412834) //= 0x8001149e. The runtime will prefer the VTID if present
  @VTID(288)
  void alignmentBaseline(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "alignmentBaseline"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412834) //= 0x8001149e. The runtime will prefer the VTID if present
  @VTID(289)
  java.lang.String alignmentBaseline();


  /**
   * <p>
   * Setter method for the COM property "baselineShift"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412833) //= 0x8001149f. The runtime will prefer the VTID if present
  @VTID(290)
  void baselineShift(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "baselineShift"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412833) //= 0x8001149f. The runtime will prefer the VTID if present
  @VTID(291)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object baselineShift();


  /**
   * <p>
   * Setter method for the COM property "dominantBaseline"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412832) //= 0x800114a0. The runtime will prefer the VTID if present
  @VTID(292)
  void dominantBaseline(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "dominantBaseline"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412832) //= 0x800114a0. The runtime will prefer the VTID if present
  @VTID(293)
  java.lang.String dominantBaseline();


  /**
   * <p>
   * Setter method for the COM property "fontSizeAdjust"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412831) //= 0x800114a1. The runtime will prefer the VTID if present
  @VTID(294)
  void fontSizeAdjust(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "fontSizeAdjust"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412831) //= 0x800114a1. The runtime will prefer the VTID if present
  @VTID(295)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fontSizeAdjust();


  /**
   * <p>
   * Setter method for the COM property "fontStretch"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412830) //= 0x800114a2. The runtime will prefer the VTID if present
  @VTID(296)
  void fontStretch(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "fontStretch"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412830) //= 0x800114a2. The runtime will prefer the VTID if present
  @VTID(297)
  java.lang.String fontStretch();


  /**
   * <p>
   * Setter method for the COM property "opacity"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412829) //= 0x800114a3. The runtime will prefer the VTID if present
  @VTID(298)
  void opacity(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "opacity"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412829) //= 0x800114a3. The runtime will prefer the VTID if present
  @VTID(299)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object opacity();


  /**
   * <p>
   * Setter method for the COM property "clipPath"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412828) //= 0x800114a4. The runtime will prefer the VTID if present
  @VTID(300)
  void clipPath(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "clipPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412828) //= 0x800114a4. The runtime will prefer the VTID if present
  @VTID(301)
  java.lang.String clipPath();


  /**
   * <p>
   * Setter method for the COM property "clipRule"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412827) //= 0x800114a5. The runtime will prefer the VTID if present
  @VTID(302)
  void clipRule(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "clipRule"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412827) //= 0x800114a5. The runtime will prefer the VTID if present
  @VTID(303)
  java.lang.String clipRule();


  /**
   * <p>
   * Setter method for the COM property "fill"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412826) //= 0x800114a6. The runtime will prefer the VTID if present
  @VTID(304)
  void fill(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "fill"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412826) //= 0x800114a6. The runtime will prefer the VTID if present
  @VTID(305)
  java.lang.String fill();


  /**
   * <p>
   * Setter method for the COM property "fillOpacity"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412825) //= 0x800114a7. The runtime will prefer the VTID if present
  @VTID(306)
  void fillOpacity(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "fillOpacity"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412825) //= 0x800114a7. The runtime will prefer the VTID if present
  @VTID(307)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fillOpacity();


  /**
   * <p>
   * Setter method for the COM property "fillRule"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412824) //= 0x800114a8. The runtime will prefer the VTID if present
  @VTID(308)
  void fillRule(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "fillRule"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412824) //= 0x800114a8. The runtime will prefer the VTID if present
  @VTID(309)
  java.lang.String fillRule();


  /**
   * <p>
   * Setter method for the COM property "kerning"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412823) //= 0x800114a9. The runtime will prefer the VTID if present
  @VTID(310)
  void kerning(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "kerning"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412823) //= 0x800114a9. The runtime will prefer the VTID if present
  @VTID(311)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object kerning();


  /**
   * <p>
   * Setter method for the COM property "marker"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412822) //= 0x800114aa. The runtime will prefer the VTID if present
  @VTID(312)
  void marker(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "marker"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412822) //= 0x800114aa. The runtime will prefer the VTID if present
  @VTID(313)
  java.lang.String marker();


  /**
   * <p>
   * Setter method for the COM property "markerEnd"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412821) //= 0x800114ab. The runtime will prefer the VTID if present
  @VTID(314)
  void markerEnd(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "markerEnd"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412821) //= 0x800114ab. The runtime will prefer the VTID if present
  @VTID(315)
  java.lang.String markerEnd();


  /**
   * <p>
   * Setter method for the COM property "markerMid"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412820) //= 0x800114ac. The runtime will prefer the VTID if present
  @VTID(316)
  void markerMid(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "markerMid"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412820) //= 0x800114ac. The runtime will prefer the VTID if present
  @VTID(317)
  java.lang.String markerMid();


  /**
   * <p>
   * Setter method for the COM property "markerStart"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412819) //= 0x800114ad. The runtime will prefer the VTID if present
  @VTID(318)
  void markerStart(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "markerStart"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412819) //= 0x800114ad. The runtime will prefer the VTID if present
  @VTID(319)
  java.lang.String markerStart();


  /**
   * <p>
   * Setter method for the COM property "mask"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412818) //= 0x800114ae. The runtime will prefer the VTID if present
  @VTID(320)
  void mask(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "mask"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412818) //= 0x800114ae. The runtime will prefer the VTID if present
  @VTID(321)
  java.lang.String mask();


  /**
   * <p>
   * Setter method for the COM property "pointerEvents"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412817) //= 0x800114af. The runtime will prefer the VTID if present
  @VTID(322)
  void pointerEvents(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "pointerEvents"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412817) //= 0x800114af. The runtime will prefer the VTID if present
  @VTID(323)
  java.lang.String pointerEvents();


  /**
   * <p>
   * Setter method for the COM property "stopColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412816) //= 0x800114b0. The runtime will prefer the VTID if present
  @VTID(324)
  void stopColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "stopColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412816) //= 0x800114b0. The runtime will prefer the VTID if present
  @VTID(325)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object stopColor();


  /**
   * <p>
   * Setter method for the COM property "stopOpacity"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412815) //= 0x800114b1. The runtime will prefer the VTID if present
  @VTID(326)
  void stopOpacity(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "stopOpacity"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412815) //= 0x800114b1. The runtime will prefer the VTID if present
  @VTID(327)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object stopOpacity();


  /**
   * <p>
   * Setter method for the COM property "stroke"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412814) //= 0x800114b2. The runtime will prefer the VTID if present
  @VTID(328)
  void stroke(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "stroke"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412814) //= 0x800114b2. The runtime will prefer the VTID if present
  @VTID(329)
  java.lang.String stroke();


  /**
   * <p>
   * Setter method for the COM property "strokeDasharray"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412813) //= 0x800114b3. The runtime will prefer the VTID if present
  @VTID(330)
  void strokeDasharray(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "strokeDasharray"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412813) //= 0x800114b3. The runtime will prefer the VTID if present
  @VTID(331)
  java.lang.String strokeDasharray();


  /**
   * <p>
   * Setter method for the COM property "strokeDashoffset"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412812) //= 0x800114b4. The runtime will prefer the VTID if present
  @VTID(332)
  void strokeDashoffset(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "strokeDashoffset"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412812) //= 0x800114b4. The runtime will prefer the VTID if present
  @VTID(333)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object strokeDashoffset();


  /**
   * <p>
   * Setter method for the COM property "strokeLinecap"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412811) //= 0x800114b5. The runtime will prefer the VTID if present
  @VTID(334)
  void strokeLinecap(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "strokeLinecap"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412811) //= 0x800114b5. The runtime will prefer the VTID if present
  @VTID(335)
  java.lang.String strokeLinecap();


  /**
   * <p>
   * Setter method for the COM property "strokeLinejoin"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412810) //= 0x800114b6. The runtime will prefer the VTID if present
  @VTID(336)
  void strokeLinejoin(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "strokeLinejoin"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412810) //= 0x800114b6. The runtime will prefer the VTID if present
  @VTID(337)
  java.lang.String strokeLinejoin();


  /**
   * <p>
   * Setter method for the COM property "strokeMiterlimit"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412809) //= 0x800114b7. The runtime will prefer the VTID if present
  @VTID(338)
  void strokeMiterlimit(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "strokeMiterlimit"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412809) //= 0x800114b7. The runtime will prefer the VTID if present
  @VTID(339)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object strokeMiterlimit();


  /**
   * <p>
   * Setter method for the COM property "strokeOpacity"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412808) //= 0x800114b8. The runtime will prefer the VTID if present
  @VTID(340)
  void strokeOpacity(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "strokeOpacity"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412808) //= 0x800114b8. The runtime will prefer the VTID if present
  @VTID(341)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object strokeOpacity();


  /**
   * <p>
   * Setter method for the COM property "strokeWidth"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412807) //= 0x800114b9. The runtime will prefer the VTID if present
  @VTID(342)
  void strokeWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "strokeWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412807) //= 0x800114b9. The runtime will prefer the VTID if present
  @VTID(343)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object strokeWidth();


  /**
   * <p>
   * Setter method for the COM property "textAnchor"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412806) //= 0x800114ba. The runtime will prefer the VTID if present
  @VTID(344)
  void textAnchor(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textAnchor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412806) //= 0x800114ba. The runtime will prefer the VTID if present
  @VTID(345)
  java.lang.String textAnchor();


  /**
   * <p>
   * Setter method for the COM property "glyphOrientationHorizontal"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412805) //= 0x800114bb. The runtime will prefer the VTID if present
  @VTID(346)
  void glyphOrientationHorizontal(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "glyphOrientationHorizontal"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412805) //= 0x800114bb. The runtime will prefer the VTID if present
  @VTID(347)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object glyphOrientationHorizontal();


  /**
   * <p>
   * Setter method for the COM property "glyphOrientationVertical"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412804) //= 0x800114bc. The runtime will prefer the VTID if present
  @VTID(348)
  void glyphOrientationVertical(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "glyphOrientationVertical"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412804) //= 0x800114bc. The runtime will prefer the VTID if present
  @VTID(349)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object glyphOrientationVertical();


  /**
   * <p>
   * Setter method for the COM property "borderRadius"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412802) //= 0x800114be. The runtime will prefer the VTID if present
  @VTID(350)
  void borderRadius(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderRadius"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412802) //= 0x800114be. The runtime will prefer the VTID if present
  @VTID(351)
  java.lang.String borderRadius();


  /**
   * <p>
   * Setter method for the COM property "borderTopLeftRadius"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412801) //= 0x800114bf. The runtime will prefer the VTID if present
  @VTID(352)
  void borderTopLeftRadius(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderTopLeftRadius"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412801) //= 0x800114bf. The runtime will prefer the VTID if present
  @VTID(353)
  java.lang.String borderTopLeftRadius();


  /**
   * <p>
   * Setter method for the COM property "borderTopRightRadius"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412800) //= 0x800114c0. The runtime will prefer the VTID if present
  @VTID(354)
  void borderTopRightRadius(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderTopRightRadius"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412800) //= 0x800114c0. The runtime will prefer the VTID if present
  @VTID(355)
  java.lang.String borderTopRightRadius();


  /**
   * <p>
   * Setter method for the COM property "borderBottomRightRadius"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412799) //= 0x800114c1. The runtime will prefer the VTID if present
  @VTID(356)
  void borderBottomRightRadius(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderBottomRightRadius"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412799) //= 0x800114c1. The runtime will prefer the VTID if present
  @VTID(357)
  java.lang.String borderBottomRightRadius();


  /**
   * <p>
   * Setter method for the COM property "borderBottomLeftRadius"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412798) //= 0x800114c2. The runtime will prefer the VTID if present
  @VTID(358)
  void borderBottomLeftRadius(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderBottomLeftRadius"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412798) //= 0x800114c2. The runtime will prefer the VTID if present
  @VTID(359)
  java.lang.String borderBottomLeftRadius();


  /**
   * <p>
   * Setter method for the COM property "clipTop"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413019) //= 0x800113e5. The runtime will prefer the VTID if present
  @VTID(360)
  void clipTop(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "clipTop"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413019) //= 0x800113e5. The runtime will prefer the VTID if present
  @VTID(361)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clipTop();


  /**
   * <p>
   * Setter method for the COM property "clipRight"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413018) //= 0x800113e6. The runtime will prefer the VTID if present
  @VTID(362)
  void clipRight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "clipRight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413018) //= 0x800113e6. The runtime will prefer the VTID if present
  @VTID(363)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clipRight();


  /**
   * <p>
   * Getter method for the COM property "clipBottom"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413017) //= 0x800113e7. The runtime will prefer the VTID if present
  @VTID(364)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clipBottom();


  /**
   * <p>
   * Setter method for the COM property "clipLeft"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413016) //= 0x800113e8. The runtime will prefer the VTID if present
  @VTID(365)
  void clipLeft(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "clipLeft"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413016) //= 0x800113e8. The runtime will prefer the VTID if present
  @VTID(366)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clipLeft();


  /**
   * <p>
   * Setter method for the COM property "cssFloat"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412803) //= 0x800114bd. The runtime will prefer the VTID if present
  @VTID(367)
  void cssFloat(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "cssFloat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412803) //= 0x800114bd. The runtime will prefer the VTID if present
  @VTID(368)
  java.lang.String cssFloat();


  /**
   * <p>
   * Setter method for the COM property "backgroundClip"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412796) //= 0x800114c4. The runtime will prefer the VTID if present
  @VTID(369)
  void backgroundClip(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "backgroundClip"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412796) //= 0x800114c4. The runtime will prefer the VTID if present
  @VTID(370)
  java.lang.String backgroundClip();


  /**
   * <p>
   * Setter method for the COM property "backgroundOrigin"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412795) //= 0x800114c5. The runtime will prefer the VTID if present
  @VTID(371)
  void backgroundOrigin(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "backgroundOrigin"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412795) //= 0x800114c5. The runtime will prefer the VTID if present
  @VTID(372)
  java.lang.String backgroundOrigin();


  /**
   * <p>
   * Setter method for the COM property "backgroundSize"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412794) //= 0x800114c6. The runtime will prefer the VTID if present
  @VTID(373)
  void backgroundSize(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "backgroundSize"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412794) //= 0x800114c6. The runtime will prefer the VTID if present
  @VTID(374)
  java.lang.String backgroundSize();


  /**
   * <p>
   * Setter method for the COM property "boxShadow"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412793) //= 0x800114c7. The runtime will prefer the VTID if present
  @VTID(375)
  void boxShadow(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "boxShadow"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412793) //= 0x800114c7. The runtime will prefer the VTID if present
  @VTID(376)
  java.lang.String boxShadow();


  /**
   * <p>
   * Setter method for the COM property "msTransform"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412797) //= 0x800114c3. The runtime will prefer the VTID if present
  @VTID(377)
  void msTransform(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "msTransform"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412797) //= 0x800114c3. The runtime will prefer the VTID if present
  @VTID(378)
  java.lang.String msTransform();


  /**
   * <p>
   * Setter method for the COM property "msTransformOrigin"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412787) //= 0x800114cd. The runtime will prefer the VTID if present
  @VTID(379)
  void msTransformOrigin(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "msTransformOrigin"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412787) //= 0x800114cd. The runtime will prefer the VTID if present
  @VTID(380)
  java.lang.String msTransformOrigin();


  // Properties:
}
