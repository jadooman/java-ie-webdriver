package ms.html  ;

import com4j.*;

@IID("{3050F6DB-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLFrameBase2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "contentWindow"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLWindow2
   */

  @DISPID(-2147415103) //= 0x80010bc1. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLWindow2 contentWindow();


  /**
   * <p>
   * Setter method for the COM property "onload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(8)
  void onload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onload();


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
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412996) //= 0x800113fc. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String readyState();


  /**
   * <p>
   * Setter method for the COM property "allowTransparency"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147412906) //= 0x80011456. The runtime will prefer the VTID if present
  @VTID(13)
  void allowTransparency(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "allowTransparency"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147412906) //= 0x80011456. The runtime will prefer the VTID if present
  @VTID(14)
  boolean allowTransparency();


  // Properties:
}
