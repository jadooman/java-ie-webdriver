package ms.html  ;

import com4j.*;

/**
 */
public enum _styleBaselineShift implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleBaselineShiftBaseline(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleBaselineShiftSub(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleBaselineShiftSuper(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleBaselineShift_Max(2147483647),
  ;

  private final int value;
  _styleBaselineShift(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
