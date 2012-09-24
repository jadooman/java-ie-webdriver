package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLPerformance extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "navigation"
   * </p>
   */

  @DISPID(1000)
  @PropGet
  ms.html.IHTMLPerformanceNavigation navigation();


  /**
   * <p>
   * Getter method for the COM property "timing"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  ms.html.IHTMLPerformanceTiming timing();


  /**
   */

  @DISPID(1002)
  java.lang.String toString_();


  /**
   */

  @DISPID(1003)
  java.lang.Object toJSON();


  // Properties:
}
