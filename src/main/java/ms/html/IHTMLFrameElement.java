package ms.html  ;

import com4j.*;

@IID("{3050F313-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLFrameElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "borderColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147414111) //= 0x80010fa1. The runtime will prefer the VTID if present
  @VTID(7)
  void borderColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147414111) //= 0x80010fa1. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderColor();


  // Properties:
}
