package ms.html  ;

import com4j.*;

@IID("{3050F683-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISegment extends Com4jObject {
  // Methods:
  /**
   * @param pIStart Mandatory ms.html.IMarkupPointer parameter.
   * @param pIEnd Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(3)
  void getPointers(
    ms.html.IMarkupPointer pIStart,
    ms.html.IMarkupPointer pIEnd);


  // Properties:
}
