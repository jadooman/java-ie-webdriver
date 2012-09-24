package ms.html  ;

import com4j.*;

/**
 */
public enum _styleBidi implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleBidiNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleBidiNormal(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleBidiEmbed(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleBidiOverride(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleBidiInherit(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleBidi_Max(2147483647),
  ;

  private final int value;
  _styleBidi(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
