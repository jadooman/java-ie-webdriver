package ms.html  ;

import com4j.*;

/**
 */
public enum _styleAlignmentBaseline implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleAlignmentBaselineNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleAlignmentBaselineAfterEdge(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleAlignmentBaselineAlphabetic(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleAlignmentBaselineAuto(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleAlignmentBaselineBaseline(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  styleAlignmentBaselineBeforeEdge(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  styleAlignmentBaselineCentral(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  styleAlignmentBaselineHanging(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  styleAlignmentBaselineMathematical(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  styleAlignmentBaselineMiddle(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  styleAlignmentBaselineTextAfterEdge(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  styleAlignmentBaselineTextBeforeEdge(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  styleAlignmentBaselineIdeographic(12),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleAlignmentBaseline_Max(2147483647),
  ;

  private final int value;
  _styleAlignmentBaseline(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
