package ms.html  ;

import com4j.*;

/**
 */
public enum _HTMLDlgCenter implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLDlgCenterNo(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLDlgCenterOff(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLDlgCenter0(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLDlgCenterYes(1),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLDlgCenterOn(1),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLDlgCenter1(1),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLDlgCenterParent(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  HTMLDlgCenterDesktop(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTMLDlgCenter_Max(2147483647),
  ;

  private final int value;
  _HTMLDlgCenter(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
