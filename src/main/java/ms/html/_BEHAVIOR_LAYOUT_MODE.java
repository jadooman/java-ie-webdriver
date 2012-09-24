package ms.html  ;

import com4j.*;

/**
 */
public enum _BEHAVIOR_LAYOUT_MODE implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  BEHAVIORLAYOUTMODE_NATURAL(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  BEHAVIORLAYOUTMODE_MINWIDTH(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  BEHAVIORLAYOUTMODE_MAXWIDTH(4),
  /**
   * <p>
   * The value of this constant is 16384
   * </p>
   */
  BEHAVIORLAYOUTMODE_MEDIA_RESOLUTION(16384),
  /**
   * <p>
   * The value of this constant is 32768
   * </p>
   */
  BEHAVIORLAYOUTMODE_FINAL_PERCENT(32768),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  BEHAVIOR_LAYOUT_MODE_Max(2147483647),
  ;

  private final int value;
  _BEHAVIOR_LAYOUT_MODE(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
