package ms.html  ;

import com4j.*;

/**
 */
public enum _styleTextLineThroughStyle implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleTextLineThroughStyleUndefined(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleTextLineThroughStyleSingle(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleTextLineThroughStyleDouble(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleTextLineThroughStyle_Max(2147483647),
  ;

  private final int value;
  _styleTextLineThroughStyle(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
