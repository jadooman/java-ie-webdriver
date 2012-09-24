package ms.html  ;

import com4j.*;

/**
 */
public enum _textDecoration implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  textDecorationNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  textDecorationUnderline(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  textDecorationOverline(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  textDecorationLineThrough(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  textDecorationBlink(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  textDecoration_Max(2147483647),
  ;

  private final int value;
  _textDecoration(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
