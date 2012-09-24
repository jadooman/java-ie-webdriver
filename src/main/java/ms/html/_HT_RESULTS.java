package ms.html  ;

import com4j.*;

/**
 */
public enum _HT_RESULTS implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HT_RESULTS_Glyph(1),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HT_RESULTS_Max(2147483647),
  ;

  private final int value;
  _HT_RESULTS(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
