package ms.html  ;

import com4j.*;

/**
 */
public enum _styleInitialString implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleInitialStringNoInitial(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleInitialStringNone(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleInitialStringAuto(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleInitialStringNormal(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleInitialString_Max(2147483647),
  ;

  private final int value;
  _styleInitialString(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
