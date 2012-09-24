package ms.html  ;

import com4j.*;

@IID("{305106EA-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLCSSImportRule extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "href"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String href();


  /**
   * <p>
   * Setter method for the COM property "media"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  void media(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "media"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object media();


  /**
   * <p>
   * Getter method for the COM property "styleSheet"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyleSheet
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLStyleSheet styleSheet();


  // Properties:
}
