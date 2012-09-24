package ms.html  ;

import com4j.*;

@IID("{3050F23A-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTableCol extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "span"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  void span(
    int p);


  /**
   * <p>
   * Getter method for the COM property "span"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int span();


  /**
   * <p>
   * Setter method for the COM property "width"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(9)
  void width(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object width();


  /**
   * <p>
   * Setter method for the COM property "align"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418040) //= 0x80010048. The runtime will prefer the VTID if present
  @VTID(11)
  void align(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "align"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418040) //= 0x80010048. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String align();


  /**
   * <p>
   * Setter method for the COM property "vAlign"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413081) //= 0x800113a7. The runtime will prefer the VTID if present
  @VTID(13)
  void vAlign(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "vAlign"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413081) //= 0x800113a7. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String vAlign();


  // Properties:
}
