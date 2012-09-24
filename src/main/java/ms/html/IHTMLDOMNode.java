package ms.html  ;

import com4j.*;

@IID("{3050F5DA-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDOMNode extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "nodeType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147417066) //= 0x80010416. The runtime will prefer the VTID if present
  @VTID(7)
  int nodeType();


  /**
   * <p>
   * Getter method for the COM property "parentNode"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147417065) //= 0x80010417. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLDOMNode parentNode();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417064) //= 0x80010418. The runtime will prefer the VTID if present
  @VTID(9)
  boolean hasChildNodes();


  /**
   * <p>
   * Getter method for the COM property "childNodes"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147417063) //= 0x80010419. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject childNodes();


  /**
   * <p>
   * Getter method for the COM property "attributes"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147417062) //= 0x8001041a. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject attributes();


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param refChild Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147417061) //= 0x8001041b. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.IHTMLDOMNode insertBefore(
    ms.html.IHTMLDOMNode newChild,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object refChild);


  /**
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147417060) //= 0x8001041c. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.IHTMLDOMNode removeChild(
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147417059) //= 0x8001041d. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.IHTMLDOMNode replaceChild(
    ms.html.IHTMLDOMNode newChild,
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param fDeep Mandatory boolean parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147417051) //= 0x80010425. The runtime will prefer the VTID if present
  @VTID(15)
  ms.html.IHTMLDOMNode cloneNode(
    boolean fDeep);


  /**
   * @param fDeep Optional parameter. Default value is false
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147417046) //= 0x8001042a. The runtime will prefer the VTID if present
  @VTID(16)
  ms.html.IHTMLDOMNode removeNode(
    @Optional @DefaultValue("0") boolean fDeep);


  /**
   * @param otherNode Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147417044) //= 0x8001042c. The runtime will prefer the VTID if present
  @VTID(17)
  ms.html.IHTMLDOMNode swapNode(
    ms.html.IHTMLDOMNode otherNode);


  /**
   * @param replacement Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147417045) //= 0x8001042b. The runtime will prefer the VTID if present
  @VTID(18)
  ms.html.IHTMLDOMNode replaceNode(
    ms.html.IHTMLDOMNode replacement);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147417039) //= 0x80010431. The runtime will prefer the VTID if present
  @VTID(19)
  ms.html.IHTMLDOMNode appendChild(
    ms.html.IHTMLDOMNode newChild);


  /**
   * <p>
   * Getter method for the COM property "nodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417038) //= 0x80010432. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String nodeName();


  /**
   * <p>
   * Setter method for the COM property "nodeValue"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147417037) //= 0x80010433. The runtime will prefer the VTID if present
  @VTID(21)
  void nodeValue(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "nodeValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147417037) //= 0x80010433. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object nodeValue();


  /**
   * <p>
   * Getter method for the COM property "firstChild"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147417036) //= 0x80010434. The runtime will prefer the VTID if present
  @VTID(23)
  ms.html.IHTMLDOMNode firstChild();


  /**
   * <p>
   * Getter method for the COM property "lastChild"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147417035) //= 0x80010435. The runtime will prefer the VTID if present
  @VTID(24)
  ms.html.IHTMLDOMNode lastChild();


  /**
   * <p>
   * Getter method for the COM property "previousSibling"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147417034) //= 0x80010436. The runtime will prefer the VTID if present
  @VTID(25)
  ms.html.IHTMLDOMNode previousSibling();


  /**
   * <p>
   * Getter method for the COM property "nextSibling"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147417033) //= 0x80010437. The runtime will prefer the VTID if present
  @VTID(26)
  ms.html.IHTMLDOMNode nextSibling();


  // Properties:
}
