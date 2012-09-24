package ms.html  ;

import com4j.*;

@IID("{3051040E-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLWindow5 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "XMLHttpRequest"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1190) //= 0x4a6. The runtime will prefer the VTID if present
  @VTID(7)
  void xmlHttpRequest(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "XMLHttpRequest"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1190) //= 0x4a6. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object xmlHttpRequest();


  // Properties:
}
