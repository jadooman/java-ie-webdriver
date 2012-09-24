package ms.html  ;

import com4j.*;

@IID("{3050F80A-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLAttributeCollection2 extends Com4jObject {
  // Methods:
  /**
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(1501) //= 0x5dd. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLDOMAttribute getNamedItem(
    java.lang.String bstrName);


  /**
   * @param ppNode Mandatory ms.html.IHTMLDOMAttribute parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(1502) //= 0x5de. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLDOMAttribute setNamedItem(
    ms.html.IHTMLDOMAttribute ppNode);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(1503) //= 0x5df. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLDOMAttribute removeNamedItem(
    java.lang.String bstrName);


  // Properties:
}
