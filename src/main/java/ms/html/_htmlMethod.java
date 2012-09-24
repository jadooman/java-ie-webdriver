package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlMethod implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlMethodNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlMethodGet(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlMethodPost(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlMethod_Max(2147483647),
  ;

  private final int value;
  _htmlMethod(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
