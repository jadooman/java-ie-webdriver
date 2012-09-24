package ms.html  ;

import com4j.*;

@IID("{3050F3D1-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStyleSheet2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "pages"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyleSheetPagesCollection
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLStyleSheetPagesCollection pages();


  @VTID(7)
  @ReturnValue(defaultPropertyThrough={ms.html.IHTMLStyleSheetPagesCollection.class})
  ms.html.IHTMLStyleSheetPage pages(
    int index);

  /**
   * @param bstrSelector Mandatory java.lang.String parameter.
   * @param bstrStyle Mandatory java.lang.String parameter.
   * @param lIndex Optional parameter. Default value is -1
   * @return  Returns a value of type int
   */

  @DISPID(1017) //= 0x3f9. The runtime will prefer the VTID if present
  @VTID(8)
  int addPageRule(
    java.lang.String bstrSelector,
    java.lang.String bstrStyle,
    @Optional @DefaultValue("-1") int lIndex);


  // Properties:
}
