package ms.html  ;

import com4j.*;

@IID("{305104C2-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStyleEnabled extends Com4jObject {
  // Methods:
  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147413605) //= 0x8001119b. The runtime will prefer the VTID if present
  @VTID(7)
  boolean msGetPropertyEnabled(
    java.lang.String name);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param b Mandatory boolean parameter.
   */

  @DISPID(-2147413604) //= 0x8001119c. The runtime will prefer the VTID if present
  @VTID(8)
  void msPutPropertyEnabled(
    java.lang.String name,
    boolean b);


  // Properties:
}
