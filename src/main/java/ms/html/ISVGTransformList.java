package ms.html  ;

import com4j.*;

@IID("{305104F8-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGTransformList extends Com4jObject {
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
   * @param newItem Mandatory ms.html.ISVGTransform parameter.
   * @return  Returns a value of type ms.html.ISVGTransform
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.ISVGTransform initialize(
    ms.html.ISVGTransform newItem);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGTransform
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.ISVGTransform getItem(
    int index);


  /**
   * @param newItem Mandatory ms.html.ISVGTransform parameter.
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGTransform
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.ISVGTransform insertItemBefore(
    ms.html.ISVGTransform newItem,
    int index);


  /**
   * @param newItem Mandatory ms.html.ISVGTransform parameter.
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGTransform
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.ISVGTransform replaceItem(
    ms.html.ISVGTransform newItem,
    int index);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGTransform
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.ISVGTransform removeItem(
    int index);


  /**
   * @param newItem Mandatory ms.html.ISVGTransform parameter.
   * @return  Returns a value of type ms.html.ISVGTransform
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(15)
  ms.html.ISVGTransform appendItem(
    ms.html.ISVGTransform newItem);


  /**
   * @param newItem Mandatory ms.html.ISVGMatrix parameter.
   * @return  Returns a value of type ms.html.ISVGTransform
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(16)
  ms.html.ISVGTransform createSVGTransformFromMatrix(
    ms.html.ISVGMatrix newItem);


  /**
   * @return  Returns a value of type ms.html.ISVGTransform
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(17)
  ms.html.ISVGTransform consolidate();


  // Properties:
}
