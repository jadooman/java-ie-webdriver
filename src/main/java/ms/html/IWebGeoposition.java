package ms.html  ;

import com4j.*;

@IID("{305107CD-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IWebGeoposition extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "coords"
   * </p>
   * @return  Returns a value of type ms.html.IWebGeocoordinates
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IWebGeocoordinates coords();


  /**
   * <p>
   * Getter method for the COM property "timeStamp"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  long timeStamp();


  // Properties:
}
