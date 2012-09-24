package ms.html  ;

import com4j.*;

/**
 */
public enum _POINTER_GRAVITY implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  POINTER_GRAVITY_Left(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  POINTER_GRAVITY_Right(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  POINTER_GRAVITY_Max(2147483647),
  ;

  private final int value;
  _POINTER_GRAVITY(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
