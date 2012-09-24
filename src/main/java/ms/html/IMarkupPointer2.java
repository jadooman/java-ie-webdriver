package ms.html  ;

import com4j.*;

@IID("{3050F675-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IMarkupPointer2 extends ms.html.IMarkupPointer {
  // Methods:
  /**
   * @return  Returns a value of type int
   */

  @VTID(24)
  int isAtWordBreak();


  /**
   * @return  Returns a value of type int
   */

  @VTID(25)
  int getMarkupPosition();


  /**
   * @param pContainer Mandatory ms.html.IMarkupContainer parameter.
   * @param lMP Mandatory int parameter.
   */

  @VTID(26)
  void moveToMarkupPosition(
    ms.html.IMarkupContainer pContainer,
    int lMP);


  /**
   * @param muAction Mandatory ms.html._MOVEUNIT_ACTION parameter.
   * @param pIBoundary Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(27)
  void moveUnitBounded(
    ms.html._MOVEUNIT_ACTION muAction,
    ms.html.IMarkupPointer pIBoundary);


  /**
   * @param pRight Mandatory ms.html.IMarkupPointer parameter.
   * @return  Returns a value of type int
   */

  @VTID(28)
  int isInsideURL(
    ms.html.IMarkupPointer pRight);


  /**
   * @param pIElement Mandatory ms.html.IHTMLElement parameter.
   * @param fAtStart Mandatory int parameter.
   */

  @VTID(29)
  void moveToContent(
    ms.html.IHTMLElement pIElement,
    int fAtStart);


  // Properties:
}
