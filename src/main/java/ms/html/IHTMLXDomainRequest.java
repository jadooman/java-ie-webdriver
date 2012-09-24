package ms.html  ;

import com4j.*;

@IID("{30510454-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLXDomainRequest extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "responseText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String responseText();


  /**
   * <p>
   * Setter method for the COM property "timeout"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(8)
  void timeout(
    int p);


  /**
   * <p>
   * Getter method for the COM property "timeout"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(9)
  int timeout();


  /**
   * <p>
   * Getter method for the COM property "contentType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String contentType();


  /**
   * <p>
   * Setter method for the COM property "onprogress"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(11)
  void onprogress(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onprogress"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onprogress();


  /**
   * <p>
   * Setter method for the COM property "onerror"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(13)
  void onerror(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onerror"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onerror();


  /**
   * <p>
   * Setter method for the COM property "ontimeout"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412000) //= 0x800117e0. The runtime will prefer the VTID if present
  @VTID(15)
  void ontimeout(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ontimeout"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412000) //= 0x800117e0. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ontimeout();


  /**
   * <p>
   * Setter method for the COM property "onload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(17)
  void onload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onload();


  /**
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(19)
  void abort();


  /**
   * @param bstrMethod Mandatory java.lang.String parameter.
   * @param bstrURL Mandatory java.lang.String parameter.
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(20)
  void open(
    java.lang.String bstrMethod,
    java.lang.String bstrURL);


  /**
   * @param varBody Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(21)
  void send(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varBody);


  // Properties:
}
