package ms.html  ;

import com4j.*;

@IID("{FECEAAA2-8405-11CF-8BA1-00AA00476DA6}")
public interface IOmHistory extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  short length();


  /**
   * @param pvargdistance Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void back(
    @Optional java.lang.Object pvargdistance);


  /**
   * @param pvargdistance Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void forward(
    @Optional java.lang.Object pvargdistance);


  /**
   * @param pvargdistance Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void go(
    @Optional java.lang.Object pvargdistance);


  // Properties:
}
