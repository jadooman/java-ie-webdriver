package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlMediaErr implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlMediaErrAborted(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlMediaErrNetwork(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlMediaErrDecode(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlMediaErrSrcNotSupported(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlMediaErr_Max(2147483647),
  ;

  private final int value;
  _htmlMediaErr(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
