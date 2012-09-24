package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispDOMStorageEvent extends Com4jObject {
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
   * Getter method for the COM property "key"
   * </p>
   */

  @DISPID(1351)
  @PropGet
  java.lang.String key();


  /**
   * <p>
   * Getter method for the COM property "oldValue"
   * </p>
   */

  @DISPID(1352)
  @PropGet
  java.lang.String oldValue();


  /**
   * <p>
   * Getter method for the COM property "newValue"
   * </p>
   */

  @DISPID(1353)
  @PropGet
  java.lang.String newValue();


  /**
   * <p>
   * Getter method for the COM property "url"
   * </p>
   */

  @DISPID(1354)
  @PropGet
  java.lang.String url();


  /**
   * <p>
   * Getter method for the COM property "storageArea"
   * </p>
   */

  @DISPID(1355)
  @PropGet
  ms.html.IHTMLStorage storageArea();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   * @param keyArg Mandatory java.lang.String parameter.
   * @param oldValueArg Mandatory java.lang.String parameter.
   * @param newValueArg Mandatory java.lang.String parameter.
   * @param urlArg Mandatory java.lang.String parameter.
   * @param storageAreaArg Mandatory ms.html.IHTMLStorage parameter.
   */

  @DISPID(1356)
  void initStorageEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable,
    java.lang.String keyArg,
    java.lang.String oldValueArg,
    java.lang.String newValueArg,
    java.lang.String urlArg,
    ms.html.IHTMLStorage storageAreaArg);


  // Properties:
}
