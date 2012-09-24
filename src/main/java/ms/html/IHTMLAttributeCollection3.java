package ms.html  ;

import com4j.*;

@IID("{30510469-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLAttributeCollection3 extends Com4jObject {
  // Methods:
  /**
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(1150) //= 0x47e. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLDOMAttribute getNamedItem(
    java.lang.String bstrName);


  /**
   * @param pNodeIn Mandatory ms.html.IHTMLDOMAttribute parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(1151) //= 0x47f. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLDOMAttribute setNamedItem(
    ms.html.IHTMLDOMAttribute pNodeIn);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(1152) //= 0x480. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLDOMAttribute removeNamedItem(
    java.lang.String bstrName);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(1154) //= 0x482. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLDOMAttribute item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1153) //= 0x481. The runtime will prefer the VTID if present
  @VTID(11)
  int length();


  // Properties:
}
