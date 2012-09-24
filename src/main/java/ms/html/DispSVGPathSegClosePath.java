package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispSVGPathSegClosePath extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "pathSegType"
   * </p>
   * @param rhs Mandatory short parameter.
   */

  @DISPID(1000)
  @PropPut
  void pathSegType(
    short rhs);


  /**
   * <p>
   * Getter method for the COM property "pathSegType"
   * </p>
   */

  @DISPID(1000)
  @PropGet
  short pathSegType();


  /**
   * <p>
   * Getter method for the COM property "pathSegTypeAsLetter"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  java.lang.String pathSegTypeAsLetter();


  // Properties:
}
