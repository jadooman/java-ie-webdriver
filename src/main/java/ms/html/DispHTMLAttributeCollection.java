package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLAttributeCollection extends Com4jObject {
  // Methods:
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
   */

  @DISPID(0)
  @DefaultMethod
  com4j.Com4jObject item(
    @Optional java.lang.Object name);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   */

  @DISPID(1501)
  ms.html.IHTMLDOMAttribute getNamedItem(
    java.lang.String bstrName);


  /**
   * @param ppNode Mandatory ms.html.IHTMLDOMAttribute parameter.
   */

  @DISPID(1502)
  ms.html.IHTMLDOMAttribute setNamedItem(
    ms.html.IHTMLDOMAttribute ppNode);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   */

  @DISPID(1503)
  ms.html.IHTMLDOMAttribute removeNamedItem(
    java.lang.String bstrName);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   */

  @DISPID(1150)
  ms.html.IHTMLDOMAttribute ie8_getNamedItem(
    java.lang.String bstrName);


  /**
   * @param pNodeIn Mandatory ms.html.IHTMLDOMAttribute parameter.
   */

  @DISPID(1151)
  ms.html.IHTMLDOMAttribute ie8_setNamedItem(
    ms.html.IHTMLDOMAttribute pNodeIn);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   */

  @DISPID(1152)
  ms.html.IHTMLDOMAttribute ie8_removeNamedItem(
    java.lang.String bstrName);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(1154)
  ms.html.IHTMLDOMAttribute ie8_item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "ie8_length"
   * </p>
   */

  @DISPID(1153)
  @PropGet
  int ie8_length();


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param bstrName Mandatory java.lang.String parameter.
   */

  @DISPID(1155)
  ms.html.IHTMLDOMAttribute2 getNamedItemNS(
    java.lang.Object pvarNS,
    java.lang.String bstrName);


  /**
   * @param pNodeIn Mandatory ms.html.IHTMLDOMAttribute2 parameter.
   */

  @DISPID(1156)
  ms.html.IHTMLDOMAttribute2 setNamedItemNS(
    ms.html.IHTMLDOMAttribute2 pNodeIn);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param bstrName Mandatory java.lang.String parameter.
   */

  @DISPID(1157)
  ms.html.IHTMLDOMAttribute2 removeNamedItemNS(
    java.lang.Object pvarNS,
    java.lang.String bstrName);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   */

  @DISPID(1158)
  ms.html.IHTMLDOMAttribute2 ie9_getNamedItem(
    java.lang.String bstrName);


  /**
   * @param pNodeIn Mandatory ms.html.IHTMLDOMAttribute2 parameter.
   */

  @DISPID(1159)
  ms.html.IHTMLDOMAttribute2 ie9_setNamedItem(
    ms.html.IHTMLDOMAttribute2 pNodeIn);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   */

  @DISPID(1160)
  ms.html.IHTMLDOMAttribute2 ie9_removeNamedItem(
    java.lang.String bstrName);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(1161)
  ms.html.IHTMLDOMAttribute2 ie9_item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "ie9_length"
   * </p>
   */

  @DISPID(1162)
  @PropGet
  int ie9_length();


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
