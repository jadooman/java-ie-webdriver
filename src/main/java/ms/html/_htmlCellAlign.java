package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlCellAlign implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlCellAlignNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlCellAlignLeft(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlCellAlignCenter(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlCellAlignRight(3),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlCellAlignMiddle(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlCellAlign_Max(2147483647),
  ;

  private final int value;
  _htmlCellAlign(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
