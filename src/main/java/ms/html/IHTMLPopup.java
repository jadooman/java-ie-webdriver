package ms.html  ;

import com4j.*;

@IID("{3050F666-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLPopup extends Com4jObject {
  // Methods:
  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param w Mandatory int parameter.
   * @param h Mandatory int parameter.
   * @param pElement Mandatory java.lang.Object parameter.
   */

  @DISPID(27001) //= 0x6979. The runtime will prefer the VTID if present
  @VTID(7)
  void show(
    int x,
    int y,
    int w,
    int h,
    java.lang.Object pElement);


  /**
   */

  @DISPID(27002) //= 0x697a. The runtime will prefer the VTID if present
  @VTID(8)
  void hide();


  /**
   * <p>
   * Getter method for the COM property "document"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDocument
   */

  @DISPID(27003) //= 0x697b. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLDocument document();


  /**
   * <p>
   * Getter method for the COM property "isOpen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(27004) //= 0x697c. The runtime will prefer the VTID if present
  @VTID(10)
  boolean isOpen();


  // Properties:
}
