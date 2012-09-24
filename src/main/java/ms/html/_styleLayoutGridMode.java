package ms.html  ;

import com4j.*;

/**
 */
public enum _styleLayoutGridMode implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleLayoutGridModeNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleLayoutGridModeChar(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleLayoutGridModeLine(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleLayoutGridModeBoth(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleLayoutGridModeNone(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleLayoutGridMode_Max(2147483647),
  ;

  private final int value;
  _styleLayoutGridMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
