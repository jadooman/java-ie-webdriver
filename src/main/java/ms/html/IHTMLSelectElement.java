package ms.html  ;

import com4j.*;

@IID("{3050F244-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLSelectElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "size"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(7)
  void size(
    int p);


  /**
   * <p>
   * Getter method for the COM property "size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  int size();


  /**
   * <p>
   * Setter method for the COM property "multiple"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(9)
  void multiple(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "multiple"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  boolean multiple();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(11)
  void name(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "options"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject options();


  /**
   * <p>
   * Setter method for the COM property "onchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(14)
  void onchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onchange();


  /**
   * <p>
   * Setter method for the COM property "selectedIndex"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(16)
  void selectedIndex(
    int p);


  /**
   * <p>
   * Getter method for the COM property "selectedIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(17)
  int selectedIndex();


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String type();


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(19)
  void value(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "disabled"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(21)
  void disabled(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "disabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(22)
  boolean disabled();


  /**
   * <p>
   * Getter method for the COM property "form"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLFormElement
   */

  @DISPID(-2147416108) //= 0x800107d4. The runtime will prefer the VTID if present
  @VTID(23)
  ms.html.IHTMLFormElement form();


  @VTID(23)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLFormElement.class})
  com4j.Com4jObject form(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param element Mandatory ms.html.IHTMLElement parameter.
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1503) //= 0x5df. The runtime will prefer the VTID if present
  @VTID(24)
  void add(
    ms.html.IHTMLElement element,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before);


  /**
   * @param index Optional parameter. Default value is -1
   */

  @DISPID(1504) //= 0x5e0. The runtime will prefer the VTID if present
  @VTID(25)
  void remove(
    @Optional @DefaultValue("-1") int index);


  /**
   * <p>
   * Setter method for the COM property "length"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1500) //= 0x5dc. The runtime will prefer the VTID if present
  @VTID(26)
  void length(
    int p);


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1500) //= 0x5dc. The runtime will prefer the VTID if present
  @VTID(27)
  int length();


  /**
   * <p>
   * Getter method for the COM property "_newEnum"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(28)
  com4j.Com4jObject _newEnum();


  /**
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(29)
  @DefaultMethod
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject item(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param tagName Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1502) //= 0x5de. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject tags(
    @MarshalAs(NativeType.VARIANT) java.lang.Object tagName);


  // Properties:
}
