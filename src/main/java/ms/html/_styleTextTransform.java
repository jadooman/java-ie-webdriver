package ms.html  ;

import com4j.*;

/**
 */
public enum _styleTextTransform implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleTextTransformNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleTextTransformCapitalize(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleTextTransformLowercase(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleTextTransformUppercase(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleTextTransformNone(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleTextTransform_Max(2147483647),
  ;

  private final int value;
  _styleTextTransform(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
