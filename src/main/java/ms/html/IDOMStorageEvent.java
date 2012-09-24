package ms.html  ;

import com4j.*;

@IID("{30510722-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMStorageEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1351) //= 0x547. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String key();


  /**
   * <p>
   * Getter method for the COM property "oldValue"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1352) //= 0x548. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String oldValue();


  /**
   * <p>
   * Getter method for the COM property "newValue"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1353) //= 0x549. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String newValue();


  /**
   * <p>
   * Getter method for the COM property "url"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1354) //= 0x54a. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String url();


  /**
   * <p>
   * Getter method for the COM property "storageArea"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStorage
   */

  @DISPID(1355) //= 0x54b. The runtime will prefer the VTID if present
  @VTID(11)
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

  @DISPID(1356) //= 0x54c. The runtime will prefer the VTID if present
  @VTID(12)
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
