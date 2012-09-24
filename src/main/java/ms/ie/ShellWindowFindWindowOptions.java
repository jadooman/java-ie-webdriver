package ms.ie  ;

import com4j.*;

/**
 * <p>
 * Options for ShellWindows FindWindow
 * </p>
 */
public enum ShellWindowFindWindowOptions implements ComEnum {
  /**
   * <p>
   * Need Dispatch
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SWFO_NEEDDISPATCH(1),
  /**
   * <p>
   * Include Pending
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  SWFO_INCLUDEPENDING(2),
  /**
   * <p>
   * Cookie Passed
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  SWFO_COOKIEPASSED(4),
  ;

  private final int value;
  ShellWindowFindWindowOptions(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
