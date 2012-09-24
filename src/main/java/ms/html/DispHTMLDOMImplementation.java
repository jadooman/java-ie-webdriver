package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLDOMImplementation extends Com4jObject {
  // Methods:
  /**
   * @param bstrfeature Mandatory java.lang.String parameter.
   * @param version Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1000)
  boolean hasFeature(
    java.lang.String bstrfeature,
    @Optional java.lang.Object version);


  /**
   * @param bstrQualifiedName Mandatory java.lang.String parameter.
   * @param pvarPublicId Mandatory java.lang.Object parameter.
   * @param pvarSystemId Mandatory java.lang.Object parameter.
   */

  @DISPID(1001)
  ms.html.IDOMDocumentType createDocumentType(
    java.lang.String bstrQualifiedName,
    java.lang.Object pvarPublicId,
    java.lang.Object pvarSystemId);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param pvarTagName Mandatory java.lang.Object parameter.
   * @param pDocumentType Mandatory ms.html.IDOMDocumentType parameter.
   */

  @DISPID(1002)
  ms.html.IHTMLDocument7 createDocument(
    java.lang.Object pvarNS,
    java.lang.Object pvarTagName,
    ms.html.IDOMDocumentType pDocumentType);


  /**
   * @param bstrTitle Mandatory java.lang.String parameter.
   */

  @DISPID(1003)
  ms.html.IHTMLDocument7 createHTMLDocument(
    java.lang.String bstrTitle);


  /**
   * @param bstrfeature Mandatory java.lang.String parameter.
   * @param version Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1004)
  boolean ie9_hasFeature(
    java.lang.String bstrfeature,
    @Optional java.lang.Object version);


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
