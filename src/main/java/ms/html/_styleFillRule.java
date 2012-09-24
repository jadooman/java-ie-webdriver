package ms.html  ;

import com4j.*;

/**
 */
public enum _styleFillRule implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleFillRuleNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleFillRuleNonZero(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleFillRuleEvenOdd(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleFillRule_Max(2147483647),
  ;

  private final int value;
  _styleFillRule(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
