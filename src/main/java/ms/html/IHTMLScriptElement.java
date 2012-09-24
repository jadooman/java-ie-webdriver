package ms.html  ;

import com4j.*;

@IID("{3050F28B-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLScriptElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "src"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  void src(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "src"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String src();


  /**
   * <p>
   * Setter method for the COM property "htmlFor"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(9)
  void htmlFor(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "htmlFor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String htmlFor();


  /**
   * <p>
   * Setter method for the COM property "event"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(11)
  void event(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "event"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String event();


  /**
   * <p>
   * Setter method for the COM property "text"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(13)
  void text(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "defer"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(15)
  void defer(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "defer"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(16)
  boolean defer();


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412996) //= 0x800113fc. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String readyState();


  /**
   * <p>
   * Setter method for the COM property "onerror"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(18)
  void onerror(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onerror"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onerror();


  /**
   * <p>
   * Setter method for the COM property "type"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(20)
  void type(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String type();


  // Properties:
}
