package ms.html  ;

import com4j.*;

@IID("{305104B8-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDocument7 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "defaultView"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLWindow2
   */

  @DISPID(1110) //= 0x456. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLWindow2 defaultView();


  /**
   * @param text Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1123) //= 0x463. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLDOMNode createCDATASection(
    java.lang.String text);


  /**
   * @return  Returns a value of type ms.html.IHTMLSelection
   */

  @DISPID(1112) //= 0x458. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLSelection getSelection();


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param bstrLocalName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1113) //= 0x459. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLElementCollection getElementsByTagNameNS(
    java.lang.Object pvarNS,
    java.lang.String bstrLocalName);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param bstrTag Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1114) //= 0x45a. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.IHTMLElement createElementNS(
    java.lang.Object pvarNS,
    java.lang.String bstrTag);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param bstrAttrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(1115) //= 0x45b. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.IHTMLDOMAttribute createAttributeNS(
    java.lang.Object pvarNS,
    java.lang.String bstrAttrName);


  /**
   * <p>
   * Setter method for the COM property "onmsthumbnailclick"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411991) //= 0x800117e9. The runtime will prefer the VTID if present
  @VTID(13)
  void onmsthumbnailclick(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmsthumbnailclick"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411991) //= 0x800117e9. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmsthumbnailclick();


  /**
   * <p>
   * Getter method for the COM property "characterSet"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1117) //= 0x45d. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String characterSet();


  /**
   * @param bstrTag Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1118) //= 0x45e. The runtime will prefer the VTID if present
  @VTID(16)
  ms.html.IHTMLElement createElement(
    java.lang.String bstrTag);


  /**
   * @param bstrAttrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(1119) //= 0x45f. The runtime will prefer the VTID if present
  @VTID(17)
  ms.html.IHTMLDOMAttribute createAttribute(
    java.lang.String bstrAttrName);


  /**
   * @param v Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1120) //= 0x460. The runtime will prefer the VTID if present
  @VTID(18)
  ms.html.IHTMLElementCollection getElementsByClassName(
    java.lang.String v);


  /**
   * @param bstrTarget Mandatory java.lang.String parameter.
   * @param bstrData Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IDOMProcessingInstruction
   */

  @DISPID(1124) //= 0x464. The runtime will prefer the VTID if present
  @VTID(19)
  ms.html.IDOMProcessingInstruction createProcessingInstruction(
    java.lang.String bstrTarget,
    java.lang.String bstrData);


  /**
   * @param pNodeSource Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode3
   */

  @DISPID(1125) //= 0x465. The runtime will prefer the VTID if present
  @VTID(20)
  ms.html.IHTMLDOMNode3 adoptNode(
    ms.html.IHTMLDOMNode pNodeSource);


  /**
   * <p>
   * Setter method for the COM property "onmssitemodejumplistitemremoved"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411982) //= 0x800117f2. The runtime will prefer the VTID if present
  @VTID(21)
  void onmssitemodejumplistitemremoved(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmssitemodejumplistitemremoved"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411982) //= 0x800117f2. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmssitemodejumplistitemremoved();


  /**
   * <p>
   * Getter method for the COM property "all"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1126) //= 0x466. The runtime will prefer the VTID if present
  @VTID(23)
  ms.html.IHTMLElementCollection all();


  @VTID(23)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject all(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "inputEncoding"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1127) //= 0x467. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String inputEncoding();


  /**
   * <p>
   * Getter method for the COM property "xmlEncoding"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1128) //= 0x468. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String xmlEncoding();


  /**
   * <p>
   * Setter method for the COM property "xmlStandalone"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1129) //= 0x469. The runtime will prefer the VTID if present
  @VTID(26)
  void xmlStandalone(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "xmlStandalone"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1129) //= 0x469. The runtime will prefer the VTID if present
  @VTID(27)
  boolean xmlStandalone();


  /**
   * <p>
   * Setter method for the COM property "xmlVersion"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1130) //= 0x46a. The runtime will prefer the VTID if present
  @VTID(28)
  void xmlVersion(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "xmlVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1130) //= 0x46a. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String xmlVersion();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1132) //= 0x46c. The runtime will prefer the VTID if present
  @VTID(30)
  boolean hasAttributes();


  /**
   * <p>
   * Setter method for the COM property "onabort"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412084) //= 0x8001178c. The runtime will prefer the VTID if present
  @VTID(31)
  void onabort(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onabort"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412084) //= 0x8001178c. The runtime will prefer the VTID if present
  @VTID(32)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onabort();


  /**
   * <p>
   * Setter method for the COM property "onblur"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412097) //= 0x8001177f. The runtime will prefer the VTID if present
  @VTID(33)
  void onblur(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onblur"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412097) //= 0x8001177f. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onblur();


  /**
   * <p>
   * Setter method for the COM property "oncanplay"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411978) //= 0x800117f6. The runtime will prefer the VTID if present
  @VTID(35)
  void oncanplay(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncanplay"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411978) //= 0x800117f6. The runtime will prefer the VTID if present
  @VTID(36)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncanplay();


  /**
   * <p>
   * Setter method for the COM property "oncanplaythrough"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411977) //= 0x800117f7. The runtime will prefer the VTID if present
  @VTID(37)
  void oncanplaythrough(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncanplaythrough"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411977) //= 0x800117f7. The runtime will prefer the VTID if present
  @VTID(38)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncanplaythrough();


  /**
   * <p>
   * Setter method for the COM property "onchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(39)
  void onchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(40)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onchange();


  /**
   * <p>
   * Setter method for the COM property "ondrag"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412063) //= 0x800117a1. The runtime will prefer the VTID if present
  @VTID(41)
  void ondrag(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondrag"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412063) //= 0x800117a1. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondrag();


  /**
   * <p>
   * Setter method for the COM property "ondragend"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412062) //= 0x800117a2. The runtime will prefer the VTID if present
  @VTID(43)
  void ondragend(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragend"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412062) //= 0x800117a2. The runtime will prefer the VTID if present
  @VTID(44)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragend();


  /**
   * <p>
   * Setter method for the COM property "ondragenter"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412061) //= 0x800117a3. The runtime will prefer the VTID if present
  @VTID(45)
  void ondragenter(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragenter"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412061) //= 0x800117a3. The runtime will prefer the VTID if present
  @VTID(46)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragenter();


  /**
   * <p>
   * Setter method for the COM property "ondragleave"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412059) //= 0x800117a5. The runtime will prefer the VTID if present
  @VTID(47)
  void ondragleave(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragleave"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412059) //= 0x800117a5. The runtime will prefer the VTID if present
  @VTID(48)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragleave();


  /**
   * <p>
   * Setter method for the COM property "ondragover"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412060) //= 0x800117a4. The runtime will prefer the VTID if present
  @VTID(49)
  void ondragover(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragover"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412060) //= 0x800117a4. The runtime will prefer the VTID if present
  @VTID(50)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragover();


  /**
   * <p>
   * Setter method for the COM property "ondrop"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412058) //= 0x800117a6. The runtime will prefer the VTID if present
  @VTID(51)
  void ondrop(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondrop"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412058) //= 0x800117a6. The runtime will prefer the VTID if present
  @VTID(52)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondrop();


  /**
   * <p>
   * Setter method for the COM property "ondurationchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411976) //= 0x800117f8. The runtime will prefer the VTID if present
  @VTID(53)
  void ondurationchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondurationchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411976) //= 0x800117f8. The runtime will prefer the VTID if present
  @VTID(54)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondurationchange();


  /**
   * <p>
   * Setter method for the COM property "onemptied"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411975) //= 0x800117f9. The runtime will prefer the VTID if present
  @VTID(55)
  void onemptied(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onemptied"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411975) //= 0x800117f9. The runtime will prefer the VTID if present
  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onemptied();


  /**
   * <p>
   * Setter method for the COM property "onended"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411974) //= 0x800117fa. The runtime will prefer the VTID if present
  @VTID(57)
  void onended(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onended"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411974) //= 0x800117fa. The runtime will prefer the VTID if present
  @VTID(58)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onended();


  /**
   * <p>
   * Setter method for the COM property "onerror"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(59)
  void onerror(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onerror"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(60)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onerror();


  /**
   * <p>
   * Setter method for the COM property "onfocus"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412098) //= 0x8001177e. The runtime will prefer the VTID if present
  @VTID(61)
  void onfocus(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onfocus"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412098) //= 0x8001177e. The runtime will prefer the VTID if present
  @VTID(62)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onfocus();


  /**
   * <p>
   * Setter method for the COM property "oninput"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411985) //= 0x800117ef. The runtime will prefer the VTID if present
  @VTID(63)
  void oninput(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oninput"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411985) //= 0x800117ef. The runtime will prefer the VTID if present
  @VTID(64)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oninput();


  /**
   * <p>
   * Setter method for the COM property "onload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(65)
  void onload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(66)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onload();


  /**
   * <p>
   * Setter method for the COM property "onloadeddata"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411973) //= 0x800117fb. The runtime will prefer the VTID if present
  @VTID(67)
  void onloadeddata(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onloadeddata"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411973) //= 0x800117fb. The runtime will prefer the VTID if present
  @VTID(68)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onloadeddata();


  /**
   * <p>
   * Setter method for the COM property "onloadedmetadata"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411972) //= 0x800117fc. The runtime will prefer the VTID if present
  @VTID(69)
  void onloadedmetadata(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onloadedmetadata"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411972) //= 0x800117fc. The runtime will prefer the VTID if present
  @VTID(70)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onloadedmetadata();


  /**
   * <p>
   * Setter method for the COM property "onloadstart"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411971) //= 0x800117fd. The runtime will prefer the VTID if present
  @VTID(71)
  void onloadstart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onloadstart"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411971) //= 0x800117fd. The runtime will prefer the VTID if present
  @VTID(72)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onloadstart();


  /**
   * <p>
   * Setter method for the COM property "onpause"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411970) //= 0x800117fe. The runtime will prefer the VTID if present
  @VTID(73)
  void onpause(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onpause"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411970) //= 0x800117fe. The runtime will prefer the VTID if present
  @VTID(74)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onpause();


  /**
   * <p>
   * Setter method for the COM property "onplay"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411969) //= 0x800117ff. The runtime will prefer the VTID if present
  @VTID(75)
  void onplay(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onplay"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411969) //= 0x800117ff. The runtime will prefer the VTID if present
  @VTID(76)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onplay();


  /**
   * <p>
   * Setter method for the COM property "onplaying"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411968) //= 0x80011800. The runtime will prefer the VTID if present
  @VTID(77)
  void onplaying(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onplaying"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411968) //= 0x80011800. The runtime will prefer the VTID if present
  @VTID(78)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onplaying();


  /**
   * <p>
   * Setter method for the COM property "onprogress"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411967) //= 0x80011801. The runtime will prefer the VTID if present
  @VTID(79)
  void onprogress(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onprogress"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411967) //= 0x80011801. The runtime will prefer the VTID if present
  @VTID(80)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onprogress();


  /**
   * <p>
   * Setter method for the COM property "onratechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411966) //= 0x80011802. The runtime will prefer the VTID if present
  @VTID(81)
  void onratechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onratechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411966) //= 0x80011802. The runtime will prefer the VTID if present
  @VTID(82)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onratechange();


  /**
   * <p>
   * Setter method for the COM property "onreset"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412100) //= 0x8001177c. The runtime will prefer the VTID if present
  @VTID(83)
  void onreset(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onreset"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412100) //= 0x8001177c. The runtime will prefer the VTID if present
  @VTID(84)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onreset();


  /**
   * <p>
   * Setter method for the COM property "onscroll"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412081) //= 0x8001178f. The runtime will prefer the VTID if present
  @VTID(85)
  void onscroll(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onscroll"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412081) //= 0x8001178f. The runtime will prefer the VTID if present
  @VTID(86)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onscroll();


  /**
   * <p>
   * Setter method for the COM property "onseeked"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411965) //= 0x80011803. The runtime will prefer the VTID if present
  @VTID(87)
  void onseeked(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onseeked"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411965) //= 0x80011803. The runtime will prefer the VTID if present
  @VTID(88)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onseeked();


  /**
   * <p>
   * Setter method for the COM property "onseeking"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411964) //= 0x80011804. The runtime will prefer the VTID if present
  @VTID(89)
  void onseeking(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onseeking"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411964) //= 0x80011804. The runtime will prefer the VTID if present
  @VTID(90)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onseeking();


  /**
   * <p>
   * Setter method for the COM property "onselect"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412102) //= 0x8001177a. The runtime will prefer the VTID if present
  @VTID(91)
  void onselect(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onselect"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412102) //= 0x8001177a. The runtime will prefer the VTID if present
  @VTID(92)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onselect();


  /**
   * <p>
   * Setter method for the COM property "onstalled"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411963) //= 0x80011805. The runtime will prefer the VTID if present
  @VTID(93)
  void onstalled(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onstalled"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411963) //= 0x80011805. The runtime will prefer the VTID if present
  @VTID(94)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onstalled();


  /**
   * <p>
   * Setter method for the COM property "onsubmit"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412101) //= 0x8001177b. The runtime will prefer the VTID if present
  @VTID(95)
  void onsubmit(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onsubmit"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412101) //= 0x8001177b. The runtime will prefer the VTID if present
  @VTID(96)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onsubmit();


  /**
   * <p>
   * Setter method for the COM property "onsuspend"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411962) //= 0x80011806. The runtime will prefer the VTID if present
  @VTID(97)
  void onsuspend(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onsuspend"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411962) //= 0x80011806. The runtime will prefer the VTID if present
  @VTID(98)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onsuspend();


  /**
   * <p>
   * Setter method for the COM property "ontimeupdate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411961) //= 0x80011807. The runtime will prefer the VTID if present
  @VTID(99)
  void ontimeupdate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ontimeupdate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411961) //= 0x80011807. The runtime will prefer the VTID if present
  @VTID(100)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ontimeupdate();


  /**
   * <p>
   * Setter method for the COM property "onvolumechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411960) //= 0x80011808. The runtime will prefer the VTID if present
  @VTID(101)
  void onvolumechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onvolumechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411960) //= 0x80011808. The runtime will prefer the VTID if present
  @VTID(102)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onvolumechange();


  /**
   * <p>
   * Setter method for the COM property "onwaiting"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411959) //= 0x80011809. The runtime will prefer the VTID if present
  @VTID(103)
  void onwaiting(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onwaiting"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411959) //= 0x80011809. The runtime will prefer the VTID if present
  @VTID(104)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onwaiting();


  /**
   */

  @DISPID(1134) //= 0x46e. The runtime will prefer the VTID if present
  @VTID(105)
  void normalize();


  /**
   * @param pNodeSource Mandatory ms.html.IHTMLDOMNode parameter.
   * @param fDeep Mandatory boolean parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode3
   */

  @DISPID(1135) //= 0x46f. The runtime will prefer the VTID if present
  @VTID(106)
  ms.html.IHTMLDOMNode3 importNode(
    ms.html.IHTMLDOMNode pNodeSource,
    boolean fDeep);


  /**
   * <p>
   * Getter method for the COM property "parentWindow"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLWindow2
   */

  @DISPID(1136) //= 0x470. The runtime will prefer the VTID if present
  @VTID(107)
  ms.html.IHTMLWindow2 parentWindow();


  /**
   * <p>
   * Setter method for the COM property "body"
   * </p>
   * @param p Mandatory ms.html.IHTMLElement parameter.
   */

  @DISPID(1137) //= 0x471. The runtime will prefer the VTID if present
  @VTID(108)
  void body(
    ms.html.IHTMLElement p);


  /**
   * <p>
   * Getter method for the COM property "body"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1137) //= 0x471. The runtime will prefer the VTID if present
  @VTID(109)
  ms.html.IHTMLElement body();


  /**
   * <p>
   * Getter method for the COM property "head"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1138) //= 0x472. The runtime will prefer the VTID if present
  @VTID(110)
  ms.html.IHTMLElement head();


  // Properties:
}
