package ms.html  ;

import com4j.*;

/**
 */
public enum _styleDataRepeat implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleDataRepeatNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleDataRepeatInner(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleDataRepeat_Max(2147483647),
  ;

  private final int value;
  _styleDataRepeat(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
