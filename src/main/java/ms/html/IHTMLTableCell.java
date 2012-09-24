package ms.html  ;

import com4j.*;

@IID("{3050F23D-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTableCell extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "rowSpan"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  void rowSpan(
    int p);


  /**
   * <p>
   * Getter method for the COM property "rowSpan"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(8)
  int rowSpan();


  /**
   * <p>
   * Setter method for the COM property "colSpan"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(9)
  void colSpan(
    int p);


  /**
   * <p>
   * Getter method for the COM property "colSpan"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(10)
  int colSpan();


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


  /**
   * <p>
   * Setter method for the COM property "bgColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(15)
  void bgColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "bgColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object bgColor();


  /**
   * <p>
   * Setter method for the COM property "noWrap"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147413107) //= 0x8001138d. The runtime will prefer the VTID if present
  @VTID(17)
  void noWrap(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "noWrap"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147413107) //= 0x8001138d. The runtime will prefer the VTID if present
  @VTID(18)
  boolean noWrap();


  /**
   * <p>
   * Setter method for the COM property "background"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413111) //= 0x80011389. The runtime will prefer the VTID if present
  @VTID(19)
  void background(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "background"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413111) //= 0x80011389. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String background();


  /**
   * <p>
   * Setter method for the COM property "borderColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413084) //= 0x800113a4. The runtime will prefer the VTID if present
  @VTID(21)
  void borderColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413084) //= 0x800113a4. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderColor();


  /**
   * <p>
   * Setter method for the COM property "borderColorLight"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413083) //= 0x800113a5. The runtime will prefer the VTID if present
  @VTID(23)
  void borderColorLight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderColorLight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413083) //= 0x800113a5. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderColorLight();


  /**
   * <p>
   * Setter method for the COM property "borderColorDark"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413082) //= 0x800113a6. The runtime will prefer the VTID if present
  @VTID(25)
  void borderColorDark(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderColorDark"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413082) //= 0x800113a6. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderColorDark();


  /**
   * <p>
   * Setter method for the COM property "width"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(27)
  void width(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object width();


  /**
   * <p>
   * Setter method for the COM property "height"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(29)
  void height(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object height();


  /**
   * <p>
   * Getter method for the COM property "cellIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(31)
  int cellIndex();


  // Properties:
}
