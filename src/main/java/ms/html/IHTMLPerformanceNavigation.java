package ms.html  ;

import com4j.*;

@IID("{30510750-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLPerformanceNavigation extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  int type();


  /**
   * <p>
   * Getter method for the COM property "redirectCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int redirectCount();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String toString_();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object toJSON();


  // Properties:
}
