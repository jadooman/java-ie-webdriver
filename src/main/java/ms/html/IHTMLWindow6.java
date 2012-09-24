package ms.html  ;

import com4j.*;

@IID("{30510453-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLWindow6 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "XDomainRequest"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1191) //= 0x4a7. The runtime will prefer the VTID if present
  @VTID(7)
  void xDomainRequest(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "XDomainRequest"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1191) //= 0x4a7. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object xDomainRequest();


  /**
   * <p>
   * Getter method for the COM property "sessionStorage"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStorage
   */

  @DISPID(1192) //= 0x4a8. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLStorage sessionStorage();


  /**
   * <p>
   * Getter method for the COM property "localStorage"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStorage
   */

  @DISPID(1193) //= 0x4a9. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLStorage localStorage();


  /**
   * <p>
   * Setter method for the COM property "onhashchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412003) //= 0x800117dd. The runtime will prefer the VTID if present
  @VTID(11)
  void onhashchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onhashchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412003) //= 0x800117dd. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onhashchange();


  /**
   * <p>
   * Getter method for the COM property "maxConnectionsPerServer"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1194) //= 0x4aa. The runtime will prefer the VTID if present
  @VTID(13)
  int maxConnectionsPerServer();


  /**
   * @param msg Mandatory java.lang.String parameter.
   * @param targetOrigin Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1196) //= 0x4ac. The runtime will prefer the VTID if present
  @VTID(14)
  void postMessage(
    java.lang.String msg,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object targetOrigin);


  /**
   * @param bstrHTML Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1197) //= 0x4ad. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String toStaticHTML(
    java.lang.String bstrHTML);


  /**
   * <p>
   * Setter method for the COM property "onmessage"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412002) //= 0x800117de. The runtime will prefer the VTID if present
  @VTID(16)
  void onmessage(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmessage"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412002) //= 0x800117de. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmessage();


  /**
   * @param bstrProfilerMarkName Mandatory java.lang.String parameter.
   */

  @DISPID(1198) //= 0x4ae. The runtime will prefer the VTID if present
  @VTID(18)
  void msWriteProfilerMark(
    java.lang.String bstrProfilerMarkName);


  // Properties:
}
