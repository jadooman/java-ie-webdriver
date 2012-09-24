package ms.html  ;

import com4j.*;

/**
 */
public enum _HTMLDlgBorder implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLDlgBorderThin(0),
  /**
   * <p>
   * The value of this constant is 262144
   * </p>
   */
  HTMLDlgBorderThick(262144),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTMLDlgBorder_Max(2147483647),
  ;

  private final int value;
  _HTMLDlgBorder(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
