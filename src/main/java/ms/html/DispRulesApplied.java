package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispRulesApplied extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "element"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  ms.html.IHTMLElement element();


  /**
   * <p>
   * Getter method for the COM property "inlineStyles"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  ms.html.IHTMLStyle inlineStyles();


  /**
   * <p>
   * Getter method for the COM property "appliedRules"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  ms.html.IHTMLStyleSheetRulesAppliedCollection appliedRules();


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1004)
  boolean propertyIsInline(
    java.lang.String name);


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1005)
  boolean propertyIsInheritable(
    java.lang.String name);


  /**
   */

  @DISPID(1006)
  boolean hasInheritableProperty();


  // Properties:
}
