package ms.html  ;

import com4j.*;

@IID("{305106FA-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLAttributeCollection4 extends Com4jObject {
  // Methods:
  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute2
   */

  @DISPID(1155) //= 0x483. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLDOMAttribute2 getNamedItemNS(
    java.lang.Object pvarNS,
    java.lang.String bstrName);


  /**
   * @param pNodeIn Mandatory ms.html.IHTMLDOMAttribute2 parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute2
   */

  @DISPID(1156) //= 0x484. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLDOMAttribute2 setNamedItemNS(
    ms.html.IHTMLDOMAttribute2 pNodeIn);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute2
   */

  @DISPID(1157) //= 0x485. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLDOMAttribute2 removeNamedItemNS(
    java.lang.Object pvarNS,
    java.lang.String bstrName);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute2
   */

  @DISPID(1158) //= 0x486. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLDOMAttribute2 getNamedItem(
    java.lang.String bstrName);


  /**
   * @param pNodeIn Mandatory ms.html.IHTMLDOMAttribute2 parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute2
   */

  @DISPID(1159) //= 0x487. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.IHTMLDOMAttribute2 setNamedItem(
    ms.html.IHTMLDOMAttribute2 pNodeIn);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute2
   */

  @DISPID(1160) //= 0x488. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.IHTMLDOMAttribute2 removeNamedItem(
    java.lang.String bstrName);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute2
   */

  @DISPID(1161) //= 0x489. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.IHTMLDOMAttribute2 item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1162) //= 0x48a. The runtime will prefer the VTID if present
  @VTID(14)
  int length();


  // Properties:
}
