package ms.html  ;

import com4j.*;

/**
 */
public enum _styleBoxSizing implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleBoxSizingNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleBoxSizingContentBox(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleBoxSizingBorderBox(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleBoxSizing_Max(2147483647),
  ;

  private final int value;
  _styleBoxSizing(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
