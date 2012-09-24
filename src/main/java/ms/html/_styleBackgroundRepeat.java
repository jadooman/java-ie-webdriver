package ms.html  ;

import com4j.*;

/**
 */
public enum _styleBackgroundRepeat implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleBackgroundRepeatRepeat(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleBackgroundRepeatRepeatX(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleBackgroundRepeatRepeatY(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleBackgroundRepeatNoRepeat(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleBackgroundRepeatNotSet(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleBackgroundRepeat_Max(2147483647),
  ;

  private final int value;
  _styleBackgroundRepeat(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
