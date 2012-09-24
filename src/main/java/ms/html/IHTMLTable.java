package ms.html  ;

import com4j.*;

@IID("{3050F21E-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTable extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "cols"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  void cols(
    int p);


  /**
   * <p>
   * Getter method for the COM property "cols"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int cols();


  /**
   * <p>
   * Setter method for the COM property "border"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  void border(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "border"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object border();


  /**
   * <p>
   * Setter method for the COM property "frame"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  void frame(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "frame"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String frame();


  /**
   * <p>
   * Setter method for the COM property "rules"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(13)
  void rules(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "rules"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String rules();


  /**
   * <p>
   * Setter method for the COM property "cellSpacing"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(15)
  void cellSpacing(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "cellSpacing"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object cellSpacing();


  /**
   * <p>
   * Setter method for the COM property "cellPadding"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(17)
  void cellPadding(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "cellPadding"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object cellPadding();


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
   * Setter method for the COM property "bgColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(21)
  void bgColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "bgColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object bgColor();


  /**
   * <p>
   * Setter method for the COM property "borderColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413084) //= 0x800113a4. The runtime will prefer the VTID if present
  @VTID(23)
  void borderColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413084) //= 0x800113a4. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderColor();


  /**
   * <p>
   * Setter method for the COM property "borderColorLight"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413083) //= 0x800113a5. The runtime will prefer the VTID if present
  @VTID(25)
  void borderColorLight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderColorLight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413083) //= 0x800113a5. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderColorLight();


  /**
   * <p>
   * Setter method for the COM property "borderColorDark"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413082) //= 0x800113a6. The runtime will prefer the VTID if present
  @VTID(27)
  void borderColorDark(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "borderColorDark"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413082) //= 0x800113a6. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object borderColorDark();


  /**
   * <p>
   * Setter method for the COM property "align"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418039) //= 0x80010049. The runtime will prefer the VTID if present
  @VTID(29)
  void align(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "align"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418039) //= 0x80010049. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String align();


  /**
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(31)
  void refresh();


  /**
   * <p>
   * Getter method for the COM property "rows"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(32)
  ms.html.IHTMLElementCollection rows();


  @VTID(32)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject rows(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Setter method for the COM property "width"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(33)
  void width(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object width();


  /**
   * <p>
   * Setter method for the COM property "height"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(35)
  void height(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(36)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object height();


  /**
   * <p>
   * Setter method for the COM property "dataPageSize"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1017) //= 0x3f9. The runtime will prefer the VTID if present
  @VTID(37)
  void dataPageSize(
    int p);


  /**
   * <p>
   * Getter method for the COM property "dataPageSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1017) //= 0x3f9. The runtime will prefer the VTID if present
  @VTID(38)
  int dataPageSize();


  /**
   */

  @DISPID(1018) //= 0x3fa. The runtime will prefer the VTID if present
  @VTID(39)
  void nextPage();


  /**
   */

  @DISPID(1019) //= 0x3fb. The runtime will prefer the VTID if present
  @VTID(40)
  void previousPage();


  /**
   * <p>
   * Getter method for the COM property "tHead"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLTableSection
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(41)
  ms.html.IHTMLTableSection tHead();


  /**
   * <p>
   * Getter method for the COM property "tFoot"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLTableSection
   */

  @DISPID(1021) //= 0x3fd. The runtime will prefer the VTID if present
  @VTID(42)
  ms.html.IHTMLTableSection tFoot();


  /**
   * <p>
   * Getter method for the COM property "tBodies"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(43)
  ms.html.IHTMLElementCollection tBodies();


  @VTID(43)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject tBodies(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "caption"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLTableCaption
   */

  @DISPID(1025) //= 0x401. The runtime will prefer the VTID if present
  @VTID(44)
  ms.html.IHTMLTableCaption caption();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1026) //= 0x402. The runtime will prefer the VTID if present
  @VTID(45)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject createTHead();


  /**
   */

  @DISPID(1027) //= 0x403. The runtime will prefer the VTID if present
  @VTID(46)
  void deleteTHead();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1028) //= 0x404. The runtime will prefer the VTID if present
  @VTID(47)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject createTFoot();


  /**
   */

  @DISPID(1029) //= 0x405. The runtime will prefer the VTID if present
  @VTID(48)
  void deleteTFoot();


  /**
   * @return  Returns a value of type ms.html.IHTMLTableCaption
   */

  @DISPID(1030) //= 0x406. The runtime will prefer the VTID if present
  @VTID(49)
  ms.html.IHTMLTableCaption createCaption();


  /**
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(50)
  void deleteCaption();


  /**
   * @param index Optional parameter. Default value is -1
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1032) //= 0x408. The runtime will prefer the VTID if present
  @VTID(51)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject insertRow(
    @Optional @DefaultValue("-1") int index);


  /**
   * @param index Optional parameter. Default value is -1
   */

  @DISPID(1033) //= 0x409. The runtime will prefer the VTID if present
  @VTID(52)
  void deleteRow(
    @Optional @DefaultValue("-1") int index);


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412996) //= 0x800113fc. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String readyState();


  /**
   * <p>
   * Setter method for the COM property "onreadystatechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(54)
  void onreadystatechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onreadystatechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(55)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onreadystatechange();


  // Properties:
}
