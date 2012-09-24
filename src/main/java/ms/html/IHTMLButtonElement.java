package ms.html  ;

import com4j.*;

@IID("{3050F2BB-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLButtonElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2000) //= 0x7d0. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String type();


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413011) //= 0x800113ed. The runtime will prefer the VTID if present
  @VTID(8)
  void value(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413011) //= 0x800113ed. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String value();


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
   * Setter method for the COM property "status"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(8001) //= 0x1f41. The runtime will prefer the VTID if present
  @VTID(12)
  void status(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "status"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(8001) //= 0x1f41. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object status();


  /**
   * <p>
   * Setter method for the COM property "disabled"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(14)
  void disabled(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "disabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(15)
  boolean disabled();


  /**
   * <p>
   * Getter method for the COM property "form"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLFormElement
   */

  @DISPID(-2147416108) //= 0x800107d4. The runtime will prefer the VTID if present
  @VTID(16)
  ms.html.IHTMLFormElement form();


  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLFormElement.class})
  com4j.Com4jObject form(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @return  Returns a value of type ms.html.IHTMLTxtRange
   */

  @DISPID(8002) //= 0x1f42. The runtime will prefer the VTID if present
  @VTID(17)
  ms.html.IHTMLTxtRange createTextRange();


  // Properties:
}
