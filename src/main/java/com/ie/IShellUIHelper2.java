package com.ie  ;

import com4j.*;

/**
 * Shell UI Helper Control Interface 2
 */
@IID("{A7FE6EDA-1932-4281-B881-87B31B8BC52C}")
public interface IShellUIHelper2 extends com.ie.IShellUIHelper {
  // Methods:
  /**
   * @param url Mandatory java.lang.String parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  void addSearchProvider(
    java.lang.String url);


  /**
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(21)
  void runOnceShown();


  /**
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(22)
  void skipRunOnce();


  /**
   * @param fSQM Mandatory boolean parameter.
   * @param fPhishing Mandatory boolean parameter.
   * @param bstrLocale Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(23)
  void customizeSettings(
    boolean fSQM,
    boolean fPhishing,
    java.lang.String bstrLocale);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(24)
  boolean sqmEnabled();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(25)
  boolean phishingEnabled();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String brandImageUri();


  /**
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(27)
  void skipTabsWelcome();


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(28)
  void diagnoseConnection();


  /**
   * @param fSet Mandatory boolean parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(29)
  void customizeClearType(
    boolean fSet);


  /**
   * @param url Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(30)
  int isSearchProviderInstalled(
    java.lang.String url);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(31)
  boolean isSearchMigrated();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String defaultSearchProvider();


  /**
   * @param fComplete Mandatory boolean parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(33)
  void runOnceRequiredSettingsComplete(
    boolean fComplete);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(34)
  boolean runOnceHasShown();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String searchGuideUrl();


  // Properties:
}
