package ms.html  ;

import com4j.*;

/**
 */
public enum _styleRubyOverhang implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleRubyOverhangNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleRubyOverhangAuto(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleRubyOverhangWhitespace(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleRubyOverhangNone(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleRubyOverhang_Max(2147483647),
  ;

  private final int value;
  _styleRubyOverhang(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
