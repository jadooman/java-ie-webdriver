package ms.html  ;

import com4j.*;

@IID("{30510720-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMMessageEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "data"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1326) //= 0x52e. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String data();


  /**
   * <p>
   * Getter method for the COM property "origin"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1327) //= 0x52f. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String origin();


  /**
   * <p>
   * Getter method for the COM property "source"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLWindow2
   */

  @DISPID(1328) //= 0x530. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLWindow2 source();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   * @param data Mandatory java.lang.String parameter.
   * @param origin Mandatory java.lang.String parameter.
   * @param lastEventId Mandatory java.lang.String parameter.
   * @param source Mandatory ms.html.IHTMLWindow2 parameter.
   */

  @DISPID(1329) //= 0x531. The runtime will prefer the VTID if present
  @VTID(10)
  void initMessageEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable,
    java.lang.String data,
    java.lang.String origin,
    java.lang.String lastEventId,
    ms.html.IHTMLWindow2 source);


  // Properties:
}
