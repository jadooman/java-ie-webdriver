package ms.html  ;

import com4j.*;

@IID("{3050F38E-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLImageElementFactory extends Com4jObject {
  // Methods:
  /**
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type ms.html.IHTMLImgElement
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  ms.html.IHTMLImgElement create(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object width,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object height);


  // Properties:
}
