package ms.html  ;

import com4j.*;

/**
 */
public enum _styleRubyPosition implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleRubyPositionNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleRubyPositionAbove(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleRubyPositionInline(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleRubyPosition_Max(2147483647),
  ;

  private final int value;
  _styleRubyPosition(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
