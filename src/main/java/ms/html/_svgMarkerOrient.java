package ms.html  ;

import com4j.*;

/**
 */
public enum _svgMarkerOrient implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  SVG_MARKER_ORIENT_UNKNOWN(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SVG_MARKER_ORIENT_AUTO(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  SVG_MARKER_ORIENT_ANGLE(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  svgMarkerOrient_Max(2147483647),
  ;

  private final int value;
  _svgMarkerOrient(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
