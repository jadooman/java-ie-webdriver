package ms.html  ;

import com4j.*;

/**
 */
public enum _FINDTEXT_FLAGS implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  FINDTEXT_BACKWARDS(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  FINDTEXT_WHOLEWORD(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  FINDTEXT_MATCHCASE(4),
  /**
   * <p>
   * The value of this constant is 131072
   * </p>
   */
  FINDTEXT_RAW(131072),
  /**
   * <p>
   * The value of this constant is 262144
   * </p>
   */
  FINDTEXT_MATCHREPEATEDWHITESPACE(262144),
  /**
   * <p>
   * The value of this constant is 536870912
   * </p>
   */
  FINDTEXT_MATCHDIAC(536870912),
  /**
   * <p>
   * The value of this constant is 1073741824
   * </p>
   */
  FINDTEXT_MATCHKASHIDA(1073741824),
  /**
   * <p>
   * The value of this constant is -2147483648
   * </p>
   */
  FINDTEXT_MATCHALEFHAMZA(-2147483648),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  FINDTEXT_FLAGS_Max(2147483647),
  ;

  private final int value;
  _FINDTEXT_FLAGS(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
