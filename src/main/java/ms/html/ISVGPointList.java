package ms.html  ;

import com4j.*;

@IID("{305104F5-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGPointList extends Com4jObject {
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
   * @param pNewItem Mandatory ms.html.ISVGPoint parameter.
   * @return  Returns a value of type ms.html.ISVGPoint
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.ISVGPoint initialize(
    ms.html.ISVGPoint pNewItem);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGPoint
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.ISVGPoint getItem(
    int index);


  /**
   * @param pNewItem Mandatory ms.html.ISVGPoint parameter.
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGPoint
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.ISVGPoint insertItemBefore(
    ms.html.ISVGPoint pNewItem,
    int index);


  /**
   * @param pNewItem Mandatory ms.html.ISVGPoint parameter.
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGPoint
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.ISVGPoint replaceItem(
    ms.html.ISVGPoint pNewItem,
    int index);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGPoint
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.ISVGPoint removeItem(
    int index);


  /**
   * @param pNewItem Mandatory ms.html.ISVGPoint parameter.
   * @return  Returns a value of type ms.html.ISVGPoint
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(15)
  ms.html.ISVGPoint appendItem(
    ms.html.ISVGPoint pNewItem);


  // Properties:
}
