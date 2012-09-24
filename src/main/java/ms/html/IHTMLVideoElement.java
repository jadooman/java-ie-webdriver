package ms.html  ;

import com4j.*;

@IID("{30510709-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLVideoElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "width"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(7)
  void width(
    int p);


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(8)
  int width();


  /**
   * <p>
   * Setter method for the COM property "height"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(9)
  void height(
    int p);


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(10)
  int height();


  /**
   * <p>
   * Getter method for the COM property "videoWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1050) //= 0x41a. The runtime will prefer the VTID if present
  @VTID(11)
  int videoWidth();


  /**
   * <p>
   * Getter method for the COM property "videoHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1051) //= 0x41b. The runtime will prefer the VTID if present
  @VTID(12)
  int videoHeight();


  /**
   * <p>
   * Setter method for the COM property "poster"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1052) //= 0x41c. The runtime will prefer the VTID if present
  @VTID(13)
  void poster(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "poster"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1052) //= 0x41c. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String poster();


  // Properties:
}
