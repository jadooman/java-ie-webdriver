package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispRulesAppliedCollection extends Com4jObject {
  // Methods:
  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(0)
  @DefaultMethod
  ms.html.IRulesApplied item(
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
   * <p>
   * Getter method for the COM property "element"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  ms.html.IHTMLElement element();


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1003)
  ms.html.IRulesApplied propertyInheritedFrom(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "propertyCount"
   * </p>
   */

  @DISPID(1004)
  @PropGet
  int propertyCount();


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(1005)
  java.lang.String property(
    int index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param index Mandatory int parameter.
   */

  @DISPID(1006)
  ms.html.IRulesApplied propertyInheritedTrace(
    java.lang.String name,
    int index);


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1007)
  int propertyInheritedTraceLength(
    java.lang.String name);


  // Properties:
}
