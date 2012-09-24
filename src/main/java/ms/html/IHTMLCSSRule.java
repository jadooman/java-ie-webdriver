package ms.html  ;

import com4j.*;

@IID("{305106E9-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLCSSRule extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(7)
  short type();


  /**
   * <p>
   * Setter method for the COM property "cssText"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1102) //= 0x44e. The runtime will prefer the VTID if present
  @VTID(8)
  void cssText(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "cssText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1102) //= 0x44e. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String cssText();


  /**
   * <p>
   * Getter method for the COM property "parentRule"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLCSSRule
   */

  @DISPID(1103) //= 0x44f. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLCSSRule parentRule();


  /**
   * <p>
   * Getter method for the COM property "parentStyleSheet"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyleSheet
   */

  @DISPID(1104) //= 0x450. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.IHTMLStyleSheet parentStyleSheet();


  // Properties:
}
