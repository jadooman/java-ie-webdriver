package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLStyleMedia extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  java.lang.String type();


  /**
   * @param mediaQuery Mandatory java.lang.String parameter.
   */

  @DISPID(1002)
  boolean matchMedium(
    java.lang.String mediaQuery);


  // Properties:
}
