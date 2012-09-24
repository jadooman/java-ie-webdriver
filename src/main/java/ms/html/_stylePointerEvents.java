package ms.html  ;

import com4j.*;

/**
 */
public enum _stylePointerEvents implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  stylePointerEventsNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  stylePointerEventsVisiblePainted(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  stylePointerEventsVisibleFill(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  stylePointerEventsVisibleStroke(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  stylePointerEventsVisible(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  stylePointerEventsPainted(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  stylePointerEventsFill(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  stylePointerEventsStroke(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  stylePointerEventsAll(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  stylePointerEventsNone(9),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  stylePointerEvents_Max(2147483647),
  ;

  private final int value;
  _stylePointerEvents(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
