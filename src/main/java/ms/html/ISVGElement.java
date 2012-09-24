package ms.html  ;

import com4j.*;

@IID("{305104C5-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "xmlbase"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1032) //= 0x408. The runtime will prefer the VTID if present
  @VTID(7)
  void xmlbase(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "xmlbase"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1032) //= 0x408. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String xmlbase();


  /**
   * <p>
   * Setter method for the COM property "ownerSVGElement"
   * </p>
   * @param p Mandatory ms.html.ISVGSVGElement parameter.
   */

  @DISPID(1033) //= 0x409. The runtime will prefer the VTID if present
  @VTID(9)
  void ownerSVGElement(
    ms.html.ISVGSVGElement p);


  /**
   * <p>
   * Getter method for the COM property "ownerSVGElement"
   * </p>
   * @return  Returns a value of type ms.html.ISVGSVGElement
   */

  @DISPID(1033) //= 0x409. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.ISVGSVGElement ownerSVGElement();


  /**
   * <p>
   * Setter method for the COM property "viewportElement"
   * </p>
   * @param p Mandatory ms.html.ISVGElement parameter.
   */

  @DISPID(1034) //= 0x40a. The runtime will prefer the VTID if present
  @VTID(11)
  void viewportElement(
    ms.html.ISVGElement p);


  /**
   * <p>
   * Getter method for the COM property "viewportElement"
   * </p>
   * @return  Returns a value of type ms.html.ISVGElement
   */

  @DISPID(1034) //= 0x40a. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.ISVGElement viewportElement();


  /**
   * <p>
   * Setter method for the COM property "focusable"
   * </p>
   * @param p Mandatory ms.html.ISVGAnimatedEnumeration parameter.
   */

  @DISPID(1036) //= 0x40c. The runtime will prefer the VTID if present
  @VTID(13)
  void focusable(
    ms.html.ISVGAnimatedEnumeration p);


  /**
   * <p>
   * Getter method for the COM property "focusable"
   * </p>
   * @return  Returns a value of type ms.html.ISVGAnimatedEnumeration
   */

  @DISPID(1036) //= 0x40c. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.ISVGAnimatedEnumeration focusable();


  // Properties:
}
