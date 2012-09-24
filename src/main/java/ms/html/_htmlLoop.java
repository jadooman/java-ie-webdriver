package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlLoop implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  htmlLoopLoopInfinite(-1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlLoop_Max(2147483647),
  ;

  private final int value;
  _htmlLoop(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
