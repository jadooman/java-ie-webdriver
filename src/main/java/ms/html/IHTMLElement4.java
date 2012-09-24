package ms.html  ;

import com4j.*;

@IID("{3050F80F-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLElement4 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "onmousewheel"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412036) //= 0x800117bc. The runtime will prefer the VTID if present
  @VTID(7)
  void onmousewheel(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmousewheel"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412036) //= 0x800117bc. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmousewheel();


  /**
   */

  @DISPID(-2147417000) //= 0x80010458. The runtime will prefer the VTID if present
  @VTID(9)
  void normalize();


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(-2147417003) //= 0x80010455. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLDOMAttribute getAttributeNode(
    java.lang.String bstrName);


  /**
   * @param pattr Mandatory ms.html.IHTMLDOMAttribute parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(-2147417002) //= 0x80010456. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.IHTMLDOMAttribute setAttributeNode(
    ms.html.IHTMLDOMAttribute pattr);


  /**
   * @param pattr Mandatory ms.html.IHTMLDOMAttribute parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(-2147417001) //= 0x80010457. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.IHTMLDOMAttribute removeAttributeNode(
    ms.html.IHTMLDOMAttribute pattr);


  /**
   * <p>
   * Setter method for the COM property "onbeforeactivate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412022) //= 0x800117ca. The runtime will prefer the VTID if present
  @VTID(13)
  void onbeforeactivate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforeactivate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412022) //= 0x800117ca. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforeactivate();


  /**
   * <p>
   * Setter method for the COM property "onfocusin"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412021) //= 0x800117cb. The runtime will prefer the VTID if present
  @VTID(15)
  void onfocusin(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onfocusin"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412021) //= 0x800117cb. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onfocusin();


  /**
   * <p>
   * Setter method for the COM property "onfocusout"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412020) //= 0x800117cc. The runtime will prefer the VTID if present
  @VTID(17)
  void onfocusout(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onfocusout"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412020) //= 0x800117cc. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onfocusout();


  // Properties:
}
