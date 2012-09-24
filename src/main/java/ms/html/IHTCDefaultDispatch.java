package ms.html  ;

import com4j.*;

@IID("{3050F4FD-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTCDefaultDispatch extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "element"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(-2147412969) //= 0x80011417. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLElement element();


  /**
   * @return  Returns a value of type ms.html.IHTMLEventObj
   */

  @DISPID(-2147412968) //= 0x80011418. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLEventObj createEventObject();


  /**
   * <p>
   * Getter method for the COM property "defaults"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147412947) //= 0x8001142d. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject defaults();


  /**
   * <p>
   * Getter method for the COM property "document"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147412970) //= 0x80011416. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject document();


  // Properties:
}
