package ms.html  ;

import com4j.*;

/**
 */
public enum _styleWordBreak implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleWordBreakNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleWordBreakNormal(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleWordBreakBreakAll(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleWordBreakKeepAll(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleWordBreak_Max(2147483647),
  ;

  private final int value;
  _styleWordBreak(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
