package ms.html  ;

import com4j.*;

@IID("{3050F205-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLLinkElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "href"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(7)
  void href(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "href"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String href();


  /**
   * <p>
   * Setter method for the COM property "rel"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(9)
  void rel(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "rel"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String rel();


  /**
   * <p>
   * Setter method for the COM property "rev"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(11)
  void rev(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "rev"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String rev();


  /**
   * <p>
   * Setter method for the COM property "type"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(13)
  void type(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String type();


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412996) //= 0x800113fc. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String readyState();


  /**
   * <p>
   * Setter method for the COM property "onreadystatechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(16)
  void onreadystatechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onreadystatechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onreadystatechange();


  /**
   * <p>
   * Setter method for the COM property "onload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(18)
  void onload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onload();


  /**
   * <p>
   * Setter method for the COM property "onerror"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(20)
  void onerror(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onerror"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onerror();


  /**
   * <p>
   * Getter method for the COM property "styleSheet"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyleSheet
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(22)
  ms.html.IHTMLStyleSheet styleSheet();


  /**
   * <p>
   * Setter method for the COM property "disabled"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(23)
  void disabled(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "disabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(24)
  boolean disabled();


  /**
   * <p>
   * Setter method for the COM property "media"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(25)
  void media(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "media"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String media();


  // Properties:
}
