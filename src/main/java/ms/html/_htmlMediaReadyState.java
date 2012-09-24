package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlMediaReadyState implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlMediaReadyStateHaveNothing(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlMediaReadyStateHaveMetadata(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlMediaReadyStateHaveCurrentData(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlMediaReadyStateHaveFutureData(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlMediaReadyStateHaveEnoughData(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlMediaReadyState_Max(2147483647),
  ;

  private final int value;
  _htmlMediaReadyState(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
