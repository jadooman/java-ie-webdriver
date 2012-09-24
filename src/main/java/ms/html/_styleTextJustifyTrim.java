package ms.html  ;

import com4j.*;

/**
 */
public enum _styleTextJustifyTrim implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleTextJustifyTrimNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleTextJustifyTrimNone(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleTextJustifyTrimPunctuation(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleTextJustifyTrimPunctAndKana(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleTextJustifyTrim_Max(2147483647),
  ;

  private final int value;
  _styleTextJustifyTrim(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
