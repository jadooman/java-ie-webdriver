package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTCPropertyBehavior extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(-2147417612)
  void fireChange();


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412971)
  @PropPut
  void value(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   */

  @DISPID(-2147412971)
  @PropGet
  java.lang.Object value();


  // Properties:
}
