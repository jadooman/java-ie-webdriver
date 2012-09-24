package ms.html  ;

import com4j.*;

/**
 */
public enum _styleBorderStyle implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleBorderStyleNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleBorderStyleDotted(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleBorderStyleDashed(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleBorderStyleSolid(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleBorderStyleDouble(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  styleBorderStyleGroove(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  styleBorderStyleRidge(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  styleBorderStyleInset(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  styleBorderStyleOutset(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  styleBorderStyleWindowInset(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  styleBorderStyleNone(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  styleBorderStyleHidden(11),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleBorderStyle_Max(2147483647),
  ;

  private final int value;
  _styleBorderStyle(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
