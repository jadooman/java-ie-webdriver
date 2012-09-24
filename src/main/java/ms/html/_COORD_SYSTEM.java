package ms.html  ;

import com4j.*;

/**
 */
public enum _COORD_SYSTEM implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  COORD_SYSTEM_GLOBAL(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  COORD_SYSTEM_PARENT(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  COORD_SYSTEM_CONTAINER(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  COORD_SYSTEM_CONTENT(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  COORD_SYSTEM_FRAME(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  COORD_SYSTEM_Max(2147483647),
  ;

  private final int value;
  _COORD_SYSTEM(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
