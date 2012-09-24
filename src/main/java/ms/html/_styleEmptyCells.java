package ms.html  ;

import com4j.*;

/**
 */
public enum _styleEmptyCells implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleEmptyCellsNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleEmptyCellsShow(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleEmptyCellsHide(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleEmptyCells_Max(2147483647),
  ;

  private final int value;
  _styleEmptyCells(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
