package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLStyleSheetPage extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   */

  @DISPID(1101)
  @PropGet
  short type();


  /**
   * <p>
   * Setter method for the COM property "cssText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1102)
  @PropPut
  void cssText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "cssText"
   * </p>
   */

  @DISPID(1102)
  @PropGet
  java.lang.String cssText();


  /**
   * <p>
   * Getter method for the COM property "parentRule"
   * </p>
   */

  @DISPID(1103)
  @PropGet
  ms.html.IHTMLCSSRule parentRule();


  /**
   * <p>
   * Getter method for the COM property "parentStyleSheet"
   * </p>
   */

  @DISPID(1104)
  @PropGet
  ms.html.IHTMLStyleSheet parentStyleSheet();


  /**
   * <p>
   * Getter method for the COM property "selector"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  java.lang.String selector();


  /**
   * <p>
   * Getter method for the COM property "pseudoClass"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  java.lang.String pseudoClass();


  /**
   * <p>
   * Setter method for the COM property "selectorText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1003)
  @PropPut
  void selectorText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "selectorText"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  java.lang.String selectorText();


  /**
   * <p>
   * Getter method for the COM property "style"
   * </p>
   */

  @DISPID(-2147418038)
  @PropGet
  ms.html.IHTMLRuleStyle style();


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
