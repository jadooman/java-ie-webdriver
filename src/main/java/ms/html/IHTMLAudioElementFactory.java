package ms.html  ;

import com4j.*;

@IID("{305107EB-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLAudioElementFactory extends Com4jObject {
  // Methods:
  /**
   * @param src Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type ms.html.IHTMLAudioElement
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  ms.html.IHTMLAudioElement create(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object src);


  // Properties:
}
