package ms.html  ;

import com4j.*;

@IID("{3050F32D-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLEventObj extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "srcElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLElement srcElement();


  /**
   * <p>
   * Getter method for the COM property "altKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  boolean altKey();


  /**
   * <p>
   * Getter method for the COM property "ctrlKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(9)
  boolean ctrlKey();


  /**
   * <p>
   * Getter method for the COM property "shiftKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(10)
  boolean shiftKey();


  /**
   * <p>
   * Setter method for the COM property "returnValue"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(11)
  void returnValue(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "returnValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object returnValue();


  /**
   * <p>
   * Setter method for the COM property "cancelBubble"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(13)
  void cancelBubble(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "cancelBubble"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(14)
  boolean cancelBubble();


  /**
   * <p>
   * Getter method for the COM property "fromElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(15)
  ms.html.IHTMLElement fromElement();


  /**
   * <p>
   * Getter method for the COM property "toElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(16)
  ms.html.IHTMLElement toElement();


  /**
   * <p>
   * Setter method for the COM property "keyCode"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(17)
  void keyCode(
    int p);


  /**
   * <p>
   * Getter method for the COM property "keyCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(18)
  int keyCode();


  /**
   * <p>
   * Getter method for the COM property "button"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(19)
  int button();


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String type();


  /**
   * <p>
   * Getter method for the COM property "qualifier"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String qualifier();


  /**
   * <p>
   * Getter method for the COM property "reason"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(22)
  int reason();


  /**
   * <p>
   * Getter method for the COM property "x"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(23)
  int x();


  /**
   * <p>
   * Getter method for the COM property "y"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(24)
  int y();


  /**
   * <p>
   * Getter method for the COM property "clientX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(25)
  int clientX();


  /**
   * <p>
   * Getter method for the COM property "clientY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1021) //= 0x3fd. The runtime will prefer the VTID if present
  @VTID(26)
  int clientY();


  /**
   * <p>
   * Getter method for the COM property "offsetX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1022) //= 0x3fe. The runtime will prefer the VTID if present
  @VTID(27)
  int offsetX();


  /**
   * <p>
   * Getter method for the COM property "offsetY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1023) //= 0x3ff. The runtime will prefer the VTID if present
  @VTID(28)
  int offsetY();


  /**
   * <p>
   * Getter method for the COM property "screenX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(29)
  int screenX();


  /**
   * <p>
   * Getter method for the COM property "screenY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1025) //= 0x401. The runtime will prefer the VTID if present
  @VTID(30)
  int screenY();


  /**
   * <p>
   * Getter method for the COM property "srcFilter"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1026) //= 0x402. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject srcFilter();


  // Properties:
}
