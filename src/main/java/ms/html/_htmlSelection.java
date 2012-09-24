package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlSelection implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlSelectionNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlSelectionText(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlSelectionControl(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlSelectionTable(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlSelection_Max(2147483647),
  ;

  private final int value;
  _htmlSelection(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
