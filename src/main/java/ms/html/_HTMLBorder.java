package ms.html  ;

import com4j.*;

/**
 */
public enum _HTMLBorder implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLBorderNone(0),
  /**
   * <p>
   * The value of this constant is 262144
   * </p>
   */
  HTMLBorderThick(262144),
  /**
   * <p>
   * The value of this constant is 4194304
   * </p>
   */
  HTMLBorderDialog(4194304),
  /**
   * <p>
   * The value of this constant is 8388608
   * </p>
   */
  HTMLBorderThin(8388608),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTMLBorder_Max(2147483647),
  ;

  private final int value;
  _HTMLBorder(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
