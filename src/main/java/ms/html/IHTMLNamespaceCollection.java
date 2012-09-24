package ms.html  ;

import com4j.*;

@IID("{3050F6B8-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLNamespaceCollection extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  int length();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param bstrNamespace Mandatory java.lang.String parameter.
   * @param bstrUrn Mandatory java.lang.String parameter.
   * @param implementationUrl Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject add(
    java.lang.String bstrNamespace,
    java.lang.String bstrUrn,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object implementationUrl);


  // Properties:
}
