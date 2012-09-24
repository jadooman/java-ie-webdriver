package ms.html  ;

import com4j.*;

@IID("{305104F7-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGTransform extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "type"
   * </p>
   * @param p Mandatory short parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  void type(
    short p);


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  short type();


  /**
   * <p>
   * Setter method for the COM property "matrix"
   * </p>
   * @param p Mandatory ms.html.ISVGMatrix parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  void matrix(
    ms.html.ISVGMatrix p);


  /**
   * <p>
   * Getter method for the COM property "matrix"
   * </p>
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.ISVGMatrix matrix();


  /**
   * <p>
   * Setter method for the COM property "angle"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(11)
  void angle(
    float p);


  /**
   * <p>
   * Getter method for the COM property "angle"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(12)
  float angle();


  /**
   * @param matrix Mandatory ms.html.ISVGMatrix parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(13)
  void setMatrix(
    ms.html.ISVGMatrix matrix);


  /**
   * @param tx Mandatory float parameter.
   * @param ty Mandatory float parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(14)
  void setTranslate(
    float tx,
    float ty);


  /**
   * @param sx Mandatory float parameter.
   * @param sy Mandatory float parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(15)
  void setScale(
    float sx,
    float sy);


  /**
   * @param angle Mandatory float parameter.
   * @param cx Mandatory float parameter.
   * @param cy Mandatory float parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(16)
  void setRotate(
    float angle,
    float cx,
    float cy);


  /**
   * @param angle Mandatory float parameter.
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(17)
  void setSkewX(
    float angle);


  /**
   * @param angle Mandatory float parameter.
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(18)
  void setSkewY(
    float angle);


  // Properties:
}
