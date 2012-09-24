package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispSVGViewElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "viewTarget"
   * </p>
   * @param rhs Mandatory ms.html.ISVGStringList parameter.
   */

  @DISPID(1052)
  @PropPut
  void viewTarget(
    ms.html.ISVGStringList rhs);


  /**
   * <p>
   * Getter method for the COM property "viewTarget"
   * </p>
   */

  @DISPID(1052)
  @PropGet
  ms.html.ISVGStringList viewTarget();


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
   * Getter method for the COM property "externalResourcesRequired"
   * </p>
   */

  @DISPID(1020)
  @PropGet
  ms.html.ISVGAnimatedBoolean externalResourcesRequired();


  /**
   * <p>
   * Getter method for the COM property "viewBox"
   * </p>
   */

  @DISPID(1022)
  @PropGet
  ms.html.ISVGAnimatedRect viewBox();


  /**
   * <p>
   * Setter method for the COM property "preserveAspectRatio"
   * </p>
   * @param rhs Mandatory ms.html.ISVGAnimatedPreserveAspectRatio parameter.
   */

  @DISPID(1024)
  @PropPut
  void preserveAspectRatio(
    ms.html.ISVGAnimatedPreserveAspectRatio rhs);


  /**
   * <p>
   * Getter method for the COM property "preserveAspectRatio"
   * </p>
   */

  @DISPID(1024)
  @PropGet
  ms.html.ISVGAnimatedPreserveAspectRatio preserveAspectRatio();


  /**
   * <p>
   * Getter method for the COM property "zoomAndPan"
   * </p>
   */

  @DISPID(1025)
  @PropGet
  short zoomAndPan();


  // Properties:
}
