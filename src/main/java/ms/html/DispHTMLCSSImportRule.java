package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLCSSImportRule extends Com4jObject {
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
   * Getter method for the COM property "href"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  java.lang.String href();


  /**
   * <p>
   * Setter method for the COM property "media"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1002)
  @PropPut
  void media(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "media"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  java.lang.Object media();


  /**
   * <p>
   * Getter method for the COM property "styleSheet"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  ms.html.IHTMLStyleSheet styleSheet();


  // Properties:
}
