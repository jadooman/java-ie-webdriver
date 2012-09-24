package ms.html  ;

import com4j.*;

/**
 */
public enum _styleLineBreak implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleLineBreakNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleLineBreakNormal(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleLineBreakStrict(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleLineBreak_Max(2147483647),
  ;

  private final int value;
  _styleLineBreak(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
