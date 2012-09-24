package ms.html  ;

import com4j.*;

@IID("{3050F4B0-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDOMAttribute extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "nodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String nodeName();


  /**
   * <p>
   * Setter method for the COM property "nodeValue"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  void nodeValue(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "nodeValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object nodeValue();


  /**
   * <p>
   * Getter method for the COM property "specified"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  boolean specified();


  // Properties:
}
