package ms.html  ;

import com4j.*;

/**
 */
public enum _stylePageBreakInside implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  stylePageBreakInsideNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  stylePageBreakInsideAuto(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  stylePageBreakInsideAvoid(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  stylePageBreakInside_Max(2147483647),
  ;

  private final int value;
  _stylePageBreakInside(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
