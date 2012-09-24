package ms.html  ;

import com4j.*;

/**
 */
public enum _styleFontStyle implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleFontStyleNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleFontStyleItalic(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleFontStyleOblique(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleFontStyleNormal(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleFontStyle_Max(2147483647),
  ;

  private final int value;
  _styleFontStyle(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
