package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispWebGeocoordinates extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "latitude"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  double latitude();


  /**
   * <p>
   * Getter method for the COM property "longitude"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  double longitude();


  /**
   * <p>
   * Getter method for the COM property "altitude"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  java.lang.Object altitude();


  /**
   * <p>
   * Getter method for the COM property "accuracy"
   * </p>
   */

  @DISPID(1004)
  @PropGet
  double accuracy();


  /**
   * <p>
   * Getter method for the COM property "altitudeAccuracy"
   * </p>
   */

  @DISPID(1005)
  @PropGet
  java.lang.Object altitudeAccuracy();


  /**
   * <p>
   * Getter method for the COM property "heading"
   * </p>
   */

  @DISPID(1006)
  @PropGet
  java.lang.Object heading();


  /**
   * <p>
   * Getter method for the COM property "speed"
   * </p>
   */

  @DISPID(1007)
  @PropGet
  java.lang.Object speed();


  // Properties:
}
