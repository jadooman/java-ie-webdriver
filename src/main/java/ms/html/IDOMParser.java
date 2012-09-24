package ms.html  ;

import com4j.*;

@IID("{30510781-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMParser extends Com4jObject {
  // Methods:
  /**
   * @param xmlSource Mandatory java.lang.String parameter.
   * @param mimeType Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDocument2
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLDocument2 parseFromString(
    java.lang.String xmlSource,
    java.lang.String mimeType);


  // Properties:
}
