package ms.html  ;

import com4j.*;

/**
 */
public enum _svgMarkerOrientAttribute implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  svgMarkerOrientAttributeAuto(0),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  svgMarkerOrientAttribute_Max(2147483647),
  ;

  private final int value;
  _svgMarkerOrientAttribute(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
