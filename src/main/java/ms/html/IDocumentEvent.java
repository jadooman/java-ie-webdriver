package ms.html  ;

import com4j.*;

@IID("{305104BC-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDocumentEvent extends Com4jObject {
  // Methods:
  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IDOMEvent
   */

  @DISPID(1108) //= 0x454. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IDOMEvent createEvent(
    java.lang.String eventType);


  // Properties:
}
