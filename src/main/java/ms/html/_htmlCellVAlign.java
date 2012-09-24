package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlCellVAlign implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlCellVAlignNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlCellVAlignTop(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlCellVAlignMiddle(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlCellVAlignBottom(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlCellVAlignBaseline(4),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlCellVAlignCenter(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlCellVAlign_Max(2147483647),
  ;

  private final int value;
  _htmlCellVAlign(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
