package ms.html  ;

import com4j.*;

/**
 */
public enum _ELEMENTNAMESPACE_FLAGS implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ELEMENTNAMESPACEFLAGS_ALLOWANYTAG(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ELEMENTNAMESPACEFLAGS_QUERYFORUNKNOWNTAGS(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  ELEMENTNAMESPACE_FLAGS_Max(2147483647),
  ;

  private final int value;
  _ELEMENTNAMESPACE_FLAGS(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
