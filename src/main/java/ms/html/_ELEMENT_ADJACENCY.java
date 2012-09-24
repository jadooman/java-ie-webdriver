package ms.html  ;

import com4j.*;

/**
 */
public enum _ELEMENT_ADJACENCY implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ELEM_ADJ_BeforeBegin(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ELEM_ADJ_AfterBegin(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ELEM_ADJ_BeforeEnd(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ELEM_ADJ_AfterEnd(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  ELEMENT_ADJACENCY_Max(2147483647),
  ;

  private final int value;
  _ELEMENT_ADJACENCY(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
