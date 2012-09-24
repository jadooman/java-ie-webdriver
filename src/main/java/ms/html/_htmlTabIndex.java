package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlTabIndex implements ComEnum {
  /**
   * <p>
   * The value of this constant is -32768
   * </p>
   */
  htmlTabIndexNotSet(-32768),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlTabIndex_Max(2147483647),
  ;

  private final int value;
  _htmlTabIndex(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
