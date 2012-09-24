package ms.html  ;

import com4j.*;

@IID("{3050F204-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLBaseElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "href"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(7)
  void href(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "href"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String href();


  /**
   * <p>
   * Setter method for the COM property "target"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(9)
  void target(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "target"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String target();


  // Properties:
}
