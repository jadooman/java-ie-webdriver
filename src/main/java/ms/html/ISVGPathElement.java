package ms.html  ;

import com4j.*;

@IID("{30510512-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGPathElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "pathLength"
   * </p>
   * @param p Mandatory ms.html.ISVGAnimatedNumber parameter.
   */

  @DISPID(1053) //= 0x41d. The runtime will prefer the VTID if present
  @VTID(7)
  void pathLength(
    ms.html.ISVGAnimatedNumber p);


  /**
   * <p>
   * Getter method for the COM property "pathLength"
   * </p>
   * @return  Returns a value of type ms.html.ISVGAnimatedNumber
   */

  @DISPID(1053) //= 0x41d. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.ISVGAnimatedNumber pathLength();


  /**
   * @return  Returns a value of type float
   */

  @DISPID(1073) //= 0x431. The runtime will prefer the VTID if present
  @VTID(9)
  float getTotalLength();


  /**
   * @param fltdistance Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGPoint
   */

  @DISPID(1074) //= 0x432. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.ISVGPoint getPointAtLength(
    float fltdistance);


  /**
   * @param fltdistance Mandatory float parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1075) //= 0x433. The runtime will prefer the VTID if present
  @VTID(11)
  int getPathSegAtLength(
    float fltdistance);


  /**
   * @return  Returns a value of type ms.html.ISVGPathSegClosePath
   */

  @DISPID(1054) //= 0x41e. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.ISVGPathSegClosePath createSVGPathSegClosePath();


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGPathSegMovetoAbs
   */

  @DISPID(1055) //= 0x41f. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.ISVGPathSegMovetoAbs createSVGPathSegMovetoAbs(
    float x,
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGPathSegMovetoRel
   */

  @DISPID(1056) //= 0x420. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.ISVGPathSegMovetoRel createSVGPathSegMovetoRel(
    float x,
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGPathSegLinetoAbs
   */

  @DISPID(1057) //= 0x421. The runtime will prefer the VTID if present
  @VTID(15)
  ms.html.ISVGPathSegLinetoAbs createSVGPathSegLinetoAbs(
    float x,
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGPathSegLinetoRel
   */

  @DISPID(1058) //= 0x422. The runtime will prefer the VTID if present
  @VTID(16)
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
   * @return  Returns a value of type ms.html.ISVGPathSegCurvetoCubicAbs
   */

  @DISPID(1059) //= 0x423. The runtime will prefer the VTID if present
  @VTID(17)
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
   * @return  Returns a value of type ms.html.ISVGPathSegCurvetoCubicRel
   */

  @DISPID(1060) //= 0x424. The runtime will prefer the VTID if present
  @VTID(18)
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
   * @return  Returns a value of type ms.html.ISVGPathSegCurvetoQuadraticAbs
   */

  @DISPID(1061) //= 0x425. The runtime will prefer the VTID if present
  @VTID(19)
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
   * @return  Returns a value of type ms.html.ISVGPathSegCurvetoQuadraticRel
   */

  @DISPID(1062) //= 0x426. The runtime will prefer the VTID if present
  @VTID(20)
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
   * @return  Returns a value of type ms.html.ISVGPathSegArcAbs
   */

  @DISPID(1063) //= 0x427. The runtime will prefer the VTID if present
  @VTID(21)
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
   * @return  Returns a value of type ms.html.ISVGPathSegArcRel
   */

  @DISPID(1064) //= 0x428. The runtime will prefer the VTID if present
  @VTID(22)
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
   * @return  Returns a value of type ms.html.ISVGPathSegLinetoHorizontalAbs
   */

  @DISPID(1065) //= 0x429. The runtime will prefer the VTID if present
  @VTID(23)
  ms.html.ISVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(
    float x);


  /**
   * @param x Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGPathSegLinetoHorizontalRel
   */

  @DISPID(1066) //= 0x42a. The runtime will prefer the VTID if present
  @VTID(24)
  ms.html.ISVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(
    float x);


  /**
   * @param y Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGPathSegLinetoVerticalAbs
   */

  @DISPID(1067) //= 0x42b. The runtime will prefer the VTID if present
  @VTID(25)
  ms.html.ISVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(
    float y);


  /**
   * @param y Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGPathSegLinetoVerticalRel
   */

  @DISPID(1068) //= 0x42c. The runtime will prefer the VTID if present
  @VTID(26)
  ms.html.ISVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param x2 Mandatory float parameter.
   * @param y2 Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGPathSegCurvetoCubicSmoothAbs
   */

  @DISPID(1069) //= 0x42d. The runtime will prefer the VTID if present
  @VTID(27)
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
   * @return  Returns a value of type ms.html.ISVGPathSegCurvetoCubicSmoothRel
   */

  @DISPID(1070) //= 0x42e. The runtime will prefer the VTID if present
  @VTID(28)
  ms.html.ISVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(
    float x,
    float y,
    float x2,
    float y2);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGPathSegCurvetoQuadraticSmoothAbs
   */

  @DISPID(1071) //= 0x42f. The runtime will prefer the VTID if present
  @VTID(29)
  ms.html.ISVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(
    float x,
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGPathSegCurvetoQuadraticSmoothRel
   */

  @DISPID(1072) //= 0x430. The runtime will prefer the VTID if present
  @VTID(30)
  ms.html.ISVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(
    float x,
    float y);


  // Properties:
}
