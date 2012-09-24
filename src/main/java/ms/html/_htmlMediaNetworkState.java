package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlMediaNetworkState implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlMediaNetworkStateEmpty(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlMediaNetworkStateIdle(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlMediaNetworkStateLoading(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlMediaNetworkStateNoSource(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlMediaNetworkState_Max(2147483647),
  ;

  private final int value;
  _htmlMediaNetworkState(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
