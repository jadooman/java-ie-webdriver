package ms.html  ;

import com4j.*;

@IID("{3050F35C-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLScreen extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "colorDepth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  int colorDepth();


  /**
   * <p>
   * Setter method for the COM property "bufferDepth"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  void bufferDepth(
    int p);


  /**
   * <p>
   * Getter method for the COM property "bufferDepth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  int bufferDepth();


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  int width();


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  int height();


  /**
   * <p>
   * Setter method for the COM property "updateInterval"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  void updateInterval(
    int p);


  /**
   * <p>
   * Getter method for the COM property "updateInterval"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(13)
  int updateInterval();


  /**
   * <p>
   * Getter method for the COM property "availHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(14)
  int availHeight();


  /**
   * <p>
   * Getter method for the COM property "availWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(15)
  int availWidth();


  /**
   * <p>
   * Getter method for the COM property "fontSmoothingEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(16)
  boolean fontSmoothingEnabled();


  // Properties:
}
