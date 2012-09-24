package ms.html  ;

import com4j.*;

@IID("{305104C0-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStyleSheetRulesAppliedCollection extends Com4jObject {
  // Methods:
  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.IHTMLStyleSheetRule
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  ms.html.IHTMLStyleSheetRule item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int length();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLStyleSheetRule
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLStyleSheetRule propertyAppliedBy(
    java.lang.String name);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.IHTMLStyleSheetRule
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLStyleSheetRule propertyAppliedTrace(
    java.lang.String name,
    int index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(11)
  int propertyAppliedTraceLength(
    java.lang.String name);


  // Properties:
}
