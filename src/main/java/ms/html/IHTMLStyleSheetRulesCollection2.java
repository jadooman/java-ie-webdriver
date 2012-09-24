package ms.html  ;

import com4j.*;

@IID("{305106E8-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStyleSheetRulesCollection2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(7)
  int length();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.IHTMLCSSRule
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLCSSRule item(
    int index);


  // Properties:
}
