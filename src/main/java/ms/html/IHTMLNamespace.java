package ms.html  ;

import com4j.*;

@IID("{3050F6BB-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLNamespace extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "urn"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String urn();


  /**
   * <p>
   * Getter method for the COM property "tagNames"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject tagNames();


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412996) //= 0x800113fc. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object readyState();


  /**
   * <p>
   * Setter method for the COM property "onreadystatechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(11)
  void onreadystatechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onreadystatechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onreadystatechange();


  /**
   * @param bstrImplementationUrl Mandatory java.lang.String parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(13)
  void doImport(
    java.lang.String bstrImplementationUrl);


  /**
   * @param event Mandatory java.lang.String parameter.
   * @param pdisp Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417605) //= 0x800101fb. The runtime will prefer the VTID if present
  @VTID(14)
  boolean attachEvent(
    java.lang.String event,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pdisp);


  /**
   * @param event Mandatory java.lang.String parameter.
   * @param pdisp Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147417604) //= 0x800101fc. The runtime will prefer the VTID if present
  @VTID(15)
  void detachEvent(
    java.lang.String event,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pdisp);


  // Properties:
}
