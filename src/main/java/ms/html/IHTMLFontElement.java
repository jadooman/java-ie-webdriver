package ms.html  ;

import com4j.*;

@IID("{3050F1D9-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLFontElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "color"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413110) //= 0x8001138a. The runtime will prefer the VTID if present
  @VTID(7)
  void color(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "color"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413110) //= 0x8001138a. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object color();


  /**
   * <p>
   * Setter method for the COM property "face"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413094) //= 0x8001139a. The runtime will prefer the VTID if present
  @VTID(9)
  void face(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "face"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413094) //= 0x8001139a. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String face();


  /**
   * <p>
   * Setter method for the COM property "size"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413093) //= 0x8001139b. The runtime will prefer the VTID if present
  @VTID(11)
  void size(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "size"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413093) //= 0x8001139b. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object size();


  // Properties:
}
