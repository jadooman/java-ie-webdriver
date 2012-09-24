package ms.html  ;

import com4j.*;

@IID("{305107C9-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IWebGeopositionError extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "code"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  int code();


  /**
   * <p>
   * Getter method for the COM property "message"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String message();


  // Properties:
}
