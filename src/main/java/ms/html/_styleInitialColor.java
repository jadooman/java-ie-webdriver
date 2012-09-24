package ms.html  ;

import com4j.*;

/**
 */
public enum _styleInitialColor implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleInitialColorNoInitial(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleInitialColorColorProperty(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleInitialColorTransparent(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleInitialColorInvert(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleInitialColor_Max(2147483647),
  ;

  private final int value;
  _styleInitialColor(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
