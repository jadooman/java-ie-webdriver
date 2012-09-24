package ms.html  ;

import com4j.*;

@IID("{3050F5C7-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTableSection2 extends Com4jObject {
  // Methods:
  /**
   * @param indexFrom Optional parameter. Default value is -1
   * @param indexTo Optional parameter. Default value is -1
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject moveRow(
    @Optional @DefaultValue("-1") int indexFrom,
    @Optional @DefaultValue("-1") int indexTo);


  // Properties:
}
