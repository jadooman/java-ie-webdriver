package ms.html  ;

import com4j.*;

@IID("{3050F80D-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDOMImplementation extends Com4jObject {
  // Methods:
  /**
   * @param bstrfeature Mandatory java.lang.String parameter.
   * @param version Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  boolean hasFeature(
    java.lang.String bstrfeature,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object version);


  // Properties:
}
