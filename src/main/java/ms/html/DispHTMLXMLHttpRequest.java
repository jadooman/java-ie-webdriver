package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLXMLHttpRequest extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  int readyState();


  /**
   * <p>
   * Getter method for the COM property "responseBody"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  java.lang.Object responseBody();


  /**
   * <p>
   * Getter method for the COM property "responseText"
   * </p>
   */

  @DISPID(1004)
  @PropGet
  java.lang.String responseText();


  /**
   * <p>
   * Getter method for the COM property "responseXML"
   * </p>
   */

  @DISPID(1005)
  @PropGet
  com4j.Com4jObject responseXML();


  /**
   * <p>
   * Getter method for the COM property "status"
   * </p>
   */

  @DISPID(1006)
  @PropGet
  int status();


  /**
   * <p>
   * Getter method for the COM property "statusText"
   * </p>
   */

  @DISPID(1007)
  @PropGet
  java.lang.String statusText();


  /**
   * <p>
   * Setter method for the COM property "onreadystatechange"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412087)
  @PropPut
  void onreadystatechange(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onreadystatechange"
   * </p>
   */

  @DISPID(-2147412087)
  @PropGet
  java.lang.Object onreadystatechange();


  /**
   */

  @DISPID(1009)
  void abort();


  /**
   * @param bstrMethod Mandatory java.lang.String parameter.
   * @param bstrURL Mandatory java.lang.String parameter.
   * @param varAsync Mandatory java.lang.Object parameter.
   * @param varUser Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varPassword Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1010)
  void open(
    java.lang.String bstrMethod,
    java.lang.String bstrURL,
    java.lang.Object varAsync,
    @Optional java.lang.Object varUser,
    @Optional java.lang.Object varPassword);


  /**
   * @param varBody Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1011)
  void send(
    @Optional java.lang.Object varBody);


  /**
   */

  @DISPID(1012)
  java.lang.String getAllResponseHeaders();


  /**
   * @param bstrHeader Mandatory java.lang.String parameter.
   */

  @DISPID(1013)
  java.lang.String getResponseHeader(
    java.lang.String bstrHeader);


  /**
   * @param bstrHeader Mandatory java.lang.String parameter.
   * @param bstrValue Mandatory java.lang.String parameter.
   */

  @DISPID(1014)
  void setRequestHeader(
    java.lang.String bstrHeader,
    java.lang.String bstrValue);


  /**
   * <p>
   * Setter method for the COM property "timeout"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1015)
  @PropPut
  void timeout(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "timeout"
   * </p>
   */

  @DISPID(1015)
  @PropGet
  int timeout();


  /**
   * <p>
   * Setter method for the COM property "ontimeout"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412000)
  @PropPut
  void ontimeout(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ontimeout"
   * </p>
   */

  @DISPID(-2147412000)
  @PropGet
  java.lang.Object ontimeout();


  /**
   * <p>
   * Getter method for the COM property "constructor"
   * </p>
   */

  @DISPID(-2147417603)
  @PropGet
  com4j.Com4jObject constructor();


  /**
   * @param type Mandatory java.lang.String parameter.
   * @param listener Mandatory com4j.Com4jObject parameter.
   * @param useCapture Mandatory boolean parameter.
   */

  @DISPID(-2147417602)
  void addEventListener(
    java.lang.String type,
    com4j.Com4jObject listener,
    boolean useCapture);


  /**
   * @param type Mandatory java.lang.String parameter.
   * @param listener Mandatory com4j.Com4jObject parameter.
   * @param useCapture Mandatory boolean parameter.
   */

  @DISPID(-2147417601)
  void removeEventListener(
    java.lang.String type,
    com4j.Com4jObject listener,
    boolean useCapture);


  /**
   * @param evt Mandatory ms.html.IDOMEvent parameter.
   */

  @DISPID(-2147417600)
  boolean dispatchEvent(
    ms.html.IDOMEvent evt);


  // Properties:
}
