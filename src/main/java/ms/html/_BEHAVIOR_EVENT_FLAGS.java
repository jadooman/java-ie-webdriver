package ms.html  ;

import com4j.*;

/**
 */
public enum _BEHAVIOR_EVENT_FLAGS implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  BEHAVIOREVENTFLAGS_BUBBLE(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  BEHAVIOREVENTFLAGS_STANDARDADDITIVE(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  BEHAVIOR_EVENT_FLAGS_Max(2147483647),
  ;

  private final int value;
  _BEHAVIOR_EVENT_FLAGS(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
