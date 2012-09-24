package ms.html  ;

import com4j.*;

/**
 */
public enum _styleTableLayout implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleTableLayoutNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleTableLayoutAuto(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleTableLayoutFixed(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleTableLayout_Max(2147483647),
  ;

  private final int value;
  _styleTableLayout(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
