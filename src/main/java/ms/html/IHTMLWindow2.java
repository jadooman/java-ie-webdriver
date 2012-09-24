package ms.html  ;

import com4j.*;

@IID("{332C4427-26CB-11D0-B483-00C04FD90119}")
public interface IHTMLWindow2 extends ms.html.IHTMLFramesCollection2 {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "frames"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLFramesCollection2
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLFramesCollection2 frames();


  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={ms.html.IHTMLFramesCollection2.class})
  java.lang.Object frames(
    java.lang.Object pvarIndex);

  /**
   * <p>
   * Setter method for the COM property "defaultStatus"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(10)
  void defaultStatus(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "defaultStatus"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String defaultStatus();


  /**
   * <p>
   * Setter method for the COM property "status"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1102) //= 0x44e. The runtime will prefer the VTID if present
  @VTID(12)
  void status(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "status"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1102) //= 0x44e. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String status();


  /**
   * @param expression Mandatory java.lang.String parameter.
   * @param msec Mandatory int parameter.
   * @param language Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(1172) //= 0x494. The runtime will prefer the VTID if present
  @VTID(14)
  int setTimeout(
    java.lang.String expression,
    int msec,
    @Optional java.lang.Object language);


  /**
   * @param timerID Mandatory int parameter.
   */

  @DISPID(1104) //= 0x450. The runtime will prefer the VTID if present
  @VTID(15)
  void clearTimeout(
    int timerID);


  /**
   * @param message Optional parameter. Default value is ""
   */

  @DISPID(1105) //= 0x451. The runtime will prefer the VTID if present
  @VTID(16)
  void alert(
    @Optional @DefaultValue("") java.lang.String message);


  /**
   * @param message Optional parameter. Default value is ""
   * @return  Returns a value of type boolean
   */

  @DISPID(1110) //= 0x456. The runtime will prefer the VTID if present
  @VTID(17)
  boolean confirm(
    @Optional @DefaultValue("") java.lang.String message);


  /**
   * @param message Optional parameter. Default value is ""
   * @param defstr Optional parameter. Default value is "undefined"
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1111) //= 0x457. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object prompt(
    @Optional @DefaultValue("") java.lang.String message,
    @Optional @DefaultValue("undefined") java.lang.String defstr);


  /**
   * <p>
   * Getter method for the COM property "Image"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLImageElementFactory
   */

  @DISPID(1125) //= 0x465. The runtime will prefer the VTID if present
  @VTID(19)
  ms.html.IHTMLImageElementFactory image();


  @VTID(19)
  @ReturnValue(defaultPropertyThrough={ms.html.IHTMLImageElementFactory.class})
  ms.html.IHTMLImgElement image(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object width,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object height);

  /**
   * <p>
   * Getter method for the COM property "location"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLLocation
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  ms.html.IHTMLLocation location();


  /**
   * <p>
   * Getter method for the COM property "history"
   * </p>
   * @return  Returns a value of type ms.html.IOmHistory
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(21)
  ms.html.IOmHistory history();


  /**
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(22)
  void close();


  /**
   * <p>
   * Setter method for the COM property "opener"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(23)
  void opener(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "opener"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object opener();


  /**
   * <p>
   * Getter method for the COM property "navigator"
   * </p>
   * @return  Returns a value of type ms.html.IOmNavigator
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(25)
  ms.html.IOmNavigator navigator();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  void name(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "parent"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLWindow2
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  ms.html.IHTMLWindow2 parent();


  /**
   * @param url Optional parameter. Default value is ""
   * @param name Optional parameter. Default value is ""
   * @param features Optional parameter. Default value is ""
   * @param replace Optional parameter. Default value is false
   * @return  Returns a value of type ms.html.IHTMLWindow2
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(29)
  ms.html.IHTMLWindow2 open(
    @Optional @DefaultValue("") java.lang.String url,
    @Optional @DefaultValue("") java.lang.String name,
    @Optional @DefaultValue("") java.lang.String features,
    @Optional @DefaultValue("0") boolean replace);


  /**
   * <p>
   * Getter method for the COM property "self"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLWindow2
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(30)
  ms.html.IHTMLWindow2 self();


  /**
   * <p>
   * Getter method for the COM property "top"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLWindow2
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(31)
  ms.html.IHTMLWindow2 top();


  /**
   * <p>
   * Getter method for the COM property "window"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLWindow2
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(32)
  ms.html.IHTMLWindow2 window();


  /**
   * @param url Mandatory java.lang.String parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(33)
  void navigate(
    java.lang.String url);


  /**
   * <p>
   * Setter method for the COM property "onfocus"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412098) //= 0x8001177e. The runtime will prefer the VTID if present
  @VTID(34)
  void onfocus(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onfocus"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412098) //= 0x8001177e. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onfocus();


  /**
   * <p>
   * Setter method for the COM property "onblur"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412097) //= 0x8001177f. The runtime will prefer the VTID if present
  @VTID(36)
  void onblur(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onblur"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412097) //= 0x8001177f. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onblur();


  /**
   * <p>
   * Setter method for the COM property "onload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(38)
  void onload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(39)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onload();


  /**
   * <p>
   * Setter method for the COM property "onbeforeunload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412073) //= 0x80011797. The runtime will prefer the VTID if present
  @VTID(40)
  void onbeforeunload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforeunload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412073) //= 0x80011797. The runtime will prefer the VTID if present
  @VTID(41)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforeunload();


  /**
   * <p>
   * Setter method for the COM property "onunload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412079) //= 0x80011791. The runtime will prefer the VTID if present
  @VTID(42)
  void onunload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onunload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412079) //= 0x80011791. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onunload();


  /**
   * <p>
   * Setter method for the COM property "onhelp"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412099) //= 0x8001177d. The runtime will prefer the VTID if present
  @VTID(44)
  void onhelp(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onhelp"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412099) //= 0x8001177d. The runtime will prefer the VTID if present
  @VTID(45)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onhelp();


  /**
   * <p>
   * Setter method for the COM property "onerror"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(46)
  void onerror(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onerror"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(47)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onerror();


  /**
   * <p>
   * Setter method for the COM property "onresize"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412076) //= 0x80011794. The runtime will prefer the VTID if present
  @VTID(48)
  void onresize(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onresize"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412076) //= 0x80011794. The runtime will prefer the VTID if present
  @VTID(49)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onresize();


  /**
   * <p>
   * Setter method for the COM property "onscroll"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412081) //= 0x8001178f. The runtime will prefer the VTID if present
  @VTID(50)
  void onscroll(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onscroll"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412081) //= 0x8001178f. The runtime will prefer the VTID if present
  @VTID(51)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onscroll();


  /**
   * <p>
   * Getter method for the COM property "document"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDocument2
   */

  @DISPID(1151) //= 0x47f. The runtime will prefer the VTID if present
  @VTID(52)
  ms.html.IHTMLDocument2 document();


  /**
   * <p>
   * Getter method for the COM property "event"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLEventObj
   */

  @DISPID(1152) //= 0x480. The runtime will prefer the VTID if present
  @VTID(53)
  ms.html.IHTMLEventObj event();


  /**
   * <p>
   * Getter method for the COM property "_newEnum"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1153) //= 0x481. The runtime will prefer the VTID if present
  @VTID(54)
  com4j.Com4jObject _newEnum();


  /**
   * @param dialog Mandatory java.lang.String parameter.
   * @param varArgIn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varOptions Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1154) //= 0x482. The runtime will prefer the VTID if present
  @VTID(55)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object showModalDialog(
    java.lang.String dialog,
    @Optional java.lang.Object varArgIn,
    @Optional java.lang.Object varOptions);


  /**
   * @param helpURL Mandatory java.lang.String parameter.
   * @param helpArg Optional parameter. Default value is com4j.Variant.getMissing()
   * @param features Optional parameter. Default value is ""
   */

  @DISPID(1155) //= 0x483. The runtime will prefer the VTID if present
  @VTID(56)
  void showHelp(
    java.lang.String helpURL,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object helpArg,
    @Optional @DefaultValue("") java.lang.String features);


  /**
   * <p>
   * Getter method for the COM property "screen"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLScreen
   */

  @DISPID(1156) //= 0x484. The runtime will prefer the VTID if present
  @VTID(57)
  ms.html.IHTMLScreen screen();


  /**
   * <p>
   * Getter method for the COM property "Option"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLOptionElementFactory
   */

  @DISPID(1157) //= 0x485. The runtime will prefer the VTID if present
  @VTID(58)
  ms.html.IHTMLOptionElementFactory option();


  @VTID(58)
  @ReturnValue(defaultPropertyThrough={ms.html.IHTMLOptionElementFactory.class})
  ms.html.IHTMLOptionElement option(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object value,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object defaultSelected,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object selected);

  /**
   */

  @DISPID(1158) //= 0x486. The runtime will prefer the VTID if present
  @VTID(59)
  void focus();


  /**
   * <p>
   * Getter method for the COM property "closed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(60)
  boolean closed();


  /**
   */

  @DISPID(1159) //= 0x487. The runtime will prefer the VTID if present
  @VTID(61)
  void blur();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(1160) //= 0x488. The runtime will prefer the VTID if present
  @VTID(62)
  void scroll(
    int x,
    int y);


  /**
   * <p>
   * Getter method for the COM property "clientInformation"
   * </p>
   * @return  Returns a value of type ms.html.IOmNavigator
   */

  @DISPID(1161) //= 0x489. The runtime will prefer the VTID if present
  @VTID(63)
  ms.html.IOmNavigator clientInformation();


  /**
   * @param expression Mandatory java.lang.String parameter.
   * @param msec Mandatory int parameter.
   * @param language Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(1173) //= 0x495. The runtime will prefer the VTID if present
  @VTID(64)
  int setInterval(
    java.lang.String expression,
    int msec,
    @Optional java.lang.Object language);


  /**
   * @param timerID Mandatory int parameter.
   */

  @DISPID(1163) //= 0x48b. The runtime will prefer the VTID if present
  @VTID(65)
  void clearInterval(
    int timerID);


  /**
   * <p>
   * Setter method for the COM property "offscreenBuffering"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1164) //= 0x48c. The runtime will prefer the VTID if present
  @VTID(66)
  void offscreenBuffering(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "offscreenBuffering"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1164) //= 0x48c. The runtime will prefer the VTID if present
  @VTID(67)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object offscreenBuffering();


  /**
   * @param code Mandatory java.lang.String parameter.
   * @param language Optional parameter. Default value is "JScript"
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1165) //= 0x48d. The runtime will prefer the VTID if present
  @VTID(68)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object execScript(
    java.lang.String code,
    @Optional @DefaultValue("JScript") java.lang.String language);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1166) //= 0x48e. The runtime will prefer the VTID if present
  @VTID(69)
  java.lang.String toString_();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(1167) //= 0x48f. The runtime will prefer the VTID if present
  @VTID(70)
  void scrollBy(
    int x,
    int y);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(1168) //= 0x490. The runtime will prefer the VTID if present
  @VTID(71)
  void scrollTo(
    int x,
    int y);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(72)
  void moveTo(
    int x,
    int y);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(73)
  void moveBy(
    int x,
    int y);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(74)
  void resizeTo(
    int x,
    int y);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(75)
  void resizeBy(
    int x,
    int y);


  /**
   * <p>
   * Getter method for the COM property "external"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1169) //= 0x491. The runtime will prefer the VTID if present
  @VTID(76)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject external();


  // Properties:
}
