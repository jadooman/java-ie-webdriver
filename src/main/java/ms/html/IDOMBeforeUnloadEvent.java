package ms.html  ;

import com4j.*;

@IID("{30510763-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMBeforeUnloadEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "returnValue"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1376) //= 0x560. The runtime will prefer the VTID if present
  @VTID(7)
  void returnValue(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "returnValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1376) //= 0x560. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object returnValue();


  // Properties:
}
