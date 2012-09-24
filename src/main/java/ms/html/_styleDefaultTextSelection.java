package ms.html  ;

import com4j.*;

/**
 */
public enum _styleDefaultTextSelection implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleDefaultTextSelectionFalse(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleDefaultTextSelectionTrue(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleDefaultTextSelection_Max(2147483647),
  ;

  private final int value;
  _styleDefaultTextSelection(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
