package com.ie  ;

import com4j.*;

/**
 * Web Browser Interface for IE4.
 */
@IID("{D30C1661-CDAF-11D0-8A3E-00C04FC9E26E}")
public interface IWebBrowser2 extends com.ie.IWebBrowserApp {
  // Methods:
  /**
   * <p>
   * Navigates to a URL or file or pidl.
   * </p>
   * @param url Mandatory java.lang.Object parameter.
   * @param flags Optional parameter. Default value is com4j.Variant.getMissing()
   * @param targetFrameName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param postData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param headers Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(500) //= 0x1f4. The runtime will prefer the VTID if present
  @VTID(52)
  void navigate2(
    java.lang.Object url,
    @Optional java.lang.Object flags,
    @Optional java.lang.Object targetFrameName,
    @Optional java.lang.Object postData,
    @Optional java.lang.Object headers);


  /**
   * <p>
   * IOleCommandTarget::QueryStatus
   * </p>
   * @param cmdID Mandatory com.ie.OLECMDID parameter.
   * @return  Returns a value of type com.ie.OLECMDF
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(53)
  com.ie.OLECMDF queryStatusWB(
    com.ie.OLECMDID cmdID);


  /**
   * <p>
   * IOleCommandTarget::Exec
   * </p>
   * @param cmdID Mandatory com.ie.OLECMDID parameter.
   * @param cmdexecopt Mandatory com.ie.OLECMDEXECOPT parameter.
   * @param pvaIn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pvaOut Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(54)
  void execWB(
    com.ie.OLECMDID cmdID,
    com.ie.OLECMDEXECOPT cmdexecopt,
    @Optional java.lang.Object pvaIn,
    @Optional java.lang.Object pvaOut);


  /**
   * <p>
   * Set BrowserBar to Clsid
   * </p>
   * @param pvaClsid Mandatory java.lang.Object parameter.
   * @param pvarShow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pvarSize Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(503) //= 0x1f7. The runtime will prefer the VTID if present
  @VTID(55)
  void showBrowserBar(
    java.lang.Object pvaClsid,
    @Optional java.lang.Object pvarShow,
    @Optional java.lang.Object pvarSize);


  /**
   * <p>
   * Getter method for the COM property "ReadyState"
   * </p>
   * @return  Returns a value of type com.ie.tagREADYSTATE
   */

  @DISPID(-525) //= 0xfffffdf3. The runtime will prefer the VTID if present
  @VTID(56)
  com.ie.tagREADYSTATE readyState();


  /**
   * <p>
   * Controls if the frame is offline (read from cache)
   * </p>
   * <p>
   * Getter method for the COM property "Offline"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(550) //= 0x226. The runtime will prefer the VTID if present
  @VTID(57)
  boolean offline();


  /**
   * <p>
   * Controls if the frame is offline (read from cache)
   * </p>
   * <p>
   * Setter method for the COM property "Offline"
   * </p>
   * @param pbOffline Mandatory boolean parameter.
   */

  @DISPID(550) //= 0x226. The runtime will prefer the VTID if present
  @VTID(58)
  void offline(
    boolean pbOffline);


  /**
   * <p>
   * Controls if any dialog boxes can be shown
   * </p>
   * <p>
   * Getter method for the COM property "Silent"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(551) //= 0x227. The runtime will prefer the VTID if present
  @VTID(59)
  boolean silent();


  /**
   * <p>
   * Controls if any dialog boxes can be shown
   * </p>
   * <p>
   * Setter method for the COM property "Silent"
   * </p>
   * @param pbSilent Mandatory boolean parameter.
   */

  @DISPID(551) //= 0x227. The runtime will prefer the VTID if present
  @VTID(60)
  void silent(
    boolean pbSilent);


  /**
   * <p>
   * Registers OC as a top-level browser (for target name resolution)
   * </p>
   * <p>
   * Getter method for the COM property "RegisterAsBrowser"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(552) //= 0x228. The runtime will prefer the VTID if present
  @VTID(61)
  boolean registerAsBrowser();


  /**
   * <p>
   * Registers OC as a top-level browser (for target name resolution)
   * </p>
   * <p>
   * Setter method for the COM property "RegisterAsBrowser"
   * </p>
   * @param pbRegister Mandatory boolean parameter.
   */

  @DISPID(552) //= 0x228. The runtime will prefer the VTID if present
  @VTID(62)
  void registerAsBrowser(
    boolean pbRegister);


  /**
   * <p>
   * Registers OC as a drop target for navigation
   * </p>
   * <p>
   * Getter method for the COM property "RegisterAsDropTarget"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(553) //= 0x229. The runtime will prefer the VTID if present
  @VTID(63)
  boolean registerAsDropTarget();


  /**
   * <p>
   * Registers OC as a drop target for navigation
   * </p>
   * <p>
   * Setter method for the COM property "RegisterAsDropTarget"
   * </p>
   * @param pbRegister Mandatory boolean parameter.
   */

  @DISPID(553) //= 0x229. The runtime will prefer the VTID if present
  @VTID(64)
  void registerAsDropTarget(
    boolean pbRegister);


  /**
   * <p>
   * Controls if the browser is in theater mode
   * </p>
   * <p>
   * Getter method for the COM property "TheaterMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(554) //= 0x22a. The runtime will prefer the VTID if present
  @VTID(65)
  boolean theaterMode();


  /**
   * <p>
   * Controls if the browser is in theater mode
   * </p>
   * <p>
   * Setter method for the COM property "TheaterMode"
   * </p>
   * @param pbRegister Mandatory boolean parameter.
   */

  @DISPID(554) //= 0x22a. The runtime will prefer the VTID if present
  @VTID(66)
  void theaterMode(
    boolean pbRegister);


  /**
   * <p>
   * Controls whether address bar is shown
   * </p>
   * <p>
   * Getter method for the COM property "AddressBar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(555) //= 0x22b. The runtime will prefer the VTID if present
  @VTID(67)
  boolean addressBar();


  /**
   * <p>
   * Controls whether address bar is shown
   * </p>
   * <p>
   * Setter method for the COM property "AddressBar"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(555) //= 0x22b. The runtime will prefer the VTID if present
  @VTID(68)
  void addressBar(
    boolean value);


  /**
   * <p>
   * Controls whether the window is resizable
   * </p>
   * <p>
   * Getter method for the COM property "Resizable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(556) //= 0x22c. The runtime will prefer the VTID if present
  @VTID(69)
  boolean resizable();


  /**
   * <p>
   * Controls whether the window is resizable
   * </p>
   * <p>
   * Setter method for the COM property "Resizable"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(556) //= 0x22c. The runtime will prefer the VTID if present
  @VTID(70)
  void resizable(
    boolean value);


  // Properties:
}
