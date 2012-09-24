package ms.html  ;

import com4j.*;

@IID("{3050F23B-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTableSection extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "align"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418040) //= 0x80010048. The runtime will prefer the VTID if present
  @VTID(7)
  void align(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "align"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418040) //= 0x80010048. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String align();


  /**
   * <p>
   * Setter method for the COM property "vAlign"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413081) //= 0x800113a7. The runtime will prefer the VTID if present
  @VTID(9)
  void vAlign(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "vAlign"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413081) //= 0x800113a7. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String vAlign();


  /**
   * <p>
   * Setter method for the COM property "bgColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(11)
  void bgColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "bgColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object bgColor();


  /**
   * <p>
   * Getter method for the COM property "rows"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.IHTMLElementCollection rows();


  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject rows(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param index Optional parameter. Default value is -1
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject insertRow(
    @Optional @DefaultValue("-1") int index);


  /**
   * @param index Optional parameter. Default value is -1
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(15)
  void deleteRow(
    @Optional @DefaultValue("-1") int index);


  // Properties:
}
