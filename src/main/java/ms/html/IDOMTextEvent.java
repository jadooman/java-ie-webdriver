package ms.html  ;

import com4j.*;

@IID("{305106D4-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMTextEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "data"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1126) //= 0x466. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String data();


  /**
   * <p>
   * Getter method for the COM property "inputMethod"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1127) //= 0x467. The runtime will prefer the VTID if present
  @VTID(8)
  int inputMethod();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   * @param viewArg Mandatory ms.html.IHTMLWindow2 parameter.
   * @param dataArg Mandatory java.lang.String parameter.
   * @param inputMethod Mandatory int parameter.
   * @param locale Mandatory java.lang.String parameter.
   */

  @DISPID(1128) //= 0x468. The runtime will prefer the VTID if present
  @VTID(9)
  void initTextEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable,
    ms.html.IHTMLWindow2 viewArg,
    java.lang.String dataArg,
    int inputMethod,
    java.lang.String locale);


  /**
   * <p>
   * Getter method for the COM property "locale"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1129) //= 0x469. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String locale();


  // Properties:
}
