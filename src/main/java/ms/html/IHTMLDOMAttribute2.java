package ms.html  ;

import com4j.*;

@IID("{3050F810-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDOMAttribute2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(8)
  void value(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String value();


  /**
   * <p>
   * Getter method for the COM property "expando"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(10)
  boolean expando();


  /**
   * <p>
   * Getter method for the COM property "nodeType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(11)
  int nodeType();


  /**
   * <p>
   * Getter method for the COM property "parentNode"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.IHTMLDOMNode parentNode();


  /**
   * <p>
   * Getter method for the COM property "childNodes"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject childNodes();


  /**
   * <p>
   * Getter method for the COM property "firstChild"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.IHTMLDOMNode firstChild();


  /**
   * <p>
   * Getter method for the COM property "lastChild"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(15)
  ms.html.IHTMLDOMNode lastChild();


  /**
   * <p>
   * Getter method for the COM property "previousSibling"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(16)
  ms.html.IHTMLDOMNode previousSibling();


  /**
   * <p>
   * Getter method for the COM property "nextSibling"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(17)
  ms.html.IHTMLDOMNode nextSibling();


  /**
   * <p>
   * Getter method for the COM property "attributes"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject attributes();


  /**
   * <p>
   * Getter method for the COM property "ownerDocument"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject ownerDocument();


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param refChild Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(20)
  ms.html.IHTMLDOMNode insertBefore(
    ms.html.IHTMLDOMNode newChild,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object refChild);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(21)
  ms.html.IHTMLDOMNode replaceChild(
    ms.html.IHTMLDOMNode newChild,
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1017) //= 0x3f9. The runtime will prefer the VTID if present
  @VTID(22)
  ms.html.IHTMLDOMNode removeChild(
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1018) //= 0x3fa. The runtime will prefer the VTID if present
  @VTID(23)
  ms.html.IHTMLDOMNode appendChild(
    ms.html.IHTMLDOMNode newChild);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1019) //= 0x3fb. The runtime will prefer the VTID if present
  @VTID(24)
  boolean hasChildNodes();


  /**
   * @param fDeep Mandatory boolean parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMAttribute
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(25)
  ms.html.IHTMLDOMAttribute cloneNode(
    boolean fDeep);


  // Properties:
}
