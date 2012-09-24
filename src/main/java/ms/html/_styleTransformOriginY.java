package ms.html  ;

import com4j.*;

/**
 */
public enum _styleTransformOriginY implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleTransformOriginYNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleTransformOriginYTop(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleTransformOriginYCenter(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleTransformOriginYBottom(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleTransformOriginY_Max(2147483647),
  ;

  private final int value;
  _styleTransformOriginY(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
