package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlEffectAllowed implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlEffectAllowedCopy(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlEffectAllowedLink(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlEffectAllowedMove(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlEffectAllowedCopyLink(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlEffectAllowedCopyMove(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  htmlEffectAllowedLinkMove(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  htmlEffectAllowedAll(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  htmlEffectAllowedNone(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  htmlEffectAllowedUninitialized(8),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlEffectAllowed_Max(2147483647),
  ;

  private final int value;
  _htmlEffectAllowed(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
