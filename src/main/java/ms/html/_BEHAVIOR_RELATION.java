package ms.html  ;

import com4j.*;

/**
 */
public enum _BEHAVIOR_RELATION implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  BEHAVIOR_FIRSTRELATION(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  BEHAVIOR_SAMEELEMENT(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  BEHAVIOR_PARENT(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  BEHAVIOR_CHILD(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  BEHAVIOR_SIBLING(3),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  BEHAVIOR_LASTRELATION(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  BEHAVIOR_RELATION_Max(2147483647),
  ;

  private final int value;
  _BEHAVIOR_RELATION(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
