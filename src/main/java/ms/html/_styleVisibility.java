package ms.html  ;

import com4j.*;

/**
 */
public enum _styleVisibility implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleVisibilityNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleVisibilityInherit(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleVisibilityVisible(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleVisibilityHidden(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleVisibilityCollapse(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleVisibility_Max(2147483647),
  ;

  private final int value;
  _styleVisibility(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
