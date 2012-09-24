package ms.html  ;

import com4j.*;

@IID("{305104BF-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IRulesApplied extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "element"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLElement element();


  /**
   * <p>
   * Getter method for the COM property "inlineStyles"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyle
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLStyle inlineStyles();


  /**
   * <p>
   * Getter method for the COM property "appliedRules"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyleSheetRulesAppliedCollection
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLStyleSheetRulesAppliedCollection appliedRules();


  @VTID(9)
  @ReturnValue(defaultPropertyThrough={ms.html.IHTMLStyleSheetRulesAppliedCollection.class})
  ms.html.IHTMLStyleSheetRule appliedRules(
    int index);

  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(10)
  boolean propertyIsInline(
    java.lang.String name);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(11)
  boolean propertyIsInheritable(
    java.lang.String name);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(12)
  boolean hasInheritableProperty();


  // Properties:
}
