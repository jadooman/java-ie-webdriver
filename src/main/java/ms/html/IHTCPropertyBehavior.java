package ms.html  ;

import com4j.*;

@IID("{3050F5DF-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTCPropertyBehavior extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(-2147417612) //= 0x800101f4. The runtime will prefer the VTID if present
  @VTID(7)
  void fireChange();


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412971) //= 0x80011415. The runtime will prefer the VTID if present
  @VTID(8)
  void value(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412971) //= 0x80011415. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object value();


  // Properties:
}
