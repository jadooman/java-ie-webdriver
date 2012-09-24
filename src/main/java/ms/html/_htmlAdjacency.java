package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlAdjacency implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlAdjacencyBeforeBegin(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlAdjacencyAfterBegin(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlAdjacencyBeforeEnd(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlAdjacencyAfterEnd(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlAdjacency_Max(2147483647),
  ;

  private final int value;
  _htmlAdjacency(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
