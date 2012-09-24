package ms.html  ;

import com4j.*;

@IID("{3050F80C-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDocument5 extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "doctype"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1098) //= 0x44a. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLDOMNode doctype();


  /**
   * <p>
   * Getter method for the COM property "implementation"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMImplementation
   */

  @DISPID(1099) //= 0x44b. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLDOMImplementation implementation();


  /**
   * @param bstrAttrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.IHTMLDOMAttribute createAttribute(
    java.lang.String bstrAttrName);


  /**
   * @param bstrData Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.IHTMLDOMNode createComment(
    java.lang.String bstrData);


  /**
   * <p>
   * Setter method for the COM property "onfocusin"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412021) //= 0x800117cb. The runtime will prefer the VTID if present
  @VTID(13)
  void onfocusin(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onfocusin"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412021) //= 0x800117cb. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onfocusin();


  /**
   * <p>
   * Setter method for the COM property "onfocusout"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412020) //= 0x800117cc. The runtime will prefer the VTID if present
  @VTID(15)
  void onfocusout(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onfocusout"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412020) //= 0x800117cc. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onfocusout();


  /**
   * <p>
   * Setter method for the COM property "onactivate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412025) //= 0x800117c7. The runtime will prefer the VTID if present
  @VTID(17)
  void onactivate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onactivate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412025) //= 0x800117c7. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onactivate();


  /**
   * <p>
   * Setter method for the COM property "ondeactivate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412024) //= 0x800117c8. The runtime will prefer the VTID if present
  @VTID(19)
  void ondeactivate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondeactivate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412024) //= 0x800117c8. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondeactivate();


  /**
   * <p>
   * Setter method for the COM property "onbeforeactivate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412022) //= 0x800117ca. The runtime will prefer the VTID if present
  @VTID(21)
  void onbeforeactivate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforeactivate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412022) //= 0x800117ca. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforeactivate();


  /**
   * <p>
   * Setter method for the COM property "onbeforedeactivate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412035) //= 0x800117bd. The runtime will prefer the VTID if present
  @VTID(23)
  void onbeforedeactivate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforedeactivate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412035) //= 0x800117bd. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforedeactivate();


  /**
   * <p>
   * Getter method for the COM property "compatMode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1102) //= 0x44e. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String compatMode();


  // Properties:
}
