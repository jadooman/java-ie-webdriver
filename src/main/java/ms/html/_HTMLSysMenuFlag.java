package ms.html  ;

import com4j.*;

/**
 */
public enum _HTMLSysMenuFlag implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLSysMenuFlagNo(0),
  /**
   * <p>
   * The value of this constant is 524288
   * </p>
   */
  HTMLSysMenuFlagYes(524288),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTMLSysMenuFlag_Max(2147483647),
  ;

  private final int value;
  _HTMLSysMenuFlag(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
