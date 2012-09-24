package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlControlAlign implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlControlAlignNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlControlAlignLeft(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlControlAlignCenter(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlControlAlignRight(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlControlAlignTextTop(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  htmlControlAlignAbsMiddle(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  htmlControlAlignBaseline(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  htmlControlAlignAbsBottom(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  htmlControlAlignBottom(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  htmlControlAlignMiddle(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  htmlControlAlignTop(10),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlControlAlign_Max(2147483647),
  ;

  private final int value;
  _htmlControlAlign(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
