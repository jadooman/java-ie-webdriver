package ms.html  ;

import com4j.*;

@IID("{30510482-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLXMLHttpRequest2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "timeout"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(7)
  void timeout(
    int p);


  /**
   * <p>
   * Getter method for the COM property "timeout"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(8)
  int timeout();


  /**
   * <p>
   * Setter method for the COM property "ontimeout"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412000) //= 0x800117e0. The runtime will prefer the VTID if present
  @VTID(9)
  void ontimeout(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ontimeout"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412000) //= 0x800117e0. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ontimeout();


  // Properties:
}
