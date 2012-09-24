package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispSVGPathElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "pathSegList"
   * </p>
   * @param rhs Mandatory ms.html.ISVGPathSegList parameter.
   */

  @DISPID(1052)
  @PropPut
  void pathSegList(
    ms.html.ISVGPathSegList rhs);


  /**
   * <p>
   * Getter method for the COM property "pathSegList"
   * </p>
   */

  @DISPID(1052)
  @PropGet
  ms.html.ISVGPathSegList pathSegList();


  /**
   * <p>
   * Setter method for the COM property "normalizedPathSegList"
   * </p>
   * @param rhs Mandatory ms.html.ISVGPathSegList parameter.
   */

  @DISPID(1076)
  @PropPut
  void normalizedPathSegList(
    ms.html.ISVGPathSegList rhs);


  /**
   * <p>
   * Getter method for the COM property "normalizedPathSegList"
   * </p>
   */

  @DISPID(1076)
  @PropGet
  ms.html.ISVGPathSegList normalizedPathSegList();


  /**
   * <p>
   * Setter method for the COM property "animatedPathSegList"
   * </p>
   * @param rhs Mandatory ms.html.ISVGPathSegList parameter.
   */

  @DISPID(1077)
  @PropPut
  void animatedPathSegList(
    ms.html.ISVGPathSegList rhs);


  /**
   * <p>
   * Getter method for the COM property "animatedPathSegList"
   * </p>
   */

  @DISPID(1077)
  @PropGet
  ms.html.ISVGPathSegList animatedPathSegList();


  /**
   * <p>
   * Setter method for the COM property "animatedNormalizedPathSegList"
   * </p>
   * @param rhs Mandatory ms.html.ISVGPathSegList parameter.
   */

  @DISPID(1078)
  @PropPut
  void animatedNormalizedPathSegList(
    ms.html.ISVGPathSegList rhs);


  /**
   * <p>
   * Getter method for the COM property "animatedNormalizedPathSegList"
   * </p>
   */

  @DISPID(1078)
  @PropGet
  ms.html.ISVGPathSegList animatedNormalizedPathSegList();


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
   * Setter method for the COM property "pathLength"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedNumber parameter.
   */

  @DISPID(1053)
  @PropPut
  void pathLength(
    ms.html.ISVGAnimatedNumber rhs);


  /**
   * <p>
   * Getter method for the COM property "pathLength"
   * </p>
   */

  @DISPID(1053)
  @PropGet
  ms.html.ISVGAnimatedNumber pathLength();


  /**
   */

  @DISPID(1073)
  float getTotalLength();


  /**
   * @param fltdistance Mandatory float parameter.
   */

  @DISPID(1074)
  ms.html.ISVGPoint getPointAtLength(
    float fltdistance);


  /**
   * @param fltdistance Mandatory float parameter.
   */

  @DISPID(1075)
  int getPathSegAtLength(
    float fltdistance);


  /**
   */

  @DISPID(1054)
  ms.html.ISVGPathSegClosePath createSVGPathSegClosePath();


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1055)
  ms.html.ISVGPathSegMovetoAbs createSVGPathSegMovetoAbs(
    float x,
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1056)
  ms.html.ISVGPathSegMovetoRel createSVGPathSegMovetoRel(
    float x,
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1057)
  ms.html.ISVGPathSegLinetoAbs createSVGPathSegLinetoAbs(
    float x,
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1058)
  ms.html.ISVGPathSegLinetoRel createSVGPathSegLinetoRel(
    float x,
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   * @param x2 Mandatory float parameter.
   * @param y2 Mandatory float parameter.
   */

  @DISPID(1059)
  ms.html.ISVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(
    float x,
    float y,
    float x1,
    float y1,
    float x2,
    float y2);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   * @param x2 Mandatory float parameter.
   * @param y2 Mandatory float parameter.
   */

  @DISPID(1060)
  ms.html.ISVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(
    float x,
    float y,
    float x1,
    float y1,
    float x2,
    float y2);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   */

  @DISPID(1061)
  ms.html.ISVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(
    float x,
    float y,
    float x1,
    float y1);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   */

  @DISPID(1062)
  ms.html.ISVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(
    float x,
    float y,
    float x1,
    float y1);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param r1 Mandatory float parameter.
   * @param r2 Mandatory float parameter.
   * @param angle Mandatory float parameter.
   * @param largeArcFlag Mandatory boolean parameter.
   * @param sweepFlag Mandatory boolean parameter.
   */

  @DISPID(1063)
  ms.html.ISVGPathSegArcAbs createSVGPathSegArcAbs(
    float x,
    float y,
    float r1,
    float r2,
    float angle,
    boolean largeArcFlag,
    boolean sweepFlag);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param r1 Mandatory float parameter.
   * @param r2 Mandatory float parameter.
   * @param angle Mandatory float parameter.
   * @param largeArcFlag Mandatory boolean parameter.
   * @param sweepFlag Mandatory boolean parameter.
   */

  @DISPID(1064)
  ms.html.ISVGPathSegArcRel createSVGPathSegArcRel(
    float x,
    float y,
    float r1,
    float r2,
    float angle,
    boolean largeArcFlag,
    boolean sweepFlag);


  /**
   * @param x Mandatory float parameter.
   */

  @DISPID(1065)
  ms.html.ISVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(
    float x);


  /**
   * @param x Mandatory float parameter.
   */

  @DISPID(1066)
  ms.html.ISVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(
    float x);


  /**
   * @param y Mandatory float parameter.
   */

  @DISPID(1067)
  ms.html.ISVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(
    float y);


  /**
   * @param y Mandatory float parameter.
   */

  @DISPID(1068)
  ms.html.ISVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param x2 Mandatory float parameter.
   * @param y2 Mandatory float parameter.
   */

  @DISPID(1069)
  ms.html.ISVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(
    float x,
    float y,
    float x2,
    float y2);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param x2 Mandatory float parameter.
   * @param y2 Mandatory float parameter.
   */

  @DISPID(1070)
  ms.html.ISVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(
    float x,
    float y,
    float x2,
    float y2);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1071)
  ms.html.ISVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(
    float x,
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1072)
  ms.html.ISVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(
    float x,
    float y);


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
