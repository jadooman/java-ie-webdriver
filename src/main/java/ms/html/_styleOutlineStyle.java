package ms.html  ;

import com4j.*;

/**
 */
public enum _styleOutlineStyle implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleOutlineStyleNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleOutlineStyleDotted(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleOutlineStyleDashed(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleOutlineStyleSolid(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleOutlineStyleDouble(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  styleOutlineStyleGroove(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  styleOutlineStyleRidge(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  styleOutlineStyleInset(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  styleOutlineStyleOutset(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  styleOutlineStyleWindowInset(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  styleOutlineStyleNone(10),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleOutlineStyle_Max(2147483647),
  ;

  private final int value;
  _styleOutlineStyle(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
