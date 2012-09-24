package ms.html  ;

import com4j.*;

/**
 */
public enum _SAVE_SEGMENTS_FLAGS implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SAVE_SEGMENTS_NoIE4SelectionCompat(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  SAVE_SEGMENTS_FLAGS_Max(2147483647),
  ;

  private final int value;
  _SAVE_SEGMENTS_FLAGS(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
