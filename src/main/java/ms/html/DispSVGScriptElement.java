package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispSVGScriptElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "type"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1052)
  @PropPut
  void type(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   */

  @DISPID(1052)
  @PropGet
  java.lang.String type();


  /**
   * <p>
   * Getter method for the COM property "href"
   * </p>
   */

  @DISPID(1026)
  @PropGet
  ms.html.ISVGAnimatedString href();


  /**
   * <p>
   * Getter method for the COM property "externalResourcesRequired"
   * </p>
   */

  @DISPID(1020)
  @PropGet
  ms.html.ISVGAnimatedBoolean externalResourcesRequired();


  // Properties:
}
