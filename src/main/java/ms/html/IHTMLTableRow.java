package ms.html  ;

import com4j.*;

@IID("{3050F23C-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTableRow extends Com4jObject {
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
   * Setter method for the COM property "borderColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413084) //= 0x800113a4. The runtime will prefer the VTID if present
  @VTID(13)
  void borderColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413084) //= 0x800113a4. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderColor();


  /**
   * <p>
   * Setter method for the COM property "borderColorLight"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413083) //= 0x800113a5. The runtime will prefer the VTID if present
  @VTID(15)
  void borderColorLight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderColorLight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413083) //= 0x800113a5. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderColorLight();


  /**
   * <p>
   * Setter method for the COM property "borderColorDark"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413082) //= 0x800113a6. The runtime will prefer the VTID if present
  @VTID(17)
  void borderColorDark(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderColorDark"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413082) //= 0x800113a6. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderColorDark();


  /**
   * <p>
   * Getter method for the COM property "rowIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(19)
  int rowIndex();


  /**
   * <p>
   * Getter method for the COM property "sectionRowIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(20)
  int sectionRowIndex();


  /**
   * <p>
   * Getter method for the COM property "cells"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(21)
  ms.html.IHTMLElementCollection cells();


  @VTID(21)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject cells(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param index Optional parameter. Default value is -1
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject insertCell(
    @Optional @DefaultValue("-1") int index);


  /**
   * @param index Optional parameter. Default value is -1
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(23)
  void deleteCell(
    @Optional @DefaultValue("-1") int index);


  // Properties:
}
