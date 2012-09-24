package ms.html  ;

import com4j.*;

@IID("{3051071A-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ICanvasImageData extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  int width();


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int height();


  /**
   * <p>
   * Getter method for the COM property "data"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object data();


  // Properties:
}
