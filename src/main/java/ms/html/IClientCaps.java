package ms.html  ;

import com4j.*;

@IID("{7E8BC44D-AEFF-11D1-89C2-00C04FB6BFC4}")
public interface IClientCaps extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "javaEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  boolean javaEnabled();


  /**
   * <p>
   * Getter method for the COM property "cookieEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  boolean cookieEnabled();


  /**
   * <p>
   * Getter method for the COM property "cpuClass"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String cpuClass();


  /**
   * <p>
   * Getter method for the COM property "systemLanguage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String systemLanguage();


  /**
   * <p>
   * Getter method for the COM property "userLanguage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String userLanguage();


  /**
   * <p>
   * Getter method for the COM property "platform"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String platform();


  /**
   * <p>
   * Getter method for the COM property "connectionSpeed"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  int connectionSpeed();


  /**
   * <p>
   * Getter method for the COM property "onLine"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  boolean onLine();


  /**
   * <p>
   * Getter method for the COM property "colorDepth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  int colorDepth();


  /**
   * <p>
   * Getter method for the COM property "bufferDepth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  int bufferDepth();


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  int width();


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  int height();


  /**
   * <p>
   * Getter method for the COM property "availHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  int availHeight();


  /**
   * <p>
   * Getter method for the COM property "availWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  int availWidth();


  /**
   * <p>
   * Getter method for the COM property "connectionType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String connectionType();


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   * @param bstrURL Mandatory java.lang.String parameter.
   * @param bStrVer Optional parameter. Default value is ""
   * @return  Returns a value of type boolean
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(22)
  boolean isComponentInstalled(
    java.lang.String bstrName,
    java.lang.String bstrURL,
    @Optional @DefaultValue("") java.lang.String bStrVer);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   * @param bstrURL Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String getComponentVersion(
    java.lang.String bstrName,
    java.lang.String bstrURL);


  /**
   * @param bstrVer1 Mandatory java.lang.String parameter.
   * @param bstrVer2 Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(24)
  int compareVersions(
    java.lang.String bstrVer1,
    java.lang.String bstrVer2);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   * @param bstrURL Mandatory java.lang.String parameter.
   * @param bStrVer Optional parameter. Default value is ""
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(25)
  void addComponentRequest(
    java.lang.String bstrName,
    java.lang.String bstrURL,
    @Optional @DefaultValue("") java.lang.String bStrVer);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(26)
  boolean doComponentRequest();


  /**
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(27)
  void clearComponentRequest();


  // Properties:
}
