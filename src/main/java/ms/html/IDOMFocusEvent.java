package ms.html  ;

import com4j.*;

@IID("{305106CC-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMFocusEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "relatedTarget"
   * </p>
   * @return  Returns a value of type ms.html.IEventTarget
   */

  @DISPID(1251) //= 0x4e3. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IEventTarget relatedTarget();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   * @param view Mandatory ms.html.IHTMLWindow2 parameter.
   * @param detail Mandatory int parameter.
   * @param relatedTargetArg Mandatory ms.html.IEventTarget parameter.
   */

  @DISPID(1252) //= 0x4e4. The runtime will prefer the VTID if present
  @VTID(8)
  void initFocusEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable,
    ms.html.IHTMLWindow2 view,
    int detail,
    ms.html.IEventTarget relatedTargetArg);


  // Properties:
}
