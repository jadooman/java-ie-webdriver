package com.ie  ;

import com4j.*;

/**
 * Shell UI Helper Control Interface 5
 */
@IID("{A2A08B09-103D-4D3F-B91C-EA455CA82EFA}")
public interface IShellUIHelper5 extends com.ie.IShellUIHelper4 {
  // Methods:
  /**
   * @param bstrProvisioningXml Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(62) //= 0x3e. The runtime will prefer the VTID if present
  @VTID(67)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object msProvisionNetworks(
    java.lang.String bstrProvisioningXml);


  /**
   */

  @DISPID(63) //= 0x3f. The runtime will prefer the VTID if present
  @VTID(68)
  void msReportSafeUrl();


  /**
   */

  @DISPID(64) //= 0x40. The runtime will prefer the VTID if present
  @VTID(69)
  void msSiteModeRefreshBadge();


  /**
   */

  @DISPID(65) //= 0x41. The runtime will prefer the VTID if present
  @VTID(70)
  void msSiteModeClearBadge();


  /**
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(71)
  void msDiagnoseConnectionUILess();


  /**
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(72)
  void msLaunchNetworkClientHelp();


  /**
   * @param fChange Mandatory boolean parameter.
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(73)
  void msChangeDefaultBrowser(
    boolean fChange);


  // Properties:
}
