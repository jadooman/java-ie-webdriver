package ms.html  ;

import com4j.*;

/**
 */
public enum _VIEW_OBJECT_ALPHA_MODE implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  VIEW_OBJECT_ALPHA_MODE_IGNORE(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  VIEW_OBJECT_ALPHA_MODE_PREMULTIPLIED(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  VIEW_OBJECT_ALPHA_MODE_Max(2147483647),
  ;

  private final int value;
  _VIEW_OBJECT_ALPHA_MODE(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
