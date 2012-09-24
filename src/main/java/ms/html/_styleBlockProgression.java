package ms.html  ;

import com4j.*;

/**
 */
public enum _styleBlockProgression implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleBlockProgressionTb(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleBlockProgressionRl(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleBlockProgressionBt(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleBlockProgressionLr(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  styleBlockProgressionNotSet(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleBlockProgression_Max(2147483647),
  ;

  private final int value;
  _styleBlockProgression(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
