package ms.html  ;

import com4j.*;

@IID("{3050F1FF-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLElement extends Com4jObject {
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
   * Setter method for the COM property "className"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417111) //= 0x800103e9. The runtime will prefer the VTID if present
  @VTID(10)
  void className(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "className"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417111) //= 0x800103e9. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String className();


  /**
   * <p>
   * Setter method for the COM property "id"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417110) //= 0x800103ea. The runtime will prefer the VTID if present
  @VTID(12)
  void id(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "id"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417110) //= 0x800103ea. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String id();


  /**
   * <p>
   * Getter method for the COM property "tagName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417108) //= 0x800103ec. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String tagName();


  /**
   * <p>
   * Getter method for the COM property "parentElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(-2147418104) //= 0x80010008. The runtime will prefer the VTID if present
  @VTID(15)
  ms.html.IHTMLElement parentElement();


  /**
   * <p>
   * Getter method for the COM property "style"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyle
   */

  @DISPID(-2147418038) //= 0x8001004a. The runtime will prefer the VTID if present
  @VTID(16)
  ms.html.IHTMLStyle style();


  /**
   * <p>
   * Setter method for the COM property "onhelp"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412099) //= 0x8001177d. The runtime will prefer the VTID if present
  @VTID(17)
  void onhelp(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onhelp"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412099) //= 0x8001177d. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onhelp();


  /**
   * <p>
   * Setter method for the COM property "onclick"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412104) //= 0x80011778. The runtime will prefer the VTID if present
  @VTID(19)
  void onclick(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onclick"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412104) //= 0x80011778. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onclick();


  /**
   * <p>
   * Setter method for the COM property "ondblclick"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412103) //= 0x80011779. The runtime will prefer the VTID if present
  @VTID(21)
  void ondblclick(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondblclick"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412103) //= 0x80011779. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondblclick();


  /**
   * <p>
   * Setter method for the COM property "onkeydown"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412107) //= 0x80011775. The runtime will prefer the VTID if present
  @VTID(23)
  void onkeydown(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onkeydown"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412107) //= 0x80011775. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onkeydown();


  /**
   * <p>
   * Setter method for the COM property "onkeyup"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412106) //= 0x80011776. The runtime will prefer the VTID if present
  @VTID(25)
  void onkeyup(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onkeyup"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412106) //= 0x80011776. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onkeyup();


  /**
   * <p>
   * Setter method for the COM property "onkeypress"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412105) //= 0x80011777. The runtime will prefer the VTID if present
  @VTID(27)
  void onkeypress(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onkeypress"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412105) //= 0x80011777. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onkeypress();


  /**
   * <p>
   * Setter method for the COM property "onmouseout"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412111) //= 0x80011771. The runtime will prefer the VTID if present
  @VTID(29)
  void onmouseout(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmouseout"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412111) //= 0x80011771. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmouseout();


  /**
   * <p>
   * Setter method for the COM property "onmouseover"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412112) //= 0x80011770. The runtime will prefer the VTID if present
  @VTID(31)
  void onmouseover(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmouseover"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412112) //= 0x80011770. The runtime will prefer the VTID if present
  @VTID(32)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmouseover();


  /**
   * <p>
   * Setter method for the COM property "onmousemove"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412108) //= 0x80011774. The runtime will prefer the VTID if present
  @VTID(33)
  void onmousemove(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmousemove"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412108) //= 0x80011774. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmousemove();


  /**
   * <p>
   * Setter method for the COM property "onmousedown"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412110) //= 0x80011772. The runtime will prefer the VTID if present
  @VTID(35)
  void onmousedown(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmousedown"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412110) //= 0x80011772. The runtime will prefer the VTID if present
  @VTID(36)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmousedown();


  /**
   * <p>
   * Setter method for the COM property "onmouseup"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412109) //= 0x80011773. The runtime will prefer the VTID if present
  @VTID(37)
  void onmouseup(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmouseup"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412109) //= 0x80011773. The runtime will prefer the VTID if present
  @VTID(38)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmouseup();


  /**
   * <p>
   * Getter method for the COM property "document"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147417094) //= 0x800103fa. The runtime will prefer the VTID if present
  @VTID(39)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject document();


  /**
   * <p>
   * Setter method for the COM property "title"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418043) //= 0x80010045. The runtime will prefer the VTID if present
  @VTID(40)
  void title(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418043) //= 0x80010045. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "language"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413012) //= 0x800113ec. The runtime will prefer the VTID if present
  @VTID(42)
  void language(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "language"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413012) //= 0x800113ec. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String language();


  /**
   * <p>
   * Setter method for the COM property "onselectstart"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412075) //= 0x80011795. The runtime will prefer the VTID if present
  @VTID(44)
  void onselectstart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onselectstart"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412075) //= 0x80011795. The runtime will prefer the VTID if present
  @VTID(45)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onselectstart();


  /**
   * @param varargStart Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-2147417093) //= 0x800103fb. The runtime will prefer the VTID if present
  @VTID(46)
  void scrollIntoView(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varargStart);


  /**
   * @param pChild Mandatory ms.html.IHTMLElement parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417092) //= 0x800103fc. The runtime will prefer the VTID if present
  @VTID(47)
  boolean contains(
    ms.html.IHTMLElement pChild);


  /**
   * <p>
   * Getter method for the COM property "sourceIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147417088) //= 0x80010400. The runtime will prefer the VTID if present
  @VTID(48)
  int sourceIndex();


  /**
   * <p>
   * Getter method for the COM property "recordNumber"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147417087) //= 0x80010401. The runtime will prefer the VTID if present
  @VTID(49)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object recordNumber();


  /**
   * <p>
   * Setter method for the COM property "lang"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413103) //= 0x80011391. The runtime will prefer the VTID if present
  @VTID(50)
  void lang(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "lang"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413103) //= 0x80011391. The runtime will prefer the VTID if present
  @VTID(51)
  java.lang.String lang();


  /**
   * <p>
   * Getter method for the COM property "offsetLeft"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147417104) //= 0x800103f0. The runtime will prefer the VTID if present
  @VTID(52)
  int offsetLeft();


  /**
   * <p>
   * Getter method for the COM property "offsetTop"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147417103) //= 0x800103f1. The runtime will prefer the VTID if present
  @VTID(53)
  int offsetTop();


  /**
   * <p>
   * Getter method for the COM property "offsetWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147417102) //= 0x800103f2. The runtime will prefer the VTID if present
  @VTID(54)
  int offsetWidth();


  /**
   * <p>
   * Getter method for the COM property "offsetHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147417101) //= 0x800103f3. The runtime will prefer the VTID if present
  @VTID(55)
  int offsetHeight();


  /**
   * <p>
   * Getter method for the COM property "offsetParent"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(-2147417100) //= 0x800103f4. The runtime will prefer the VTID if present
  @VTID(56)
  ms.html.IHTMLElement offsetParent();


  /**
   * <p>
   * Setter method for the COM property "innerHTML"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417086) //= 0x80010402. The runtime will prefer the VTID if present
  @VTID(57)
  void innerHTML(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "innerHTML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417086) //= 0x80010402. The runtime will prefer the VTID if present
  @VTID(58)
  java.lang.String innerHTML();


  /**
   * <p>
   * Setter method for the COM property "innerText"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417085) //= 0x80010403. The runtime will prefer the VTID if present
  @VTID(59)
  void innerText(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "innerText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417085) //= 0x80010403. The runtime will prefer the VTID if present
  @VTID(60)
  java.lang.String innerText();


  /**
   * <p>
   * Setter method for the COM property "outerHTML"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417084) //= 0x80010404. The runtime will prefer the VTID if present
  @VTID(61)
  void outerHTML(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "outerHTML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417084) //= 0x80010404. The runtime will prefer the VTID if present
  @VTID(62)
  java.lang.String outerHTML();


  /**
   * <p>
   * Setter method for the COM property "outerText"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417083) //= 0x80010405. The runtime will prefer the VTID if present
  @VTID(63)
  void outerText(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "outerText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417083) //= 0x80010405. The runtime will prefer the VTID if present
  @VTID(64)
  java.lang.String outerText();


  /**
   * @param where Mandatory java.lang.String parameter.
   * @param html Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417082) //= 0x80010406. The runtime will prefer the VTID if present
  @VTID(65)
  void insertAdjacentHTML(
    java.lang.String where,
    java.lang.String html);


  /**
   * @param where Mandatory java.lang.String parameter.
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417081) //= 0x80010407. The runtime will prefer the VTID if present
  @VTID(66)
  void insertAdjacentText(
    java.lang.String where,
    java.lang.String text);


  /**
   * <p>
   * Getter method for the COM property "parentTextEdit"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(-2147417080) //= 0x80010408. The runtime will prefer the VTID if present
  @VTID(67)
  ms.html.IHTMLElement parentTextEdit();


  /**
   * <p>
   * Getter method for the COM property "isTextEdit"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417078) //= 0x8001040a. The runtime will prefer the VTID if present
  @VTID(68)
  boolean isTextEdit();


  /**
   */

  @DISPID(-2147417079) //= 0x80010409. The runtime will prefer the VTID if present
  @VTID(69)
  void click();


  /**
   * <p>
   * Getter method for the COM property "filters"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLFiltersCollection
   */

  @DISPID(-2147417077) //= 0x8001040b. The runtime will prefer the VTID if present
  @VTID(70)
  ms.html.IHTMLFiltersCollection filters();


  @VTID(70)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={ms.html.IHTMLFiltersCollection.class})
  java.lang.Object filters(
    java.lang.Object pvarIndex);

  /**
   * <p>
   * Setter method for the COM property "ondragstart"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412077) //= 0x80011793. The runtime will prefer the VTID if present
  @VTID(71)
  void ondragstart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragstart"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412077) //= 0x80011793. The runtime will prefer the VTID if present
  @VTID(72)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragstart();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417076) //= 0x8001040c. The runtime will prefer the VTID if present
  @VTID(73)
  java.lang.String toString_();


  /**
   * <p>
   * Setter method for the COM property "onbeforeupdate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412091) //= 0x80011785. The runtime will prefer the VTID if present
  @VTID(74)
  void onbeforeupdate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforeupdate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412091) //= 0x80011785. The runtime will prefer the VTID if present
  @VTID(75)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforeupdate();


  /**
   * <p>
   * Setter method for the COM property "onafterupdate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412090) //= 0x80011786. The runtime will prefer the VTID if present
  @VTID(76)
  void onafterupdate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onafterupdate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412090) //= 0x80011786. The runtime will prefer the VTID if present
  @VTID(77)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onafterupdate();


  /**
   * <p>
   * Setter method for the COM property "onerrorupdate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412074) //= 0x80011796. The runtime will prefer the VTID if present
  @VTID(78)
  void onerrorupdate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onerrorupdate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412074) //= 0x80011796. The runtime will prefer the VTID if present
  @VTID(79)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onerrorupdate();


  /**
   * <p>
   * Setter method for the COM property "onrowexit"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412094) //= 0x80011782. The runtime will prefer the VTID if present
  @VTID(80)
  void onrowexit(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onrowexit"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412094) //= 0x80011782. The runtime will prefer the VTID if present
  @VTID(81)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onrowexit();


  /**
   * <p>
   * Setter method for the COM property "onrowenter"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412093) //= 0x80011783. The runtime will prefer the VTID if present
  @VTID(82)
  void onrowenter(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onrowenter"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412093) //= 0x80011783. The runtime will prefer the VTID if present
  @VTID(83)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onrowenter();


  /**
   * <p>
   * Setter method for the COM property "ondatasetchanged"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412072) //= 0x80011798. The runtime will prefer the VTID if present
  @VTID(84)
  void ondatasetchanged(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondatasetchanged"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412072) //= 0x80011798. The runtime will prefer the VTID if present
  @VTID(85)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondatasetchanged();


  /**
   * <p>
   * Setter method for the COM property "ondataavailable"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412071) //= 0x80011799. The runtime will prefer the VTID if present
  @VTID(86)
  void ondataavailable(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondataavailable"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412071) //= 0x80011799. The runtime will prefer the VTID if present
  @VTID(87)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondataavailable();


  /**
   * <p>
   * Setter method for the COM property "ondatasetcomplete"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412070) //= 0x8001179a. The runtime will prefer the VTID if present
  @VTID(88)
  void ondatasetcomplete(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondatasetcomplete"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412070) //= 0x8001179a. The runtime will prefer the VTID if present
  @VTID(89)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondatasetcomplete();


  /**
   * <p>
   * Setter method for the COM property "onfilterchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412069) //= 0x8001179b. The runtime will prefer the VTID if present
  @VTID(90)
  void onfilterchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onfilterchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412069) //= 0x8001179b. The runtime will prefer the VTID if present
  @VTID(91)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onfilterchange();


  /**
   * <p>
   * Getter method for the COM property "children"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147417075) //= 0x8001040d. The runtime will prefer the VTID if present
  @VTID(92)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject children();


  /**
   * <p>
   * Getter method for the COM property "all"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147417074) //= 0x8001040e. The runtime will prefer the VTID if present
  @VTID(93)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject all();


  // Properties:
}
