package ms.html  ;

import com4j.*;

/**
 */
public enum _bodyScroll implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  bodyScrollyes(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  bodyScrollno(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  bodyScrollauto(4),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  bodyScrolldefault(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  bodyScroll_Max(2147483647),
  ;

  private final int value;
  _bodyScroll(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
