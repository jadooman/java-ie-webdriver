package ms.html  ;

import com4j.*;

@IID("{3050F2E5-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStyleSheetRulesCollection extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  int length();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.IHTMLStyleSheetRule
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  ms.html.IHTMLStyleSheetRule item(
    int index);


  // Properties:
}
