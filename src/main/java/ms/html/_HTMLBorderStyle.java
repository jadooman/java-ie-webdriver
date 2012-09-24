package ms.html  ;

import com4j.*;

/**
 */
public enum _HTMLBorderStyle implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLBorderStyleNormal(0),
  /**
   * <p>
   * The value of this constant is 256
   * </p>
   */
  HTMLBorderStyleRaised(256),
  /**
   * <p>
   * The value of this constant is 512
   * </p>
   */
  HTMLBorderStyleSunken(512),
  /**
   * <p>
   * The value of this constant is 768
   * </p>
   */
  HTMLBorderStylecombined(768),
  /**
   * <p>
   * The value of this constant is 131072
   * </p>
   */
  HTMLBorderStyleStatic(131072),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTMLBorderStyle_Max(2147483647),
  ;

  private final int value;
  _HTMLBorderStyle(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
