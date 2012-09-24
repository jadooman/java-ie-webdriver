package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLNamespaceCollection extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   */

  @DISPID(1000)
  @PropGet
  int length();


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @DefaultMethod
  com4j.Com4jObject item(
    java.lang.Object index);


  /**
   * @param bstrNamespace Mandatory java.lang.String parameter.
   * @param bstrUrn Mandatory java.lang.String parameter.
   * @param implementationUrl Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1001)
  com4j.Com4jObject add(
    java.lang.String bstrNamespace,
    java.lang.String bstrUrn,
    @Optional java.lang.Object implementationUrl);


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
