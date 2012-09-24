package ms.html  ;

import com4j.*;

@IID("{3051073C-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDOMImplementation2 extends Com4jObject {
  // Methods:
  /**
   * @param bstrQualifiedName Mandatory java.lang.String parameter.
   * @param pvarPublicId Mandatory java.lang.Object parameter.
   * @param pvarSystemId Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ms.html.IDOMDocumentType
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IDOMDocumentType createDocumentType(
    java.lang.String bstrQualifiedName,
    java.lang.Object pvarPublicId,
    java.lang.Object pvarSystemId);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param pvarTagName Mandatory java.lang.Object parameter.
   * @param pDocumentType Mandatory ms.html.IDOMDocumentType parameter.
   * @return  Returns a value of type ms.html.IHTMLDocument7
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLDocument7 createDocument(
    java.lang.Object pvarNS,
    java.lang.Object pvarTagName,
    ms.html.IDOMDocumentType pDocumentType);


  /**
   * @param bstrTitle Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDocument7
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLDocument7 createHTMLDocument(
    java.lang.String bstrTitle);


  /**
   * @param bstrfeature Mandatory java.lang.String parameter.
   * @param version Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(10)
  boolean hasFeature(
    java.lang.String bstrfeature,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object version);


  // Properties:
}
