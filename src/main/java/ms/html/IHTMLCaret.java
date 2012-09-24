package ms.html  ;

import com4j.*;

@IID("{3050F604-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLCaret extends Com4jObject {
  // Methods:
  /**
   * @param pDispPointer Mandatory ms.html.IDisplayPointer parameter.
   * @param fScrollIntoView Mandatory int parameter.
   * @param eDir Mandatory ms.html._CARET_DIRECTION parameter.
   */

  @VTID(3)
  void moveCaretToPointer(
    ms.html.IDisplayPointer pDispPointer,
    int fScrollIntoView,
    ms.html._CARET_DIRECTION eDir);


  /**
   * @param pDispPointer Mandatory ms.html.IDisplayPointer parameter.
   * @param fVisible Mandatory int parameter.
   * @param fScrollIntoView Mandatory int parameter.
   * @param eDir Mandatory ms.html._CARET_DIRECTION parameter.
   */

  @VTID(4)
  void moveCaretToPointerEx(
    ms.html.IDisplayPointer pDispPointer,
    int fVisible,
    int fScrollIntoView,
    ms.html._CARET_DIRECTION eDir);


  /**
   * @param pIMarkupPointer Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(5)
  void moveMarkupPointerToCaret(
    ms.html.IMarkupPointer pIMarkupPointer);


  /**
   * @param pDispPointer Mandatory ms.html.IDisplayPointer parameter.
   */

  @VTID(6)
  void moveDisplayPointerToCaret(
    ms.html.IDisplayPointer pDispPointer);


  /**
   * @return  Returns a value of type int
   */

  @VTID(7)
  int isVisible();


  /**
   * @param fScrollIntoView Mandatory int parameter.
   */

  @VTID(8)
  void show(
    int fScrollIntoView);


  /**
   */

  @VTID(9)
  void hide();


  /**
   * @param pText Mandatory Holder<Short> parameter.
   * @param lLen Mandatory int parameter.
   */

  @VTID(10)
  void insertText(
    Holder<Short> pText,
    int lLen);


  /**
   */

  @VTID(11)
  void scrollIntoView();


  /**
   * @return  Returns a value of type ms.html._CARET_DIRECTION
   */

  @VTID(13)
  ms.html._CARET_DIRECTION getCaretDirection();


  /**
   * @param eDir Mandatory ms.html._CARET_DIRECTION parameter.
   */

  @VTID(14)
  void setCaretDirection(
    ms.html._CARET_DIRECTION eDir);


  // Properties:
}
