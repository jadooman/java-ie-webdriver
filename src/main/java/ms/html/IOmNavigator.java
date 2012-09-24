package ms.html  ;

import com4j.*;

@IID("{FECEAAA5-8405-11CF-8BA1-00AA00476DA6}")
public interface IOmNavigator extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "appCodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String appCodeName();


  /**
   * <p>
   * Getter method for the COM property "appName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String appName();


  /**
   * <p>
   * Getter method for the COM property "appVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String appVersion();


  /**
   * <p>
   * Getter method for the COM property "userAgent"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String userAgent();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  boolean javaEnabled();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  boolean taintEnabled();


  /**
   * <p>
   * Getter method for the COM property "mimeTypes"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLMimeTypesCollection
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.IHTMLMimeTypesCollection mimeTypes();


  /**
   * <p>
   * Getter method for the COM property "plugins"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLPluginsCollection
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.IHTMLPluginsCollection plugins();


  /**
   * <p>
   * Getter method for the COM property "cookieEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  boolean cookieEnabled();


  /**
   * <p>
   * Getter method for the COM property "opsProfile"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLOpsProfile
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  ms.html.IHTMLOpsProfile opsProfile();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String toString_();


  /**
   * <p>
   * Getter method for the COM property "cpuClass"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String cpuClass();


  /**
   * <p>
   * Getter method for the COM property "systemLanguage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String systemLanguage();


  /**
   * <p>
   * Getter method for the COM property "browserLanguage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String browserLanguage();


  /**
   * <p>
   * Getter method for the COM property "userLanguage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String userLanguage();


  /**
   * <p>
   * Getter method for the COM property "platform"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String platform();


  /**
   * <p>
   * Getter method for the COM property "appMinorVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String appMinorVersion();


  /**
   * <p>
   * Getter method for the COM property "connectionSpeed"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(24)
  int connectionSpeed();


  /**
   * <p>
   * Getter method for the COM property "onLine"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(25)
  boolean onLine();


  /**
   * <p>
   * Getter method for the COM property "userProfile"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLOpsProfile
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(26)
  ms.html.IHTMLOpsProfile userProfile();


  // Properties:
}
