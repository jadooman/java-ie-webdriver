package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLNamespace extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   */

  @DISPID(1000)
  @PropGet
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "urn"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  java.lang.String urn();


  /**
   * <p>
   * Getter method for the COM property "tagNames"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  com4j.Com4jObject tagNames();


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   */

  @DISPID(-2147412996)
  @PropGet
  java.lang.Object readyState();


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
   * @param bstrImplementationUrl Mandatory java.lang.String parameter.
   */

  @DISPID(1003)
  void doImport(
    java.lang.String bstrImplementationUrl);


  /**
   * @param event Mandatory java.lang.String parameter.
   * @param pdisp Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147417605)
  boolean attachEvent(
    java.lang.String event,
    com4j.Com4jObject pdisp);


  /**
   * @param event Mandatory java.lang.String parameter.
   * @param pdisp Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147417604)
  void detachEvent(
    java.lang.String event,
    com4j.Com4jObject pdisp);


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
