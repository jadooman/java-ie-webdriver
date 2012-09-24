package ms.html  ;

import com4j.*;

/**
 */
public enum _DISPLAY_BREAK implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  DISPLAY_BREAK_None(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  DISPLAY_BREAK_Block(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  DISPLAY_BREAK_Break(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  DISPLAY_BREAK_Max(2147483647),
  ;

  private final int value;
  _DISPLAY_BREAK(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
