package ms.html  ;

import com4j.*;

@IID("{3050F377-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLFontSizesCollection extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1502) //= 0x5de. The runtime will prefer the VTID if present
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
   * <p>
   * Getter method for the COM property "forFont"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1503) //= 0x5df. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String forFont();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  int item(
    int index);


  // Properties:
}
