package ms.html  ;

import com4j.*;

/**
 */
public enum _DISPLAY_GRAVITY implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  DISPLAY_GRAVITY_PreviousLine(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  DISPLAY_GRAVITY_NextLine(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  DISPLAY_GRAVITY_Max(2147483647),
  ;

  private final int value;
  _DISPLAY_GRAVITY(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
