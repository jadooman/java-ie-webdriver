package ms.html  ;

import com4j.*;

@IID("{3050F4C3-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLAttributeCollection extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1500) //= 0x5dc. The runtime will prefer the VTID if present
  @VTID(7)
  int length();


  /**
   * <p>
   * Getter method for the COM property "_newEnum"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(8)
  com4j.Com4jObject _newEnum();


  /**
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject item(
    @Optional java.lang.Object name);


  // Properties:
}
