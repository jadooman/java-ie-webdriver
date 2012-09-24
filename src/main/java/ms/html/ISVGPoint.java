package ms.html  ;

import com4j.*;

@IID("{305104F4-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGPoint extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "x"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  void x(
    float p);


  /**
   * <p>
   * Getter method for the COM property "x"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  float x();


  /**
   * <p>
   * Setter method for the COM property "y"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  void y(
    float p);


  /**
   * <p>
   * Getter method for the COM property "y"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  float y();


  /**
   * @param pMatrix Mandatory ms.html.ISVGMatrix parameter.
   * @return  Returns a value of type ms.html.ISVGPoint
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.ISVGPoint matrixTransform(
    ms.html.ISVGMatrix pMatrix);


  // Properties:
}
