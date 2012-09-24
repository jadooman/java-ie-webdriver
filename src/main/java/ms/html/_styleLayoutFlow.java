package ms.html  ;

import com4j.*;

/**
 */
public enum _styleLayoutFlow implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleLayoutFlowHorizontal(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleLayoutFlowVerticalIdeographic(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleLayoutFlowNotSet(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleLayoutFlow_Max(2147483647),
  ;

  private final int value;
  _styleLayoutFlow(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
