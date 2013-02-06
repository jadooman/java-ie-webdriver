package com.ie  ;

import com4j.*;

/**
 * IShellFavoritesNameSpace Interface
 */
@IID("{55136804-B2DE-11D1-B9F2-00A0C98BC547}")
public interface IShellFavoritesNameSpace extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method MoveSelectionUp
   * </p>
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void moveSelectionUp();


  /**
   * <p>
   * method MoveSelectionDown
   * </p>
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void moveSelectionDown();


  /**
   * <p>
   * method ResetSort
   * </p>
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void resetSort();


  /**
   * <p>
   * method NewFolder
   * </p>
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void newFolder();


  /**
   * <p>
   * method Synchronize
   * </p>
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  void synchronize();


  /**
   * <p>
   * method Import
   * </p>
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  void _import();


  /**
   * <p>
   * method Export
   * </p>
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  void export();


  /**
   * <p>
   * method InvokeContextMenuCommand
   * </p>
   * @param strCommand Mandatory java.lang.String parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  void invokeContextMenuCommand(
    java.lang.String strCommand);


  /**
   * <p>
   * method MoveSelectionTo
   * </p>
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  void moveSelectionTo();


  /**
   * <p>
   * Query to see if subscriptions are enabled
   * </p>
   * <p>
   * Getter method for the COM property "SubscriptionsEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  boolean subscriptionsEnabled();


  /**
   * <p>
   * method CreateSubscriptionForSelection
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  boolean createSubscriptionForSelection();


  /**
   * <p>
   * method DeleteSubscriptionForSelection
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  boolean deleteSubscriptionForSelection();


  /**
   * <p>
   * old, use put_Root() instead
   * </p>
   * @param bstrFullPath Mandatory java.lang.String parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  void setRoot(
    java.lang.String bstrFullPath);


  // Properties:
}
