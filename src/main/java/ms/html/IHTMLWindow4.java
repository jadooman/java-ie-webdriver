package ms.html  ;

import com4j.*;

@IID("{3050F6CF-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLWindow4 extends Com4jObject {
  // Methods:
  /**
   * @param varArgIn Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1180) //= 0x49c. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject createPopup(
    @Optional java.lang.Object varArgIn);


  /**
   * <p>
   * Getter method for the COM property "frameElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLFrameBase
   */

  @DISPID(1181) //= 0x49d. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLFrameBase frameElement();


  // Properties:
}
