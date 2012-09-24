package ms.html  ;

import com4j.*;

/**
 */
public enum _stylePageBreak implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  stylePageBreakNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  stylePageBreakAuto(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  stylePageBreakAlways(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  stylePageBreakLeft(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  stylePageBreakRight(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  stylePageBreakAvoid(5),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  stylePageBreak_Max(2147483647),
  ;

  private final int value;
  _stylePageBreak(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
