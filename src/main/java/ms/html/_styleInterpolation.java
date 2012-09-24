package ms.html  ;

import com4j.*;

/**
 */
public enum _styleInterpolation implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleInterpolationNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleInterpolationNN(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleInterpolationBCH(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleInterpolation_Max(2147483647),
  ;

  private final int value;
  _styleInterpolation(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
