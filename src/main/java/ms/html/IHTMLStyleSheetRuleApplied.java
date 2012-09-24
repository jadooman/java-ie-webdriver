package ms.html  ;

import com4j.*;

@IID("{305104C1-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStyleSheetRuleApplied extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "msSpecificity"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(7)
  int msSpecificity();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(8)
  int msGetSpecificity(
    int index);


  // Properties:
}
