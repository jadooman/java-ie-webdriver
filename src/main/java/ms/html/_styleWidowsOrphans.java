package ms.html  ;

import com4j.*;

/**
 */
public enum _styleWidowsOrphans implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2147483647
   * </p>
   */
  styleWidowsOrphansNotSet(-2147483647),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleWidowsOrphans_Max(2147483647),
  ;

  private final int value;
  _styleWidowsOrphans(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
