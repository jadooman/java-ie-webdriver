package ms.html  ;

import com4j.*;

@IID("{30510463-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IElementSelector extends Com4jObject {
  // Methods:
  /**
   * @param v Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(-2147416998) //= 0x8001045a. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLElement querySelector(
    java.lang.String v);


  /**
   * @param v Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMChildrenCollection
   */

  @DISPID(-2147416997) //= 0x8001045b. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLDOMChildrenCollection querySelectorAll(
    java.lang.String v);


  // Properties:
}
