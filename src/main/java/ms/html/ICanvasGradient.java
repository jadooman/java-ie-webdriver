package ms.html  ;

import com4j.*;

@IID("{30510714-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ICanvasGradient extends Com4jObject {
  // Methods:
  /**
   * @param offset Mandatory float parameter.
   * @param color Mandatory java.lang.String parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  void addColorStop(
    float offset,
    java.lang.String color);


  // Properties:
}
