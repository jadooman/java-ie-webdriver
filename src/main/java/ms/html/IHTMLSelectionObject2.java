package ms.html  ;

import com4j.*;

@IID("{3050F7EC-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLSelectionObject2 extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject createRangeCollection();


  /**
   * <p>
   * Getter method for the COM property "typeDetail"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String typeDetail();


  // Properties:
}
