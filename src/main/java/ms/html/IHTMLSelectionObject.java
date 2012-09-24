package ms.html  ;

import com4j.*;

@IID("{3050F25A-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLSelectionObject extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject createRange();


  /**
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  void empty();


  /**
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(9)
  void clear();


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String type();


  // Properties:
}
