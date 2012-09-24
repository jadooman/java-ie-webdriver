package ms.html  ;

import com4j.*;

@IID("{332C4426-26CB-11D0-B483-00C04FD90119}")
public interface IHTMLFramesCollection2 extends Com4jObject {
  // Methods:
  /**
   * @param pvarIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object item(
    java.lang.Object pvarIndex);


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int length();


  // Properties:
}
