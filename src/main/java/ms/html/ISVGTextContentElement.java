package ms.html  ;

import com4j.*;

@IID("{3051051A-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGTextContentElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "textLength"
   * </p>
   * @param p Mandatory ms.html.ISVGAnimatedLength parameter.
   */

  @DISPID(1053) //= 0x41d. The runtime will prefer the VTID if present
  @VTID(7)
  void textLength(
    ms.html.ISVGAnimatedLength p);


  /**
   * <p>
   * Getter method for the COM property "textLength"
   * </p>
   * @return  Returns a value of type ms.html.ISVGAnimatedLength
   */

  @DISPID(1053) //= 0x41d. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.ISVGAnimatedLength textLength();


  /**
   * <p>
   * Setter method for the COM property "lengthAdjust"
   * </p>
   * @param p Mandatory ms.html.ISVGAnimatedEnumeration parameter.
   */

  @DISPID(1051) //= 0x41b. The runtime will prefer the VTID if present
  @VTID(9)
  void lengthAdjust(
    ms.html.ISVGAnimatedEnumeration p);


  /**
   * <p>
   * Getter method for the COM property "lengthAdjust"
   * </p>
   * @return  Returns a value of type ms.html.ISVGAnimatedEnumeration
   */

  @DISPID(1051) //= 0x41b. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.ISVGAnimatedEnumeration lengthAdjust();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1054) //= 0x41e. The runtime will prefer the VTID if present
  @VTID(11)
  int getNumberOfChars();


  /**
   * @return  Returns a value of type float
   */

  @DISPID(1055) //= 0x41f. The runtime will prefer the VTID if present
  @VTID(12)
  float getComputedTextLength();


  /**
   * @param charnum Mandatory int parameter.
   * @param nchars Mandatory int parameter.
   * @return  Returns a value of type float
   */

  @DISPID(1056) //= 0x420. The runtime will prefer the VTID if present
  @VTID(13)
  float getSubStringLength(
    int charnum,
    int nchars);


  /**
   * @param charnum Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGPoint
   */

  @DISPID(1057) //= 0x421. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.ISVGPoint getStartPositionOfChar(
    int charnum);


  /**
   * @param charnum Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGPoint
   */

  @DISPID(1058) //= 0x422. The runtime will prefer the VTID if present
  @VTID(15)
  ms.html.ISVGPoint getEndPositionOfChar(
    int charnum);


  /**
   * @param charnum Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGRect
   */

  @DISPID(1059) //= 0x423. The runtime will prefer the VTID if present
  @VTID(16)
  ms.html.ISVGRect getExtentOfChar(
    int charnum);


  /**
   * @param charnum Mandatory int parameter.
   * @return  Returns a value of type float
   */

  @DISPID(1060) //= 0x424. The runtime will prefer the VTID if present
  @VTID(17)
  float getRotationOfChar(
    int charnum);


  /**
   * @param point Mandatory ms.html.ISVGPoint parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1061) //= 0x425. The runtime will prefer the VTID if present
  @VTID(18)
  int getCharNumAtPosition(
    ms.html.ISVGPoint point);


  /**
   * @param charnum Mandatory int parameter.
   * @param nchars Mandatory int parameter.
   */

  @DISPID(1062) //= 0x426. The runtime will prefer the VTID if present
  @VTID(19)
  void selectSubString(
    int charnum,
    int nchars);


  // Properties:
}
