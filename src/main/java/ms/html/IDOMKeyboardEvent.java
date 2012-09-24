package ms.html  ;

import com4j.*;

@IID("{305106D6-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMKeyboardEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1151) //= 0x47f. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String key();


  /**
   * <p>
   * Getter method for the COM property "location"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1152) //= 0x480. The runtime will prefer the VTID if present
  @VTID(8)
  int location();


  /**
   * <p>
   * Getter method for the COM property "ctrlKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1153) //= 0x481. The runtime will prefer the VTID if present
  @VTID(9)
  boolean ctrlKey();


  /**
   * <p>
   * Getter method for the COM property "shiftKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1154) //= 0x482. The runtime will prefer the VTID if present
  @VTID(10)
  boolean shiftKey();


  /**
   * <p>
   * Getter method for the COM property "altKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1155) //= 0x483. The runtime will prefer the VTID if present
  @VTID(11)
  boolean altKey();


  /**
   * <p>
   * Getter method for the COM property "metaKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1156) //= 0x484. The runtime will prefer the VTID if present
  @VTID(12)
  boolean metaKey();


  /**
   * <p>
   * Getter method for the COM property "repeat"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1157) //= 0x485. The runtime will prefer the VTID if present
  @VTID(13)
  boolean repeat();


  /**
   * @param keyArg Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1158) //= 0x486. The runtime will prefer the VTID if present
  @VTID(14)
  boolean getModifierState(
    java.lang.String keyArg);


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   * @param viewArg Mandatory ms.html.IHTMLWindow2 parameter.
   * @param keyArg Mandatory java.lang.String parameter.
   * @param locationArg Mandatory int parameter.
   * @param modifiersListArg Mandatory java.lang.String parameter.
   * @param repeat Mandatory boolean parameter.
   * @param locale Mandatory java.lang.String parameter.
   */

  @DISPID(1159) //= 0x487. The runtime will prefer the VTID if present
  @VTID(15)
  void initKeyboardEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable,
    ms.html.IHTMLWindow2 viewArg,
    java.lang.String keyArg,
    int locationArg,
    java.lang.String modifiersListArg,
    boolean repeat,
    java.lang.String locale);


  /**
   * <p>
   * Getter method for the COM property "keyCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1160) //= 0x488. The runtime will prefer the VTID if present
  @VTID(16)
  int keyCode();


  /**
   * <p>
   * Getter method for the COM property "charCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1161) //= 0x489. The runtime will prefer the VTID if present
  @VTID(17)
  int charCode();


  /**
   * <p>
   * Getter method for the COM property "which"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1162) //= 0x48a. The runtime will prefer the VTID if present
  @VTID(18)
  int which();


  /**
   * <p>
   * Getter method for the COM property "ie9_char"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1163) //= 0x48b. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ie9_char();


  /**
   * <p>
   * Getter method for the COM property "locale"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1164) //= 0x48c. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String locale();


  // Properties:
}
