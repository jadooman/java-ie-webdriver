package ms.html  ;

import com4j.*;

@IID("{305106E4-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLCanvasElement extends Com4jObject {
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
   * @param contextId Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.ICanvasRenderingContext2D
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.ICanvasRenderingContext2D getContext(
    java.lang.String contextId);


  /**
   * @param type Mandatory java.lang.String parameter.
   * @param jpegquality Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String toDataURL(
    java.lang.String type,
    @MarshalAs(NativeType.VARIANT) java.lang.Object jpegquality);


  // Properties:
}
