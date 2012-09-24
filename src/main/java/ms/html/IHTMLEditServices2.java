package ms.html  ;

import com4j.*;

@IID("{3050F812-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLEditServices2 extends ms.html.IHTMLEditServices {
  // Methods:
  /**
   * @param pIStartAnchor Mandatory ms.html.IDisplayPointer parameter.
   */

  @VTID(9)
  void moveToSelectionAnchorEx(
    ms.html.IDisplayPointer pIStartAnchor);


  /**
   * @param pIEndAnchor Mandatory ms.html.IDisplayPointer parameter.
   */

  @VTID(10)
  void moveToSelectionEndEx(
    ms.html.IDisplayPointer pIEndAnchor);


  /**
   * @param fReCompute Mandatory int parameter.
   */

  @VTID(11)
  void freezeVirtualCaretPos(
    int fReCompute);


  /**
   * @param fReset Mandatory int parameter.
   */

  @VTID(12)
  void unFreezeVirtualCaretPos(
    int fReset);


  // Properties:
}
