package ms.html  ;

import com4j.*;

/**
 */
public enum _styleWritingMode implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleWritingModeLrtb(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleWritingModeTbrl(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleWritingModeRltb(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleWritingModeBtrl(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleWritingModeNotSet(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  styleWritingModeTblr(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  styleWritingModeBtlr(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  styleWritingModeLrbt(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  styleWritingModeRlbt(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  styleWritingModeLr(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  styleWritingModeRl(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  styleWritingModeTb(11),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleWritingMode_Max(2147483647),
  ;

  private final int value;
  _styleWritingMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
