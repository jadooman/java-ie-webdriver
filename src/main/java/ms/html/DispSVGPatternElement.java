package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispSVGPatternElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "xmlbase"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1032)
  @PropPut
  void xmlbase(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "xmlbase"
   * </p>
   */

  @DISPID(1032)
  @PropGet
  java.lang.String xmlbase();


  /**
   * <p>
   * Setter method for the COM property "ownerSVGElement"
   * </p>
   * @param rhs Mandatory ms.html.ISVGSVGElement parameter.
   */

  @DISPID(1033)
  @PropPut
  void ownerSVGElement(
    ms.html.ISVGSVGElement rhs);


  /**
   * <p>
   * Getter method for the COM property "ownerSVGElement"
   * </p>
   */

  @DISPID(1033)
  @PropGet
  ms.html.ISVGSVGElement ownerSVGElement();


  /**
   * <p>
   * Setter method for the COM property "viewportElement"
   * </p>
   * @param rhs Mandatory ms.html.ISVGElement parameter.
   */

  @DISPID(1034)
  @PropPut
  void viewportElement(
    ms.html.ISVGElement rhs);


  /**
   * <p>
   * Getter method for the COM property "viewportElement"
   * </p>
   */

  @DISPID(1034)
  @PropGet
  ms.html.ISVGElement viewportElement();


  /**
   * <p>
   * Setter method for the COM property "focusable"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedEnumeration parameter.
   */

  @DISPID(1036)
  @PropPut
  void focusable(
    ms.html.ISVGAnimatedEnumeration rhs);


  /**
   * <p>
   * Getter method for the COM property "focusable"
   * </p>
   */

  @DISPID(1036)
  @PropGet
  ms.html.ISVGAnimatedEnumeration focusable();


  /**
   * <p>
   * Setter method for the COM property "patternUnits"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedEnumeration parameter.
   */

  @DISPID(1051)
  @PropPut
  void patternUnits(
    ms.html.ISVGAnimatedEnumeration rhs);


  /**
   * <p>
   * Getter method for the COM property "patternUnits"
   * </p>
   */

  @DISPID(1051)
  @PropGet
  ms.html.ISVGAnimatedEnumeration patternUnits();


  /**
   * <p>
   * Setter method for the COM property "patternContentUnits"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedEnumeration parameter.
   */

  @DISPID(1053)
  @PropPut
  void patternContentUnits(
    ms.html.ISVGAnimatedEnumeration rhs);


  /**
   * <p>
   * Getter method for the COM property "patternContentUnits"
   * </p>
   */

  @DISPID(1053)
  @PropGet
  ms.html.ISVGAnimatedEnumeration patternContentUnits();


  /**
   * <p>
   * Setter method for the COM property "patternTransform"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedTransformList parameter.
   */

  @DISPID(1055)
  @PropPut
  void patternTransform(
    ms.html.ISVGAnimatedTransformList rhs);


  /**
   * <p>
   * Getter method for the COM property "patternTransform"
   * </p>
   */

  @DISPID(1055)
  @PropGet
  ms.html.ISVGAnimatedTransformList patternTransform();


  /**
   * <p>
   * Setter method for the COM property "x"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedLength parameter.
   */

  @DISPID(1057)
  @PropPut
  void x(
    ms.html.ISVGAnimatedLength rhs);


  /**
   * <p>
   * Getter method for the COM property "x"
   * </p>
   */

  @DISPID(1057)
  @PropGet
  ms.html.ISVGAnimatedLength x();


  /**
   * <p>
   * Setter method for the COM property "y"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedLength parameter.
   */

  @DISPID(1059)
  @PropPut
  void y(
    ms.html.ISVGAnimatedLength rhs);


  /**
   * <p>
   * Getter method for the COM property "y"
   * </p>
   */

  @DISPID(1059)
  @PropGet
  ms.html.ISVGAnimatedLength y();


  /**
   * <p>
   * Setter method for the COM property "width"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedLength parameter.
   */

  @DISPID(1061)
  @PropPut
  void width(
    ms.html.ISVGAnimatedLength rhs);


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   */

  @DISPID(1061)
  @PropGet
  ms.html.ISVGAnimatedLength width();


  /**
   * <p>
   * Setter method for the COM property "height"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedLength parameter.
   */

  @DISPID(1063)
  @PropPut
  void height(
    ms.html.ISVGAnimatedLength rhs);


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   */

  @DISPID(1063)
  @PropGet
  ms.html.ISVGAnimatedLength height();


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
   * Getter method for the COM property "requiredFeatures"
   * </p>
   */

  @DISPID(1011)
  @PropGet
  ms.html.ISVGStringList requiredFeatures();


  /**
   * <p>
   * Getter method for the COM property "requiredExtensions"
   * </p>
   */

  @DISPID(1013)
  @PropGet
  ms.html.ISVGStringList requiredExtensions();


  /**
   * <p>
   * Getter method for the COM property "systemLanguage"
   * </p>
   */

  @DISPID(1015)
  @PropGet
  ms.html.ISVGStringList systemLanguage();


  /**
   * @param extension Mandatory java.lang.String parameter.
   */

  @DISPID(1016)
  boolean hasExtension(
    java.lang.String extension);


  /**
   * <p>
   * Setter method for the COM property "xmllang"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1017)
  @PropPut
  void xmllang(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "xmllang"
   * </p>
   */

  @DISPID(1017)
  @PropGet
  java.lang.String xmllang();


  /**
   * <p>
   * Setter method for the COM property "xmlspace"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1018)
  @PropPut
  void xmlspace(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "xmlspace"
   * </p>
   */

  @DISPID(1018)
  @PropGet
  java.lang.String xmlspace();


  /**
   * <p>
   * Getter method for the COM property "externalResourcesRequired"
   * </p>
   */

  @DISPID(1020)
  @PropGet
  ms.html.ISVGAnimatedBoolean externalResourcesRequired();


  /**
   * <p>
   * Getter method for the COM property "className"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  ms.html.ISVGAnimatedString className();


  /**
   * <p>
   * Getter method for the COM property "viewBox"
   * </p>
   */

  @DISPID(1022)
  @PropGet
  ms.html.ISVGAnimatedRect viewBox();


  /**
   * <p>
   * Setter method for the COM property "preserveAspectRatio"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedPreserveAspectRatio parameter.
   */

  @DISPID(1024)
  @PropPut
  void preserveAspectRatio(
    ms.html.ISVGAnimatedPreserveAspectRatio rhs);


  /**
   * <p>
   * Getter method for the COM property "preserveAspectRatio"
   * </p>
   */

  @DISPID(1024)
  @PropGet
  ms.html.ISVGAnimatedPreserveAspectRatio preserveAspectRatio();


  // Properties:
}
