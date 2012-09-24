package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispDOMParser extends Com4jObject {
  // Methods:
  /**
   * @param xmlSource Mandatory java.lang.String parameter.
   * @param mimeType Mandatory java.lang.String parameter.
   */

  @DISPID(1000)
  ms.html.IHTMLDocument2 parseFromString(
    java.lang.String xmlSource,
    java.lang.String mimeType);


  // Properties:
}
