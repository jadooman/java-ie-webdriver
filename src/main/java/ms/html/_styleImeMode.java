package ms.html  ;

import com4j.*;

/**
 */
public enum _styleImeMode implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleImeModeAuto(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleImeModeActive(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleImeModeInactive(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleImeModeDisabled(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleImeModeNotSet(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleImeMode_Max(2147483647),
  ;

  private final int value;
  _styleImeMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
