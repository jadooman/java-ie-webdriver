package ms.html  ;

import com4j.*;

@IID("{3050F4A1-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTableRow2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "height"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(7)
  void height(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object height();


  // Properties:
}
