package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispWebGeolocation extends Com4jObject {
  // Methods:
  /**
   * @param successCallback Mandatory com4j.Com4jObject parameter.
   * @param errorCallback Optional parameter. Default value is unprintable.
   * @param options Optional parameter. Default value is unprintable.
   */

  @DISPID(1001)
  void getCurrentPosition(
    com4j.Com4jObject successCallback,
    @Optional com4j.Com4jObject errorCallback,
    @Optional com4j.Com4jObject options);


  /**
   * @param successCallback Mandatory com4j.Com4jObject parameter.
   * @param errorCallback Optional parameter. Default value is unprintable.
   * @param options Optional parameter. Default value is unprintable.
   */

  @DISPID(1002)
  int watchPosition(
    com4j.Com4jObject successCallback,
    @Optional com4j.Com4jObject errorCallback,
    @Optional com4j.Com4jObject options);


  /**
   * @param watchId Mandatory int parameter.
   */

  @DISPID(1003)
  void clearWatch(
    int watchId);


  // Properties:
}
