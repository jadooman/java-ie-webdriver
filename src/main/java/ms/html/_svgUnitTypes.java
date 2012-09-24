package ms.html  ;

import com4j.*;

/**
 */
public enum _svgUnitTypes implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  SVG_UNITTYPE_UNKNOWN(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SVG_UNITTYPE_USERSPACEONUSE(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  SVG_UNITTYPE_OBJECTBOUNDINGBOX(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  svgUnitTypes_Max(2147483647),
  ;

  private final int value;
  _svgUnitTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
