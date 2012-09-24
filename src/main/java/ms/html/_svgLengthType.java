package ms.html  ;

import com4j.*;

/**
 */
public enum _svgLengthType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  SVG_LENGTHTYPE_UNKNOWN(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SVG_LENGTHTYPE_NUMBER(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  SVG_LENGTHTYPE_PERCENTAGE(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  SVG_LENGTHTYPE_EMS(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  SVG_LENGTHTYPE_EXS(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  SVG_LENGTHTYPE_PX(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  SVG_LENGTHTYPE_CM(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  SVG_LENGTHTYPE_MM(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  SVG_LENGTHTYPE_IN(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  SVG_LENGTHTYPE_PT(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  SVG_LENGTHTYPE_PC(10),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  svgLengthType_Max(2147483647),
  ;

  private final int value;
  _svgLengthType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
