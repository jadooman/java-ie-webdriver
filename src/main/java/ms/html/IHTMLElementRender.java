package ms.html  ;

import com4j.*;

@IID("{3050F669-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLElementRender extends Com4jObject {
  // Methods:
  /**
   * @param hdc Mandatory int parameter.
   */

  @VTID(3)
  void drawToDC(
    int hdc);


  /**
   * @param bstrPrinterName Mandatory java.lang.String parameter.
   * @param hdc Mandatory int parameter.
   */

  @VTID(4)
  void setDocumentPrinter(
    java.lang.String bstrPrinterName,
    int hdc);


  // Properties:
}
