package ms.html  ;

import com4j.*;

@IID("{305107C7-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IWebGeocoordinates extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "latitude"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  double latitude();


  /**
   * <p>
   * Getter method for the COM property "longitude"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  double longitude();


  /**
   * <p>
   * Getter method for the COM property "altitude"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object altitude();


  /**
   * <p>
   * Getter method for the COM property "accuracy"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(10)
  double accuracy();


  /**
   * <p>
   * Getter method for the COM property "altitudeAccuracy"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object altitudeAccuracy();


  /**
   * <p>
   * Getter method for the COM property "heading"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object heading();


  /**
   * <p>
   * Getter method for the COM property "speed"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object speed();


  // Properties:
}
