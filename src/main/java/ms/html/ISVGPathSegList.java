package ms.html  ;

import com4j.*;

@IID("{30510510-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGPathSegList extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "numberOfItems"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  void numberOfItems(
    int p);


  /**
   * <p>
   * Getter method for the COM property "numberOfItems"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  int numberOfItems();


  /**
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  void clear();


  /**
   * @param newItem Mandatory ms.html.ISVGPathSeg parameter.
   * @return  Returns a value of type ms.html.ISVGPathSeg
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.ISVGPathSeg initialize(
    ms.html.ISVGPathSeg newItem);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGPathSeg
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.ISVGPathSeg getItem(
    int index);


  /**
   * @param newItem Mandatory ms.html.ISVGPathSeg parameter.
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGPathSeg
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.ISVGPathSeg insertItemBefore(
    ms.html.ISVGPathSeg newItem,
    int index);


  /**
   * @param newItem Mandatory ms.html.ISVGPathSeg parameter.
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGPathSeg
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.ISVGPathSeg replaceItem(
    ms.html.ISVGPathSeg newItem,
    int index);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGPathSeg
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.ISVGPathSeg removeItem(
    int index);


  /**
   * @param newItem Mandatory ms.html.ISVGPathSeg parameter.
   * @return  Returns a value of type ms.html.ISVGPathSeg
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(15)
  ms.html.ISVGPathSeg appendItem(
    ms.html.ISVGPathSeg newItem);


  // Properties:
}
