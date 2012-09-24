package ms.html  ;

import com4j.*;

@IID("{AE24FDAD-03C6-11D1-8B76-0080C744F389}")
public interface IWebBridge extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "url"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void url(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "url"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String url();


  /**
   * <p>
   * Setter method for the COM property "Scrollbar"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void scrollbar(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "Scrollbar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  boolean scrollbar();


  /**
   * <p>
   * Setter method for the COM property "embed"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void embed(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "embed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  boolean embed();


  /**
   * <p>
   * Getter method for the COM property "event"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1152) //= 0x480. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject event();


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-525) //= 0xfffffdf3. The runtime will prefer the VTID if present
  @VTID(14)
  int readyState();


  /**
   */

  @DISPID(-552) //= 0xfffffdd8. The runtime will prefer the VTID if present
  @VTID(15)
  void aboutBox();


  // Properties:
}
