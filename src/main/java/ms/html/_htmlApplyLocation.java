package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlApplyLocation implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlApplyLocationInside(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlApplyLocationOutside(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlApplyLocation_Max(2147483647),
  ;

  private final int value;
  _htmlApplyLocation(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
