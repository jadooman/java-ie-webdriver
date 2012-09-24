package ms.html  ;

import com4j.*;

@IID("{626FC520-A41E-11CF-A731-00A0C9082637}")
public interface IHTMLDocument extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Script"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject script();


  // Properties:
}
