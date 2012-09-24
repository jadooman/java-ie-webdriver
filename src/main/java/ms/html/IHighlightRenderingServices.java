package ms.html  ;

import com4j.*;

@IID("{3050F606-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHighlightRenderingServices extends Com4jObject {
  // Methods:
  /**
   * @param pDispPointerStart Mandatory ms.html.IDisplayPointer parameter.
   * @param pDispPointerEnd Mandatory ms.html.IDisplayPointer parameter.
   * @param pIRenderStyle Mandatory ms.html.IHTMLRenderStyle parameter.
   * @return  Returns a value of type ms.html.IHighlightSegment
   */

  @VTID(3)
  ms.html.IHighlightSegment addSegment(
    ms.html.IDisplayPointer pDispPointerStart,
    ms.html.IDisplayPointer pDispPointerEnd,
    ms.html.IHTMLRenderStyle pIRenderStyle);


  /**
   * @param pISegment Mandatory ms.html.IHighlightSegment parameter.
   * @param pDispPointerStart Mandatory ms.html.IDisplayPointer parameter.
   * @param pDispPointerEnd Mandatory ms.html.IDisplayPointer parameter.
   */

  @VTID(4)
  void moveSegmentToPointers(
    ms.html.IHighlightSegment pISegment,
    ms.html.IDisplayPointer pDispPointerStart,
    ms.html.IDisplayPointer pDispPointerEnd);


  /**
   * @param pISegment Mandatory ms.html.IHighlightSegment parameter.
   */

  @VTID(5)
  void removeSegment(
    ms.html.IHighlightSegment pISegment);


  // Properties:
}
