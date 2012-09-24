package ms.html  ;

import com4j.*;

@IID("{3051040A-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLXMLHttpRequest extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(7)
  int readyState();


  /**
   * <p>
   * Getter method for the COM property "responseBody"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object responseBody();


  /**
   * <p>
   * Getter method for the COM property "responseText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String responseText();


  /**
   * <p>
   * Getter method for the COM property "responseXML"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject responseXML();


  /**
   * <p>
   * Getter method for the COM property "status"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(11)
  int status();


  /**
   * <p>
   * Getter method for the COM property "statusText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String statusText();


  /**
   * <p>
   * Setter method for the COM property "onreadystatechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(13)
  void onreadystatechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onreadystatechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onreadystatechange();


  /**
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(15)
  void abort();


  /**
   * @param bstrMethod Mandatory java.lang.String parameter.
   * @param bstrURL Mandatory java.lang.String parameter.
   * @param varAsync Mandatory java.lang.Object parameter.
   * @param varUser Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varPassword Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(16)
  void open(
    java.lang.String bstrMethod,
    java.lang.String bstrURL,
    @MarshalAs(NativeType.VARIANT) java.lang.Object varAsync,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varUser,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varPassword);


  /**
   * @param varBody Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(17)
  void send(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varBody);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String getAllResponseHeaders();


  /**
   * @param bstrHeader Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String getResponseHeader(
    java.lang.String bstrHeader);


  /**
   * @param bstrHeader Mandatory java.lang.String parameter.
   * @param bstrValue Mandatory java.lang.String parameter.
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(20)
  void setRequestHeader(
    java.lang.String bstrHeader,
    java.lang.String bstrValue);


  // Properties:
}
