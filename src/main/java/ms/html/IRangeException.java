package ms.html  ;

import com4j.*;

@IID("{3051072D-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IRangeException extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "code"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  void code(
    int p);


  /**
   * <p>
   * Getter method for the COM property "code"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  int code();


  /**
   * <p>
   * Getter method for the COM property "message"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String message();


  // Properties:
}
