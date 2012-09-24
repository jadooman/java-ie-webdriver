package ms.html  ;

import com4j.*;

@IID("{305107C5-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IWebGeolocation extends Com4jObject {
  // Methods:
  /**
   * @param successCallback Mandatory com4j.Com4jObject parameter.
   * @param errorCallback Optional parameter. Default value is unprintable.
   * @param options Optional parameter. Default value is unprintable.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  void getCurrentPosition(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject successCallback,
    @Optional @MarshalAs(NativeType.Dispatch) com4j.Com4jObject errorCallback,
    @Optional @MarshalAs(NativeType.Dispatch) com4j.Com4jObject options);


  /**
   * @param successCallback Mandatory com4j.Com4jObject parameter.
   * @param errorCallback Optional parameter. Default value is unprintable.
   * @param options Optional parameter. Default value is unprintable.
   * @return  Returns a value of type int
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  int watchPosition(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject successCallback,
    @Optional @MarshalAs(NativeType.Dispatch) com4j.Com4jObject errorCallback,
    @Optional @MarshalAs(NativeType.Dispatch) com4j.Com4jObject options);


  /**
   * @param watchId Mandatory int parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(9)
  void clearWatch(
    int watchId);


  // Properties:
}
