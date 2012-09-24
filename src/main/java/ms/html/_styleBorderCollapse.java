package ms.html  ;

import com4j.*;

/**
 */
public enum _styleBorderCollapse implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleBorderCollapseNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleBorderCollapseSeparate(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleBorderCollapseCollapse(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleBorderCollapse_Max(2147483647),
  ;

  private final int value;
  _styleBorderCollapse(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
