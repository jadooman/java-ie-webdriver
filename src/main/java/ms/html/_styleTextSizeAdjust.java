package ms.html  ;

import com4j.*;

/**
 */
public enum _styleTextSizeAdjust implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleTextSizeAdjustNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleTextSizeAdjustAuto(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleTextSizeAdjust_Max(2147483647),
  ;

  private final int value;
  _styleTextSizeAdjust(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
