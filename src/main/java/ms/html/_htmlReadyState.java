package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlReadyState implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlReadyStateuninitialized(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlReadyStateloading(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlReadyStateloaded(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlReadyStateinteractive(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlReadyStatecomplete(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlReadyState_Max(2147483647),
  ;

  private final int value;
  _htmlReadyState(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
