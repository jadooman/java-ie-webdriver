package ms.html  ;

import com4j.*;

/**
 */
public enum _PARSE_FLAGS implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  PARSE_ABSOLUTIFYIE40URLS(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  PARSE_FLAGS_Max(2147483647),
  ;

  private final int value;
  _PARSE_FLAGS(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
