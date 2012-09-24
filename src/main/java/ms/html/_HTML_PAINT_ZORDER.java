package ms.html  ;

import com4j.*;

/**
 */
public enum _HTML_PAINT_ZORDER implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLPAINT_ZORDER_NONE(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLPAINT_ZORDER_REPLACE_ALL(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  HTMLPAINT_ZORDER_REPLACE_CONTENT(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  HTMLPAINT_ZORDER_REPLACE_BACKGROUND(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  HTMLPAINT_ZORDER_BELOW_CONTENT(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  HTMLPAINT_ZORDER_BELOW_FLOW(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  HTMLPAINT_ZORDER_ABOVE_FLOW(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  HTMLPAINT_ZORDER_ABOVE_CONTENT(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  HTMLPAINT_ZORDER_WINDOW_TOP(8),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTML_PAINT_ZORDER_Max(2147483647),
  ;

  private final int value;
  _HTML_PAINT_ZORDER(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
