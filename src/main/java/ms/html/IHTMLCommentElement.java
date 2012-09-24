package ms.html  ;

import com4j.*;

@IID("{3050F20C-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLCommentElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "text"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  void text(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "atomic"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  void atomic(
    int p);


  /**
   * <p>
   * Getter method for the COM property "atomic"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  int atomic();


  // Properties:
}
