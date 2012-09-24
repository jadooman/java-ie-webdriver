package ms.html  ;

import com4j.*;

/**
 */
public enum _lengthAdjust implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  LENGTHADJUST_UNKNOWN(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  LENGTHADJUST_SPACING(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  LENGTHADJUST_SPACINGANDGLYPHS(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  lengthAdjust_Max(2147483647),
  ;

  private final int value;
  _lengthAdjust(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
