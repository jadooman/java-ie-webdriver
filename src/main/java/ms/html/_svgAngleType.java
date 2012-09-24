package ms.html  ;

import com4j.*;

/**
 */
public enum _svgAngleType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  SVG_ANGLETYPE_UNKNOWN(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SVG_ANGLETYPE_UNSPECIFIED(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  SVG_ANGLETYPE_DEG(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  SVG_ANGLETYPE_RAD(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  SVG_ANGLETYPE_GRAD(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  svgAngleType_Max(2147483647),
  ;

  private final int value;
  _svgAngleType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
