package ms.html  ;

import com4j.*;

/**
 */
public enum _ELEMENT_CORNER implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ELEMENT_CORNER_NONE(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ELEMENT_CORNER_TOP(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ELEMENT_CORNER_LEFT(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ELEMENT_CORNER_BOTTOM(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ELEMENT_CORNER_RIGHT(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ELEMENT_CORNER_TOPLEFT(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ELEMENT_CORNER_TOPRIGHT(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  ELEMENT_CORNER_BOTTOMLEFT(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ELEMENT_CORNER_BOTTOMRIGHT(8),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  ELEMENT_CORNER_Max(2147483647),
  ;

  private final int value;
  _ELEMENT_CORNER(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
