package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlDropEffect implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlDropEffectCopy(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlDropEffectLink(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlDropEffectMove(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlDropEffectNone(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlDropEffect_Max(2147483647),
  ;

  private final int value;
  _htmlDropEffect(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
