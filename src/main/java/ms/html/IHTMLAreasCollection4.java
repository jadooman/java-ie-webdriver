package ms.html  ;

import com4j.*;

@IID("{30510492-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLAreasCollection4 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1150) //= 0x47e. The runtime will prefer the VTID if present
  @VTID(7)
  int length();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.IHTMLElement2
   */

  @DISPID(1152) //= 0x480. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLElement2 item(
    int index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElement2
   */

  @DISPID(1153) //= 0x481. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLElement2 namedItem(
    java.lang.String name);


  // Properties:
}
