package ms.html  ;

import com4j.*;

@IID("{3050F211-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLOptionElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "selected"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  void selected(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "selected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  boolean selected();


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  void value(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "defaultSelected"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(11)
  void defaultSelected(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "defaultSelected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(12)
  boolean defaultSelected();


  /**
   * <p>
   * Setter method for the COM property "index"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(13)
  void index(
    int p);


  /**
   * <p>
   * Getter method for the COM property "index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(14)
  int index();


  /**
   * <p>
   * Setter method for the COM property "text"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(15)
  void text(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String text();


  /**
   * <p>
   * Getter method for the COM property "form"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLFormElement
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(17)
  ms.html.IHTMLFormElement form();


  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLFormElement.class})
  com4j.Com4jObject form(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  // Properties:
}
