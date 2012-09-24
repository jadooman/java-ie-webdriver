package ms.html  ;

import com4j.*;

/**
 */
public enum _styleListStylePosition implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleListStylePositionNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleListStylePositionInside(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleListStylePositionOutSide(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleListStylePosition_Max(2147483647),
  ;

  private final int value;
  _styleListStylePosition(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
