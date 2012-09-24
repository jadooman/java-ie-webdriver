package ms.html  ;

import com4j.*;

/**
 */
public enum _svgSpreadMethod implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  SVG_SPREADMETHOD_UNKNOWN(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SVG_SPREADMETHOD_PAD(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  SVG_SPREADMETHOD_REFLECT(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  SVG_SPREADMETHOD_REPEAT(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  svgSpreadMethod_Max(2147483647),
  ;

  private final int value;
  _svgSpreadMethod(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
