package ms.html  ;

import com4j.*;

/**
 */
public enum _styleBorderWidth implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleBorderWidthThin(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleBorderWidthMedium(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleBorderWidthThick(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleBorderWidth_Max(2147483647),
  ;

  private final int value;
  _styleBorderWidth(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
