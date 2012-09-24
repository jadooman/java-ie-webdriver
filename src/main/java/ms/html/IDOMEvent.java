package ms.html  ;

import com4j.*;

@IID("{305104BA-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "bubbles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  boolean bubbles();


  /**
   * <p>
   * Getter method for the COM property "cancelable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  boolean cancelable();


  /**
   * <p>
   * Getter method for the COM property "currentTarget"
   * </p>
   * @return  Returns a value of type ms.html.IEventTarget
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IEventTarget currentTarget();


  /**
   * <p>
   * Getter method for the COM property "defaultPrevented"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(10)
  boolean defaultPrevented();


  /**
   * <p>
   * Getter method for the COM property "eventPhase"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(11)
  short eventPhase();


  /**
   * <p>
   * Getter method for the COM property "target"
   * </p>
   * @return  Returns a value of type ms.html.IEventTarget
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.IEventTarget target();


  /**
   * <p>
   * Getter method for the COM property "timeStamp"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(13)
  long timeStamp();


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String type();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(15)
  void initEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable);


  /**
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(16)
  void preventDefault();


  /**
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(17)
  void stopPropagation();


  /**
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(18)
  void stopImmediatePropagation();


  /**
   * <p>
   * Getter method for the COM property "isTrusted"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(19)
  boolean isTrusted();


  /**
   * <p>
   * Setter method for the COM property "cancelBubble"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(20)
  void cancelBubble(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "cancelBubble"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(21)
  boolean cancelBubble();


  /**
   * <p>
   * Getter method for the COM property "srcElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(22)
  ms.html.IHTMLElement srcElement();


  // Properties:
}
