package ms.html  ;

import com4j.*;

/**
 */
public enum _DISPLAY_MOVEUNIT implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  DISPLAY_MOVEUNIT_PreviousLine(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  DISPLAY_MOVEUNIT_NextLine(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  DISPLAY_MOVEUNIT_CurrentLineStart(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  DISPLAY_MOVEUNIT_CurrentLineEnd(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  DISPLAY_MOVEUNIT_TopOfWindow(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  DISPLAY_MOVEUNIT_BottomOfWindow(6),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  DISPLAY_MOVEUNIT_Max(2147483647),
  ;

  private final int value;
  _DISPLAY_MOVEUNIT(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
