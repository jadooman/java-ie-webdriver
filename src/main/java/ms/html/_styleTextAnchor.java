package ms.html  ;

import com4j.*;

/**
 */
public enum _styleTextAnchor implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleTextAnchorNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleTextAnchorStart(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleTextAnchorMiddle(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleTextAnchorEnd(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleTextAnchor_Max(2147483647),
  ;

  private final int value;
  _styleTextAnchor(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
