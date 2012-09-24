package ms.html  ;

import com4j.*;

@IID("{305104EF-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGElementInstanceList extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  int length();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.ISVGElementInstance
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.ISVGElementInstance item(
    int index);


  // Properties:
}
