package ms.html  ;

import com4j.*;

/**
 */
public enum _textpathMethodtype implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  TEXTPATH_METHODTYPE_UNKNOWN(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  TEXTPATH_METHODTYPE_ALIGN(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  TEXTPATH_METHODTYPE_STRETCH(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  textpathMethodtype_Max(2147483647),
  ;

  private final int value;
  _textpathMethodtype(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
