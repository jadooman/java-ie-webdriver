package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLNavigator extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "appCodeName"
   * </p>
   */

  @DISPID(1)
  @PropGet
  java.lang.String appCodeName();


  /**
   * <p>
   * Getter method for the COM property "appName"
   * </p>
   */

  @DISPID(2)
  @PropGet
  java.lang.String appName();


  /**
   * <p>
   * Getter method for the COM property "appVersion"
   * </p>
   */

  @DISPID(3)
  @PropGet
  java.lang.String appVersion();


  /**
   * <p>
   * Getter method for the COM property "userAgent"
   * </p>
   */

  @DISPID(4)
  @PropGet
  java.lang.String userAgent();


  /**
   */

  @DISPID(5)
  boolean javaEnabled();


  /**
   */

  @DISPID(6)
  boolean taintEnabled();


  /**
   * <p>
   * Getter method for the COM property "mimeTypes"
   * </p>
   */

  @DISPID(7)
  @PropGet
  ms.html.IHTMLMimeTypesCollection mimeTypes();


  /**
   * <p>
   * Getter method for the COM property "plugins"
   * </p>
   */

  @DISPID(8)
  @PropGet
  ms.html.IHTMLPluginsCollection plugins();


  /**
   * <p>
   * Getter method for the COM property "cookieEnabled"
   * </p>
   */

  @DISPID(9)
  @PropGet
  boolean cookieEnabled();


  /**
   * <p>
   * Getter method for the COM property "opsProfile"
   * </p>
   */

  @DISPID(10)
  @PropGet
  ms.html.IHTMLOpsProfile opsProfile();


  /**
   */

  @DISPID(11)
  java.lang.String toString_();


  /**
   * <p>
   * Getter method for the COM property "cpuClass"
   * </p>
   */

  @DISPID(12)
  @PropGet
  java.lang.String cpuClass();


  /**
   * <p>
   * Getter method for the COM property "systemLanguage"
   * </p>
   */

  @DISPID(13)
  @PropGet
  java.lang.String systemLanguage();


  /**
   * <p>
   * Getter method for the COM property "browserLanguage"
   * </p>
   */

  @DISPID(14)
  @PropGet
  java.lang.String browserLanguage();


  /**
   * <p>
   * Getter method for the COM property "userLanguage"
   * </p>
   */

  @DISPID(15)
  @PropGet
  java.lang.String userLanguage();


  /**
   * <p>
   * Getter method for the COM property "platform"
   * </p>
   */

  @DISPID(16)
  @PropGet
  java.lang.String platform();


  /**
   * <p>
   * Getter method for the COM property "appMinorVersion"
   * </p>
   */

  @DISPID(17)
  @PropGet
  java.lang.String appMinorVersion();


  /**
   * <p>
   * Getter method for the COM property "connectionSpeed"
   * </p>
   */

  @DISPID(18)
  @PropGet
  int connectionSpeed();


  /**
   * <p>
   * Getter method for the COM property "onLine"
   * </p>
   */

  @DISPID(19)
  @PropGet
  boolean onLine();


  /**
   * <p>
   * Getter method for the COM property "userProfile"
   * </p>
   */

  @DISPID(20)
  @PropGet
  ms.html.IHTMLOpsProfile userProfile();


  /**
   * <p>
   * Getter method for the COM property "geolocation"
   * </p>
   */

  @DISPID(21)
  @PropGet
  ms.html.IWebGeolocation geolocation();


  /**
   * <p>
   * Getter method for the COM property "msDoNotTrack"
   * </p>
   */

  @DISPID(22)
  @PropGet
  java.lang.String msDoNotTrack();


  /**
   * <p>
   * Getter method for the COM property "constructor"
   * </p>
   */

  @DISPID(-2147417603)
  @PropGet
  com4j.Com4jObject constructor();


  // Properties:
}
