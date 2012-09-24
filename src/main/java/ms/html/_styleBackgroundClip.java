package ms.html  ;

import com4j.*;

/**
 */
public enum _styleBackgroundClip implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleBackgroundClipBorderBox(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleBackgroundClipPaddingBox(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleBackgroundClipContentBox(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleBackgroundClipNotSet(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleBackgroundClip_Max(2147483647),
  ;

  private final int value;
  _styleBackgroundClip(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
