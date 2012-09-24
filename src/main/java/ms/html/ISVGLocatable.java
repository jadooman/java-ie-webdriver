package ms.html  ;

import com4j.*;

@IID("{305104DB-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGLocatable extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "nearestViewportElement"
   * </p>
   * @return  Returns a value of type ms.html.ISVGElement
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.ISVGElement nearestViewportElement();


  /**
   * <p>
   * Getter method for the COM property "farthestViewportElement"
   * </p>
   * @return  Returns a value of type ms.html.ISVGElement
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.ISVGElement farthestViewportElement();


  /**
   * @return  Returns a value of type ms.html.ISVGRect
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.ISVGRect getBBox();


  /**
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.ISVGMatrix getCTM();


  /**
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.ISVGMatrix getScreenCTM();


  /**
   * @param pElement Mandatory ms.html.ISVGElement parameter.
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.ISVGMatrix getTransformToElement(
    ms.html.ISVGElement pElement);


  // Properties:
}
