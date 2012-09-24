package ms.html  ;

import com4j.*;

@IID("{3050F230-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTextContainer extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject createControlRange();


  /**
   * <p>
   * Getter method for the COM property "scrollHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  int scrollHeight();


  /**
   * <p>
   * Getter method for the COM property "scrollWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(9)
  int scrollWidth();


  /**
   * <p>
   * Setter method for the COM property "scrollTop"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(10)
  void scrollTop(
    int p);


  /**
   * <p>
   * Getter method for the COM property "scrollTop"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  int scrollTop();


  /**
   * <p>
   * Setter method for the COM property "scrollLeft"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  void scrollLeft(
    int p);


  /**
   * <p>
   * Getter method for the COM property "scrollLeft"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(13)
  int scrollLeft();


  /**
   * <p>
   * Setter method for the COM property "onscroll"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412081) //= 0x8001178f. The runtime will prefer the VTID if present
  @VTID(14)
  void onscroll(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onscroll"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412081) //= 0x8001178f. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onscroll();


  // Properties:
}
