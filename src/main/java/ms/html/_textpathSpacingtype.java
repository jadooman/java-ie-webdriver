package ms.html  ;

import com4j.*;

/**
 */
public enum _textpathSpacingtype implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  TEXTPATH_SPACINGTYPE_UNKNOWN(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  TEXTPATH_SPACINGTYPE_AUTO(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  TEXTPATH_SPACINGTYPE_EXACT(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  textpathSpacingtype_Max(2147483647),
  ;

  private final int value;
  _textpathSpacingtype(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
