package ms.html  ;

import com4j.*;

@IID("{3050F4B7-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLGenericElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "recordset"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject recordset();


  /**
   * @param dataMember Mandatory java.lang.String parameter.
   * @param hierarchy Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject namedRecordset(
    java.lang.String dataMember,
    @Optional java.lang.Object hierarchy);


  // Properties:
}
