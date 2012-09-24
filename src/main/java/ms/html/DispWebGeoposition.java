package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispWebGeoposition extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "coords"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  ms.html.IWebGeocoordinates coords();


  /**
   * <p>
   * Getter method for the COM property "timeStamp"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  long timeStamp();


  // Properties:
}
