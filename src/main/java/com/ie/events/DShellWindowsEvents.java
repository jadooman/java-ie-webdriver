package com.ie.events;

import com4j.*;

/**
 * Event interface for IShellWindows
 */
@IID("{FE4106E0-399A-11D0-A48C-00A0C90A8F39}")
public abstract class DShellWindowsEvents {
  // Methods:
  /**
   * <p>
   * A new window was registered.
   * </p>
   * @param lCookie Mandatory int parameter.
   */

  @DISPID(200)
  public void windowRegistered(
    int lCookie) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * A new window was revoked.
   * </p>
   * @param lCookie Mandatory int parameter.
   */

  @DISPID(201)
  public void windowRevoked(
    int lCookie) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
