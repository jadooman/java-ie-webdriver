package ms.html  ;

import com4j.*;

@IID("{3050F311-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLFrameBase extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "src"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147415112) //= 0x80010bb8. The runtime will prefer the VTID if present
  @VTID(7)
  void src(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "src"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147415112) //= 0x80010bb8. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String src();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(9)
  void name(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "border"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147415110) //= 0x80010bba. The runtime will prefer the VTID if present
  @VTID(11)
  void border(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "border"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147415110) //= 0x80010bba. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object border();


  /**
   * <p>
   * Setter method for the COM property "frameBorder"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147415109) //= 0x80010bbb. The runtime will prefer the VTID if present
  @VTID(13)
  void frameBorder(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "frameBorder"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147415109) //= 0x80010bbb. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String frameBorder();


  /**
   * <p>
   * Setter method for the COM property "frameSpacing"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147415108) //= 0x80010bbc. The runtime will prefer the VTID if present
  @VTID(15)
  void frameSpacing(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "frameSpacing"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147415108) //= 0x80010bbc. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object frameSpacing();


  /**
   * <p>
   * Setter method for the COM property "marginWidth"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147415107) //= 0x80010bbd. The runtime will prefer the VTID if present
  @VTID(17)
  void marginWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "marginWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147415107) //= 0x80010bbd. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object marginWidth();


  /**
   * <p>
   * Setter method for the COM property "marginHeight"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147415106) //= 0x80010bbe. The runtime will prefer the VTID if present
  @VTID(19)
  void marginHeight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "marginHeight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147415106) //= 0x80010bbe. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object marginHeight();


  /**
   * <p>
   * Setter method for the COM property "noResize"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147415105) //= 0x80010bbf. The runtime will prefer the VTID if present
  @VTID(21)
  void noResize(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "noResize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147415105) //= 0x80010bbf. The runtime will prefer the VTID if present
  @VTID(22)
  boolean noResize();


  /**
   * <p>
   * Setter method for the COM property "scrolling"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147415104) //= 0x80010bc0. The runtime will prefer the VTID if present
  @VTID(23)
  void scrolling(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "scrolling"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147415104) //= 0x80010bc0. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String scrolling();


  // Properties:
}
