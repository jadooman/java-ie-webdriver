package ms.html  ;

import com4j.*;

/**
 */
public enum _svgPreserveAspectRatioAlignType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  SVG_PRESERVEASPECTRATIO_UNKNOWN(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SVG_PRESERVEASPECTRATIO_NONE(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  SVG_PRESERVEASPECTRATIO_XMINYMIN(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  SVG_PRESERVEASPECTRATIO_XMIDYMIN(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  SVG_PRESERVEASPECTRATIO_XMAXYMIN(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  SVG_PRESERVEASPECTRATIO_XMINYMID(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  SVG_PRESERVEASPECTRATIO_XMIDYMID(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  SVG_PRESERVEASPECTRATIO_XMAXYMID(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  SVG_PRESERVEASPECTRATIO_XMINYMAX(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  SVG_PRESERVEASPECTRATIO_XMIDYMAX(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  SVG_PRESERVEASPECTRATIO_XMAXYMAX(10),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  svgPreserveAspectRatioAlignType_Max(2147483647),
  ;

  private final int value;
  _svgPreserveAspectRatioAlignType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
