package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLPopup extends Com4jObject {
  // Methods:
  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param w Mandatory int parameter.
   * @param h Mandatory int parameter.
   * @param pElement Mandatory java.lang.Object parameter.
   */

  @DISPID(27001)
  void show(
    int x,
    int y,
    int w,
    int h,
    java.lang.Object pElement);


  /**
   */

  @DISPID(27002)
  void hide();


  /**
   * <p>
   * Getter method for the COM property "document"
   * </p>
   */

  @DISPID(27003)
  @PropGet
  ms.html.IHTMLDocument document();


  /**
   * <p>
   * Getter method for the COM property "isOpen"
   * </p>
   */

  @DISPID(27004)
  @PropGet
  boolean isOpen();


  /**
   * <p>
   * Getter method for the COM property "constructor"
   * </p>
   */

  @DISPID(-2147417603)
  @PropGet
  com4j.Com4jObject constructor();


  // Properties:
}
