package ms.html  ;

import com4j.*;

@IID("{305106FF-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ICanvasRenderingContext2D extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "canvas"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLCanvasElement
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLCanvasElement canvas();


  /**
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  void restore();


  /**
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  void save();


  /**
   * @param angle Mandatory float parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  void rotate(
    float angle);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  void scale(
    float x,
    float y);


  /**
   * @param m11 Mandatory float parameter.
   * @param m12 Mandatory float parameter.
   * @param m21 Mandatory float parameter.
   * @param m22 Mandatory float parameter.
   * @param dx Mandatory float parameter.
   * @param dy Mandatory float parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  void setTransform(
    float m11,
    float m12,
    float m21,
    float m22,
    float dx,
    float dy);


  /**
   * @param m11 Mandatory float parameter.
   * @param m12 Mandatory float parameter.
   * @param m21 Mandatory float parameter.
   * @param m22 Mandatory float parameter.
   * @param dx Mandatory float parameter.
   * @param dy Mandatory float parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(13)
  void transform(
    float m11,
    float m12,
    float m21,
    float m22,
    float dx,
    float dy);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(14)
  void translate(
    float x,
    float y);


  /**
   * <p>
   * Setter method for the COM property "globalAlpha"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(15)
  void globalAlpha(
    float p);


  /**
   * <p>
   * Getter method for the COM property "globalAlpha"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(16)
  float globalAlpha();


  /**
   * <p>
   * Setter method for the COM property "globalCompositeOperation"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(17)
  void globalCompositeOperation(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "globalCompositeOperation"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String globalCompositeOperation();


  /**
   * <p>
   * Setter method for the COM property "fillStyle"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(19)
  void fillStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "fillStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fillStyle();


  /**
   * <p>
   * Setter method for the COM property "strokeStyle"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(21)
  void strokeStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "strokeStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object strokeStyle();


  /**
   * @param x0 Mandatory float parameter.
   * @param y0 Mandatory float parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   * @return  Returns a value of type ms.html.ICanvasGradient
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(23)
  ms.html.ICanvasGradient createLinearGradient(
    float x0,
    float y0,
    float x1,
    float y1);


  /**
   * @param x0 Mandatory float parameter.
   * @param y0 Mandatory float parameter.
   * @param r0 Mandatory float parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   * @param r1 Mandatory float parameter.
   * @return  Returns a value of type ms.html.ICanvasGradient
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(24)
  ms.html.ICanvasGradient createRadialGradient(
    float x0,
    float y0,
    float r0,
    float x1,
    float y1,
    float r1);


  /**
   * @param image Mandatory com4j.Com4jObject parameter.
   * @param repetition Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ms.html.ICanvasPattern
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(25)
  ms.html.ICanvasPattern createPattern(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject image,
    @MarshalAs(NativeType.VARIANT) java.lang.Object repetition);


  /**
   * <p>
   * Setter method for the COM property "lineCap"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(26)
  void lineCap(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "lineCap"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String lineCap();


  /**
   * <p>
   * Setter method for the COM property "lineJoin"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(28)
  void lineJoin(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "lineJoin"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String lineJoin();


  /**
   * <p>
   * Setter method for the COM property "lineWidth"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1017) //= 0x3f9. The runtime will prefer the VTID if present
  @VTID(30)
  void lineWidth(
    float p);


  /**
   * <p>
   * Getter method for the COM property "lineWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1017) //= 0x3f9. The runtime will prefer the VTID if present
  @VTID(31)
  float lineWidth();


  /**
   * <p>
   * Setter method for the COM property "miterLimit"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1018) //= 0x3fa. The runtime will prefer the VTID if present
  @VTID(32)
  void miterLimit(
    float p);


  /**
   * <p>
   * Getter method for the COM property "miterLimit"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1018) //= 0x3fa. The runtime will prefer the VTID if present
  @VTID(33)
  float miterLimit();


  /**
   * <p>
   * Setter method for the COM property "shadowBlur"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1019) //= 0x3fb. The runtime will prefer the VTID if present
  @VTID(34)
  void shadowBlur(
    float p);


  /**
   * <p>
   * Getter method for the COM property "shadowBlur"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1019) //= 0x3fb. The runtime will prefer the VTID if present
  @VTID(35)
  float shadowBlur();


  /**
   * <p>
   * Setter method for the COM property "shadowColor"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(36)
  void shadowColor(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "shadowColor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String shadowColor();


  /**
   * <p>
   * Setter method for the COM property "shadowOffsetX"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1021) //= 0x3fd. The runtime will prefer the VTID if present
  @VTID(38)
  void shadowOffsetX(
    float p);


  /**
   * <p>
   * Getter method for the COM property "shadowOffsetX"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1021) //= 0x3fd. The runtime will prefer the VTID if present
  @VTID(39)
  float shadowOffsetX();


  /**
   * <p>
   * Setter method for the COM property "shadowOffsetY"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1022) //= 0x3fe. The runtime will prefer the VTID if present
  @VTID(40)
  void shadowOffsetY(
    float p);


  /**
   * <p>
   * Getter method for the COM property "shadowOffsetY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1022) //= 0x3fe. The runtime will prefer the VTID if present
  @VTID(41)
  float shadowOffsetY();


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param w Mandatory float parameter.
   * @param h Mandatory float parameter.
   */

  @DISPID(1023) //= 0x3ff. The runtime will prefer the VTID if present
  @VTID(42)
  void clearRect(
    float x,
    float y,
    float w,
    float h);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param w Mandatory float parameter.
   * @param h Mandatory float parameter.
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(43)
  void fillRect(
    float x,
    float y,
    float w,
    float h);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param w Mandatory float parameter.
   * @param h Mandatory float parameter.
   */

  @DISPID(1025) //= 0x401. The runtime will prefer the VTID if present
  @VTID(44)
  void strokeRect(
    float x,
    float y,
    float w,
    float h);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param radius Mandatory float parameter.
   * @param startAngle Mandatory float parameter.
   * @param endAngle Mandatory float parameter.
   * @param anticlockwise Mandatory int parameter.
   */

  @DISPID(1026) //= 0x402. The runtime will prefer the VTID if present
  @VTID(45)
  void arc(
    float x,
    float y,
    float radius,
    float startAngle,
    float endAngle,
    int anticlockwise);


  /**
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   * @param x2 Mandatory float parameter.
   * @param y2 Mandatory float parameter.
   * @param radius Mandatory float parameter.
   */

  @DISPID(1027) //= 0x403. The runtime will prefer the VTID if present
  @VTID(46)
  void arcTo(
    float x1,
    float y1,
    float x2,
    float y2,
    float radius);


  /**
   */

  @DISPID(1028) //= 0x404. The runtime will prefer the VTID if present
  @VTID(47)
  void beginPath();


  /**
   * @param cp1x Mandatory float parameter.
   * @param cp1y Mandatory float parameter.
   * @param cp2x Mandatory float parameter.
   * @param cp2y Mandatory float parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1029) //= 0x405. The runtime will prefer the VTID if present
  @VTID(48)
  void bezierCurveTo(
    float cp1x,
    float cp1y,
    float cp2x,
    float cp2y,
    float x,
    float y);


  /**
   */

  @DISPID(1030) //= 0x406. The runtime will prefer the VTID if present
  @VTID(49)
  void clip();


  /**
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(50)
  void closePath();


  /**
   */

  @DISPID(1032) //= 0x408. The runtime will prefer the VTID if present
  @VTID(51)
  void fill();


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1033) //= 0x409. The runtime will prefer the VTID if present
  @VTID(52)
  void lineTo(
    float x,
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1034) //= 0x40a. The runtime will prefer the VTID if present
  @VTID(53)
  void moveTo(
    float x,
    float y);


  /**
   * @param cpx Mandatory float parameter.
   * @param cpy Mandatory float parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1035) //= 0x40b. The runtime will prefer the VTID if present
  @VTID(54)
  void quadraticCurveTo(
    float cpx,
    float cpy,
    float x,
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param w Mandatory float parameter.
   * @param h Mandatory float parameter.
   */

  @DISPID(1036) //= 0x40c. The runtime will prefer the VTID if present
  @VTID(55)
  void rect(
    float x,
    float y,
    float w,
    float h);


  /**
   */

  @DISPID(1037) //= 0x40d. The runtime will prefer the VTID if present
  @VTID(56)
  void stroke();


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1038) //= 0x40e. The runtime will prefer the VTID if present
  @VTID(57)
  boolean isPointInPath(
    float x,
    float y);


  /**
   * <p>
   * Setter method for the COM property "font"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1039) //= 0x40f. The runtime will prefer the VTID if present
  @VTID(58)
  void font(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "font"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1039) //= 0x40f. The runtime will prefer the VTID if present
  @VTID(59)
  java.lang.String font();


  /**
   * <p>
   * Setter method for the COM property "textAlign"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1040) //= 0x410. The runtime will prefer the VTID if present
  @VTID(60)
  void textAlign(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textAlign"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1040) //= 0x410. The runtime will prefer the VTID if present
  @VTID(61)
  java.lang.String textAlign();


  /**
   * <p>
   * Setter method for the COM property "textBaseline"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1041) //= 0x411. The runtime will prefer the VTID if present
  @VTID(62)
  void textBaseline(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textBaseline"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1041) //= 0x411. The runtime will prefer the VTID if present
  @VTID(63)
  java.lang.String textBaseline();


  /**
   * @param text Mandatory java.lang.String parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param maxWidth Mandatory java.lang.Object parameter.
   */

  @DISPID(1042) //= 0x412. The runtime will prefer the VTID if present
  @VTID(64)
  void fillText(
    java.lang.String text,
    float x,
    float y,
    @MarshalAs(NativeType.VARIANT) java.lang.Object maxWidth);


  /**
   * @param text Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.ICanvasTextMetrics
   */

  @DISPID(1043) //= 0x413. The runtime will prefer the VTID if present
  @VTID(65)
  ms.html.ICanvasTextMetrics measureText(
    java.lang.String text);


  /**
   * @param text Mandatory java.lang.String parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param maxWidth Mandatory java.lang.Object parameter.
   */

  @DISPID(1044) //= 0x414. The runtime will prefer the VTID if present
  @VTID(66)
  void strokeText(
    java.lang.String text,
    float x,
    float y,
    @MarshalAs(NativeType.VARIANT) java.lang.Object maxWidth);


  /**
   * @param pSrc Mandatory com4j.Com4jObject parameter.
   * @param a1 Mandatory java.lang.Object parameter.
   * @param a2 Mandatory java.lang.Object parameter.
   * @param a3 Mandatory java.lang.Object parameter.
   * @param a4 Mandatory java.lang.Object parameter.
   * @param a5 Mandatory java.lang.Object parameter.
   * @param a6 Mandatory java.lang.Object parameter.
   * @param a7 Mandatory java.lang.Object parameter.
   * @param a8 Mandatory java.lang.Object parameter.
   */

  @DISPID(1045) //= 0x415. The runtime will prefer the VTID if present
  @VTID(67)
  void drawImage(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pSrc,
    @MarshalAs(NativeType.VARIANT) java.lang.Object a1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object a2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object a3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object a4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object a5,
    @MarshalAs(NativeType.VARIANT) java.lang.Object a6,
    @MarshalAs(NativeType.VARIANT) java.lang.Object a7,
    @MarshalAs(NativeType.VARIANT) java.lang.Object a8);


  /**
   * @param a1 Mandatory java.lang.Object parameter.
   * @param a2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ms.html.ICanvasImageData
   */

  @DISPID(1046) //= 0x416. The runtime will prefer the VTID if present
  @VTID(68)
  ms.html.ICanvasImageData createImageData(
    @MarshalAs(NativeType.VARIANT) java.lang.Object a1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object a2);


  /**
   * @param sx Mandatory float parameter.
   * @param sy Mandatory float parameter.
   * @param sw Mandatory float parameter.
   * @param sh Mandatory float parameter.
   * @return  Returns a value of type ms.html.ICanvasImageData
   */

  @DISPID(1047) //= 0x417. The runtime will prefer the VTID if present
  @VTID(69)
  ms.html.ICanvasImageData getImageData(
    float sx,
    float sy,
    float sw,
    float sh);


  /**
   * @param imagedata Mandatory ms.html.ICanvasImageData parameter.
   * @param dx Mandatory float parameter.
   * @param dy Mandatory float parameter.
   * @param dirtyX Mandatory java.lang.Object parameter.
   * @param dirtyY Mandatory java.lang.Object parameter.
   * @param dirtyWidth Mandatory java.lang.Object parameter.
   * @param dirtyHeight Mandatory java.lang.Object parameter.
   */

  @DISPID(1048) //= 0x418. The runtime will prefer the VTID if present
  @VTID(70)
  void putImageData(
    ms.html.ICanvasImageData imagedata,
    float dx,
    float dy,
    @MarshalAs(NativeType.VARIANT) java.lang.Object dirtyX,
    @MarshalAs(NativeType.VARIANT) java.lang.Object dirtyY,
    @MarshalAs(NativeType.VARIANT) java.lang.Object dirtyWidth,
    @MarshalAs(NativeType.VARIANT) java.lang.Object dirtyHeight);


  // Properties:
}
