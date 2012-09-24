package ms.html  ;

import com4j.*;

@IID("{3050F2AD-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLInputFileElement extends Com4jObject {
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
   * Setter method for the COM property "name"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(8)
  void name(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "status"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(10)
  void status(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "status"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object status();


  /**
   * <p>
   * Setter method for the COM property "disabled"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(12)
  void disabled(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "disabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(13)
  boolean disabled();


  /**
   * <p>
   * Getter method for the COM property "form"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLFormElement
   */

  @DISPID(-2147416108) //= 0x800107d4. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.IHTMLFormElement form();


  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLFormElement.class})
  com4j.Com4jObject form(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Setter method for the COM property "size"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(15)
  void size(
    int p);


  /**
   * <p>
   * Getter method for the COM property "size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(16)
  int size();


  /**
   * <p>
   * Setter method for the COM property "maxLength"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(17)
  void maxLength(
    int p);


  /**
   * <p>
   * Getter method for the COM property "maxLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(18)
  int maxLength();


  /**
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(19)
  void select();


  /**
   * <p>
   * Setter method for the COM property "onchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(20)
  void onchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onchange();


  /**
   * <p>
   * Setter method for the COM property "onselect"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412102) //= 0x8001177a. The runtime will prefer the VTID if present
  @VTID(22)
  void onselect(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onselect"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412102) //= 0x8001177a. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onselect();


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413011) //= 0x800113ed. The runtime will prefer the VTID if present
  @VTID(24)
  void value(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413011) //= 0x800113ed. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String value();


  // Properties:
}
