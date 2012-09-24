package ms.html  ;

import com4j.*;

/**
 */
public enum _svgPathSegType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  PATHSEG_UNKNOWN(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  PATHSEG_CLOSEPATH(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  PATHSEG_MOVETO_ABS(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  PATHSEG_MOVETO_REL(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  PATHSEG_LINETO_ABS(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  PATHSEG_LINETO_REL(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  PATHSEG_CURVETO_CUBIC_ABS(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  PATHSEG_CURVETO_CUBIC_REL(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  PATHSEG_CURVETO_QUADRATIC_ABS(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  PATHSEG_CURVETO_QUADRATIC_REL(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  PATHSEG_ARC_ABS(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  PATHSEG_ARC_REL(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  PATHSEG_LINETO_HORIZONTAL_ABS(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  PATHSEG_LINETO_HORIZONTAL_REL(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  PATHSEG_LINETO_VERTICAL_ABS(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  PATHSEG_LINETO_VERTICAL_REL(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  PATHSEG_CURVETO_CUBIC_SMOOTH_ABS(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  PATHSEG_CURVETO_CUBIC_SMOOTH_REL(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL(19),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  svgPathSegType_Max(2147483647),
  ;

  private final int value;
  _svgPathSegType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
