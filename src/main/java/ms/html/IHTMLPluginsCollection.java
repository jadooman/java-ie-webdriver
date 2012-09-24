package ms.html  ;

import com4j.*;

@IID("{3050F3FD-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLPluginsCollection extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int length();


  /**
   * @param reload Optional parameter. Default value is false
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void refresh(
    @Optional @DefaultValue("0") boolean reload);


  // Properties:
}
