package ms.html  ;

import com4j.*;

/**
 */
public enum _styleVerticalAlign implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleVerticalAlignAuto(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleVerticalAlignBaseline(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleVerticalAlignSub(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleVerticalAlignSuper(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleVerticalAlignTop(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  styleVerticalAlignTextTop(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  styleVerticalAlignMiddle(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  styleVerticalAlignBottom(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  styleVerticalAlignTextBottom(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  styleVerticalAlignInherit(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  styleVerticalAlignNotSet(10),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleVerticalAlign_Max(2147483647),
  ;

  private final int value;
  _styleVerticalAlign(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
