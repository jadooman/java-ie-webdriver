package ms.html  ;

import com4j.*;

@IID("{305104B7-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLWindow7 extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type ms.html.IHTMLSelection
   */

  @DISPID(1199) //= 0x4af. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLSelection getSelection();


  /**
   * @param varArgIn Mandatory ms.html.IHTMLDOMNode parameter.
   * @param bstrPseudoElt Optional parameter. Default value is ""
   * @return  Returns a value of type ms.html.IHTMLCSSStyleDeclaration
   */

  @DISPID(1200) //= 0x4b0. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLCSSStyleDeclaration getComputedStyle(
    ms.html.IHTMLDOMNode varArgIn,
    @Optional @DefaultValue("") java.lang.String bstrPseudoElt);


  /**
   * <p>
   * Getter method for the COM property "styleMedia"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyleMedia
   */

  @DISPID(1202) //= 0x4b2. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLStyleMedia styleMedia();


  /**
   * <p>
   * Setter method for the COM property "performance"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1203) //= 0x4b3. The runtime will prefer the VTID if present
  @VTID(10)
  void performance(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "performance"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1203) //= 0x4b3. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object performance();


  /**
   * <p>
   * Getter method for the COM property "innerWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1204) //= 0x4b4. The runtime will prefer the VTID if present
  @VTID(12)
  int innerWidth();


  /**
   * <p>
   * Getter method for the COM property "innerHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1205) //= 0x4b5. The runtime will prefer the VTID if present
  @VTID(13)
  int innerHeight();


  /**
   * <p>
   * Getter method for the COM property "pageXOffset"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1206) //= 0x4b6. The runtime will prefer the VTID if present
  @VTID(14)
  int pageXOffset();


  /**
   * <p>
   * Getter method for the COM property "pageYOffset"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1207) //= 0x4b7. The runtime will prefer the VTID if present
  @VTID(15)
  int pageYOffset();


  /**
   * <p>
   * Getter method for the COM property "screenX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1208) //= 0x4b8. The runtime will prefer the VTID if present
  @VTID(16)
  int screenX();


  /**
   * <p>
   * Getter method for the COM property "screenY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1209) //= 0x4b9. The runtime will prefer the VTID if present
  @VTID(17)
  int screenY();


  /**
   * <p>
   * Getter method for the COM property "outerWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1210) //= 0x4ba. The runtime will prefer the VTID if present
  @VTID(18)
  int outerWidth();


  /**
   * <p>
   * Getter method for the COM property "outerHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1211) //= 0x4bb. The runtime will prefer the VTID if present
  @VTID(19)
  int outerHeight();


  /**
   * <p>
   * Setter method for the COM property "onabort"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412084) //= 0x8001178c. The runtime will prefer the VTID if present
  @VTID(20)
  void onabort(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onabort"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412084) //= 0x8001178c. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onabort();


  /**
   * <p>
   * Setter method for the COM property "oncanplay"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411978) //= 0x800117f6. The runtime will prefer the VTID if present
  @VTID(22)
  void oncanplay(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncanplay"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411978) //= 0x800117f6. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncanplay();


  /**
   * <p>
   * Setter method for the COM property "oncanplaythrough"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411977) //= 0x800117f7. The runtime will prefer the VTID if present
  @VTID(24)
  void oncanplaythrough(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncanplaythrough"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411977) //= 0x800117f7. The runtime will prefer the VTID if present
  @VTID(25)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncanplaythrough();


  /**
   * <p>
   * Setter method for the COM property "onchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(26)
  void onchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onchange();


  /**
   * <p>
   * Setter method for the COM property "onclick"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412104) //= 0x80011778. The runtime will prefer the VTID if present
  @VTID(28)
  void onclick(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onclick"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412104) //= 0x80011778. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onclick();


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
   * Setter method for the COM property "ondblclick"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412103) //= 0x80011779. The runtime will prefer the VTID if present
  @VTID(32)
  void ondblclick(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondblclick"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412103) //= 0x80011779. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondblclick();


  /**
   * <p>
   * Setter method for the COM property "ondrag"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412063) //= 0x800117a1. The runtime will prefer the VTID if present
  @VTID(34)
  void ondrag(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondrag"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412063) //= 0x800117a1. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondrag();


  /**
   * <p>
   * Setter method for the COM property "ondragend"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412062) //= 0x800117a2. The runtime will prefer the VTID if present
  @VTID(36)
  void ondragend(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragend"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412062) //= 0x800117a2. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragend();


  /**
   * <p>
   * Setter method for the COM property "ondragenter"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412061) //= 0x800117a3. The runtime will prefer the VTID if present
  @VTID(38)
  void ondragenter(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragenter"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412061) //= 0x800117a3. The runtime will prefer the VTID if present
  @VTID(39)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragenter();


  /**
   * <p>
   * Setter method for the COM property "ondragleave"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412059) //= 0x800117a5. The runtime will prefer the VTID if present
  @VTID(40)
  void ondragleave(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragleave"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412059) //= 0x800117a5. The runtime will prefer the VTID if present
  @VTID(41)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragleave();


  /**
   * <p>
   * Setter method for the COM property "ondragover"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412060) //= 0x800117a4. The runtime will prefer the VTID if present
  @VTID(42)
  void ondragover(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragover"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412060) //= 0x800117a4. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragover();


  /**
   * <p>
   * Setter method for the COM property "ondragstart"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412077) //= 0x80011793. The runtime will prefer the VTID if present
  @VTID(44)
  void ondragstart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragstart"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412077) //= 0x80011793. The runtime will prefer the VTID if present
  @VTID(45)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragstart();


  /**
   * <p>
   * Setter method for the COM property "ondrop"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412058) //= 0x800117a6. The runtime will prefer the VTID if present
  @VTID(46)
  void ondrop(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondrop"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412058) //= 0x800117a6. The runtime will prefer the VTID if present
  @VTID(47)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondrop();


  /**
   * <p>
   * Setter method for the COM property "ondurationchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411976) //= 0x800117f8. The runtime will prefer the VTID if present
  @VTID(48)
  void ondurationchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondurationchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411976) //= 0x800117f8. The runtime will prefer the VTID if present
  @VTID(49)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondurationchange();


  /**
   * <p>
   * Setter method for the COM property "onfocusin"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412021) //= 0x800117cb. The runtime will prefer the VTID if present
  @VTID(50)
  void onfocusin(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onfocusin"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412021) //= 0x800117cb. The runtime will prefer the VTID if present
  @VTID(51)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onfocusin();


  /**
   * <p>
   * Setter method for the COM property "onfocusout"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412020) //= 0x800117cc. The runtime will prefer the VTID if present
  @VTID(52)
  void onfocusout(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onfocusout"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412020) //= 0x800117cc. The runtime will prefer the VTID if present
  @VTID(53)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onfocusout();


  /**
   * <p>
   * Setter method for the COM property "oninput"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411985) //= 0x800117ef. The runtime will prefer the VTID if present
  @VTID(54)
  void oninput(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oninput"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411985) //= 0x800117ef. The runtime will prefer the VTID if present
  @VTID(55)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oninput();


  /**
   * <p>
   * Setter method for the COM property "onemptied"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411975) //= 0x800117f9. The runtime will prefer the VTID if present
  @VTID(56)
  void onemptied(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onemptied"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411975) //= 0x800117f9. The runtime will prefer the VTID if present
  @VTID(57)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onemptied();


  /**
   * <p>
   * Setter method for the COM property "onended"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411974) //= 0x800117fa. The runtime will prefer the VTID if present
  @VTID(58)
  void onended(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onended"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411974) //= 0x800117fa. The runtime will prefer the VTID if present
  @VTID(59)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onended();


  /**
   * <p>
   * Setter method for the COM property "onkeydown"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412107) //= 0x80011775. The runtime will prefer the VTID if present
  @VTID(60)
  void onkeydown(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onkeydown"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412107) //= 0x80011775. The runtime will prefer the VTID if present
  @VTID(61)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onkeydown();


  /**
   * <p>
   * Setter method for the COM property "onkeypress"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412105) //= 0x80011777. The runtime will prefer the VTID if present
  @VTID(62)
  void onkeypress(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onkeypress"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412105) //= 0x80011777. The runtime will prefer the VTID if present
  @VTID(63)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onkeypress();


  /**
   * <p>
   * Setter method for the COM property "onkeyup"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412106) //= 0x80011776. The runtime will prefer the VTID if present
  @VTID(64)
  void onkeyup(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onkeyup"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412106) //= 0x80011776. The runtime will prefer the VTID if present
  @VTID(65)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onkeyup();


  /**
   * <p>
   * Setter method for the COM property "onloadeddata"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411973) //= 0x800117fb. The runtime will prefer the VTID if present
  @VTID(66)
  void onloadeddata(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onloadeddata"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411973) //= 0x800117fb. The runtime will prefer the VTID if present
  @VTID(67)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onloadeddata();


  /**
   * <p>
   * Setter method for the COM property "onloadedmetadata"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411972) //= 0x800117fc. The runtime will prefer the VTID if present
  @VTID(68)
  void onloadedmetadata(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onloadedmetadata"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411972) //= 0x800117fc. The runtime will prefer the VTID if present
  @VTID(69)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onloadedmetadata();


  /**
   * <p>
   * Setter method for the COM property "onloadstart"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411971) //= 0x800117fd. The runtime will prefer the VTID if present
  @VTID(70)
  void onloadstart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onloadstart"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411971) //= 0x800117fd. The runtime will prefer the VTID if present
  @VTID(71)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onloadstart();


  /**
   * <p>
   * Setter method for the COM property "onmousedown"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412110) //= 0x80011772. The runtime will prefer the VTID if present
  @VTID(72)
  void onmousedown(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmousedown"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412110) //= 0x80011772. The runtime will prefer the VTID if present
  @VTID(73)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmousedown();


  /**
   * <p>
   * Setter method for the COM property "onmouseenter"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412027) //= 0x800117c5. The runtime will prefer the VTID if present
  @VTID(74)
  void onmouseenter(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmouseenter"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412027) //= 0x800117c5. The runtime will prefer the VTID if present
  @VTID(75)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmouseenter();


  /**
   * <p>
   * Setter method for the COM property "onmouseleave"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412026) //= 0x800117c6. The runtime will prefer the VTID if present
  @VTID(76)
  void onmouseleave(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmouseleave"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412026) //= 0x800117c6. The runtime will prefer the VTID if present
  @VTID(77)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmouseleave();


  /**
   * <p>
   * Setter method for the COM property "onmousemove"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412108) //= 0x80011774. The runtime will prefer the VTID if present
  @VTID(78)
  void onmousemove(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmousemove"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412108) //= 0x80011774. The runtime will prefer the VTID if present
  @VTID(79)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmousemove();


  /**
   * <p>
   * Setter method for the COM property "onmouseout"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412111) //= 0x80011771. The runtime will prefer the VTID if present
  @VTID(80)
  void onmouseout(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmouseout"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412111) //= 0x80011771. The runtime will prefer the VTID if present
  @VTID(81)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmouseout();


  /**
   * <p>
   * Setter method for the COM property "onmouseover"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412112) //= 0x80011770. The runtime will prefer the VTID if present
  @VTID(82)
  void onmouseover(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmouseover"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412112) //= 0x80011770. The runtime will prefer the VTID if present
  @VTID(83)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmouseover();


  /**
   * <p>
   * Setter method for the COM property "onmouseup"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412109) //= 0x80011773. The runtime will prefer the VTID if present
  @VTID(84)
  void onmouseup(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmouseup"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412109) //= 0x80011773. The runtime will prefer the VTID if present
  @VTID(85)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmouseup();


  /**
   * <p>
   * Setter method for the COM property "onmousewheel"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412036) //= 0x800117bc. The runtime will prefer the VTID if present
  @VTID(86)
  void onmousewheel(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmousewheel"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412036) //= 0x800117bc. The runtime will prefer the VTID if present
  @VTID(87)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmousewheel();


  /**
   * <p>
   * Setter method for the COM property "onoffline"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412004) //= 0x800117dc. The runtime will prefer the VTID if present
  @VTID(88)
  void onoffline(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onoffline"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412004) //= 0x800117dc. The runtime will prefer the VTID if present
  @VTID(89)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onoffline();


  /**
   * <p>
   * Setter method for the COM property "ononline"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412005) //= 0x800117db. The runtime will prefer the VTID if present
  @VTID(90)
  void ononline(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ononline"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412005) //= 0x800117db. The runtime will prefer the VTID if present
  @VTID(91)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ononline();


  /**
   * <p>
   * Setter method for the COM property "onprogress"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411967) //= 0x80011801. The runtime will prefer the VTID if present
  @VTID(92)
  void onprogress(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onprogress"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411967) //= 0x80011801. The runtime will prefer the VTID if present
  @VTID(93)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onprogress();


  /**
   * <p>
   * Setter method for the COM property "onratechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411966) //= 0x80011802. The runtime will prefer the VTID if present
  @VTID(94)
  void onratechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onratechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411966) //= 0x80011802. The runtime will prefer the VTID if present
  @VTID(95)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onratechange();


  /**
   * <p>
   * Setter method for the COM property "onreadystatechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(96)
  void onreadystatechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onreadystatechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(97)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onreadystatechange();


  /**
   * <p>
   * Setter method for the COM property "onreset"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412100) //= 0x8001177c. The runtime will prefer the VTID if present
  @VTID(98)
  void onreset(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onreset"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412100) //= 0x8001177c. The runtime will prefer the VTID if present
  @VTID(99)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onreset();


  /**
   * <p>
   * Setter method for the COM property "onseeked"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411965) //= 0x80011803. The runtime will prefer the VTID if present
  @VTID(100)
  void onseeked(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onseeked"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411965) //= 0x80011803. The runtime will prefer the VTID if present
  @VTID(101)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onseeked();


  /**
   * <p>
   * Setter method for the COM property "onseeking"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411964) //= 0x80011804. The runtime will prefer the VTID if present
  @VTID(102)
  void onseeking(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onseeking"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411964) //= 0x80011804. The runtime will prefer the VTID if present
  @VTID(103)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onseeking();


  /**
   * <p>
   * Setter method for the COM property "onselect"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412102) //= 0x8001177a. The runtime will prefer the VTID if present
  @VTID(104)
  void onselect(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onselect"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412102) //= 0x8001177a. The runtime will prefer the VTID if present
  @VTID(105)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onselect();


  /**
   * <p>
   * Setter method for the COM property "onstalled"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411963) //= 0x80011805. The runtime will prefer the VTID if present
  @VTID(106)
  void onstalled(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onstalled"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411963) //= 0x80011805. The runtime will prefer the VTID if present
  @VTID(107)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onstalled();


  /**
   * <p>
   * Setter method for the COM property "onstorage"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412012) //= 0x800117d4. The runtime will prefer the VTID if present
  @VTID(108)
  void onstorage(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onstorage"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412012) //= 0x800117d4. The runtime will prefer the VTID if present
  @VTID(109)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onstorage();


  /**
   * <p>
   * Setter method for the COM property "onsubmit"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412101) //= 0x8001177b. The runtime will prefer the VTID if present
  @VTID(110)
  void onsubmit(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onsubmit"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412101) //= 0x8001177b. The runtime will prefer the VTID if present
  @VTID(111)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onsubmit();


  /**
   * <p>
   * Setter method for the COM property "onsuspend"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411962) //= 0x80011806. The runtime will prefer the VTID if present
  @VTID(112)
  void onsuspend(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onsuspend"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411962) //= 0x80011806. The runtime will prefer the VTID if present
  @VTID(113)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onsuspend();


  /**
   * <p>
   * Setter method for the COM property "ontimeupdate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411961) //= 0x80011807. The runtime will prefer the VTID if present
  @VTID(114)
  void ontimeupdate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ontimeupdate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411961) //= 0x80011807. The runtime will prefer the VTID if present
  @VTID(115)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ontimeupdate();


  /**
   * <p>
   * Setter method for the COM property "onpause"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411970) //= 0x800117fe. The runtime will prefer the VTID if present
  @VTID(116)
  void onpause(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onpause"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411970) //= 0x800117fe. The runtime will prefer the VTID if present
  @VTID(117)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onpause();


  /**
   * <p>
   * Setter method for the COM property "onplay"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411969) //= 0x800117ff. The runtime will prefer the VTID if present
  @VTID(118)
  void onplay(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onplay"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411969) //= 0x800117ff. The runtime will prefer the VTID if present
  @VTID(119)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onplay();


  /**
   * <p>
   * Setter method for the COM property "onplaying"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411968) //= 0x80011800. The runtime will prefer the VTID if present
  @VTID(120)
  void onplaying(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onplaying"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411968) //= 0x80011800. The runtime will prefer the VTID if present
  @VTID(121)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onplaying();


  /**
   * <p>
   * Setter method for the COM property "onvolumechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411960) //= 0x80011808. The runtime will prefer the VTID if present
  @VTID(122)
  void onvolumechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onvolumechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411960) //= 0x80011808. The runtime will prefer the VTID if present
  @VTID(123)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onvolumechange();


  /**
   * <p>
   * Setter method for the COM property "onwaiting"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411959) //= 0x80011809. The runtime will prefer the VTID if present
  @VTID(124)
  void onwaiting(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onwaiting"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411959) //= 0x80011809. The runtime will prefer the VTID if present
  @VTID(125)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onwaiting();


  // Properties:
}
