package ms.html  ;

import com4j.*;

/**
 */
public enum _styleBool implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleBoolFalse(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleBoolTrue(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleBool_Max(2147483647),
  ;

  private final int value;
  _styleBool(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
