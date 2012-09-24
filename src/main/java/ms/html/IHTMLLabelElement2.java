package ms.html  ;

import com4j.*;

@IID("{3050F832-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLLabelElement2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "form"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLFormElement
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLFormElement form();


  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLFormElement.class})
  com4j.Com4jObject form(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  // Properties:
}
