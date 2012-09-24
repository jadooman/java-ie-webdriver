package ms.html  ;

import com4j.*;

/**
 */
public enum _styleDir implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  styleDirNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  styleDirLeftToRight(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  styleDirRightToLeft(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  styleDirInherit(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  styleDir_Max(2147483647),
  ;

  private final int value;
  _styleDir(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
