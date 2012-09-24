package ms.html  ;

import com4j.*;

/**
 */
public enum _styleTextAlignLast implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleTextAlignLastNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleTextAlignLastLeft(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleTextAlignLastCenter(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleTextAlignLastRight(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleTextAlignLastJustify(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  styleTextAlignLastAuto(5),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleTextAlignLast_Max(2147483647),
  ;

  private final int value;
  _styleTextAlignLast(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
