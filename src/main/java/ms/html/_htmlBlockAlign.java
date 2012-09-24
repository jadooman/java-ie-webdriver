package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlBlockAlign implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlBlockAlignNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlBlockAlignLeft(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlBlockAlignCenter(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlBlockAlignRight(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlBlockAlignJustify(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlBlockAlign_Max(2147483647),
  ;

  private final int value;
  _htmlBlockAlign(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
