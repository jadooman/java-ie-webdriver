package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlEndPoints implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlEndPointsStartToStart(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlEndPointsStartToEnd(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlEndPointsEndToStart(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlEndPointsEndToEnd(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlEndPoints_Max(2147483647),
  ;

  private final int value;
  _htmlEndPoints(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
