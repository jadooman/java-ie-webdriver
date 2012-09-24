package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlClear implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlClearNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlClearAll(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlClearLeft(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlClearRight(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlClearBoth(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  htmlClearNone(5),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlClear_Max(2147483647),
  ;

  private final int value;
  _htmlClear(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
