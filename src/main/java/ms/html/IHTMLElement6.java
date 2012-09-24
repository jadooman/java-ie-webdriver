package ms.html  ;

import com4j.*;

@IID("{305106F8-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLElement6 extends Com4jObject {
  // Methods:
  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147416859) //= 0x800104e5. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getAttributeNS(
    java.lang.Object pvarNS,
    java.lang.String strAttributeName);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param pvarAttributeValue Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416858) //= 0x800104e6. The runtime will prefer the VTID if present
  @VTID(8)
  void setAttributeNS(
    java.lang.Object pvarNS,
    java.lang.String strAttributeName,
    java.lang.Object pvarAttributeValue);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param strAttributeName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416857) //= 0x800104e7. The runtime will prefer the VTID if present
  @VTID(9)
  void removeAttributeNS(
    java.lang.Object pvarNS,
    java.lang.String strAttributeName);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute2
   */

  @DISPID(-2147416862) //= 0x800104e2. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLDOMAttribute2 getAttributeNodeNS(
    java.lang.Object pvarNS,
    java.lang.String bstrName);


  /**
   * @param pattr Mandatory ms.html.IHTMLDOMAttribute2 parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute2
   */

  @DISPID(-2147416861) //= 0x800104e3. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.IHTMLDOMAttribute2 setAttributeNodeNS(
    ms.html.IHTMLDOMAttribute2 pattr);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147416860) //= 0x800104e4. The runtime will prefer the VTID if present
  @VTID(12)
  boolean hasAttributeNS(
    java.lang.Object pvarNS,
    java.lang.String name);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147416852) //= 0x800104ec. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getAttribute(
    java.lang.String strAttributeName);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param pvarAttributeValue Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416851) //= 0x800104ed. The runtime will prefer the VTID if present
  @VTID(14)
  void setAttribute(
    java.lang.String strAttributeName,
    java.lang.Object pvarAttributeValue);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416850) //= 0x800104ee. The runtime will prefer the VTID if present
  @VTID(15)
  void removeAttribute(
    java.lang.String strAttributeName);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute2
   */

  @DISPID(-2147416856) //= 0x800104e8. The runtime will prefer the VTID if present
  @VTID(16)
  ms.html.IHTMLDOMAttribute2 getAttributeNode(
    java.lang.String strAttributeName);


  /**
   * @param pattr Mandatory ms.html.IHTMLDOMAttribute2 parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute2
   */

  @DISPID(-2147416855) //= 0x800104e9. The runtime will prefer the VTID if present
  @VTID(17)
  ms.html.IHTMLDOMAttribute2 setAttributeNode(
    ms.html.IHTMLDOMAttribute2 pattr);


  /**
   * @param pattr Mandatory ms.html.IHTMLDOMAttribute2 parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute2
   */

  @DISPID(-2147416854) //= 0x800104ea. The runtime will prefer the VTID if present
  @VTID(18)
  ms.html.IHTMLDOMAttribute2 removeAttributeNode(
    ms.html.IHTMLDOMAttribute2 pattr);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147416853) //= 0x800104eb. The runtime will prefer the VTID if present
  @VTID(19)
  boolean hasAttribute(
    java.lang.String name);


  /**
   * @param varNS Mandatory java.lang.Object parameter.
   * @param bstrLocalName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(-2147416849) //= 0x800104ef. The runtime will prefer the VTID if present
  @VTID(20)
  ms.html.IHTMLElementCollection getElementsByTagNameNS(
    java.lang.Object varNS,
    java.lang.String bstrLocalName);


  /**
   * <p>
   * Getter method for the COM property "tagName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147416847) //= 0x800104f1. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String tagName();


  /**
   * <p>
   * Getter method for the COM property "nodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147416846) //= 0x800104f2. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String nodeName();


  /**
   * @param v Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(-2147416845) //= 0x800104f3. The runtime will prefer the VTID if present
  @VTID(23)
  ms.html.IHTMLElementCollection getElementsByClassName(
    java.lang.String v);


  /**
   * @param v Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147416834) //= 0x800104fe. The runtime will prefer the VTID if present
  @VTID(24)
  boolean msMatchesSelector(
    java.lang.String v);


  /**
   * <p>
   * Setter method for the COM property "onabort"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412084) //= 0x8001178c. The runtime will prefer the VTID if present
  @VTID(25)
  void onabort(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onabort"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412084) //= 0x8001178c. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onabort();


  /**
   * <p>
   * Setter method for the COM property "oncanplay"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411978) //= 0x800117f6. The runtime will prefer the VTID if present
  @VTID(27)
  void oncanplay(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncanplay"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411978) //= 0x800117f6. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncanplay();


  /**
   * <p>
   * Setter method for the COM property "oncanplaythrough"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411977) //= 0x800117f7. The runtime will prefer the VTID if present
  @VTID(29)
  void oncanplaythrough(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oncanplaythrough"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411977) //= 0x800117f7. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oncanplaythrough();


  /**
   * <p>
   * Setter method for the COM property "onchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(31)
  void onchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(32)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onchange();


  /**
   * <p>
   * Setter method for the COM property "ondurationchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411976) //= 0x800117f8. The runtime will prefer the VTID if present
  @VTID(33)
  void ondurationchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondurationchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411976) //= 0x800117f8. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondurationchange();


  /**
   * <p>
   * Setter method for the COM property "onemptied"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411975) //= 0x800117f9. The runtime will prefer the VTID if present
  @VTID(35)
  void onemptied(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onemptied"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411975) //= 0x800117f9. The runtime will prefer the VTID if present
  @VTID(36)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onemptied();


  /**
   * <p>
   * Setter method for the COM property "onended"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411974) //= 0x800117fa. The runtime will prefer the VTID if present
  @VTID(37)
  void onended(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onended"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411974) //= 0x800117fa. The runtime will prefer the VTID if present
  @VTID(38)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onended();


  /**
   * <p>
   * Setter method for the COM property "onerror"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(39)
  void onerror(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onerror"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(40)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onerror();


  /**
   * <p>
   * Setter method for the COM property "oninput"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411985) //= 0x800117ef. The runtime will prefer the VTID if present
  @VTID(41)
  void oninput(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "oninput"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411985) //= 0x800117ef. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object oninput();


  /**
   * <p>
   * Setter method for the COM property "onload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(43)
  void onload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(44)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onload();


  /**
   * <p>
   * Setter method for the COM property "onloadeddata"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411973) //= 0x800117fb. The runtime will prefer the VTID if present
  @VTID(45)
  void onloadeddata(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onloadeddata"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411973) //= 0x800117fb. The runtime will prefer the VTID if present
  @VTID(46)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onloadeddata();


  /**
   * <p>
   * Setter method for the COM property "onloadedmetadata"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411972) //= 0x800117fc. The runtime will prefer the VTID if present
  @VTID(47)
  void onloadedmetadata(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onloadedmetadata"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411972) //= 0x800117fc. The runtime will prefer the VTID if present
  @VTID(48)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onloadedmetadata();


  /**
   * <p>
   * Setter method for the COM property "onloadstart"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411971) //= 0x800117fd. The runtime will prefer the VTID if present
  @VTID(49)
  void onloadstart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onloadstart"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411971) //= 0x800117fd. The runtime will prefer the VTID if present
  @VTID(50)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onloadstart();


  /**
   * <p>
   * Setter method for the COM property "onpause"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411970) //= 0x800117fe. The runtime will prefer the VTID if present
  @VTID(51)
  void onpause(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onpause"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411970) //= 0x800117fe. The runtime will prefer the VTID if present
  @VTID(52)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onpause();


  /**
   * <p>
   * Setter method for the COM property "onplay"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411969) //= 0x800117ff. The runtime will prefer the VTID if present
  @VTID(53)
  void onplay(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onplay"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411969) //= 0x800117ff. The runtime will prefer the VTID if present
  @VTID(54)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onplay();


  /**
   * <p>
   * Setter method for the COM property "onplaying"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411968) //= 0x80011800. The runtime will prefer the VTID if present
  @VTID(55)
  void onplaying(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onplaying"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411968) //= 0x80011800. The runtime will prefer the VTID if present
  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onplaying();


  /**
   * <p>
   * Setter method for the COM property "onprogress"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411967) //= 0x80011801. The runtime will prefer the VTID if present
  @VTID(57)
  void onprogress(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onprogress"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411967) //= 0x80011801. The runtime will prefer the VTID if present
  @VTID(58)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onprogress();


  /**
   * <p>
   * Setter method for the COM property "onratechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411966) //= 0x80011802. The runtime will prefer the VTID if present
  @VTID(59)
  void onratechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onratechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411966) //= 0x80011802. The runtime will prefer the VTID if present
  @VTID(60)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onratechange();


  /**
   * <p>
   * Setter method for the COM property "onreset"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412100) //= 0x8001177c. The runtime will prefer the VTID if present
  @VTID(61)
  void onreset(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onreset"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412100) //= 0x8001177c. The runtime will prefer the VTID if present
  @VTID(62)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onreset();


  /**
   * <p>
   * Setter method for the COM property "onseeked"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411965) //= 0x80011803. The runtime will prefer the VTID if present
  @VTID(63)
  void onseeked(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onseeked"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411965) //= 0x80011803. The runtime will prefer the VTID if present
  @VTID(64)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onseeked();


  /**
   * <p>
   * Setter method for the COM property "onseeking"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411964) //= 0x80011804. The runtime will prefer the VTID if present
  @VTID(65)
  void onseeking(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onseeking"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411964) //= 0x80011804. The runtime will prefer the VTID if present
  @VTID(66)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onseeking();


  /**
   * <p>
   * Setter method for the COM property "onselect"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412102) //= 0x8001177a. The runtime will prefer the VTID if present
  @VTID(67)
  void onselect(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onselect"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412102) //= 0x8001177a. The runtime will prefer the VTID if present
  @VTID(68)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onselect();


  /**
   * <p>
   * Setter method for the COM property "onstalled"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411963) //= 0x80011805. The runtime will prefer the VTID if present
  @VTID(69)
  void onstalled(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onstalled"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411963) //= 0x80011805. The runtime will prefer the VTID if present
  @VTID(70)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onstalled();


  /**
   * <p>
   * Setter method for the COM property "onsubmit"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412101) //= 0x8001177b. The runtime will prefer the VTID if present
  @VTID(71)
  void onsubmit(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onsubmit"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412101) //= 0x8001177b. The runtime will prefer the VTID if present
  @VTID(72)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onsubmit();


  /**
   * <p>
   * Setter method for the COM property "onsuspend"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411962) //= 0x80011806. The runtime will prefer the VTID if present
  @VTID(73)
  void onsuspend(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onsuspend"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411962) //= 0x80011806. The runtime will prefer the VTID if present
  @VTID(74)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onsuspend();


  /**
   * <p>
   * Setter method for the COM property "ontimeupdate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411961) //= 0x80011807. The runtime will prefer the VTID if present
  @VTID(75)
  void ontimeupdate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ontimeupdate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411961) //= 0x80011807. The runtime will prefer the VTID if present
  @VTID(76)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ontimeupdate();


  /**
   * <p>
   * Setter method for the COM property "onvolumechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411960) //= 0x80011808. The runtime will prefer the VTID if present
  @VTID(77)
  void onvolumechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onvolumechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411960) //= 0x80011808. The runtime will prefer the VTID if present
  @VTID(78)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onvolumechange();


  /**
   * <p>
   * Setter method for the COM property "onwaiting"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411959) //= 0x80011809. The runtime will prefer the VTID if present
  @VTID(79)
  void onwaiting(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onwaiting"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147411959) //= 0x80011809. The runtime will prefer the VTID if present
  @VTID(80)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onwaiting();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147416833) //= 0x800104ff. The runtime will prefer the VTID if present
  @VTID(81)
  boolean hasAttributes();


  // Properties:
}
