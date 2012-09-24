package ms.html  ;

import com4j.*;

@IID("{305106E0-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDOMNode3 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "prefix"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416992) //= 0x80010460. The runtime will prefer the VTID if present
  @VTID(7)
  void prefix(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "prefix"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147416992) //= 0x80010460. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object prefix();


  /**
   * <p>
   * Getter method for the COM property "localName"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147416994) //= 0x8001045e. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object localName();


  /**
   * <p>
   * Getter method for the COM property "namespaceURI"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147416993) //= 0x8001045f. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object namespaceURI();


  /**
   * <p>
   * Setter method for the COM property "textContent"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416985) //= 0x80010467. The runtime will prefer the VTID if present
  @VTID(11)
  void textContent(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "textContent"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147416985) //= 0x80010467. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object textContent();


  /**
   * @param otherNode Mandatory ms.html.IHTMLDOMNode3 parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147416991) //= 0x80010461. The runtime will prefer the VTID if present
  @VTID(13)
  boolean isEqualNode(
    ms.html.IHTMLDOMNode3 otherNode);


  /**
   * @param pvarPrefix Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147416990) //= 0x80010462. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object lookupNamespaceURI(
    java.lang.Object pvarPrefix);


  /**
   * @param pvarNamespaceURI Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147416989) //= 0x80010463. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object lookupPrefix(
    java.lang.Object pvarNamespaceURI);


  /**
   * @param pvarNamespace Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147416988) //= 0x80010464. The runtime will prefer the VTID if present
  @VTID(16)
  boolean isDefaultNamespace(
    java.lang.Object pvarNamespace);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147416844) //= 0x800104f4. The runtime will prefer the VTID if present
  @VTID(17)
  ms.html.IHTMLDOMNode appendChild(
    ms.html.IHTMLDOMNode newChild);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param refChild Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147416843) //= 0x800104f5. The runtime will prefer the VTID if present
  @VTID(18)
  ms.html.IHTMLDOMNode insertBefore(
    ms.html.IHTMLDOMNode newChild,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object refChild);


  /**
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147416842) //= 0x800104f6. The runtime will prefer the VTID if present
  @VTID(19)
  ms.html.IHTMLDOMNode removeChild(
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(-2147416841) //= 0x800104f7. The runtime will prefer the VTID if present
  @VTID(20)
  ms.html.IHTMLDOMNode replaceChild(
    ms.html.IHTMLDOMNode newChild,
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param otherNode Mandatory ms.html.IHTMLDOMNode3 parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147416987) //= 0x80010465. The runtime will prefer the VTID if present
  @VTID(21)
  boolean isSameNode(
    ms.html.IHTMLDOMNode3 otherNode);


  /**
   * @param otherNode Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type short
   */

  @DISPID(-2147416986) //= 0x80010466. The runtime will prefer the VTID if present
  @VTID(22)
  short compareDocumentPosition(
    ms.html.IHTMLDOMNode otherNode);


  /**
   * @param feature Mandatory java.lang.String parameter.
   * @param version Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147416835) //= 0x800104fd. The runtime will prefer the VTID if present
  @VTID(23)
  boolean isSupported(
    java.lang.String feature,
    @MarshalAs(NativeType.VARIANT) java.lang.Object version);


  // Properties:
}
