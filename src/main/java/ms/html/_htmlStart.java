package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlStart implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlStartfileopen(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlStartmouseover(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlStart_Max(2147483647),
  ;

  private final int value;
  _htmlStart(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
