package ms.html  ;

import com4j.*;

@IID("{3051041A-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDocumentCompatibleInfo extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "userAgent"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String userAgent();


  /**
   * <p>
   * Getter method for the COM property "version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String version();


  // Properties:
}
