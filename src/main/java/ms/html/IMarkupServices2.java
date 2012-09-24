package ms.html  ;

import com4j.*;

@IID("{3050F682-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IMarkupServices2 extends ms.html.IMarkupServices {
  // Methods:
    /**
     * @param pPointerStart Mandatory ms.html.IMarkupPointer parameter.
     * @param pPointerFinish Mandatory ms.html.IMarkupPointer parameter.
     * @param pPointerTarget Mandatory ms.html.IMarkupPointer parameter.
     * @param pPointerStatus Mandatory ms.html.IMarkupPointer parameter.
     * @param ppElemFailBottom Mandatory Holder<ms.html.IHTMLElement> parameter.
     * @param ppElemFailTop Mandatory Holder<ms.html.IHTMLElement> parameter.
     */

    @VTID(24)
    void validateElements(
      ms.html.IMarkupPointer pPointerStart,
      ms.html.IMarkupPointer pPointerFinish,
      ms.html.IMarkupPointer pPointerTarget,
      ms.html.IMarkupPointer pPointerStatus,
      Holder<ms.html.IHTMLElement> ppElemFailBottom,
      Holder<ms.html.IHTMLElement> ppElemFailTop);


    /**
     * @param pSegmentList Mandatory ms.html.ISegmentList parameter.
     * @param dwFlags Mandatory int parameter.
     */

    @VTID(25)
    void saveSegmentsToClipboard(
      ms.html.ISegmentList pSegmentList,
      int dwFlags);


    // Properties:
  }
