package ms.html  ;

import com4j.*;

@IID("{3050F319-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLFrameSetElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "rows"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  void rows(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "rows"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String rows();


  /**
   * <p>
   * Setter method for the COM property "cols"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  void cols(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "cols"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String cols();


  /**
   * <p>
   * Setter method for the COM property "border"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(11)
  void border(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "border"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object border();


  /**
   * <p>
   * Setter method for the COM property "borderColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(13)
  void borderColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderColor();


  /**
   * <p>
   * Setter method for the COM property "frameBorder"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(15)
  void frameBorder(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "frameBorder"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String frameBorder();


  /**
   * <p>
   * Setter method for the COM property "frameSpacing"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(17)
  void frameSpacing(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "frameSpacing"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object frameSpacing();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(19)
  void name(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "onload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(21)
  void onload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onload();


  /**
   * <p>
   * Setter method for the COM property "onunload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412079) //= 0x80011791. The runtime will prefer the VTID if present
  @VTID(23)
  void onunload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onunload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412079) //= 0x80011791. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onunload();


  /**
   * <p>
   * Setter method for the COM property "onbeforeunload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412073) //= 0x80011797. The runtime will prefer the VTID if present
  @VTID(25)
  void onbeforeunload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforeunload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412073) //= 0x80011797. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforeunload();


  // Properties:
}
