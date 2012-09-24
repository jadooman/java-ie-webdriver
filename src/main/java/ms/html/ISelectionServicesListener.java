package ms.html  ;

import com4j.*;

@IID("{3050F699-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISelectionServicesListener extends Com4jObject {
  // Methods:
  /**
   */

  @VTID(3)
  void beginSelectionUndo();


  /**
   */

  @VTID(4)
  void endSelectionUndo();


  /**
   * @param pIElementStart Mandatory ms.html.IMarkupPointer parameter.
   * @param pIElementEnd Mandatory ms.html.IMarkupPointer parameter.
   * @param pIElementContentStart Mandatory ms.html.IMarkupPointer parameter.
   * @param pIElementContentEnd Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(5)
  void onSelectedElementExit(
    ms.html.IMarkupPointer pIElementStart,
    ms.html.IMarkupPointer pIElementEnd,
    ms.html.IMarkupPointer pIElementContentStart,
    ms.html.IMarkupPointer pIElementContentEnd);


  /**
   * @param eType Mandatory ms.html._SELECTION_TYPE parameter.
   * @param pIListener Mandatory ms.html.ISelectionServicesListener parameter.
   */

  @VTID(6)
  void onChangeType(
    ms.html._SELECTION_TYPE eType,
    ms.html.ISelectionServicesListener pIListener);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @VTID(7)
  java.lang.String getTypeDetail();


  // Properties:
}
