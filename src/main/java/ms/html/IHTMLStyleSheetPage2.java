package ms.html  ;

import com4j.*;

@IID("{305106ED-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStyleSheetPage2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "selectorText"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(7)
  void selectorText(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "selectorText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String selectorText();


  /**
   * <p>
   * Getter method for the COM property "style"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLRuleStyle
   */

  @DISPID(-2147418038) //= 0x8001004a. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLRuleStyle style();


  // Properties:
}
