package ms.html  ;

import com4j.*;

@IID("{3050F4B1-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDOMTextNode extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "data"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  void data(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "data"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String data();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String toString_();


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  int length();


  /**
   * @param offset Mandatory int parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.IHTMLDOMNode splitText(
    int offset);


  // Properties:
}
