package ms.html  ;

import com4j.*;

@IID("{30510736-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IElementTraversal extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "firstElementChild"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(-2147416840) //= 0x800104f8. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLElement firstElementChild();


  /**
   * <p>
   * Getter method for the COM property "lastElementChild"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(-2147416839) //= 0x800104f9. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLElement lastElementChild();


  /**
   * <p>
   * Getter method for the COM property "previousElementSibling"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(-2147416838) //= 0x800104fa. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLElement previousElementSibling();


  /**
   * <p>
   * Getter method for the COM property "nextElementSibling"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(-2147416837) //= 0x800104fb. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLElement nextElementSibling();


  /**
   * <p>
   * Getter method for the COM property "childElementCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147416836) //= 0x800104fc. The runtime will prefer the VTID if present
  @VTID(11)
  int childElementCount();


  // Properties:
}
