package ms.html  ;

import com4j.*;

@IID("{3050F401-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLOpsProfile extends Com4jObject {
  // Methods:
  /**
   * @param name Mandatory java.lang.String parameter.
   * @param reserved Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  boolean addRequest(
    java.lang.String name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved);


  /**
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void clearRequest();


  /**
   * @param usage Mandatory java.lang.Object parameter.
   * @param fname Optional parameter. Default value is com4j.Variant.getMissing()
   * @param domain Optional parameter. Default value is com4j.Variant.getMissing()
   * @param path Optional parameter. Default value is com4j.Variant.getMissing()
   * @param expire Optional parameter. Default value is com4j.Variant.getMissing()
   * @param reserved Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void doRequest(
    @MarshalAs(NativeType.VARIANT) java.lang.Object usage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fname,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object domain,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object path,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object expire,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String getAttribute(
    java.lang.String name);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.String parameter.
   * @param prefs Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  boolean setAttribute(
    java.lang.String name,
    java.lang.String value,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prefs);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  boolean commitChanges();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param reserved Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  boolean addReadRequest(
    java.lang.String name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved);


  /**
   * @param usage Mandatory java.lang.Object parameter.
   * @param fname Optional parameter. Default value is com4j.Variant.getMissing()
   * @param domain Optional parameter. Default value is com4j.Variant.getMissing()
   * @param path Optional parameter. Default value is com4j.Variant.getMissing()
   * @param expire Optional parameter. Default value is com4j.Variant.getMissing()
   * @param reserved Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  void doReadRequest(
    @MarshalAs(NativeType.VARIANT) java.lang.Object usage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fname,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object domain,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object path,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object expire,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  boolean doWriteRequest();


  // Properties:
}
