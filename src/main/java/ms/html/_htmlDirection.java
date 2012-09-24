package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlDirection implements ComEnum {
  /**
   * <p>
   * The value of this constant is 99999
   * </p>
   */
  htmlDirectionForward(99999),
  /**
   * <p>
   * The value of this constant is -99999
   * </p>
   */
  htmlDirectionBackward(-99999),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlDirection_Max(2147483647),
  ;

  private final int value;
  _htmlDirection(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
