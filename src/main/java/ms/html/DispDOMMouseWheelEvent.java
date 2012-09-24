package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispDOMMouseWheelEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "bubbles"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  boolean bubbles();


  /**
   * <p>
   * Getter method for the COM property "cancelable"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  boolean cancelable();


  /**
   * <p>
   * Getter method for the COM property "currentTarget"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  ms.html.IEventTarget currentTarget();


  /**
   * <p>
   * Getter method for the COM property "defaultPrevented"
   * </p>
   */

  @DISPID(1004)
  @PropGet
  boolean defaultPrevented();


  /**
   * <p>
   * Getter method for the COM property "eventPhase"
   * </p>
   */

  @DISPID(1005)
  @PropGet
  short eventPhase();


  /**
   * <p>
   * Getter method for the COM property "target"
   * </p>
   */

  @DISPID(1006)
  @PropGet
  ms.html.IEventTarget target();


  /**
   * <p>
   * Getter method for the COM property "timeStamp"
   * </p>
   */

  @DISPID(1007)
  @PropGet
  long timeStamp();


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   */

  @DISPID(1008)
  @PropGet
  java.lang.String type();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   */

  @DISPID(1009)
  void initEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable);


  /**
   */

  @DISPID(1010)
  void preventDefault();


  /**
   */

  @DISPID(1011)
  void stopPropagation();


  /**
   */

  @DISPID(1012)
  void stopImmediatePropagation();


  /**
   * <p>
   * Getter method for the COM property "isTrusted"
   * </p>
   */

  @DISPID(1013)
  @PropGet
  boolean isTrusted();


  /**
   * <p>
   * Setter method for the COM property "cancelBubble"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1014)
  @PropPut
  void cancelBubble(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "cancelBubble"
   * </p>
   */

  @DISPID(1014)
  @PropGet
  boolean cancelBubble();


  /**
   * <p>
   * Getter method for the COM property "srcElement"
   * </p>
   */

  @DISPID(1015)
  @PropGet
  ms.html.IHTMLElement srcElement();


  /**
   * <p>
   * Getter method for the COM property "view"
   * </p>
   */

  @DISPID(1026)
  @PropGet
  ms.html.IHTMLWindow2 view();


  /**
   * <p>
   * Getter method for the COM property "detail"
   * </p>
   */

  @DISPID(1027)
  @PropGet
  int detail();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   * @param view Mandatory ms.html.IHTMLWindow2 parameter.
   * @param detail Mandatory int parameter.
   */

  @DISPID(1028)
  void initUIEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable,
    ms.html.IHTMLWindow2 view,
    int detail);


  /**
   * <p>
   * Getter method for the COM property "screenX"
   * </p>
   */

  @DISPID(1051)
  @PropGet
  int screenX();


  /**
   * <p>
   * Getter method for the COM property "screenY"
   * </p>
   */

  @DISPID(1052)
  @PropGet
  int screenY();


  /**
   * <p>
   * Getter method for the COM property "clientX"
   * </p>
   */

  @DISPID(1053)
  @PropGet
  int clientX();


  /**
   * <p>
   * Getter method for the COM property "clientY"
   * </p>
   */

  @DISPID(1054)
  @PropGet
  int clientY();


  /**
   * <p>
   * Getter method for the COM property "ctrlKey"
   * </p>
   */

  @DISPID(1055)
  @PropGet
  boolean ctrlKey();


  /**
   * <p>
   * Getter method for the COM property "shiftKey"
   * </p>
   */

  @DISPID(1056)
  @PropGet
  boolean shiftKey();


  /**
   * <p>
   * Getter method for the COM property "altKey"
   * </p>
   */

  @DISPID(1057)
  @PropGet
  boolean altKey();


  /**
   * <p>
   * Getter method for the COM property "metaKey"
   * </p>
   */

  @DISPID(1058)
  @PropGet
  boolean metaKey();


  /**
   * <p>
   * Getter method for the COM property "button"
   * </p>
   */

  @DISPID(1059)
  @PropGet
  short button();


  /**
   * <p>
   * Getter method for the COM property "relatedTarget"
   * </p>
   */

  @DISPID(1060)
  @PropGet
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

  @DISPID(1061)
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
   */

  @DISPID(1062)
  boolean getModifierState(
    java.lang.String keyArg);


  /**
   * <p>
   * Getter method for the COM property "buttons"
   * </p>
   */

  @DISPID(1063)
  @PropGet
  short buttons();


  /**
   * <p>
   * Getter method for the COM property "fromElement"
   * </p>
   */

  @DISPID(1064)
  @PropGet
  ms.html.IHTMLElement fromElement();


  /**
   * <p>
   * Getter method for the COM property "toElement"
   * </p>
   */

  @DISPID(1065)
  @PropGet
  ms.html.IHTMLElement toElement();


  /**
   * <p>
   * Getter method for the COM property "x"
   * </p>
   */

  @DISPID(1066)
  @PropGet
  int x();


  /**
   * <p>
   * Getter method for the COM property "y"
   * </p>
   */

  @DISPID(1067)
  @PropGet
  int y();


  /**
   * <p>
   * Getter method for the COM property "offsetX"
   * </p>
   */

  @DISPID(1068)
  @PropGet
  int offsetX();


  /**
   * <p>
   * Getter method for the COM property "offsetY"
   * </p>
   */

  @DISPID(1069)
  @PropGet
  int offsetY();


  /**
   * <p>
   * Getter method for the COM property "pageX"
   * </p>
   */

  @DISPID(1070)
  @PropGet
  int pageX();


  /**
   * <p>
   * Getter method for the COM property "pageY"
   * </p>
   */

  @DISPID(1071)
  @PropGet
  int pageY();


  /**
   * <p>
   * Getter method for the COM property "layerX"
   * </p>
   */

  @DISPID(1072)
  @PropGet
  int layerX();


  /**
   * <p>
   * Getter method for the COM property "layerY"
   * </p>
   */

  @DISPID(1073)
  @PropGet
  int layerY();


  /**
   * <p>
   * Getter method for the COM property "which"
   * </p>
   */

  @DISPID(1074)
  @PropGet
  short which();


  /**
   * <p>
   * Getter method for the COM property "wheelDelta"
   * </p>
   */

  @DISPID(1076)
  @PropGet
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

  @DISPID(1077)
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
