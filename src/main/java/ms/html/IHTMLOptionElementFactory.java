package ms.html  ;

import com4j.*;

@IID("{3050F38C-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLOptionElementFactory extends Com4jObject {
  // Methods:
  /**
   * @param text Optional parameter. Default value is com4j.Variant.getMissing()
   * @param value Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultSelected Optional parameter. Default value is com4j.Variant.getMissing()
   * @param selected Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type ms.html.IHTMLOptionElement
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  ms.html.IHTMLOptionElement create(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object value,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object defaultSelected,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object selected);


  // Properties:
}
