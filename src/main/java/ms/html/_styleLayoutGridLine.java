package ms.html  ;

import com4j.*;

/**
 */
public enum _styleLayoutGridLine implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleLayoutGridLineNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleLayoutGridLineAuto(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleLayoutGridLineNone(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleLayoutGridLine_Max(2147483647),
  ;

  private final int value;
  _styleLayoutGridLine(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
