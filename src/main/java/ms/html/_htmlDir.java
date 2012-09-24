package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlDir implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlDirNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlDirLeftToRight(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlDirRightToLeft(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlDir_Max(2147483647),
  ;

  private final int value;
  _htmlDir(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
