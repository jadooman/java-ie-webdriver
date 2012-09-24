package ms.html  ;

import com4j.*;

/**
 */
public enum _styleRubyAlign implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleRubyAlignNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleRubyAlignAuto(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleRubyAlignLeft(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleRubyAlignCenter(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleRubyAlignRight(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  styleRubyAlignDistributeLetter(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  styleRubyAlignDistributeSpace(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  styleRubyAlignLineEdge(7),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleRubyAlign_Max(2147483647),
  ;

  private final int value;
  _styleRubyAlign(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
