package ms.html  ;

import com4j.*;

@IID("{3050F434-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLElement2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "scopeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417073) //= 0x8001040f. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String scopeName();


  /**
   * @param containerCapture Optional parameter. Default value is false
   */

  @DISPID(-2147417072) //= 0x80010410. The runtime will prefer the VTID if present
  @VTID(8)
  void setCapture(
    @Optional @DefaultValue("-1") boolean containerCapture);


  /**
   */

  @DISPID(-2147417071) //= 0x80010411. The runtime will prefer the VTID if present
  @VTID(9)
  void releaseCapture();


  /**
   * <p>
   * Setter method for the COM property "onlosecapture"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412066) //= 0x8001179e. The runtime will prefer the VTID if present
  @VTID(10)
  void onlosecapture(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onlosecapture"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412066) //= 0x8001179e. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onlosecapture();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417070) //= 0x80010412. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String componentFromPoint(
    int x,
    int y);


  /**
   * @param component Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-2147417069) //= 0x80010413. The runtime will prefer the VTID if present
  @VTID(13)
  void doScroll(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object component);


  /**
   * <p>
   * Setter method for the COM property "onscroll"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412081) //= 0x8001178f. The runtime will prefer the VTID if present
  @VTID(14)
  void onscroll(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onscroll"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412081) //= 0x8001178f. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onscroll();


  /**
   * <p>
   * Setter method for the COM property "ondrag"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412063) //= 0x800117a1. The runtime will prefer the VTID if present
  @VTID(16)
  void ondrag(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondrag"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412063) //= 0x800117a1. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondrag();


  /**
   * <p>
   * Setter method for the COM property "ondragend"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412062) //= 0x800117a2. The runtime will prefer the VTID if present
  @VTID(18)
  void ondragend(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragend"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412062) //= 0x800117a2. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragend();


  /**
   * <p>
   * Setter method for the COM property "ondragenter"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412061) //= 0x800117a3. The runtime will prefer the VTID if present
  @VTID(20)
  void ondragenter(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragenter"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412061) //= 0x800117a3. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragenter();


  /**
   * <p>
   * Setter method for the COM property "ondragover"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412060) //= 0x800117a4. The runtime will prefer the VTID if present
  @VTID(22)
  void ondragover(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragover"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412060) //= 0x800117a4. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragover();


  /**
   * <p>
   * Setter method for the COM property "ondragleave"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412059) //= 0x800117a5. The runtime will prefer the VTID if present
  @VTID(24)
  void ondragleave(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragleave"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412059) //= 0x800117a5. The runtime will prefer the VTID if present
  @VTID(25)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragleave();


  /**
   * <p>
   * Setter method for the COM property "ondrop"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412058) //= 0x800117a6. The runtime will prefer the VTID if present
  @VTID(26)
  void ondrop(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondrop"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412058) //= 0x800117a6. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondrop();


  /**
   * <p>
   * Setter method for the COM property "onbeforecut"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412054) //= 0x800117aa. The runtime will prefer the VTID if present
  @VTID(28)
  void onbeforecut(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforecut"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412054) //= 0x800117aa. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforecut();


  /**
   * <p>
   * Setter method for the COM property "oncut"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412057) //= 0x800117a7. The runtime will prefer the VTID if present
  @VTID(30)
  void oncut(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncut"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412057) //= 0x800117a7. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncut();


  /**
   * <p>
   * Setter method for the COM property "onbeforecopy"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412053) //= 0x800117ab. The runtime will prefer the VTID if present
  @VTID(32)
  void onbeforecopy(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforecopy"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412053) //= 0x800117ab. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforecopy();


  /**
   * <p>
   * Setter method for the COM property "oncopy"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412056) //= 0x800117a8. The runtime will prefer the VTID if present
  @VTID(34)
  void oncopy(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncopy"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412056) //= 0x800117a8. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncopy();


  /**
   * <p>
   * Setter method for the COM property "onbeforepaste"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412052) //= 0x800117ac. The runtime will prefer the VTID if present
  @VTID(36)
  void onbeforepaste(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforepaste"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412052) //= 0x800117ac. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforepaste();


  /**
   * <p>
   * Setter method for the COM property "onpaste"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412055) //= 0x800117a9. The runtime will prefer the VTID if present
  @VTID(38)
  void onpaste(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onpaste"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412055) //= 0x800117a9. The runtime will prefer the VTID if present
  @VTID(39)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onpaste();


  /**
   * <p>
   * Getter method for the COM property "currentStyle"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLCurrentStyle
   */

  @DISPID(-2147417105) //= 0x800103ef. The runtime will prefer the VTID if present
  @VTID(40)
  ms.html.IHTMLCurrentStyle currentStyle();


  /**
   * <p>
   * Setter method for the COM property "onpropertychange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412065) //= 0x8001179f. The runtime will prefer the VTID if present
  @VTID(41)
  void onpropertychange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onpropertychange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412065) //= 0x8001179f. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onpropertychange();


  /**
   * @return  Returns a value of type ms.html.IHTMLRectCollection
   */

  @DISPID(-2147417068) //= 0x80010414. The runtime will prefer the VTID if present
  @VTID(43)
  ms.html.IHTMLRectCollection getClientRects();


  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={ms.html.IHTMLRectCollection.class})
  java.lang.Object getClientRects(
    java.lang.Object pvarIndex);

  /**
   * @return  Returns a value of type ms.html.IHTMLRect
   */

  @DISPID(-2147417067) //= 0x80010415. The runtime will prefer the VTID if present
  @VTID(44)
  ms.html.IHTMLRect getBoundingClientRect();


  /**
   * @param propname Mandatory java.lang.String parameter.
   * @param expression Mandatory java.lang.String parameter.
   * @param language Optional parameter. Default value is ""
   */

  @DISPID(-2147417608) //= 0x800101f8. The runtime will prefer the VTID if present
  @VTID(45)
  void setExpression(
    java.lang.String propname,
    java.lang.String expression,
    @Optional @DefaultValue("") java.lang.String language);


  /**
   * @param propname Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147417607) //= 0x800101f9. The runtime will prefer the VTID if present
  @VTID(46)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getExpression(
    java.lang.String propname);


  /**
   * @param propname Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417606) //= 0x800101fa. The runtime will prefer the VTID if present
  @VTID(47)
  boolean removeExpression(
    java.lang.String propname);


  /**
   * <p>
   * Setter method for the COM property "tabIndex"
   * </p>
   * @param p Mandatory short parameter.
   */

  @DISPID(-2147418097) //= 0x8001000f. The runtime will prefer the VTID if present
  @VTID(48)
  void tabIndex(
    short p);


  /**
   * <p>
   * Getter method for the COM property "tabIndex"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(-2147418097) //= 0x8001000f. The runtime will prefer the VTID if present
  @VTID(49)
  short tabIndex();


  /**
   */

  @DISPID(-2147416112) //= 0x800107d0. The runtime will prefer the VTID if present
  @VTID(50)
  void focus();


  /**
   * <p>
   * Setter method for the COM property "accessKey"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416107) //= 0x800107d5. The runtime will prefer the VTID if present
  @VTID(51)
  void accessKey(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "accessKey"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147416107) //= 0x800107d5. The runtime will prefer the VTID if present
  @VTID(52)
  java.lang.String accessKey();


  /**
   * <p>
   * Setter method for the COM property "onblur"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412097) //= 0x8001177f. The runtime will prefer the VTID if present
  @VTID(53)
  void onblur(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onblur"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412097) //= 0x8001177f. The runtime will prefer the VTID if present
  @VTID(54)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onblur();


  /**
   * <p>
   * Setter method for the COM property "onfocus"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412098) //= 0x8001177e. The runtime will prefer the VTID if present
  @VTID(55)
  void onfocus(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onfocus"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412098) //= 0x8001177e. The runtime will prefer the VTID if present
  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onfocus();


  /**
   * <p>
   * Setter method for the COM property "onresize"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412076) //= 0x80011794. The runtime will prefer the VTID if present
  @VTID(57)
  void onresize(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onresize"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412076) //= 0x80011794. The runtime will prefer the VTID if present
  @VTID(58)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onresize();


  /**
   */

  @DISPID(-2147416110) //= 0x800107d2. The runtime will prefer the VTID if present
  @VTID(59)
  void blur();


  /**
   * @param pUnk Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147416095) //= 0x800107e1. The runtime will prefer the VTID if present
  @VTID(60)
  void addFilter(
    com4j.Com4jObject pUnk);


  /**
   * @param pUnk Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147416094) //= 0x800107e2. The runtime will prefer the VTID if present
  @VTID(61)
  void removeFilter(
    com4j.Com4jObject pUnk);


  /**
   * <p>
   * Getter method for the COM property "clientHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147416093) //= 0x800107e3. The runtime will prefer the VTID if present
  @VTID(62)
  int clientHeight();


  /**
   * <p>
   * Getter method for the COM property "clientWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147416092) //= 0x800107e4. The runtime will prefer the VTID if present
  @VTID(63)
  int clientWidth();


  /**
   * <p>
   * Getter method for the COM property "clientTop"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147416091) //= 0x800107e5. The runtime will prefer the VTID if present
  @VTID(64)
  int clientTop();


  /**
   * <p>
   * Getter method for the COM property "clientLeft"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147416090) //= 0x800107e6. The runtime will prefer the VTID if present
  @VTID(65)
  int clientLeft();


  /**
   * @param event Mandatory java.lang.String parameter.
   * @param pdisp Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417605) //= 0x800101fb. The runtime will prefer the VTID if present
  @VTID(66)
  boolean attachEvent(
    java.lang.String event,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pdisp);


  /**
   * @param event Mandatory java.lang.String parameter.
   * @param pdisp Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147417604) //= 0x800101fc. The runtime will prefer the VTID if present
  @VTID(67)
  void detachEvent(
    java.lang.String event,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pdisp);


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412996) //= 0x800113fc. The runtime will prefer the VTID if present
  @VTID(68)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object readyState();


  /**
   * <p>
   * Setter method for the COM property "onreadystatechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(69)
  void onreadystatechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onreadystatechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(70)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onreadystatechange();


  /**
   * <p>
   * Setter method for the COM property "onrowsdelete"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412050) //= 0x800117ae. The runtime will prefer the VTID if present
  @VTID(71)
  void onrowsdelete(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onrowsdelete"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412050) //= 0x800117ae. The runtime will prefer the VTID if present
  @VTID(72)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onrowsdelete();


  /**
   * <p>
   * Setter method for the COM property "onrowsinserted"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412049) //= 0x800117af. The runtime will prefer the VTID if present
  @VTID(73)
  void onrowsinserted(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onrowsinserted"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412049) //= 0x800117af. The runtime will prefer the VTID if present
  @VTID(74)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onrowsinserted();


  /**
   * <p>
   * Setter method for the COM property "oncellchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412048) //= 0x800117b0. The runtime will prefer the VTID if present
  @VTID(75)
  void oncellchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncellchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412048) //= 0x800117b0. The runtime will prefer the VTID if present
  @VTID(76)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncellchange();


  /**
   * <p>
   * Setter method for the COM property "dir"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412995) //= 0x800113fd. The runtime will prefer the VTID if present
  @VTID(77)
  void dir(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "dir"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412995) //= 0x800113fd. The runtime will prefer the VTID if present
  @VTID(78)
  java.lang.String dir();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147417056) //= 0x80010420. The runtime will prefer the VTID if present
  @VTID(79)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject createControlRange();


  /**
   * <p>
   * Getter method for the COM property "scrollHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147417055) //= 0x80010421. The runtime will prefer the VTID if present
  @VTID(80)
  int scrollHeight();


  /**
   * <p>
   * Getter method for the COM property "scrollWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147417054) //= 0x80010422. The runtime will prefer the VTID if present
  @VTID(81)
  int scrollWidth();


  /**
   * <p>
   * Setter method for the COM property "scrollTop"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147417053) //= 0x80010423. The runtime will prefer the VTID if present
  @VTID(82)
  void scrollTop(
    int p);


  /**
   * <p>
   * Getter method for the COM property "scrollTop"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147417053) //= 0x80010423. The runtime will prefer the VTID if present
  @VTID(83)
  int scrollTop();


  /**
   * <p>
   * Setter method for the COM property "scrollLeft"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147417052) //= 0x80010424. The runtime will prefer the VTID if present
  @VTID(84)
  void scrollLeft(
    int p);


  /**
   * <p>
   * Getter method for the COM property "scrollLeft"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147417052) //= 0x80010424. The runtime will prefer the VTID if present
  @VTID(85)
  int scrollLeft();


  /**
   */

  @DISPID(-2147417050) //= 0x80010426. The runtime will prefer the VTID if present
  @VTID(86)
  void clearAttributes();


  /**
   * @param mergeThis Mandatory ms.html.IHTMLElement parameter.
   */

  @DISPID(-2147417049) //= 0x80010427. The runtime will prefer the VTID if present
  @VTID(87)
  void mergeAttributes(
    ms.html.IHTMLElement mergeThis);


  /**
   * <p>
   * Setter method for the COM property "oncontextmenu"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412047) //= 0x800117b1. The runtime will prefer the VTID if present
  @VTID(88)
  void oncontextmenu(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncontextmenu"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412047) //= 0x800117b1. The runtime will prefer the VTID if present
  @VTID(89)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncontextmenu();


  /**
   * @param where Mandatory java.lang.String parameter.
   * @param insertedElement Mandatory ms.html.IHTMLElement parameter.
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(-2147417043) //= 0x8001042d. The runtime will prefer the VTID if present
  @VTID(90)
  ms.html.IHTMLElement insertAdjacentElement(
    java.lang.String where,
    ms.html.IHTMLElement insertedElement);


  /**
   * @param apply Mandatory ms.html.IHTMLElement parameter.
   * @param where Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(-2147417047) //= 0x80010429. The runtime will prefer the VTID if present
  @VTID(91)
  ms.html.IHTMLElement applyElement(
    ms.html.IHTMLElement apply,
    java.lang.String where);


  /**
   * @param where Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417042) //= 0x8001042e. The runtime will prefer the VTID if present
  @VTID(92)
  java.lang.String getAdjacentText(
    java.lang.String where);


  /**
   * @param where Mandatory java.lang.String parameter.
   * @param newText Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417041) //= 0x8001042f. The runtime will prefer the VTID if present
  @VTID(93)
  java.lang.String replaceAdjacentText(
    java.lang.String where,
    java.lang.String newText);


  /**
   * <p>
   * Getter method for the COM property "canHaveChildren"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417040) //= 0x80010430. The runtime will prefer the VTID if present
  @VTID(94)
  boolean canHaveChildren();


  /**
   * @param bstrURL Mandatory java.lang.String parameter.
   * @param pvarFactory Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(-2147417032) //= 0x80010438. The runtime will prefer the VTID if present
  @VTID(95)
  int addBehavior(
    java.lang.String bstrURL,
    @Optional java.lang.Object pvarFactory);


  /**
   * @param cookie Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417031) //= 0x80010439. The runtime will prefer the VTID if present
  @VTID(96)
  boolean removeBehavior(
    int cookie);


  /**
   * <p>
   * Getter method for the COM property "runtimeStyle"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyle
   */

  @DISPID(-2147417048) //= 0x80010428. The runtime will prefer the VTID if present
  @VTID(97)
  ms.html.IHTMLStyle runtimeStyle();


  /**
   * <p>
   * Getter method for the COM property "behaviorUrns"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147417030) //= 0x8001043a. The runtime will prefer the VTID if present
  @VTID(98)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject behaviorUrns();


  /**
   * <p>
   * Setter method for the COM property "tagUrn"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417029) //= 0x8001043b. The runtime will prefer the VTID if present
  @VTID(99)
  void tagUrn(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "tagUrn"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417029) //= 0x8001043b. The runtime will prefer the VTID if present
  @VTID(100)
  java.lang.String tagUrn();


  /**
   * <p>
   * Setter method for the COM property "onbeforeeditfocus"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412043) //= 0x800117b5. The runtime will prefer the VTID if present
  @VTID(101)
  void onbeforeeditfocus(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforeeditfocus"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412043) //= 0x800117b5. The runtime will prefer the VTID if present
  @VTID(102)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforeeditfocus();


  /**
   * <p>
   * Getter method for the COM property "readyStateValue"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147417028) //= 0x8001043c. The runtime will prefer the VTID if present
  @VTID(103)
  int readyStateValue();


  /**
   * @param v Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(-2147417027) //= 0x8001043d. The runtime will prefer the VTID if present
  @VTID(104)
  ms.html.IHTMLElementCollection getElementsByTagName(
    java.lang.String v);


  // Properties:
}
