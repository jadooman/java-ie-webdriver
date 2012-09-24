package ms.html  ;

import com4j.*;

@IID("{305106CE-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMMouseEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "screenX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1051) //= 0x41b. The runtime will prefer the VTID if present
  @VTID(7)
  int screenX();


  /**
   * <p>
   * Getter method for the COM property "screenY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1052) //= 0x41c. The runtime will prefer the VTID if present
  @VTID(8)
  int screenY();


  /**
   * <p>
   * Getter method for the COM property "clientX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1053) //= 0x41d. The runtime will prefer the VTID if present
  @VTID(9)
  int clientX();


  /**
   * <p>
   * Getter method for the COM property "clientY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1054) //= 0x41e. The runtime will prefer the VTID if present
  @VTID(10)
  int clientY();


  /**
   * <p>
   * Getter method for the COM property "ctrlKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1055) //= 0x41f. The runtime will prefer the VTID if present
  @VTID(11)
  boolean ctrlKey();


  /**
   * <p>
   * Getter method for the COM property "shiftKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1056) //= 0x420. The runtime will prefer the VTID if present
  @VTID(12)
  boolean shiftKey();


  /**
   * <p>
   * Getter method for the COM property "altKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1057) //= 0x421. The runtime will prefer the VTID if present
  @VTID(13)
  boolean altKey();


  /**
   * <p>
   * Getter method for the COM property "metaKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1058) //= 0x422. The runtime will prefer the VTID if present
  @VTID(14)
  boolean metaKey();


  /**
   * <p>
   * Getter method for the COM property "button"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1059) //= 0x423. The runtime will prefer the VTID if present
  @VTID(15)
  short button();


  /**
   * <p>
   * Getter method for the COM property "relatedTarget"
   * </p>
   * @return  Returns a value of type ms.html.IEventTarget
   */

  @DISPID(1060) //= 0x424. The runtime will prefer the VTID if present
  @VTID(16)
  ms.html.IEventTarget relatedTarget();


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
   * @param ctrlKeyArg Mandatory boolean parameter.
   * @param altKeyArg Mandatory boolean parameter.
   * @param shiftKeyArg Mandatory boolean parameter.
   * @param metaKeyArg Mandatory boolean parameter.
   * @param buttonArg Mandatory short parameter.
   * @param relatedTargetArg Mandatory ms.html.IEventTarget parameter.
   */

  @DISPID(1061) //= 0x425. The runtime will prefer the VTID if present
  @VTID(17)
  void initMouseEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable,
    ms.html.IHTMLWindow2 viewArg,
    int detailArg,
    int screenXArg,
    int screenYArg,
    int clientXArg,
    int clientYArg,
    boolean ctrlKeyArg,
    boolean altKeyArg,
    boolean shiftKeyArg,
    boolean metaKeyArg,
    short buttonArg,
    ms.html.IEventTarget relatedTargetArg);


  /**
   * @param keyArg Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1062) //= 0x426. The runtime will prefer the VTID if present
  @VTID(18)
  boolean getModifierState(
    java.lang.String keyArg);


  /**
   * <p>
   * Getter method for the COM property "buttons"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1063) //= 0x427. The runtime will prefer the VTID if present
  @VTID(19)
  short buttons();


  /**
   * <p>
   * Getter method for the COM property "fromElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1064) //= 0x428. The runtime will prefer the VTID if present
  @VTID(20)
  ms.html.IHTMLElement fromElement();


  /**
   * <p>
   * Getter method for the COM property "toElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1065) //= 0x429. The runtime will prefer the VTID if present
  @VTID(21)
  ms.html.IHTMLElement toElement();


  /**
   * <p>
   * Getter method for the COM property "x"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1066) //= 0x42a. The runtime will prefer the VTID if present
  @VTID(22)
  int x();


  /**
   * <p>
   * Getter method for the COM property "y"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1067) //= 0x42b. The runtime will prefer the VTID if present
  @VTID(23)
  int y();


  /**
   * <p>
   * Getter method for the COM property "offsetX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1068) //= 0x42c. The runtime will prefer the VTID if present
  @VTID(24)
  int offsetX();


  /**
   * <p>
   * Getter method for the COM property "offsetY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1069) //= 0x42d. The runtime will prefer the VTID if present
  @VTID(25)
  int offsetY();


  /**
   * <p>
   * Getter method for the COM property "pageX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1070) //= 0x42e. The runtime will prefer the VTID if present
  @VTID(26)
  int pageX();


  /**
   * <p>
   * Getter method for the COM property "pageY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1071) //= 0x42f. The runtime will prefer the VTID if present
  @VTID(27)
  int pageY();


  /**
   * <p>
   * Getter method for the COM property "layerX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1072) //= 0x430. The runtime will prefer the VTID if present
  @VTID(28)
  int layerX();


  /**
   * <p>
   * Getter method for the COM property "layerY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1073) //= 0x431. The runtime will prefer the VTID if present
  @VTID(29)
  int layerY();


  /**
   * <p>
   * Getter method for the COM property "which"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1074) //= 0x432. The runtime will prefer the VTID if present
  @VTID(30)
  short which();


  // Properties:
}
