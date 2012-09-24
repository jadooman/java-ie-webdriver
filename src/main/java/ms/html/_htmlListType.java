package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlListType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlListTypeNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlListTypeLargeAlpha(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlListTypeSmallAlpha(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlListTypeLargeRoman(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlListTypeSmallRoman(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  htmlListTypeNumbers(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  htmlListTypeDisc(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  htmlListTypeCircle(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  htmlListTypeSquare(8),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlListType_Max(2147483647),
  ;

  private final int value;
  _htmlListType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
