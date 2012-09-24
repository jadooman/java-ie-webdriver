package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispCPlugins extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   */

  @DISPID(1)
  @PropGet
  int length();


  /**
   * @param reload Optional parameter. Default value is false
   */

  @DISPID(2)
  void refresh(
    @Optional @DefaultValue("0") boolean reload);


  /**
   * <p>
   * Getter method for the COM property "constructor"
   * </p>
   */

  @DISPID(-2147417603)
  @PropGet
  com4j.Com4jObject constructor();


  // Properties:
}
