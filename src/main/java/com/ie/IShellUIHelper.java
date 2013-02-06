package com.ie  ;

import com4j.*;

/**
 * Shell UI Helper Control Interface
 */
@IID("{729FE2F8-1EA8-11D1-8F85-00C04FC2FBE1}")
public interface IShellUIHelper extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void resetFirstBootMode();


  /**
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void resetSafeMode();


  /**
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void refreshOfflineDesktop();


  /**
   * @param url Mandatory java.lang.String parameter.
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void addFavorite(
    java.lang.String url,
    @Optional java.lang.Object title);


  /**
   * @param url Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  void addChannel(
    java.lang.String url);


  /**
   * @param url Mandatory java.lang.String parameter.
   * @param type Mandatory java.lang.String parameter.
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param height Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  void addDesktopComponent(
    java.lang.String url,
    java.lang.String type,
    @Optional java.lang.Object left,
    @Optional java.lang.Object top,
    @Optional java.lang.Object width,
    @Optional java.lang.Object height);


  /**
   * @param url Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  boolean isSubscribed(
    java.lang.String url);


  /**
   * @param url Mandatory java.lang.String parameter.
   * @param strQuery Mandatory java.lang.String parameter.
   * @param varTargetFrame Mandatory java.lang.Object parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  void navigateAndFind(
    java.lang.String url,
    java.lang.String strQuery,
    java.lang.Object varTargetFrame);


  /**
   * @param fImport Mandatory boolean parameter.
   * @param strImpExpPath Mandatory java.lang.String parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  void importExportFavorites(
    boolean fImport,
    java.lang.String strImpExpPath);


  /**
   * @param form Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  void autoCompleteSaveForm(
    @Optional java.lang.Object form);


  /**
   * @param strSearch Mandatory java.lang.String parameter.
   * @param strFailureUrl Mandatory java.lang.String parameter.
   * @param pvarTargetFrame Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  void autoScan(
    java.lang.String strSearch,
    java.lang.String strFailureUrl,
    @Optional java.lang.Object pvarTargetFrame);


  /**
   * @param reserved Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  void autoCompleteAttach(
    @Optional java.lang.Object reserved);


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   * @param pvarIn Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object showBrowserUI(
    java.lang.String bstrName,
    java.lang.Object pvarIn);


  // Properties:
}
