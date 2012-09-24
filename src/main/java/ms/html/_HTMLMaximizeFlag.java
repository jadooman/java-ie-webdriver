package ms.html  ;

import com4j.*;

/**
 */
public enum _HTMLMaximizeFlag implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLMaximizeFlagNo(0),
  /**
   * <p>
   * The value of this constant is 65536
   * </p>
   */
  HTMLMaximizeFlagYes(65536),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTMLMaximizeFlag_Max(2147483647),
  ;

  private final int value;
  _HTMLMaximizeFlag(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
