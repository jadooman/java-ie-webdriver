package ms.html  ;

import com4j.*;

@IID("{305104D1-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGLengthList extends Com4jObject {
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
   * @param newItem Mandatory ms.html.ISVGLength parameter.
   * @return  Returns a value of type ms.html.ISVGLength
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.ISVGLength initialize(
    ms.html.ISVGLength newItem);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGLength
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.ISVGLength getItem(
    int index);


  /**
   * @param newItem Mandatory ms.html.ISVGLength parameter.
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGLength
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.ISVGLength insertItemBefore(
    ms.html.ISVGLength newItem,
    int index);


  /**
   * @param newItem Mandatory ms.html.ISVGLength parameter.
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGLength
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.ISVGLength replaceItem(
    ms.html.ISVGLength newItem,
    int index);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGLength
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.ISVGLength removeItem(
    int index);


  /**
   * @param newItem Mandatory ms.html.ISVGLength parameter.
   * @return  Returns a value of type ms.html.ISVGLength
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(15)
  ms.html.ISVGLength appendItem(
    ms.html.ISVGLength newItem);


  // Properties:
}
