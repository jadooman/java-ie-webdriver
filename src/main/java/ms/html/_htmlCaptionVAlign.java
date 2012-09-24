package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlCaptionVAlign implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlCaptionVAlignNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlCaptionVAlignTop(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlCaptionVAlignBottom(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlCaptionVAlign_Max(2147483647),
  ;

  private final int value;
  _htmlCaptionVAlign(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
