package ms.html  ;

import com4j.*;

@IID("{305104CA-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGAnimatedInteger extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "baseVal"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  void baseVal(
    int p);


  /**
   * <p>
   * Getter method for the COM property "baseVal"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  int baseVal();


  /**
   * <p>
   * Setter method for the COM property "animVal"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  void animVal(
    int p);


  /**
   * <p>
   * Getter method for the COM property "animVal"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  int animVal();


  // Properties:
}
