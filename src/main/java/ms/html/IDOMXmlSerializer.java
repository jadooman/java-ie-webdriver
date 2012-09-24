package ms.html  ;

import com4j.*;

@IID("{3051077D-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMXmlSerializer extends Com4jObject {
  // Methods:
  /**
   * @param pNode Mandatory ms.html.IHTMLDOMNode parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String serializeToString(
    ms.html.IHTMLDOMNode pNode);


  // Properties:
}
