package ms.html  ;

import com4j.*;

@IID("{305104F6-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGMatrix extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "a"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  void a(
    float p);


  /**
   * <p>
   * Getter method for the COM property "a"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  float a();


  /**
   * <p>
   * Setter method for the COM property "b"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  void b(
    float p);


  /**
   * <p>
   * Getter method for the COM property "b"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  float b();


  /**
   * <p>
   * Setter method for the COM property "c"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(11)
  void c(
    float p);


  /**
   * <p>
   * Getter method for the COM property "c"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(12)
  float c();


  /**
   * <p>
   * Setter method for the COM property "d"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(13)
  void d(
    float p);


  /**
   * <p>
   * Getter method for the COM property "d"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(14)
  float d();


  /**
   * <p>
   * Setter method for the COM property "e"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(15)
  void e(
    float p);


  /**
   * <p>
   * Getter method for the COM property "e"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(16)
  float e();


  /**
   * <p>
   * Setter method for the COM property "f"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(17)
  void f(
    float p);


  /**
   * <p>
   * Getter method for the COM property "f"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(18)
  float f();


  /**
   * @param secondMatrix Mandatory ms.html.ISVGMatrix parameter.
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(19)
  ms.html.ISVGMatrix multiply(
    ms.html.ISVGMatrix secondMatrix);


  /**
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(20)
  ms.html.ISVGMatrix inverse();


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(21)
  ms.html.ISVGMatrix translate(
    float x,
    float y);


  /**
   * @param scaleFactor Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(22)
  ms.html.ISVGMatrix scale(
    float scaleFactor);


  /**
   * @param scaleFactorX Mandatory float parameter.
   * @param scaleFactorY Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(23)
  ms.html.ISVGMatrix scaleNonUniform(
    float scaleFactorX,
    float scaleFactorY);


  /**
   * @param angle Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(24)
  ms.html.ISVGMatrix rotate(
    float angle);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(25)
  ms.html.ISVGMatrix rotateFromVector(
    float x,
    float y);


  /**
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(26)
  ms.html.ISVGMatrix flipX();


  /**
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(27)
  ms.html.ISVGMatrix flipY();


  /**
   * @param angle Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(28)
  ms.html.ISVGMatrix skewX(
    float angle);


  /**
   * @param angle Mandatory float parameter.
   * @return  Returns a value of type ms.html.ISVGMatrix
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(29)
  ms.html.ISVGMatrix skewY(
    float angle);


  // Properties:
}
