package com.ie  ;

import com4j.*;

/**
 * Shell UI Helper Control Interface 4
 */
@IID("{B36E6A53-8073-499E-824C-D776330A333E}")
public interface IShellUIHelper4 extends com.ie.IShellUIHelper3 {
  // Methods:
  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(49)
  boolean msIsSiteMode();


  /**
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(50)
  void msSiteModeShowThumbBar();


  /**
   * @param bstrIconURL Mandatory java.lang.String parameter.
   * @param bstrTooltip Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(51)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object msSiteModeAddThumbBarButton(
    java.lang.String bstrIconURL,
    java.lang.String bstrTooltip);


  /**
   * @param buttonID Mandatory java.lang.Object parameter.
   * @param fEnabled Mandatory boolean parameter.
   * @param fVisible Mandatory boolean parameter.
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(52)
  void msSiteModeUpdateThumbBarButton(
    @MarshalAs(NativeType.VARIANT) java.lang.Object buttonID,
    boolean fEnabled,
    boolean fVisible);


  /**
   * @param iconUrl Mandatory java.lang.String parameter.
   * @param pvarDescription Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(53)
  void msSiteModeSetIconOverlay(
    java.lang.String iconUrl,
    @Optional java.lang.Object pvarDescription);


  /**
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(54)
  void msSiteModeClearIconOverlay();


  /**
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(55)
  void msAddSiteMode();


  /**
   * @param bstrHeader Mandatory java.lang.String parameter.
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(56)
  void msSiteModeCreateJumpList(
    java.lang.String bstrHeader);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   * @param bstrActionUri Mandatory java.lang.String parameter.
   * @param bstrIconUri Mandatory java.lang.String parameter.
   * @param pvarWindowType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(57)
  void msSiteModeAddJumpListItem(
    java.lang.String bstrName,
    java.lang.String bstrActionUri,
    java.lang.String bstrIconUri,
    @Optional java.lang.Object pvarWindowType);


  /**
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(58)
  void msSiteModeClearJumpList();


  /**
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(59)
  void msSiteModeShowJumpList();


  /**
   * @param uiButtonID Mandatory java.lang.Object parameter.
   * @param bstrIconURL Mandatory java.lang.String parameter.
   * @param bstrTooltip Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(60)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object msSiteModeAddButtonStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object uiButtonID,
    java.lang.String bstrIconURL,
    java.lang.String bstrTooltip);


  /**
   * @param uiButtonID Mandatory java.lang.Object parameter.
   * @param uiStyleID Mandatory java.lang.Object parameter.
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(61)
  void msSiteModeShowButtonStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object uiButtonID,
    @MarshalAs(NativeType.VARIANT) java.lang.Object uiStyleID);


  /**
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(62)
  void msSiteModeActivate();


  /**
   * @param fPreserveState Mandatory boolean parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(63)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object msIsSiteModeFirstRun(
    boolean fPreserveState);


  /**
   * @param url Mandatory java.lang.String parameter.
   * @param bstrFilterName Mandatory java.lang.String parameter.
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(64)
  void msAddTrackingProtectionList(
    java.lang.String url,
    java.lang.String bstrFilterName);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(60) //= 0x3c. The runtime will prefer the VTID if present
  @VTID(65)
  boolean msTrackingProtectionEnabled();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(66)
  boolean msActiveXFilteringEnabled();


  // Properties:
}
