package ms.html  ;

import com4j.*;

@IID("{305106D8-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMCompositionEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "data"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1176) //= 0x498. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String data();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   * @param viewArg Mandatory ms.html.IHTMLWindow2 parameter.
   * @param data Mandatory java.lang.String parameter.
   * @param locale Mandatory java.lang.String parameter.
   */

  @DISPID(1177) //= 0x499. The runtime will prefer the VTID if present
  @VTID(8)
  void initCompositionEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable,
    ms.html.IHTMLWindow2 viewArg,
    java.lang.String data,
    java.lang.String locale);


  /**
   * <p>
   * Getter method for the COM property "locale"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1178) //= 0x49a. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String locale();


  // Properties:
}
