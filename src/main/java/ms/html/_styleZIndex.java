package ms.html  ;

import com4j.*;

/**
 */
public enum _styleZIndex implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2147483647
   * </p>
   */
  styleZIndexAuto(-2147483647),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleZIndex_Max(2147483647),
  ;

  private final int value;
  _styleZIndex(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
