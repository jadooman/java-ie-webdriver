package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlCompatMode implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlCompatModeBackCompat(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlCompatModeCSS1Compat(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlCompatMode_Max(2147483647),
  ;

  private final int value;
  _htmlCompatMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
