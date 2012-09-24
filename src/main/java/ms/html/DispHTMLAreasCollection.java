package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLAreasCollection extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "length"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1500)
  @PropPut
  void length(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   */

  @DISPID(1500)
  @PropGet
  int length();


  /**
   * <p>
   * Getter method for the COM property "_newEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  com4j.Com4jObject _newEnum();


  /**
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(0)
  @DefaultMethod
  com4j.Com4jObject item(
    @Optional java.lang.Object name,
    @Optional java.lang.Object index);


  /**
   * @param tagName Mandatory java.lang.Object parameter.
   */

  @DISPID(1502)
  com4j.Com4jObject tags(
    java.lang.Object tagName);


  /**
   * @param element Mandatory ms.html.IHTMLElement parameter.
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1503)
  void add(
    ms.html.IHTMLElement element,
    @Optional java.lang.Object before);


  /**
   * @param index Optional parameter. Default value is -1
   */

  @DISPID(1504)
  void remove(
    @Optional @DefaultValue("-1") int index);


  /**
   * @param urn Mandatory java.lang.Object parameter.
   */

  @DISPID(1505)
  com4j.Com4jObject urns(
    java.lang.Object urn);


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1506)
  com4j.Com4jObject namedItem(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "ie8_length"
   * </p>
   */

  @DISPID(1150)
  @PropGet
  int ie8_length();


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(1152)
  ms.html.IHTMLElement2 ie8_item(
    int index);


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1153)
  ms.html.IHTMLElement2 ie8_namedItem(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "constructor"
   * </p>
   */

  @DISPID(-2147417603)
  @PropGet
  com4j.Com4jObject constructor();


  // Properties:
}
