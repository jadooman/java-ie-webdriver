package ms.html  ;

import com4j.*;

/**
 */
public enum _styleStyleFloat implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleStyleFloatNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleStyleFloatLeft(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleStyleFloatRight(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleStyleFloatNone(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleStyleFloat_Max(2147483647),
  ;

  private final int value;
  _styleStyleFloat(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
