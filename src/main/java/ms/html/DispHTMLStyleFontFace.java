package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLStyleFontFace extends Com4jObject {
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
   * Setter method for the COM property "fontsrc"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413015)
  @PropPut
  void fontsrc(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "fontsrc"
   * </p>
   */

  @DISPID(-2147413015)
  @PropGet
  java.lang.String fontsrc();


  /**
   * <p>
   * Getter method for the COM property "style"
   * </p>
   */

  @DISPID(-2147418038)
  @PropGet
  ms.html.IHTMLRuleStyle style();


  // Properties:
}
