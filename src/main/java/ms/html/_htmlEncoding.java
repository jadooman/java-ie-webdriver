package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlEncoding implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlEncodingURL(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlEncodingMultipart(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlEncodingText(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlEncoding_Max(2147483647),
  ;

  private final int value;
  _htmlEncoding(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
