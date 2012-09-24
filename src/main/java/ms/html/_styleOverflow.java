package ms.html  ;

import com4j.*;

/**
 */
public enum _styleOverflow implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleOverflowNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleOverflowAuto(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleOverflowHidden(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleOverflowVisible(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleOverflowScroll(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleOverflow_Max(2147483647),
  ;

  private final int value;
  _styleOverflow(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
