package ms.html  ;

import com4j.*;

/**
 */
public enum _HTMLMinimizeFlag implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLMinimizeFlagNo(0),
  /**
   * <p>
   * The value of this constant is 131072
   * </p>
   */
  HTMLMinimizeFlagYes(131072),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTMLMinimizeFlag_Max(2147483647),
  ;

  private final int value;
  _HTMLMinimizeFlag(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
