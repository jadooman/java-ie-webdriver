package ms.html  ;

import com4j.*;

@IID("{3050F2BC-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLOptionButtonElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413011) //= 0x800113ed. The runtime will prefer the VTID if present
  @VTID(7)
  void value(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413011) //= 0x800113ed. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String value();


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2000) //= 0x7d0. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String type();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(10)
  void name(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "checked"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(12)
  void checked(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "checked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(13)
  boolean checked();


  /**
   * <p>
   * Setter method for the COM property "defaultChecked"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(14)
  void defaultChecked(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "defaultChecked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(15)
  boolean defaultChecked();


  /**
   * <p>
   * Setter method for the COM property "onchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(16)
  void onchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onchange();


  /**
   * <p>
   * Setter method for the COM property "disabled"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(18)
  void disabled(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "disabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(19)
  boolean disabled();


  /**
   * <p>
   * Setter method for the COM property "status"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(20)
  void status(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "status"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(21)
  boolean status();


  /**
   * <p>
   * Setter method for the COM property "indeterminate"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(22)
  void indeterminate(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "indeterminate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(23)
  boolean indeterminate();


  /**
   * <p>
   * Getter method for the COM property "form"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLFormElement
   */

  @DISPID(-2147416108) //= 0x800107d4. The runtime will prefer the VTID if present
  @VTID(24)
  ms.html.IHTMLFormElement form();


  @VTID(24)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLFormElement.class})
  com4j.Com4jObject form(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  // Properties:
}
