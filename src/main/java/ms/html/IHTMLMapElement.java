package ms.html  ;

import com4j.*;

@IID("{3050F266-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLMapElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "areas"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLAreasCollection
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLAreasCollection areas();


  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLAreasCollection.class})
  com4j.Com4jObject areas(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(8)
  void name(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String name();


  // Properties:
}
