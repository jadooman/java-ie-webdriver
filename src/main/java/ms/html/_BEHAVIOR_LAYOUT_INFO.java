package ms.html  ;

import com4j.*;

/**
 */
public enum _BEHAVIOR_LAYOUT_INFO implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  BEHAVIORLAYOUTINFO_FULLDELEGATION(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  BEHAVIORLAYOUTINFO_MODIFYNATURAL(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  BEHAVIORLAYOUTINFO_MAPSIZE(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  BEHAVIOR_LAYOUT_INFO_Max(2147483647),
  ;

  private final int value;
  _BEHAVIOR_LAYOUT_INFO(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
