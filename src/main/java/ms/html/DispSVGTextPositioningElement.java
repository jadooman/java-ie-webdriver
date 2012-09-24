package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispSVGTextPositioningElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "x"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedLengthList parameter.
   */

  @DISPID(1071)
  @PropPut
  void x(
    ms.html.ISVGAnimatedLengthList rhs);


  /**
   * <p>
   * Getter method for the COM property "x"
   * </p>
   */

  @DISPID(1071)
  @PropGet
  ms.html.ISVGAnimatedLengthList x();


  /**
   * <p>
   * Setter method for the COM property "y"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedLengthList parameter.
   */

  @DISPID(1073)
  @PropPut
  void y(
    ms.html.ISVGAnimatedLengthList rhs);


  /**
   * <p>
   * Getter method for the COM property "y"
   * </p>
   */

  @DISPID(1073)
  @PropGet
  ms.html.ISVGAnimatedLengthList y();


  /**
   * <p>
   * Setter method for the COM property "dx"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedLengthList parameter.
   */

  @DISPID(1075)
  @PropPut
  void dx(
    ms.html.ISVGAnimatedLengthList rhs);


  /**
   * <p>
   * Getter method for the COM property "dx"
   * </p>
   */

  @DISPID(1075)
  @PropGet
  ms.html.ISVGAnimatedLengthList dx();


  /**
   * <p>
   * Setter method for the COM property "dy"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedLengthList parameter.
   */

  @DISPID(1077)
  @PropPut
  void dy(
    ms.html.ISVGAnimatedLengthList rhs);


  /**
   * <p>
   * Getter method for the COM property "dy"
   * </p>
   */

  @DISPID(1077)
  @PropGet
  ms.html.ISVGAnimatedLengthList dy();


  /**
   * <p>
   * Setter method for the COM property "rotate"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedNumberList parameter.
   */

  @DISPID(1079)
  @PropPut
  void rotate(
    ms.html.ISVGAnimatedNumberList rhs);


  /**
   * <p>
   * Getter method for the COM property "rotate"
   * </p>
   */

  @DISPID(1079)
  @PropGet
  ms.html.ISVGAnimatedNumberList rotate();


  /**
   * <p>
   * Setter method for the COM property "textLength"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedLength parameter.
   */

  @DISPID(1053)
  @PropPut
  void textLength(
    ms.html.ISVGAnimatedLength rhs);


  /**
   * <p>
   * Getter method for the COM property "textLength"
   * </p>
   */

  @DISPID(1053)
  @PropGet
  ms.html.ISVGAnimatedLength textLength();


  /**
   * <p>
   * Setter method for the COM property "lengthAdjust"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedEnumeration parameter.
   */

  @DISPID(1051)
  @PropPut
  void lengthAdjust(
    ms.html.ISVGAnimatedEnumeration rhs);


  /**
   * <p>
   * Getter method for the COM property "lengthAdjust"
   * </p>
   */

  @DISPID(1051)
  @PropGet
  ms.html.ISVGAnimatedEnumeration lengthAdjust();


  /**
   */

  @DISPID(1054)
  int getNumberOfChars();


  /**
   */

  @DISPID(1055)
  float getComputedTextLength();


  /**
   * @param charnum Mandatory int parameter.
   * @param nchars Mandatory int parameter.
   */

  @DISPID(1056)
  float getSubStringLength(
    int charnum,
    int nchars);


  /**
   * @param charnum Mandatory int parameter.
   */

  @DISPID(1057)
  ms.html.ISVGPoint getStartPositionOfChar(
    int charnum);


  /**
   * @param charnum Mandatory int parameter.
   */

  @DISPID(1058)
  ms.html.ISVGPoint getEndPositionOfChar(
    int charnum);


  /**
   * @param charnum Mandatory int parameter.
   */

  @DISPID(1059)
  ms.html.ISVGRect getExtentOfChar(
    int charnum);


  /**
   * @param charnum Mandatory int parameter.
   */

  @DISPID(1060)
  float getRotationOfChar(
    int charnum);


  /**
   * @param point Mandatory ms.html.ISVGPoint parameter.
   */

  @DISPID(1061)
  int getCharNumAtPosition(
    ms.html.ISVGPoint point);


  /**
   * @param charnum Mandatory int parameter.
   * @param nchars Mandatory int parameter.
   */

  @DISPID(1062)
  void selectSubString(
    int charnum,
    int nchars);


  /**
   * <p>
   * Setter method for the COM property "xmlbase"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1032)
  @PropPut
  void xmlbase(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "xmlbase"
   * </p>
   */

  @DISPID(1032)
  @PropGet
  java.lang.String xmlbase();


  /**
   * <p>
   * Setter method for the COM property "ownerSVGElement"
   * </p>
   * @param rhs Mandatory ms.html.ISVGSVGElement parameter.
   */

  @DISPID(1033)
  @PropPut
  void ownerSVGElement(
    ms.html.ISVGSVGElement rhs);


  /**
   * <p>
   * Getter method for the COM property "ownerSVGElement"
   * </p>
   */

  @DISPID(1033)
  @PropGet
  ms.html.ISVGSVGElement ownerSVGElement();


  /**
   * <p>
   * Setter method for the COM property "viewportElement"
   * </p>
   * @param rhs Mandatory ms.html.ISVGElement parameter.
   */

  @DISPID(1034)
  @PropPut
  void viewportElement(
    ms.html.ISVGElement rhs);


  /**
   * <p>
   * Getter method for the COM property "viewportElement"
   * </p>
   */

  @DISPID(1034)
  @PropGet
  ms.html.ISVGElement viewportElement();


  /**
   * <p>
   * Setter method for the COM property "focusable"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedEnumeration parameter.
   */

  @DISPID(1036)
  @PropPut
  void focusable(
    ms.html.ISVGAnimatedEnumeration rhs);


  /**
   * <p>
   * Getter method for the COM property "focusable"
   * </p>
   */

  @DISPID(1036)
  @PropGet
  ms.html.ISVGAnimatedEnumeration focusable();


  /**
   * <p>
   * Getter method for the COM property "requiredFeatures"
   * </p>
   */

  @DISPID(1011)
  @PropGet
  ms.html.ISVGStringList requiredFeatures();


  /**
   * <p>
   * Getter method for the COM property "requiredExtensions"
   * </p>
   */

  @DISPID(1013)
  @PropGet
  ms.html.ISVGStringList requiredExtensions();


  /**
   * <p>
   * Getter method for the COM property "systemLanguage"
   * </p>
   */

  @DISPID(1015)
  @PropGet
  ms.html.ISVGStringList systemLanguage();


  /**
   * @param extension Mandatory java.lang.String parameter.
   */

  @DISPID(1016)
  boolean hasExtension(
    java.lang.String extension);


  /**
   * <p>
   * Setter method for the COM property "xmllang"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1017)
  @PropPut
  void xmllang(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "xmllang"
   * </p>
   */

  @DISPID(1017)
  @PropGet
  java.lang.String xmllang();


  /**
   * <p>
   * Setter method for the COM property "xmlspace"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1018)
  @PropPut
  void xmlspace(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "xmlspace"
   * </p>
   */

  @DISPID(1018)
  @PropGet
  java.lang.String xmlspace();


  /**
   * <p>
   * Getter method for the COM property "externalResourcesRequired"
   * </p>
   */

  @DISPID(1020)
  @PropGet
  ms.html.ISVGAnimatedBoolean externalResourcesRequired();


  /**
   * <p>
   * Getter method for the COM property "className"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  ms.html.ISVGAnimatedString className();


  // Properties:
}
