package ms.html  ;

import com4j.*;

@IID("{305104CC-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGAnimatedNumber extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "baseVal"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  void baseVal(
    float p);


  /**
   * <p>
   * Getter method for the COM property "baseVal"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  float baseVal();


  /**
   * <p>
   * Setter method for the COM property "animVal"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  void animVal(
    float p);


  /**
   * <p>
   * Getter method for the COM property "animVal"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  float animVal();


  // Properties:
}
