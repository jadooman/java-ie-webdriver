package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispDOMUIEvent extends Com4jObject {
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


  // Properties:
}
