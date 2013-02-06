package com.ie  ;

import com4j.*;

/**
 * Web Browser interface
 */
@IID("{EAB22AC1-30C1-11CF-A7EB-0000C05BAE0B}")
public interface IWebBrowser extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Navigates to the previous item in the history list.
   * </p>
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  void goBack();


  /**
   * <p>
   * Navigates to the next item in the history list.
   * </p>
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(8)
  void goForward();


  /**
   * <p>
   * Go home/start page.
   * </p>
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(9)
  void goHome();


  /**
   * <p>
   * Go Search Page.
   * </p>
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  void goSearch();


  /**
   * <p>
   * Navigates to a URL or file.
   * </p>
   * @param url Mandatory java.lang.String parameter.
   * @param flags Optional parameter. Default value is com4j.Variant.getMissing()
   * @param targetFrameName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param postData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param headers Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  void navigate(
    java.lang.String url,
    @Optional java.lang.Object flags,
    @Optional java.lang.Object targetFrameName,
    @Optional java.lang.Object postData,
    @Optional java.lang.Object headers);


  /**
   * <p>
   * Refresh the currently viewed page.
   * </p>
   */

  @DISPID(-550) //= 0xfffffdda. The runtime will prefer the VTID if present
  @VTID(12)
  void refresh();


  /**
   * <p>
   * Refresh the currently viewed page.
   * </p>
   * @param level Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(13)
  void refresh2(
    @Optional java.lang.Object level);


  /**
   * <p>
   * Stops opening a file.
   * </p>
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(14)
  void stop();


  /**
   * <p>
   * Returns the application automation object if accessible, this automation object otherwise..
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Returns the automation object of the container/parent if one exists or this automation object.
   * </p>
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Returns the container/parent automation object, if any.
   * </p>
   * <p>
   * Getter method for the COM property "Container"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject container();


  /**
   * <p>
   * Returns the active Document automation object, if any.
   * </p>
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject document();


  /**
   * <p>
   * Returns True if this is the top level object.
   * </p>
   * <p>
   * Getter method for the COM property "TopLevelContainer"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(19)
  boolean topLevelContainer();


  /**
   * <p>
   * Returns the type of the contained document object.
   * </p>
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String type();


  /**
   * <p>
   * The horizontal position (pixels) of the frame window relative to the screen/container.
   * </p>
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(21)
  int left();


  /**
   * <p>
   * The horizontal position (pixels) of the frame window relative to the screen/container.
   * </p>
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param pl Mandatory int parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(22)
  void left(
    int pl);


  /**
   * <p>
   * The vertical position (pixels) of the frame window relative to the screen/container.
   * </p>
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(23)
  int top();


  /**
   * <p>
   * The vertical position (pixels) of the frame window relative to the screen/container.
   * </p>
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param pl Mandatory int parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(24)
  void top(
    int pl);


  /**
   * <p>
   * The horizontal dimension (pixels) of the frame window/object.
   * </p>
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(25)
  int width();


  /**
   * <p>
   * The horizontal dimension (pixels) of the frame window/object.
   * </p>
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param pl Mandatory int parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(26)
  void width(
    int pl);


  /**
   * <p>
   * The vertical dimension (pixels) of the frame window/object.
   * </p>
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(27)
  int height();


  /**
   * <p>
   * The vertical dimension (pixels) of the frame window/object.
   * </p>
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param pl Mandatory int parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(28)
  void height(
    int pl);


  /**
   * <p>
   * Gets the short (UI-friendly) name of the URL/file currently viewed.
   * </p>
   * <p>
   * Getter method for the COM property "LocationName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String locationName();


  /**
   * <p>
   * Gets the full URL/path currently viewed.
   * </p>
   * <p>
   * Getter method for the COM property "LocationURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String locationURL();


  /**
   * <p>
   * Query to see if something is still in progress.
   * </p>
   * <p>
   * Getter method for the COM property "Busy"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(31)
  boolean busy();


  // Properties:
}
