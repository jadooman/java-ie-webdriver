package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlFrame implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlFrameNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlFramevoid(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlFrameabove(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlFramebelow(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlFramehsides(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  htmlFramelhs(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  htmlFramerhs(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  htmlFramevsides(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  htmlFramebox(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  htmlFrameborder(9),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlFrame_Max(2147483647),
  ;

  private final int value;
  _htmlFrame(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
