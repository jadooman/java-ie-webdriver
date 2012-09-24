package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispXMLSerializer extends Com4jObject {
  // Methods:
  /**
   * @param pNode Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(1000)
  java.lang.String serializeToString(
    ms.html.IHTMLDOMNode pNode);


  // Properties:
}
