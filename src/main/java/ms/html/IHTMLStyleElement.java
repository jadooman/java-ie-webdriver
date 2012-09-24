package ms.html  ;

import com4j.*;

@IID("{3050F375-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStyleElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "type"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(7)
  void type(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String type();


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412996) //= 0x800113fc. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String readyState();


  /**
   * <p>
   * Setter method for the COM property "onreadystatechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(10)
  void onreadystatechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onreadystatechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onreadystatechange();


  /**
   * <p>
   * Setter method for the COM property "onload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(12)
  void onload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onload();


  /**
   * <p>
   * Setter method for the COM property "onerror"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(14)
  void onerror(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onerror"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onerror();


  /**
   * <p>
   * Getter method for the COM property "styleSheet"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyleSheet
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(16)
  ms.html.IHTMLStyleSheet styleSheet();


  /**
   * <p>
   * Setter method for the COM property "disabled"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(17)
  void disabled(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "disabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(18)
  boolean disabled();


  /**
   * <p>
   * Setter method for the COM property "media"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(19)
  void media(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "media"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String media();


  // Properties:
}
