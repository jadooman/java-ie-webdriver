package ms.html  ;

import com4j.*;

/**
 */
public enum _svgTransformType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  SVG_TRANSFORM_UNKNOWN(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SVG_TRANSFORM_MATRIX(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  SVG_TRANSFORM_TRANSLATE(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  SVG_TRANSFORM_SCALE(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  SVG_TRANSFORM_ROTATE(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  SVG_TRANSFORM_SKEWX(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  SVG_TRANSFORM_SKEWY(6),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  svgTransformType_Max(2147483647),
  ;

  private final int value;
  _svgTransformType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
