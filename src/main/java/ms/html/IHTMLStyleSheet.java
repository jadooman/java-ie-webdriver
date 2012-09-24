package ms.html  ;

import com4j.*;

@IID("{3050F2E3-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStyleSheet extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "title"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  void title(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String title();


  /**
   * <p>
   * Getter method for the COM property "parentStyleSheet"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyleSheet
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLStyleSheet parentStyleSheet();


  /**
   * <p>
   * Getter method for the COM property "owningElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLElement owningElement();


  /**
   * <p>
   * Setter method for the COM property "disabled"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(11)
  void disabled(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "disabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(12)
  boolean disabled();


  /**
   * <p>
   * Getter method for the COM property "readOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(13)
  boolean readOnly();


  /**
   * <p>
   * Getter method for the COM property "imports"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyleSheetsCollection
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.IHTMLStyleSheetsCollection imports();


  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={ms.html.IHTMLStyleSheetsCollection.class})
  java.lang.Object imports(
    java.lang.Object pvarIndex);

  /**
   * <p>
   * Setter method for the COM property "href"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(15)
  void href(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "href"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String href();


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String type();


  /**
   * <p>
   * Getter method for the COM property "id"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String id();


  /**
   * @param bstrURL Mandatory java.lang.String parameter.
   * @param lIndex Optional parameter. Default value is -1
   * @return  Returns a value of type int
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(19)
  int addImport(
    java.lang.String bstrURL,
    @Optional @DefaultValue("-1") int lIndex);


  /**
   * @param bstrSelector Mandatory java.lang.String parameter.
   * @param bstrStyle Mandatory java.lang.String parameter.
   * @param lIndex Optional parameter. Default value is -1
   * @return  Returns a value of type int
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(20)
  int addRule(
    java.lang.String bstrSelector,
    java.lang.String bstrStyle,
    @Optional @DefaultValue("-1") int lIndex);


  /**
   * @param lIndex Mandatory int parameter.
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(21)
  void removeImport(
    int lIndex);


  /**
   * @param lIndex Mandatory int parameter.
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(22)
  void removeRule(
    int lIndex);


  /**
   * <p>
   * Setter method for the COM property "media"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(23)
  void media(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "media"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String media();


  /**
   * <p>
   * Setter method for the COM property "cssText"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(25)
  void cssText(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "cssText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String cssText();


  /**
   * <p>
   * Getter method for the COM property "rules"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyleSheetRulesCollection
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(27)
  ms.html.IHTMLStyleSheetRulesCollection rules();


  @VTID(27)
  @ReturnValue(defaultPropertyThrough={ms.html.IHTMLStyleSheetRulesCollection.class})
  ms.html.IHTMLStyleSheetRule rules(
    int index);

  // Properties:
}
