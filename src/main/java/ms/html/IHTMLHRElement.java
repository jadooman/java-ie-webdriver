package ms.html  ;

import com4j.*;

@IID("{3050F1F4-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLHRElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "align"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418040) //= 0x80010048. The runtime will prefer the VTID if present
  @VTID(7)
  void align(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "align"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418040) //= 0x80010048. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String align();


  /**
   * <p>
   * Setter method for the COM property "color"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413110) //= 0x8001138a. The runtime will prefer the VTID if present
  @VTID(9)
  void color(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "color"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413110) //= 0x8001138a. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object color();


  /**
   * <p>
   * Setter method for the COM property "noShade"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(11)
  void noShade(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "noShade"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(12)
  boolean noShade();


  /**
   * <p>
   * Setter method for the COM property "width"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(13)
  void width(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object width();


  /**
   * <p>
   * Setter method for the COM property "size"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(15)
  void size(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "size"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object size();


  // Properties:
}
