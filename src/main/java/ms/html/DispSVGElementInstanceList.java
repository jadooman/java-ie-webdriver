package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispSVGElementInstanceList extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   */

  @DISPID(1000)
  @PropGet
  int length();


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(1001)
  ms.html.ISVGElementInstance item(
    int index);


  // Properties:
}
