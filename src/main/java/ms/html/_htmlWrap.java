package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlWrap implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlWrapOff(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlWrapSoft(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlWrapHard(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlWrap_Max(2147483647),
  ;

  private final int value;
  _htmlWrap(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
