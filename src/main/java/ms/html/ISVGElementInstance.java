package ms.html  ;

import com4j.*;

@IID("{305104EE-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGElementInstance extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "correspondingElement"
   * </p>
   * @return  Returns a value of type ms.html.ISVGElement
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.ISVGElement correspondingElement();


  /**
   * <p>
   * Getter method for the COM property "correspondingUseElement"
   * </p>
   * @return  Returns a value of type ms.html.ISVGUseElement
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.ISVGUseElement correspondingUseElement();


  /**
   * <p>
   * Getter method for the COM property "parentNode"
   * </p>
   * @return  Returns a value of type ms.html.ISVGElementInstance
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.ISVGElementInstance parentNode();


  /**
   * <p>
   * Getter method for the COM property "childNodes"
   * </p>
   * @return  Returns a value of type ms.html.ISVGElementInstanceList
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.ISVGElementInstanceList childNodes();


  /**
   * <p>
   * Getter method for the COM property "firstChild"
   * </p>
   * @return  Returns a value of type ms.html.ISVGElementInstance
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.ISVGElementInstance firstChild();


  /**
   * <p>
   * Getter method for the COM property "lastChild"
   * </p>
   * @return  Returns a value of type ms.html.ISVGElementInstance
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.ISVGElementInstance lastChild();


  /**
   * <p>
   * Getter method for the COM property "previousSibling"
   * </p>
   * @return  Returns a value of type ms.html.ISVGElementInstance
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.ISVGElementInstance previousSibling();


  /**
   * <p>
   * Getter method for the COM property "nextSibling"
   * </p>
   * @return  Returns a value of type ms.html.ISVGElementInstance
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.ISVGElementInstance nextSibling();


  // Properties:
}
