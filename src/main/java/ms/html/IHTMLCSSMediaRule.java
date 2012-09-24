package ms.html  ;

import com4j.*;

@IID("{305106EB-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLCSSMediaRule extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "media"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  void media(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "media"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object media();


  /**
   * <p>
   * Getter method for the COM property "cssRules"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyleSheetRulesCollection
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLStyleSheetRulesCollection cssRules();


  @VTID(9)
  @ReturnValue(defaultPropertyThrough={ms.html.IHTMLStyleSheetRulesCollection.class})
  ms.html.IHTMLStyleSheetRule cssRules(
    int index);

  /**
   * @param bstrRule Mandatory java.lang.String parameter.
   * @param lIndex Optional parameter. Default value is -1
   * @return  Returns a value of type int
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  int insertRule(
    java.lang.String bstrRule,
    @Optional @DefaultValue("-1") int lIndex);


  /**
   * @param lIndex Optional parameter. Default value is -1
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  void deleteRule(
    @Optional @DefaultValue("-1") int lIndex);


  // Properties:
}
