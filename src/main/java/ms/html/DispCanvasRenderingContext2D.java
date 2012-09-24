package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispCanvasRenderingContext2D extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "canvas"
   * </p>
   */

  @DISPID(1000)
  @PropGet
  ms.html.IHTMLCanvasElement canvas();


  /**
   */

  @DISPID(1001)
  void restore();


  /**
   */

  @DISPID(1002)
  void save();


  /**
   * @param angle Mandatory float parameter.
   */

  @DISPID(1003)
  void rotate(
    float angle);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1004)
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

  @DISPID(1005)
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

  @DISPID(1006)
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

  @DISPID(1007)
  void translate(
    float x,
    float y);


  /**
   * <p>
   * Setter method for the COM property "globalAlpha"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(1008)
  @PropPut
  void globalAlpha(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "globalAlpha"
   * </p>
   */

  @DISPID(1008)
  @PropGet
  float globalAlpha();


  /**
   * <p>
   * Setter method for the COM property "globalCompositeOperation"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1009)
  @PropPut
  void globalCompositeOperation(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "globalCompositeOperation"
   * </p>
   */

  @DISPID(1009)
  @PropGet
  java.lang.String globalCompositeOperation();


  /**
   * <p>
   * Setter method for the COM property "fillStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1010)
  @PropPut
  void fillStyle(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "fillStyle"
   * </p>
   */

  @DISPID(1010)
  @PropGet
  java.lang.Object fillStyle();


  /**
   * <p>
   * Setter method for the COM property "strokeStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1011)
  @PropPut
  void strokeStyle(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "strokeStyle"
   * </p>
   */

  @DISPID(1011)
  @PropGet
  java.lang.Object strokeStyle();


  /**
   * @param x0 Mandatory float parameter.
   * @param y0 Mandatory float parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   */

  @DISPID(1012)
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
   */

  @DISPID(1013)
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
   */

  @DISPID(1014)
  ms.html.ICanvasPattern createPattern(
    com4j.Com4jObject image,
    java.lang.Object repetition);


  /**
   * <p>
   * Setter method for the COM property "lineCap"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1015)
  @PropPut
  void lineCap(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "lineCap"
   * </p>
   */

  @DISPID(1015)
  @PropGet
  java.lang.String lineCap();


  /**
   * <p>
   * Setter method for the COM property "lineJoin"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1016)
  @PropPut
  void lineJoin(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "lineJoin"
   * </p>
   */

  @DISPID(1016)
  @PropGet
  java.lang.String lineJoin();


  /**
   * <p>
   * Setter method for the COM property "lineWidth"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(1017)
  @PropPut
  void lineWidth(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "lineWidth"
   * </p>
   */

  @DISPID(1017)
  @PropGet
  float lineWidth();


  /**
   * <p>
   * Setter method for the COM property "miterLimit"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(1018)
  @PropPut
  void miterLimit(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "miterLimit"
   * </p>
   */

  @DISPID(1018)
  @PropGet
  float miterLimit();


  /**
   * <p>
   * Setter method for the COM property "shadowBlur"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(1019)
  @PropPut
  void shadowBlur(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "shadowBlur"
   * </p>
   */

  @DISPID(1019)
  @PropGet
  float shadowBlur();


  /**
   * <p>
   * Setter method for the COM property "shadowColor"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1020)
  @PropPut
  void shadowColor(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "shadowColor"
   * </p>
   */

  @DISPID(1020)
  @PropGet
  java.lang.String shadowColor();


  /**
   * <p>
   * Setter method for the COM property "shadowOffsetX"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(1021)
  @PropPut
  void shadowOffsetX(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "shadowOffsetX"
   * </p>
   */

  @DISPID(1021)
  @PropGet
  float shadowOffsetX();


  /**
   * <p>
   * Setter method for the COM property "shadowOffsetY"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(1022)
  @PropPut
  void shadowOffsetY(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "shadowOffsetY"
   * </p>
   */

  @DISPID(1022)
  @PropGet
  float shadowOffsetY();


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param w Mandatory float parameter.
   * @param h Mandatory float parameter.
   */

  @DISPID(1023)
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

  @DISPID(1024)
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

  @DISPID(1025)
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

  @DISPID(1026)
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

  @DISPID(1027)
  void arcTo(
    float x1,
    float y1,
    float x2,
    float y2,
    float radius);


  /**
   */

  @DISPID(1028)
  void beginPath();


  /**
   * @param cp1x Mandatory float parameter.
   * @param cp1y Mandatory float parameter.
   * @param cp2x Mandatory float parameter.
   * @param cp2y Mandatory float parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1029)
  void bezierCurveTo(
    float cp1x,
    float cp1y,
    float cp2x,
    float cp2y,
    float x,
    float y);


  /**
   */

  @DISPID(1030)
  void clip();


  /**
   */

  @DISPID(1031)
  void closePath();


  /**
   */

  @DISPID(1032)
  void fill();


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1033)
  void lineTo(
    float x,
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1034)
  void moveTo(
    float x,
    float y);


  /**
   * @param cpx Mandatory float parameter.
   * @param cpy Mandatory float parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1035)
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

  @DISPID(1036)
  void rect(
    float x,
    float y,
    float w,
    float h);


  /**
   */

  @DISPID(1037)
  void stroke();


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(1038)
  boolean isPointInPath(
    float x,
    float y);


  /**
   * <p>
   * Setter method for the COM property "font"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1039)
  @PropPut
  void font(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "font"
   * </p>
   */

  @DISPID(1039)
  @PropGet
  java.lang.String font();


  /**
   * <p>
   * Setter method for the COM property "textAlign"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1040)
  @PropPut
  void textAlign(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "textAlign"
   * </p>
   */

  @DISPID(1040)
  @PropGet
  java.lang.String textAlign();


  /**
   * <p>
   * Setter method for the COM property "textBaseline"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1041)
  @PropPut
  void textBaseline(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "textBaseline"
   * </p>
   */

  @DISPID(1041)
  @PropGet
  java.lang.String textBaseline();


  /**
   * @param text Mandatory java.lang.String parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param maxWidth Mandatory java.lang.Object parameter.
   */

  @DISPID(1042)
  void fillText(
    java.lang.String text,
    float x,
    float y,
    java.lang.Object maxWidth);


  /**
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(1043)
  ms.html.ICanvasTextMetrics measureText(
    java.lang.String text);


  /**
   * @param text Mandatory java.lang.String parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   * @param maxWidth Mandatory java.lang.Object parameter.
   */

  @DISPID(1044)
  void strokeText(
    java.lang.String text,
    float x,
    float y,
    java.lang.Object maxWidth);


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

  @DISPID(1045)
  void drawImage(
    com4j.Com4jObject pSrc,
    java.lang.Object a1,
    java.lang.Object a2,
    java.lang.Object a3,
    java.lang.Object a4,
    java.lang.Object a5,
    java.lang.Object a6,
    java.lang.Object a7,
    java.lang.Object a8);


  /**
   * @param a1 Mandatory java.lang.Object parameter.
   * @param a2 Mandatory java.lang.Object parameter.
   */

  @DISPID(1046)
  ms.html.ICanvasImageData createImageData(
    java.lang.Object a1,
    java.lang.Object a2);


  /**
   * @param sx Mandatory float parameter.
   * @param sy Mandatory float parameter.
   * @param sw Mandatory float parameter.
   * @param sh Mandatory float parameter.
   */

  @DISPID(1047)
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

  @DISPID(1048)
  void putImageData(
    ms.html.ICanvasImageData imagedata,
    float dx,
    float dy,
    java.lang.Object dirtyX,
    java.lang.Object dirtyY,
    java.lang.Object dirtyWidth,
    java.lang.Object dirtyHeight);


  // Properties:
}
