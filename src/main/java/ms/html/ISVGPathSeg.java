package ms.html  ;

import com4j.*;

@IID("{305104FC-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGPathSeg extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "pathSegType"
   * </p>
   * @param p Mandatory short parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  void pathSegType(
    short p);


  /**
   * <p>
   * Getter method for the COM property "pathSegType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  short pathSegType();


  /**
   * <p>
   * Getter method for the COM property "pathSegTypeAsLetter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String pathSegTypeAsLetter();


  // Properties:
}
