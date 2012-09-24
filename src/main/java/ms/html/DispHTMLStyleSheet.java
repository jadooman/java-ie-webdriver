package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLStyleSheet extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "title"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1001)
  @PropPut
  void title(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "title"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  java.lang.String title();


  /**
   * <p>
   * Getter method for the COM property "parentStyleSheet"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  ms.html.IHTMLStyleSheet parentStyleSheet();


  /**
   * <p>
   * Getter method for the COM property "owningElement"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  ms.html.IHTMLElement owningElement();


  /**
   * <p>
   * Setter method for the COM property "disabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(-2147418036)
  @PropPut
  void disabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "disabled"
   * </p>
   */

  @DISPID(-2147418036)
  @PropGet
  boolean disabled();


  /**
   * <p>
   * Getter method for the COM property "readOnly"
   * </p>
   */

  @DISPID(1004)
  @PropGet
  boolean readOnly();


  /**
   * <p>
   * Getter method for the COM property "imports"
   * </p>
   */

  @DISPID(1005)
  @PropGet
  ms.html.IHTMLStyleSheetsCollection imports();


  /**
   * <p>
   * Setter method for the COM property "href"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1006)
  @PropPut
  void href(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "href"
   * </p>
   */

  @DISPID(1006)
  @PropGet
  java.lang.String href();


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   */

  @DISPID(1007)
  @PropGet
  java.lang.String type();


  /**
   * <p>
   * Getter method for the COM property "id"
   * </p>
   */

  @DISPID(1008)
  @PropGet
  java.lang.String id();


  /**
   * @param bstrURL Mandatory java.lang.String parameter.
   * @param lIndex Optional parameter. Default value is -1
   */

  @DISPID(1009)
  int addImport(
    java.lang.String bstrURL,
    @Optional @DefaultValue("-1") int lIndex);


  /**
   * @param bstrSelector Mandatory java.lang.String parameter.
   * @param bstrStyle Mandatory java.lang.String parameter.
   * @param lIndex Optional parameter. Default value is -1
   */

  @DISPID(1010)
  int addRule(
    java.lang.String bstrSelector,
    java.lang.String bstrStyle,
    @Optional @DefaultValue("-1") int lIndex);


  /**
   * @param lIndex Mandatory int parameter.
   */

  @DISPID(1011)
  void removeImport(
    int lIndex);


  /**
   * @param lIndex Mandatory int parameter.
   */

  @DISPID(1012)
  void removeRule(
    int lIndex);


  /**
   * <p>
   * Setter method for the COM property "media"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1013)
  @PropPut
  void media(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "media"
   * </p>
   */

  @DISPID(1013)
  @PropGet
  java.lang.String media();


  /**
   * <p>
   * Setter method for the COM property "cssText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1014)
  @PropPut
  void cssText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "cssText"
   * </p>
   */

  @DISPID(1014)
  @PropGet
  java.lang.String cssText();


  /**
   * <p>
   * Getter method for the COM property "rules"
   * </p>
   */

  @DISPID(1015)
  @PropGet
  ms.html.IHTMLStyleSheetRulesCollection rules();


  /**
   * <p>
   * Getter method for the COM property "pages"
   * </p>
   */

  @DISPID(1016)
  @PropGet
  ms.html.IHTMLStyleSheetPagesCollection pages();


  /**
   * @param bstrSelector Mandatory java.lang.String parameter.
   * @param bstrStyle Mandatory java.lang.String parameter.
   * @param lIndex Optional parameter. Default value is -1
   */

  @DISPID(1017)
  int addPageRule(
    java.lang.String bstrSelector,
    java.lang.String bstrStyle,
    @Optional @DefaultValue("-1") int lIndex);


  /**
   * <p>
   * Setter method for the COM property "ie8_href"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1150)
  @PropPut
  void ie8_href(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ie8_href"
   * </p>
   */

  @DISPID(1150)
  @PropGet
  java.lang.String ie8_href();


  /**
   * <p>
   * Getter method for the COM property "isAlternate"
   * </p>
   */

  @DISPID(1151)
  @PropGet
  boolean isAlternate();


  /**
   * <p>
   * Getter method for the COM property "isPrefAlternate"
   * </p>
   */

  @DISPID(1152)
  @PropGet
  boolean isPrefAlternate();


  /**
   * <p>
   * Getter method for the COM property "ie9_type"
   * </p>
   */

  @DISPID(1153)
  @PropGet
  java.lang.String ie9_type();


  /**
   * <p>
   * Getter method for the COM property "ie9_href"
   * </p>
   */

  @DISPID(1154)
  @PropGet
  java.lang.Object ie9_href();


  /**
   * <p>
   * Getter method for the COM property "ie9_title"
   * </p>
   */

  @DISPID(1155)
  @PropGet
  java.lang.String ie9_title();


  /**
   * <p>
   * Getter method for the COM property "ownerNode"
   * </p>
   */

  @DISPID(1156)
  @PropGet
  ms.html.IHTMLElement ownerNode();


  /**
   * <p>
   * Getter method for the COM property "ownerRule"
   * </p>
   */

  @DISPID(1157)
  @PropGet
  ms.html.IHTMLCSSRule ownerRule();


  /**
   * <p>
   * Getter method for the COM property "cssRules"
   * </p>
   */

  @DISPID(1158)
  @PropGet
  ms.html.IHTMLStyleSheetRulesCollection cssRules();


  /**
   * <p>
   * Getter method for the COM property "ie9_media"
   * </p>
   */

  @DISPID(1159)
  @PropGet
  java.lang.Object ie9_media();


  /**
   * @param bstrRule Mandatory java.lang.String parameter.
   * @param lIndex Optional parameter. Default value is -1
   */

  @DISPID(1160)
  int insertRule(
    java.lang.String bstrRule,
    @Optional @DefaultValue("-1") int lIndex);


  /**
   * @param lIndex Optional parameter. Default value is -1
   */

  @DISPID(1161)
  void deleteRule(
    @Optional @DefaultValue("-1") int lIndex);


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
