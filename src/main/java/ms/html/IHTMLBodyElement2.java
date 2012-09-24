package ms.html  ;

import com4j.*;

@IID("{3050F5C5-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLBodyElement2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "onbeforeprint"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412046) //= 0x800117b2. The runtime will prefer the VTID if present
  @VTID(7)
  void onbeforeprint(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforeprint"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412046) //= 0x800117b2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforeprint();


  /**
   * <p>
   * Setter method for the COM property "onafterprint"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412045) //= 0x800117b3. The runtime will prefer the VTID if present
  @VTID(9)
  void onafterprint(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onafterprint"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412045) //= 0x800117b3. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onafterprint();


  // Properties:
}
