package ms.html  ;

import com4j.*;

@IID("{305106F4-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStyleSheet4 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1153) //= 0x481. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String type();


  /**
   * <p>
   * Getter method for the COM property "href"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1154) //= 0x482. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object href();


  /**
   * <p>
   * Getter method for the COM property "title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1155) //= 0x483. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String title();


  /**
   * <p>
   * Getter method for the COM property "ownerNode"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1156) //= 0x484. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLElement ownerNode();


  /**
   * <p>
   * Getter method for the COM property "ownerRule"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLCSSRule
   */

  @DISPID(1157) //= 0x485. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.IHTMLCSSRule ownerRule();


  /**
   * <p>
   * Getter method for the COM property "cssRules"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyleSheetRulesCollection
   */

  @DISPID(1158) //= 0x486. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.IHTMLStyleSheetRulesCollection cssRules();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={ms.html.IHTMLStyleSheetRulesCollection.class})
  ms.html.IHTMLStyleSheetRule cssRules(
    int index);

  /**
   * <p>
   * Getter method for the COM property "media"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1159) //= 0x487. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object media();


  /**
   * @param bstrRule Mandatory java.lang.String parameter.
   * @param lIndex Optional parameter. Default value is -1
   * @return  Returns a value of type int
   */

  @DISPID(1160) //= 0x488. The runtime will prefer the VTID if present
  @VTID(14)
  int insertRule(
    java.lang.String bstrRule,
    @Optional @DefaultValue("-1") int lIndex);


  /**
   * @param lIndex Optional parameter. Default value is -1
   */

  @DISPID(1161) //= 0x489. The runtime will prefer the VTID if present
  @VTID(15)
  void deleteRule(
    @Optional @DefaultValue("-1") int lIndex);


  // Properties:
}
