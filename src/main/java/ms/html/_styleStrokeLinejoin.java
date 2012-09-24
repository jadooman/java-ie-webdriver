package ms.html  ;

import com4j.*;

/**
 */
public enum _styleStrokeLinejoin implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleStrokeLinejoinNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleStrokeLinejoinMiter(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleStrokeLinejoinRound(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleStrokeLinejoinBevel(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleStrokeLinejoin_Max(2147483647),
  ;

  private final int value;
  _styleStrokeLinejoin(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
