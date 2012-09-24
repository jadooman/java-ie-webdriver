package ms.html  ;

import com4j.*;

@IID("{3050F648-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IMarkupContainer2 extends ms.html.IMarkupContainer {
  // Methods:
  /**
   * @param pChangeSink Mandatory ms.html.IHTMLChangeSink parameter.
   * @param fForward Mandatory int parameter.
   * @param fBackward Mandatory int parameter.
   * @return  Returns a value of type ms.html.IHTMLChangeLog
   */

  @VTID(4)
  @ReturnValue(index=1)
  ms.html.IHTMLChangeLog createChangeLog(
    ms.html.IHTMLChangeSink pChangeSink,
    int fForward,
    int fBackward);


  /**
   * @param pChangeSink Mandatory ms.html.IHTMLChangeSink parameter.
   * @return  Returns a value of type int
   */

  @VTID(5)
  int registerForDirtyRange(
    ms.html.IHTMLChangeSink pChangeSink);


  /**
   * @param dwCookie Mandatory int parameter.
   */

  @VTID(6)
  void unRegisterForDirtyRange(
    int dwCookie);


  /**
   * @param dwCookie Mandatory int parameter.
   * @param pIPointerBegin Mandatory ms.html.IMarkupPointer parameter.
   * @param pIPointerEnd Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(7)
  void getAndClearDirtyRange(
    int dwCookie,
    ms.html.IMarkupPointer pIPointerBegin,
    ms.html.IMarkupPointer pIPointerEnd);


  /**
   */

  @VTID(8)
  void getVersionNumber();


  /**
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @VTID(9)
  ms.html.IHTMLElement getMasterElement();


  // Properties:
}
