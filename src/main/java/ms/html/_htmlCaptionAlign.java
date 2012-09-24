package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlCaptionAlign implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlCaptionAlignNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlCaptionAlignLeft(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlCaptionAlignCenter(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlCaptionAlignRight(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlCaptionAlignJustify(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  htmlCaptionAlignTop(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  htmlCaptionAlignBottom(6),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlCaptionAlign_Max(2147483647),
  ;

  private final int value;
  _htmlCaptionAlign(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
