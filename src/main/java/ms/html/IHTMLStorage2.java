package ms.html  ;

import com4j.*;

@IID("{30510799-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStorage2 extends Com4jObject {
  // Methods:
  /**
   * @param bstrKey Mandatory java.lang.String parameter.
   * @param bstrValue Mandatory java.lang.String parameter.
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(7)
  void setItem(
    java.lang.String bstrKey,
    java.lang.String bstrValue);


  // Properties:
}
