package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispSVGException extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "code"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1000)
  @PropPut
  void code(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "code"
   * </p>
   */

  @DISPID(1000)
  @PropGet
  int code();


  /**
   * <p>
   * Getter method for the COM property "message"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  java.lang.String message();


  // Properties:
}
