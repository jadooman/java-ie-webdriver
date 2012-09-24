package ms.html  ;

import com4j.*;

@IID("{305104BE-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IRulesAppliedCollection extends Com4jObject {
  // Methods:
  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.IRulesApplied
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  ms.html.IRulesApplied item(
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
   * <p>
   * Getter method for the COM property "element"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLElement element();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IRulesApplied
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IRulesApplied propertyInheritedFrom(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "propertyCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  int propertyCount();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String property(
    int index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.IRulesApplied
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.IRulesApplied propertyInheritedTrace(
    java.lang.String name,
    int index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(14)
  int propertyInheritedTraceLength(
    java.lang.String name);


  // Properties:
}
