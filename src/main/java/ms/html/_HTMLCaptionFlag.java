package ms.html  ;

import com4j.*;

/**
 */
public enum _HTMLCaptionFlag implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLCaptionFlagNo(0),
  /**
   * <p>
   * The value of this constant is 12582912
   * </p>
   */
  HTMLCaptionFlagYes(12582912),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTMLCaptionFlag_Max(2147483647),
  ;

  private final int value;
  _HTMLCaptionFlag(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
