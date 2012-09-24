package ms.html  ;

import com4j.*;

/**
 */
public enum _styleFontSize implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleFontSizeXXSmall(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleFontSizeXSmall(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleFontSizeSmall(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleFontSizeMedium(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleFontSizeLarge(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  styleFontSizeXLarge(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  styleFontSizeXXLarge(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  styleFontSizeSmaller(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  styleFontSizeLarger(8),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleFontSize_Max(2147483647),
  ;

  private final int value;
  _styleFontSize(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
