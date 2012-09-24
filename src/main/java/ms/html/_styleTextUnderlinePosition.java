package ms.html  ;

import com4j.*;

/**
 */
public enum _styleTextUnderlinePosition implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleTextUnderlinePositionBelow(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleTextUnderlinePositionAbove(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleTextUnderlinePositionAuto(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleTextUnderlinePositionNotSet(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleTextUnderlinePosition_Max(2147483647),
  ;

  private final int value;
  _styleTextUnderlinePosition(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
