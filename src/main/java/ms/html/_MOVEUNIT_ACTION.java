package ms.html  ;

import com4j.*;

/**
 */
public enum _MOVEUNIT_ACTION implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  MOVEUNIT_PREVCHAR(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  MOVEUNIT_NEXTCHAR(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  MOVEUNIT_PREVCLUSTERBEGIN(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  MOVEUNIT_NEXTCLUSTERBEGIN(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  MOVEUNIT_PREVCLUSTEREND(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  MOVEUNIT_NEXTCLUSTEREND(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  MOVEUNIT_PREVWORDBEGIN(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  MOVEUNIT_NEXTWORDBEGIN(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  MOVEUNIT_PREVWORDEND(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  MOVEUNIT_NEXTWORDEND(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  MOVEUNIT_PREVPROOFWORD(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  MOVEUNIT_NEXTPROOFWORD(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  MOVEUNIT_NEXTURLBEGIN(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  MOVEUNIT_PREVURLBEGIN(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  MOVEUNIT_NEXTURLEND(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  MOVEUNIT_PREVURLEND(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  MOVEUNIT_PREVSENTENCE(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  MOVEUNIT_NEXTSENTENCE(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  MOVEUNIT_PREVBLOCK(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  MOVEUNIT_NEXTBLOCK(19),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  MOVEUNIT_ACTION_Max(2147483647),
  ;

  private final int value;
  _MOVEUNIT_ACTION(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
