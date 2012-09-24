package ms.html  ;

import com4j.*;

@IID("{3050F684-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISelectionServices extends Com4jObject {
  // Methods:
  /**
   * @param eType Mandatory ms.html._SELECTION_TYPE parameter.
   * @param pIListener Mandatory ms.html.ISelectionServicesListener parameter.
   */

  @VTID(3)
  void setSelectionType(
    ms.html._SELECTION_TYPE eType,
    ms.html.ISelectionServicesListener pIListener);


  /**
   * @return  Returns a value of type ms.html.IMarkupContainer
   */

  @VTID(4)
  ms.html.IMarkupContainer getMarkupContainer();


  /**
   * @param pIStart Mandatory ms.html.IMarkupPointer parameter.
   * @param pIEnd Mandatory ms.html.IMarkupPointer parameter.
   * @return  Returns a value of type ms.html.ISegment
   */

  @VTID(5)
  ms.html.ISegment addSegment(
    ms.html.IMarkupPointer pIStart,
    ms.html.IMarkupPointer pIEnd);


  /**
   * @param pIElement Mandatory ms.html.IHTMLElement parameter.
   * @return  Returns a value of type ms.html.IElementSegment
   */

  @VTID(6)
  ms.html.IElementSegment addElementSegment(
    ms.html.IHTMLElement pIElement);


  /**
   * @param pISegment Mandatory ms.html.ISegment parameter.
   */

  @VTID(7)
  void removeSegment(
    ms.html.ISegment pISegment);


  /**
   * @return  Returns a value of type ms.html.ISelectionServicesListener
   */

  @VTID(8)
  ms.html.ISelectionServicesListener getSelectionServicesListener();


  // Properties:
}
