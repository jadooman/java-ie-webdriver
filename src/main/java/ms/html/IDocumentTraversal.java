package ms.html  ;

import com4j.*;

@IID("{30510744-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDocumentTraversal extends Com4jObject {
  // Methods:
  /**
   * @param pRootNode Mandatory com4j.Com4jObject parameter.
   * @param ulWhatToShow Mandatory int parameter.
   * @param pFilter Mandatory java.lang.Object parameter.
   * @param fEntityReferenceExpansion Mandatory boolean parameter.
   * @return  Returns a value of type ms.html.IDOMNodeIterator
   */

  @DISPID(1121) //= 0x461. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IDOMNodeIterator createNodeIterator(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pRootNode,
    int ulWhatToShow,
    java.lang.Object pFilter,
    boolean fEntityReferenceExpansion);


  /**
   * @param pRootNode Mandatory com4j.Com4jObject parameter.
   * @param ulWhatToShow Mandatory int parameter.
   * @param pFilter Mandatory java.lang.Object parameter.
   * @param fEntityReferenceExpansion Mandatory boolean parameter.
   * @return  Returns a value of type ms.html.IDOMTreeWalker
   */

  @DISPID(1122) //= 0x462. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IDOMTreeWalker createTreeWalker(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pRootNode,
    int ulWhatToShow,
    java.lang.Object pFilter,
    boolean fEntityReferenceExpansion);


  // Properties:
}
