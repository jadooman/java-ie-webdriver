package ms.html  ;

import com4j.*;

@IID("{3050F1F7-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLFormElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "action"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  void action(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "action"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String action();


  /**
   * <p>
   * Setter method for the COM property "dir"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412995) //= 0x800113fd. The runtime will prefer the VTID if present
  @VTID(9)
  void dir(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "dir"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412995) //= 0x800113fd. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String dir();


  /**
   * <p>
   * Setter method for the COM property "encoding"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(11)
  void encoding(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "encoding"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String encoding();


  /**
   * <p>
   * Setter method for the COM property "method"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(13)
  void method(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "method"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String method();


  /**
   * <p>
   * Getter method for the COM property "elements"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject elements();


  /**
   * <p>
   * Setter method for the COM property "target"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(16)
  void target(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "target"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String target();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(18)
  void name(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "onsubmit"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412101) //= 0x8001177b. The runtime will prefer the VTID if present
  @VTID(20)
  void onsubmit(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onsubmit"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412101) //= 0x8001177b. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onsubmit();


  /**
   * <p>
   * Setter method for the COM property "onreset"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412100) //= 0x8001177c. The runtime will prefer the VTID if present
  @VTID(22)
  void onreset(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onreset"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412100) //= 0x8001177c. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onreset();


  /**
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(24)
  void submit();


  /**
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(25)
  void reset();


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
