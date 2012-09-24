package ms.html  ;

import com4j.*;

/**
 */
public enum _styleStrokeLinecap implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleStrokeLinecapNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleStrokeLinecapButt(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleStrokeLinecapRound(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleStrokeLinecapSquare(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleStrokeLinecap_Max(2147483647),
  ;

  private final int value;
  _styleStrokeLinecap(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
