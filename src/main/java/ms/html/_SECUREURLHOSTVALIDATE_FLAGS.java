package ms.html  ;

import com4j.*;

/**
 */
public enum _SECUREURLHOSTVALIDATE_FLAGS implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SUHV_PROMPTBEFORENO(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  SUHV_SILENTYES(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  SUHV_UNSECURESOURCE(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  SECUREURLHOSTVALIDATE_FLAGS_Max(2147483647),
  ;

  private final int value;
  _SECUREURLHOSTVALIDATE_FLAGS(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
