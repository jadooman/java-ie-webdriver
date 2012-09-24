package ms.html  ;

import com4j.*;

/**
 */
public enum _styleTextJustify implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleTextJustifyNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleTextJustifyInterWord(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleTextJustifyNewspaper(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleTextJustifyDistribute(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleTextJustifyDistributeAllLines(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  styleTextJustifyInterIdeograph(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  styleTextJustifyInterCluster(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  styleTextJustifyKashida(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  styleTextJustifyAuto(8),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleTextJustify_Max(2147483647),
  ;

  private final int value;
  _styleTextJustify(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
