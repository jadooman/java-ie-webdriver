package ms.html  ;

import com4j.*;

@IID("{3050F4A6-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTextRangeMetrics2 extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type ms.html.IHTMLRectCollection
   */

  @DISPID(1041) //= 0x411. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLRectCollection getClientRects();


  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={ms.html.IHTMLRectCollection.class})
  java.lang.Object getClientRects(
    java.lang.Object pvarIndex);

  /**
   * @return  Returns a value of type ms.html.IHTMLRect
   */

  @DISPID(1042) //= 0x412. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLRect getBoundingClientRect();


  // Properties:
}
