package ms.html  ;

import com4j.*;

@IID("{30510748-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMTreeWalker extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "root"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject root();


  /**
   * <p>
   * Getter method for the COM property "whatToShow"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int whatToShow();


  /**
   * <p>
   * Getter method for the COM property "filter"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject filter();


  /**
   * <p>
   * Getter method for the COM property "expandEntityReferences"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  boolean expandEntityReferences();


  /**
   * <p>
   * Setter method for the COM property "currentNode"
   * </p>
   * @param p Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(11)
  void currentNode(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject p);


  /**
   * <p>
   * Getter method for the COM property "currentNode"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject currentNode();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1021) //= 0x3fd. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parentNode();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1022) //= 0x3fe. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject firstChild();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1023) //= 0x3ff. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject lastChild();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject previousSibling();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1025) //= 0x401. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject nextSibling();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1026) //= 0x402. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject previousNode();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1027) //= 0x403. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject nextNode();


  // Properties:
}
