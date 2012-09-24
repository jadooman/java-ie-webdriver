package ms.html  ;

import com4j.*;

/**
 */
public enum _styleTextEffect implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleTextEffectNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleTextEffectEmboss(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleTextEffectEngrave(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleTextEffectOutline(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleTextEffect_Max(2147483647),
  ;

  private final int value;
  _styleTextEffect(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
