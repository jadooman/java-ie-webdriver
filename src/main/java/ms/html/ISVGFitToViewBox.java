package ms.html  ;

import com4j.*;

@IID("{305104E0-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGFitToViewBox extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "viewBox"
   * </p>
   * @return  Returns a value of type ms.html.ISVGAnimatedRect
   */

  @DISPID(1022) //= 0x3fe. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.ISVGAnimatedRect viewBox();


  /**
   * <p>
   * Setter method for the COM property "preserveAspectRatio"
   * </p>
   * @param p Mandatory ms.html.ISVGAnimatedPreserveAspectRatio parameter.
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(8)
  void preserveAspectRatio(
    ms.html.ISVGAnimatedPreserveAspectRatio p);


  /**
   * <p>
   * Getter method for the COM property "preserveAspectRatio"
   * </p>
   * @return  Returns a value of type ms.html.ISVGAnimatedPreserveAspectRatio
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.ISVGAnimatedPreserveAspectRatio preserveAspectRatio();


  // Properties:
}
