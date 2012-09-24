package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLCSSMediaRule extends Com4jObject {
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
   * Setter method for the COM property "media"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1001)
  @PropPut
  void media(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "media"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  java.lang.Object media();


  /**
   * <p>
   * Getter method for the COM property "cssRules"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  ms.html.IHTMLStyleSheetRulesCollection cssRules();


  /**
   * @param bstrRule Mandatory java.lang.String parameter.
   * @param lIndex Optional parameter. Default value is -1
   */

  @DISPID(1003)
  int insertRule(
    java.lang.String bstrRule,
    @Optional @DefaultValue("-1") int lIndex);


  /**
   * @param lIndex Optional parameter. Default value is -1
   */

  @DISPID(1004)
  void deleteRule(
    @Optional @DefaultValue("-1") int lIndex);


  // Properties:
}
