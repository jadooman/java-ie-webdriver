package ms.html  ;

import com4j.*;

/**
 */
public enum _HTML_PAINT_DRAW_FLAGS implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLPAINT_DRAW_UPDATEREGION(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  HTMLPAINT_DRAW_USE_XFORM(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTML_PAINT_DRAW_FLAGS_Max(2147483647),
  ;

  private final int value;
  _HTML_PAINT_DRAW_FLAGS(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
