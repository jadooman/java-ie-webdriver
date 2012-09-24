package ms.html  ;

import com4j.*;

@IID("{3051054E-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGZoomEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "zoomRectScreen"
   * </p>
   * @return  Returns a value of type ms.html.ISVGRect
   */

  @DISPID(1276) //= 0x4fc. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.ISVGRect zoomRectScreen();


  /**
   * <p>
   * Getter method for the COM property "previousScale"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1277) //= 0x4fd. The runtime will prefer the VTID if present
  @VTID(8)
  float previousScale();


  /**
   * <p>
   * Getter method for the COM property "previousTranslate"
   * </p>
   * @return  Returns a value of type ms.html.ISVGPoint
   */

  @DISPID(1278) //= 0x4fe. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.ISVGPoint previousTranslate();


  /**
   * <p>
   * Getter method for the COM property "newScale"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1279) //= 0x4ff. The runtime will prefer the VTID if present
  @VTID(10)
  float newScale();


  /**
   * <p>
   * Getter method for the COM property "newTranslate"
   * </p>
   * @return  Returns a value of type ms.html.ISVGPoint
   */

  @DISPID(1280) //= 0x500. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.ISVGPoint newTranslate();


  // Properties:
}
