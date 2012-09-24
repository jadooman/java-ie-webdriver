package ms.html  ;

import com4j.*;

@IID("{305104DD-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGTests extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "requiredFeatures"
   * </p>
   * @return  Returns a value of type ms.html.ISVGStringList
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.ISVGStringList requiredFeatures();


  /**
   * <p>
   * Getter method for the COM property "requiredExtensions"
   * </p>
   * @return  Returns a value of type ms.html.ISVGStringList
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.ISVGStringList requiredExtensions();


  /**
   * <p>
   * Getter method for the COM property "systemLanguage"
   * </p>
   * @return  Returns a value of type ms.html.ISVGStringList
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.ISVGStringList systemLanguage();


  /**
   * @param extension Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(10)
  boolean hasExtension(
    java.lang.String extension);


  // Properties:
}
