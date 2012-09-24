package ms.html  ;

import com4j.*;

@IID("{30510746-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMNodeIterator extends Com4jObject {
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
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject nextNode();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject previousNode();


  /**
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(13)
  void detach();


  // Properties:
}
