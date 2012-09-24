package ms.html  ;

import com4j.*;

@IID("{305106D0-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMMouseWheelEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "wheelDelta"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1076) //= 0x434. The runtime will prefer the VTID if present
  @VTID(7)
  int wheelDelta();


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
   * @param wheelDeltaArg Mandatory int parameter.
   */

  @DISPID(1077) //= 0x435. The runtime will prefer the VTID if present
  @VTID(8)
  void initMouseWheelEvent(
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
    int wheelDeltaArg);


  // Properties:
}
