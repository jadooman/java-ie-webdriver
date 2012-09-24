package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlPersistState implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlPersistStateNormal(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlPersistStateFavorite(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlPersistStateHistory(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlPersistStateSnapshot(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlPersistStateUserData(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlPersistState_Max(2147483647),
  ;

  private final int value;
  _htmlPersistState(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
