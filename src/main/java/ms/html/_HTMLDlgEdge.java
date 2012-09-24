package ms.html  ;

import com4j.*;

/**
 */
public enum _HTMLDlgEdge implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HTMLDlgEdgeSunken(0),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  HTMLDlgEdgeRaised(16),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTMLDlgEdge_Max(2147483647),
  ;

  private final int value;
  _HTMLDlgEdge(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
