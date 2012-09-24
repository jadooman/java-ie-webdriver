package ms.html  ;

import com4j.*;

@IID("{305106CA-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMUIEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "view"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLWindow2
   */

  @DISPID(1026) //= 0x402. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLWindow2 view();


  /**
   * <p>
   * Getter method for the COM property "detail"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1027) //= 0x403. The runtime will prefer the VTID if present
  @VTID(8)
  int detail();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   * @param view Mandatory ms.html.IHTMLWindow2 parameter.
   * @param detail Mandatory int parameter.
   */

  @DISPID(1028) //= 0x404. The runtime will prefer the VTID if present
  @VTID(9)
  void initUIEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable,
    ms.html.IHTMLWindow2 view,
    int detail);


  // Properties:
}
