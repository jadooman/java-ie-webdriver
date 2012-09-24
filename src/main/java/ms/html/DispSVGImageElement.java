package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispSVGImageElement extends Com4jObject {
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
   * Getter method for the COM property "transform"
   * </p>
   */

  @DISPID(1009)
  @PropGet
  ms.html.ISVGAnimatedTransformList transform();


  /**
   * <p>
   * Getter method for the COM property "nearestViewportElement"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  ms.html.ISVGElement nearestViewportElement();


  /**
   * <p>
   * Getter method for the COM property "farthestViewportElement"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  ms.html.ISVGElement farthestViewportElement();


  /**
   */

  @DISPID(1004)
  ms.html.ISVGRect getBBox();


  /**
   */

  @DISPID(1005)
  ms.html.ISVGMatrix getCTM();


  /**
   */

  @DISPID(1006)
  ms.html.ISVGMatrix getScreenCTM();


  /**
   * @param pElement Mandatory ms.html.ISVGElement parameter.
   */

  @DISPID(1007)
  ms.html.ISVGMatrix getTransformToElement(
    ms.html.ISVGElement pElement);


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


  /**
   * <p>
   * Setter method for the COM property "x"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedLength parameter.
   */

  @DISPID(1051)
  @PropPut
  void x(
    ms.html.ISVGAnimatedLength rhs);


  /**
   * <p>
   * Getter method for the COM property "x"
   * </p>
   */

  @DISPID(1051)
  @PropGet
  ms.html.ISVGAnimatedLength x();


  /**
   * <p>
   * Setter method for the COM property "y"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedLength parameter.
   */

  @DISPID(1053)
  @PropPut
  void y(
    ms.html.ISVGAnimatedLength rhs);


  /**
   * <p>
   * Getter method for the COM property "y"
   * </p>
   */

  @DISPID(1053)
  @PropGet
  ms.html.ISVGAnimatedLength y();


  /**
   * <p>
   * Setter method for the COM property "width"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedLength parameter.
   */

  @DISPID(1055)
  @PropPut
  void width(
    ms.html.ISVGAnimatedLength rhs);


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   */

  @DISPID(1055)
  @PropGet
  ms.html.ISVGAnimatedLength width();


  /**
   * <p>
   * Setter method for the COM property "height"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedLength parameter.
   */

  @DISPID(1057)
  @PropPut
  void height(
    ms.html.ISVGAnimatedLength rhs);


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   */

  @DISPID(1057)
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


  // Properties:
}
