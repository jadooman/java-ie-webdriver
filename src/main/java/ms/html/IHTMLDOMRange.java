package ms.html  ;

import com4j.*;

@IID("{305104AE-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDOMRange extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "startContainer"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLDOMNode startContainer();


  /**
   * <p>
   * Getter method for the COM property "startOffset"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  int startOffset();


  /**
   * <p>
   * Getter method for the COM property "endContainer"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLDOMNode endContainer();


  /**
   * <p>
   * Getter method for the COM property "endOffset"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(10)
  int endOffset();


  /**
   * <p>
   * Getter method for the COM property "collapsed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(11)
  boolean collapsed();


  /**
   * <p>
   * Getter method for the COM property "commonAncestorContainer"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.IHTMLDOMNode commonAncestorContainer();


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   * @param offset Mandatory int parameter.
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(13)
  void setStart(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject refNode,
    int offset);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   * @param offset Mandatory int parameter.
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(14)
  void setEnd(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject refNode,
    int offset);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(15)
  void setStartBefore(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject refNode);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(16)
  void setStartAfter(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject refNode);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(17)
  void setEndBefore(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject refNode);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(18)
  void setEndAfter(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject refNode);


  /**
   * @param toStart Mandatory boolean parameter.
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(19)
  void collapse(
    boolean toStart);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(20)
  void selectNode(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject refNode);


  /**
   * @param refNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(21)
  void selectNodeContents(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject refNode);


  /**
   * @param how Mandatory short parameter.
   * @param sourceRange Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(22)
  int compareBoundaryPoints(
    short how,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sourceRange);


  /**
   */

  @DISPID(1017) //= 0x3f9. The runtime will prefer the VTID if present
  @VTID(23)
  void deleteContents();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1018) //= 0x3fa. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject extractContents();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1019) //= 0x3fb. The runtime will prefer the VTID if present
  @VTID(25)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject cloneContents();


  /**
   * @param newNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(26)
  void insertNode(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject newNode);


  /**
   * @param newParent Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1021) //= 0x3fd. The runtime will prefer the VTID if present
  @VTID(27)
  void surroundContents(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject newParent);


  /**
   * @return  Returns a value of type ms.html.IHTMLDOMRange
   */

  @DISPID(1022) //= 0x3fe. The runtime will prefer the VTID if present
  @VTID(28)
  ms.html.IHTMLDOMRange cloneRange();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1023) //= 0x3ff. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String toString_();


  /**
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(30)
  void detach();


  /**
   * @return  Returns a value of type ms.html.IHTMLRectCollection
   */

  @DISPID(1025) //= 0x401. The runtime will prefer the VTID if present
  @VTID(31)
  ms.html.IHTMLRectCollection getClientRects();


  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={ms.html.IHTMLRectCollection.class})
  java.lang.Object getClientRects(
    java.lang.Object pvarIndex);

  /**
   * @return  Returns a value of type ms.html.IHTMLRect
   */

  @DISPID(1026) //= 0x402. The runtime will prefer the VTID if present
  @VTID(32)
  ms.html.IHTMLRect getBoundingClientRect();


  // Properties:
}
