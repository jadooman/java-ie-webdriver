package ms.html  ;

import com4j.*;

/**
 */
public enum _styleFontStretch implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleFontStretchNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleFontStretchWider(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleFontStretchNarrower(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleFontStretchUltraCondensed(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleFontStretchExtraCondensed(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  styleFontStretchCondensed(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  styleFontStretchSemiCondensed(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  styleFontStretchNormal(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  styleFontStretchSemiExpanded(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  styleFontStretchExpanded(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  styleFontStretchExtraExpanded(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  styleFontStretchUltraExpanded(11),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleFontStretch_Max(2147483647),
  ;

  private final int value;
  _styleFontStretch(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
