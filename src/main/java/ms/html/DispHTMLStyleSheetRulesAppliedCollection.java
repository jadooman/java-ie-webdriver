package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLStyleSheetRulesAppliedCollection extends Com4jObject {
  // Methods:
  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(0)
  @DefaultMethod
  ms.html.IHTMLStyleSheetRule item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  int length();


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1002)
  ms.html.IHTMLStyleSheetRule propertyAppliedBy(
    java.lang.String name);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param index Mandatory int parameter.
   */

  @DISPID(1004)
  ms.html.IHTMLStyleSheetRule propertyAppliedTrace(
    java.lang.String name,
    int index);


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1005)
  int propertyAppliedTraceLength(
    java.lang.String name);


  // Properties:
}
