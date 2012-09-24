package ms.html  ;

import com4j.*;

/**
 */
public enum _LINE_DIRECTION implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  LINE_DIRECTION_RightToLeft(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  LINE_DIRECTION_LeftToRight(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  LINE_DIRECTION_Max(2147483647),
  ;

  private final int value;
  _LINE_DIRECTION(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
