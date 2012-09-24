package ms.html  ;

import com4j.*;

@IID("{3050F5F4-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTCAttachBehavior extends Com4jObject {
  // Methods:
  /**
   * @param evt Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  void fireEvent(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject evt);


  /**
   */

  @DISPID(-2147417612) //= 0x800101f4. The runtime will prefer the VTID if present
  @VTID(8)
  void detachEvent();


  // Properties:
}
