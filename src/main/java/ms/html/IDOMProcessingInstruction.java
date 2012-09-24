package ms.html  ;

import com4j.*;

@IID("{30510742-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMProcessingInstruction extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "target"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String target();


  /**
   * <p>
   * Setter method for the COM property "data"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  void data(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "data"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String data();


  // Properties:
}
