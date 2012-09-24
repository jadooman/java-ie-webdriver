package ms.html  ;

import com4j.*;

/**
 */
public enum _styleTextOverflow implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleTextOverflowClip(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleTextOverflowEllipsis(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleTextOverflowNotSet(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleTextOverflow_Max(2147483647),
  ;

  private final int value;
  _styleTextOverflow(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
