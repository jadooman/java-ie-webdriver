package ms.html  ;

import com4j.*;

/**
 */
public enum _styleAccelerator implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleAcceleratorFalse(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleAcceleratorTrue(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleAccelerator_Max(2147483647),
  ;

  private final int value;
  _styleAccelerator(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
