package ms.html  ;

import com4j.*;

@IID("{3050F29C-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLControlRange extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(7)
  void select();


  /**
   * @param item Mandatory ms.html.IHTMLControlElement parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(8)
  void add(
    ms.html.IHTMLControlElement item);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(9)
  void remove(
    int index);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  ms.html.IHTMLElement item(
    int index);


  /**
   * @param varargStart Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(11)
  void scrollIntoView(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varargStart);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(12)
  boolean queryCommandSupported(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(13)
  boolean queryCommandEnabled(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(14)
  boolean queryCommandState(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(15)
  boolean queryCommandIndeterm(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String queryCommandText(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object queryCommandValue(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @param showUI Optional parameter. Default value is false
   * @param value Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(18)
  boolean execCommand(
    java.lang.String cmdID,
    @Optional @DefaultValue("0") boolean showUI,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(19)
  boolean execCommandShowHelp(
    java.lang.String cmdID);


  /**
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(20)
  ms.html.IHTMLElement commonParentElement();


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(21)
  int length();


  // Properties:
}
