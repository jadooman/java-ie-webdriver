package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlDesignMode implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  htmlDesignModeInherit(-2),
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  htmlDesignModeOn(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlDesignModeOff(0),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlDesignMode_Max(2147483647),
  ;

  private final int value;
  _htmlDesignMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
