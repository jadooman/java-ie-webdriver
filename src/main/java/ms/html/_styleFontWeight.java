package ms.html  ;

import com4j.*;

/**
 */
public enum _styleFontWeight implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleFontWeightNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleFontWeight100(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleFontWeight200(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleFontWeight300(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleFontWeight400(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  styleFontWeight500(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  styleFontWeight600(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  styleFontWeight700(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  styleFontWeight800(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  styleFontWeight900(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  styleFontWeightNormal(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  styleFontWeightBold(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  styleFontWeightBolder(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  styleFontWeightLighter(13),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleFontWeight_Max(2147483647),
  ;

  private final int value;
  _styleFontWeight(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
