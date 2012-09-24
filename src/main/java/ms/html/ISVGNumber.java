package ms.html  ;

import com4j.*;

@IID("{305104CB-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGNumber extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  void value(
    float p);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  float value();


  // Properties:
}
