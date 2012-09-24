package ms.html  ;

import com4j.*;

/**
 */
public enum _svgPreserveAspectMeetOrSliceType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  SVG_MEETORSLICE_UNKNOWN(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SVG_MEETORSLICE_MEET(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  SVG_MEETORSLICE_SLICE(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  svgPreserveAspectMeetOrSliceType_Max(2147483647),
  ;

  private final int value;
  _svgPreserveAspectMeetOrSliceType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
