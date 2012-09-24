package ms.html  ;

import com4j.*;

@IID("{3051074B-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStyleMedia extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String type();


  /**
   * @param mediaQuery Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  boolean matchMedium(
    java.lang.String mediaQuery);


  // Properties:
}
