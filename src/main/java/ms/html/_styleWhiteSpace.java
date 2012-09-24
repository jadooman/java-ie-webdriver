package ms.html  ;

import com4j.*;

/**
 */
public enum _styleWhiteSpace implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleWhiteSpaceNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleWhiteSpaceNormal(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleWhiteSpacePre(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleWhiteSpaceNowrap(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleWhiteSpacePreline(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  styleWhiteSpacePrewrap(5),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleWhiteSpace_Max(2147483647),
  ;

  private final int value;
  _styleWhiteSpace(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
