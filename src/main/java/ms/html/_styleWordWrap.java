package ms.html  ;

import com4j.*;

/**
 */
public enum _styleWordWrap implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleWordWrapNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleWordWrapOff(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleWordWrapOn(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleWordWrap_Max(2147483647),
  ;

  private final int value;
  _styleWordWrap(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
