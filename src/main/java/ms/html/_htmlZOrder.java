package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlZOrder implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlZOrderFront(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlZOrderBack(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlZOrder_Max(2147483647),
  ;

  private final int value;
  _htmlZOrder(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
