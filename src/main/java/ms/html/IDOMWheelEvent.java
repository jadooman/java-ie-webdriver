package ms.html  ;

import com4j.*;

@IID("{305106D2-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMWheelEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "deltaX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(7)
  int deltaX();


  /**
   * <p>
   * Getter method for the COM property "deltaY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1102) //= 0x44e. The runtime will prefer the VTID if present
  @VTID(8)
  int deltaY();


  /**
   * <p>
   * Getter method for the COM property "deltaZ"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1103) //= 0x44f. The runtime will prefer the VTID if present
  @VTID(9)
  int deltaZ();


  /**
   * <p>
   * Getter method for the COM property "deltaMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1104) //= 0x450. The runtime will prefer the VTID if present
  @VTID(10)
  int deltaMode();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   * @param viewArg Mandatory ms.html.IHTMLWindow2 parameter.
   * @param detailArg Mandatory int parameter.
   * @param screenXArg Mandatory int parameter.
   * @param screenYArg Mandatory int parameter.
   * @param clientXArg Mandatory int parameter.
   * @param clientYArg Mandatory int parameter.
   * @param buttonArg Mandatory short parameter.
   * @param relatedTargetArg Mandatory ms.html.IEventTarget parameter.
   * @param modifiersListArg Mandatory java.lang.String parameter.
   * @param deltaX Mandatory int parameter.
   * @param deltaY Mandatory int parameter.
   * @param deltaZ Mandatory int parameter.
   * @param deltaMode Mandatory int parameter.
   */

  @DISPID(1105) //= 0x451. The runtime will prefer the VTID if present
  @VTID(11)
  void initWheelEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable,
    ms.html.IHTMLWindow2 viewArg,
    int detailArg,
    int screenXArg,
    int screenYArg,
    int clientXArg,
    int clientYArg,
    short buttonArg,
    ms.html.IEventTarget relatedTargetArg,
    java.lang.String modifiersListArg,
    int deltaX,
    int deltaY,
    int deltaZ,
    int deltaMode);


  // Properties:
}
