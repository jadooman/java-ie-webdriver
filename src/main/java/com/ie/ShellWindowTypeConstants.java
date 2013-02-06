package com.ie  ;

import com4j.*;

/**
 * <p>
 * Constants for ShellWindows registration
 * </p>
 */
public enum ShellWindowTypeConstants implements ComEnum {
  /**
   * <p>
   * Explorer
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  SWC_EXPLORER(0),
  /**
   * <p>
   * Various Browsing Windows
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SWC_BROWSER(1),
  /**
   * <p>
   * 3rd Party Browsers
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  SWC_3RDPARTY(2),
  /**
   * <p>
   * Creation Callback
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  SWC_CALLBACK(4),
  /**
   * <p>
   * The Windows Desktop
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  SWC_DESKTOP(8),
  ;

  private final int value;
  ShellWindowTypeConstants(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
