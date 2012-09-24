package ms.html  ;

import com4j.*;

/**
 */
public enum _styleClipRule implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleClipRuleNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleClipRuleNonZero(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleClipRuleEvenOdd(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleClipRule_Max(2147483647),
  ;

  private final int value;
  _styleClipRule(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
