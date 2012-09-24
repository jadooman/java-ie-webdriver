package ms.html  ;

import com4j.*;

@IID("{305104B6-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLSelection extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "anchorNode"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLDOMNode anchorNode();


  /**
   * <p>
   * Getter method for the COM property "anchorOffset"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  int anchorOffset();


  /**
   * <p>
   * Getter method for the COM property "focusNode"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLDOMNode focusNode();


  /**
   * <p>
   * Getter method for the COM property "focusOffset"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(10)
  int focusOffset();


  /**
   * <p>
   * Getter method for the COM property "isCollapsed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(11)
  boolean isCollapsed();


  /**
   * @param parentNode Mandatory com4j.Com4jObject parameter.
   * @param offfset Mandatory int parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(12)
  void collapse(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject parentNode,
    int offfset);


  /**
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(13)
  void collapseToStart();


  /**
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(14)
  void collapseToEnd();


  /**
   * @param parentNode Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(15)
  void selectAllChildren(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject parentNode);


  /**
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(16)
  void deleteFromDocument();


  /**
   * <p>
   * Getter method for the COM property "rangeCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(17)
  int rangeCount();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMRange
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(18)
  ms.html.IHTMLDOMRange getRangeAt(
    int index);


  /**
   * @param range Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(19)
  void addRange(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject range);


  /**
   * @param range Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(20)
  void removeRange(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject range);


  /**
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(21)
  void removeAllRanges();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String toString_();


  // Properties:
}
