package ms.html  ;

import com4j.*;

/**
 */
public enum _stylePosition implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  stylePositionNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  stylePositionstatic(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  stylePositionrelative(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  stylePositionabsolute(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  stylePositionfixed(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  stylePosition_Max(2147483647),
  ;

  private final int value;
  _stylePosition(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
