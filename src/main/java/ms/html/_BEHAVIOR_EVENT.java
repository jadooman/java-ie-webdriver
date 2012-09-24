package ms.html  ;

import com4j.*;

/**
 */
public enum _BEHAVIOR_EVENT implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  BEHAVIOREVENT_FIRST(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  BEHAVIOREVENT_CONTENTREADY(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  BEHAVIOREVENT_DOCUMENTREADY(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  BEHAVIOREVENT_APPLYSTYLE(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  BEHAVIOREVENT_DOCUMENTCONTEXTCHANGE(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  BEHAVIOREVENT_CONTENTSAVE(4),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  BEHAVIOREVENT_LAST(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  BEHAVIOR_EVENT_Max(2147483647),
  ;

  private final int value;
  _BEHAVIOR_EVENT(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
