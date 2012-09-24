package ms.html  ;

import com4j.*;

/**
 */
public enum _HTMLAppFlag implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLAppFlagNo(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLAppFlagOff(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLAppFlag0(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLAppFlagYes(1),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLAppFlagOn(1),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLAppFlag1(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTMLAppFlag_Max(2147483647),
  ;

  private final int value;
  _HTMLAppFlag(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
