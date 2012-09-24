package ms.html  ;

import com4j.*;

/**
 */
public enum _HTMLWindowState implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLWindowStateNormal(1),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  HTMLWindowStateMaximize(3),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  HTMLWindowStateMinimize(6),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTMLWindowState_Max(2147483647),
  ;

  private final int value;
  _HTMLWindowState(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
