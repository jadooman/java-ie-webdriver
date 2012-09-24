package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLScreen extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "colorDepth"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  int colorDepth();


  /**
   * <p>
   * Setter method for the COM property "bufferDepth"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1002)
  @PropPut
  void bufferDepth(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "bufferDepth"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  int bufferDepth();


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  int width();


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   */

  @DISPID(1004)
  @PropGet
  int height();


  /**
   * <p>
   * Setter method for the COM property "updateInterval"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1005)
  @PropPut
  void updateInterval(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "updateInterval"
   * </p>
   */

  @DISPID(1005)
  @PropGet
  int updateInterval();


  /**
   * <p>
   * Getter method for the COM property "availHeight"
   * </p>
   */

  @DISPID(1006)
  @PropGet
  int availHeight();


  /**
   * <p>
   * Getter method for the COM property "availWidth"
   * </p>
   */

  @DISPID(1007)
  @PropGet
  int availWidth();


  /**
   * <p>
   * Getter method for the COM property "fontSmoothingEnabled"
   * </p>
   */

  @DISPID(1008)
  @PropGet
  boolean fontSmoothingEnabled();


  /**
   * <p>
   * Getter method for the COM property "logicalXDPI"
   * </p>
   */

  @DISPID(1009)
  @PropGet
  int logicalXDPI();


  /**
   * <p>
   * Getter method for the COM property "logicalYDPI"
   * </p>
   */

  @DISPID(1010)
  @PropGet
  int logicalYDPI();


  /**
   * <p>
   * Getter method for the COM property "deviceXDPI"
   * </p>
   */

  @DISPID(1011)
  @PropGet
  int deviceXDPI();


  /**
   * <p>
   * Getter method for the COM property "deviceYDPI"
   * </p>
   */

  @DISPID(1012)
  @PropGet
  int deviceYDPI();


  /**
   * <p>
   * Getter method for the COM property "systemXDPI"
   * </p>
   */

  @DISPID(1013)
  @PropGet
  int systemXDPI();


  /**
   * <p>
   * Getter method for the COM property "systemYDPI"
   * </p>
   */

  @DISPID(1014)
  @PropGet
  int systemYDPI();


  /**
   * <p>
   * Getter method for the COM property "pixelDepth"
   * </p>
   */

  @DISPID(1015)
  @PropGet
  int pixelDepth();


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
