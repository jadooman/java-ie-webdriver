package ms.html  ;

import com4j.*;

/**
 */
public enum _styleTransformOriginX implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleTransformOriginXNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleTransformOriginXLeft(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleTransformOriginXCenter(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleTransformOriginXRight(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleTransformOriginX_Max(2147483647),
  ;

  private final int value;
  _styleTransformOriginX(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
