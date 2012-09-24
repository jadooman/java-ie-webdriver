package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLStyleSheetPagesCollection extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  int length();


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(0)
  @DefaultMethod
  ms.html.IHTMLStyleSheetPage item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "constructor"
   * </p>
   */

  @DISPID(-2147417603)
  @PropGet
  com4j.Com4jObject constructor();


  // Properties:
}
