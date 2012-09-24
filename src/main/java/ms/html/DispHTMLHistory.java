package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLHistory extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   */

  @DISPID(1)
  @PropGet
  short length();


  /**
   * @param pvargdistance Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2)
  void back(
    @Optional java.lang.Object pvargdistance);


  /**
   * @param pvargdistance Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3)
  void forward(
    @Optional java.lang.Object pvargdistance);


  /**
   * @param pvargdistance Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(4)
  void go(
    @Optional java.lang.Object pvargdistance);


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
