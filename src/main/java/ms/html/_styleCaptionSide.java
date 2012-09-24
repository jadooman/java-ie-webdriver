package ms.html  ;

import com4j.*;

/**
 */
public enum _styleCaptionSide implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleCaptionSideNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleCaptionSideTop(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleCaptionSideBottom(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleCaptionSideLeft(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleCaptionSideRight(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleCaptionSide_Max(2147483647),
  ;

  private final int value;
  _styleCaptionSide(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
