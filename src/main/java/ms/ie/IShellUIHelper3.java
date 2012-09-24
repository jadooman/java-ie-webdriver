package ms.ie  ;

import com4j.*;

/**
 * Shell UI Helper Control Interface 3
 */
@IID("{528DF2EC-D419-40BC-9B6D-DCDBF9C1B25D}")
public interface IShellUIHelper3 extends ms.ie.IShellUIHelper2 {
  // Methods:
  /**
   * @param url Mandatory java.lang.String parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(36)
  void addService(
    java.lang.String url);


  /**
   * @param url Mandatory java.lang.String parameter.
   * @param verb Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(37)
  int isServiceInstalled(
    java.lang.String url,
    java.lang.String verb);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(38)
  boolean inPrivateFilteringEnabled();


  /**
   * @param url Mandatory java.lang.String parameter.
   * @param title Mandatory java.lang.String parameter.
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(39)
  void addToFavoritesBar(
    java.lang.String url,
    java.lang.String title,
    @Optional java.lang.Object type);


  /**
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(40)
  void buildNewTabPage();


  /**
   * @param fVisible Mandatory boolean parameter.
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(41)
  void setRecentlyClosedVisible(
    boolean fVisible);


  /**
   * @param fVisible Mandatory boolean parameter.
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(42)
  void setActivitiesVisible(
    boolean fVisible);


  /**
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(43)
  void contentDiscoveryReset();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(44)
  boolean isSuggestedSitesEnabled();


  /**
   * @param fEnable Mandatory boolean parameter.
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(45)
  void enableSuggestedSites(
    boolean fEnable);


  /**
   * @param bstrRelativeUrl Mandatory java.lang.String parameter.
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(46)
  void navigateToSuggestedSites(
    java.lang.String bstrRelativeUrl);


  /**
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(47)
  void showTabsHelp();


  /**
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(48)
  void showInPrivateHelp();


  // Properties:
}
