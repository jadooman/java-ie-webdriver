package ms.html  ;

import com4j.*;

@IID("{3050F663-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLEditServices extends Com4jObject {
  // Methods:
  /**
   * @param pIDesigner Mandatory ms.html.IHTMLEditDesigner parameter.
   */

  @VTID(3)
  void addDesigner(
    ms.html.IHTMLEditDesigner pIDesigner);


  /**
   * @param pIDesigner Mandatory ms.html.IHTMLEditDesigner parameter.
   */

  @VTID(4)
  void removeDesigner(
    ms.html.IHTMLEditDesigner pIDesigner);


  /**
   * @param pIContainer Mandatory ms.html.IMarkupContainer parameter.
   * @return  Returns a value of type ms.html.ISelectionServices
   */

  @VTID(5)
  ms.html.ISelectionServices getSelectionServices(
    ms.html.IMarkupContainer pIContainer);


  /**
   * @param pIStartAnchor Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(6)
  void moveToSelectionAnchor(
    ms.html.IMarkupPointer pIStartAnchor);


  /**
   * @param pIEndAnchor Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(7)
  void moveToSelectionEnd(
    ms.html.IMarkupPointer pIEndAnchor);


  /**
   * @param pStart Mandatory ms.html.IMarkupPointer parameter.
   * @param pEnd Mandatory ms.html.IMarkupPointer parameter.
   * @param eType Mandatory ms.html._SELECTION_TYPE parameter.
   */

  @VTID(8)
  void selectRange(
    ms.html.IMarkupPointer pStart,
    ms.html.IMarkupPointer pEnd,
    ms.html._SELECTION_TYPE eType);


  // Properties:
}
