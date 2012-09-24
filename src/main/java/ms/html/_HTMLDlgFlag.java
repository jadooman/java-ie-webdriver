package ms.html  ;

import com4j.*;

/**
 */
public enum _HTMLDlgFlag implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLDlgFlagNo(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLDlgFlagOff(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLDlgFlag0(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLDlgFlagYes(1),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLDlgFlagOn(1),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLDlgFlag1(1),
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  HTMLDlgFlagNotSet(-1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTMLDlgFlag_Max(2147483647),
  ;

  private final int value;
  _HTMLDlgFlag(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
