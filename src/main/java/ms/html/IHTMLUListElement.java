package ms.html  ;

import com4j.*;

@IID("{3050F1DD-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLUListElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "compact"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  void compact(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "compact"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  boolean compact();


  /**
   * <p>
   * Setter method for the COM property "type"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413095) //= 0x80011399. The runtime will prefer the VTID if present
  @VTID(9)
  void type(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413095) //= 0x80011399. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String type();


  // Properties:
}
