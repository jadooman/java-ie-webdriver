package ms.html  ;

import com4j.*;

@IID("{3050F662-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLEditDesigner extends Com4jObject {
  // Methods:
  /**
   * @param inEvtDispId Mandatory int parameter.
   * @param pIEventObj Mandatory ms.html.IHTMLEventObj parameter.
   */

  @VTID(3)
  void preHandleEvent(
    int inEvtDispId,
    ms.html.IHTMLEventObj pIEventObj);


  /**
   * @param inEvtDispId Mandatory int parameter.
   * @param pIEventObj Mandatory ms.html.IHTMLEventObj parameter.
   */

  @VTID(4)
  void postHandleEvent(
    int inEvtDispId,
    ms.html.IHTMLEventObj pIEventObj);


  /**
   * @param inEvtDispId Mandatory int parameter.
   * @param pIEventObj Mandatory ms.html.IHTMLEventObj parameter.
   */

  @VTID(5)
  void translateAccelerator(
    int inEvtDispId,
    ms.html.IHTMLEventObj pIEventObj);


  /**
   * @param inEvtDispId Mandatory int parameter.
   * @param pIEventObj Mandatory ms.html.IHTMLEventObj parameter.
   */

  @VTID(6)
  void postEditorEventNotify(
    int inEvtDispId,
    ms.html.IHTMLEventObj pIEventObj);


  // Properties:
}
