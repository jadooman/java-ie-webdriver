package ms.html  ;

import com4j.*;

@IID("{30510462-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDocumentSelector extends Com4jObject {
  // Methods:
  /**
   * @param v Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1105) //= 0x451. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLElement querySelector(
    java.lang.String v);


  /**
   * @param v Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMChildrenCollection
   */

  @DISPID(1106) //= 0x452. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLDOMChildrenCollection querySelectorAll(
    java.lang.String v);


  // Properties:
}
