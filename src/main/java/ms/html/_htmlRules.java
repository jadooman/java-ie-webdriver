package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlRules implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlRulesNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlRulesnone(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlRulesgroups(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlRulesrows(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlRulescols(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  htmlRulesall(5),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlRules_Max(2147483647),
  ;

  private final int value;
  _htmlRules(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
