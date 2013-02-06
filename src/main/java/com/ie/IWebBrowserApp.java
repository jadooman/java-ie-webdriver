package com.ie  ;

import com4j.*;

/**
 * Web Browser Application Interface.
 */
@IID("{0002DF05-0000-0000-C000-000000000046}")
public interface IWebBrowserApp extends com.ie.IWebBrowser {
  // Methods:
  /**
   * <p>
   * Exits application and closes the open document.
   * </p>
   */

  @DISPID(300) //= 0x12c. The runtime will prefer the VTID if present
  @VTID(32)
  void quit();


  /**
   * <p>
   * Converts client sizes into window sizes.
   * </p>
   * @param pcx Mandatory Holder<Integer> parameter.
   * @param pcy Mandatory Holder<Integer> parameter.
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(33)
  void clientToWindow(
    Holder<Integer> pcx,
    Holder<Integer> pcy);


  /**
   * <p>
   * Associates vtValue with the name szProperty in the context of the object.
   * </p>
   * @param property Mandatory java.lang.String parameter.
   * @param vtValue Mandatory java.lang.Object parameter.
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(34)
  void putProperty(
    java.lang.String property,
    @MarshalAs(NativeType.VARIANT) java.lang.Object vtValue);


  /**
   * <p>
   * Retrieve the Associated value for the property vtValue in the context of the object.
   * </p>
   * @param property Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getProperty(
    java.lang.String property);


  /**
   * <p>
   * Returns name of the application.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(36)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Returns the HWND of the current IE window.
   * </p>
   * <p>
   * Getter method for the COM property "HWND"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-515) //= 0xfffffdfd. The runtime will prefer the VTID if present
  @VTID(37)
  int hwnd();


  /**
   * <p>
   * Returns file specification of the application, including path.
   * </p>
   * <p>
   * Getter method for the COM property "FullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(400) //= 0x190. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String fullName();


  /**
   * <p>
   * Returns the path to the application.
   * </p>
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String path();


  /**
   * <p>
   * Determines whether the application is visible or hidden.
   * </p>
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(40)
  boolean visible();


  /**
   * <p>
   * Determines whether the application is visible or hidden.
   * </p>
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param pBool Mandatory boolean parameter.
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(41)
  void visible(
    boolean pBool);


  /**
   * <p>
   * Turn on or off the statusbar.
   * </p>
   * <p>
   * Getter method for the COM property "StatusBar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(42)
  boolean statusBar();


  /**
   * <p>
   * Turn on or off the statusbar.
   * </p>
   * <p>
   * Setter method for the COM property "StatusBar"
   * </p>
   * @param pBool Mandatory boolean parameter.
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(43)
  void statusBar(
    boolean pBool);


  /**
   * <p>
   * Text of Status window.
   * </p>
   * <p>
   * Getter method for the COM property "StatusText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String statusText();


  /**
   * <p>
   * Text of Status window.
   * </p>
   * <p>
   * Setter method for the COM property "StatusText"
   * </p>
   * @param statusText Mandatory java.lang.String parameter.
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(45)
  void statusText(
    java.lang.String statusText);


  /**
   * <p>
   * Controls which toolbar is shown.
   * </p>
   * <p>
   * Getter method for the COM property "ToolBar"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(46)
  int toolBar();


  /**
   * <p>
   * Controls which toolbar is shown.
   * </p>
   * <p>
   * Setter method for the COM property "ToolBar"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(47)
  void toolBar(
    int value);


  /**
   * <p>
   * Controls whether menubar is shown.
   * </p>
   * <p>
   * Getter method for the COM property "MenuBar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(48)
  boolean menuBar();


  /**
   * <p>
   * Controls whether menubar is shown.
   * </p>
   * <p>
   * Setter method for the COM property "MenuBar"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(49)
  void menuBar(
    boolean value);


  /**
   * <p>
   * Maximizes window and turns off statusbar, toolbar, menubar, and titlebar.
   * </p>
   * <p>
   * Getter method for the COM property "FullScreen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(50)
  boolean fullScreen();


  /**
   * <p>
   * Maximizes window and turns off statusbar, toolbar, menubar, and titlebar.
   * </p>
   * <p>
   * Setter method for the COM property "FullScreen"
   * </p>
   * @param pbFullScreen Mandatory boolean parameter.
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(51)
  void fullScreen(
    boolean pbFullScreen);


  // Properties:
}
