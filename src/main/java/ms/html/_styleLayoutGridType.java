package ms.html  ;

import com4j.*;

/**
 */
public enum _styleLayoutGridType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleLayoutGridTypeNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleLayoutGridTypeLoose(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleLayoutGridTypeStrict(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleLayoutGridTypeFixed(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleLayoutGridType_Max(2147483647),
  ;

  private final int value;
  _styleLayoutGridType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
