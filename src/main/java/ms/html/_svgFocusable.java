package ms.html  ;

import com4j.*;

/**
 */
public enum _svgFocusable implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  svgFocusableNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  svgFocusableAuto(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  svgFocusableTrue(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  svgFocusableFalse(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  svgFocusable_Max(2147483647),
  ;

  private final int value;
  _svgFocusable(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
