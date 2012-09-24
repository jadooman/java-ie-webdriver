package ms.html  ;

import com4j.*;

@IID("{305106DE-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMCustomEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "detail"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1201) //= 0x4b1. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object detail();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   * @param detail Mandatory java.lang.Object parameter.
   */

  @DISPID(1202) //= 0x4b2. The runtime will prefer the VTID if present
  @VTID(8)
  void initCustomEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable,
    java.lang.Object detail);


  // Properties:
}
