package ms.html  ;

import com4j.*;

/**
 */
public enum _CARET_DIRECTION implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  CARET_DIRECTION_INDETERMINATE(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  CARET_DIRECTION_SAME(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  CARET_DIRECTION_BACKWARD(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  CARET_DIRECTION_FORWARD(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  CARET_DIRECTION_Max(2147483647),
  ;

  private final int value;
  _CARET_DIRECTION(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
