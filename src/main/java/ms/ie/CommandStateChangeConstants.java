package ms.ie  ;

import com4j.*;

/**
 * <p>
 * Constants for WebBrowser CommandStateChange
 * </p>
 */
public enum CommandStateChangeConstants implements ComEnum {
  /**
   * <p>
   * Command Change
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  CSC_UPDATECOMMANDS(-1),
  /**
   * <p>
   * Navigate Forward
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  CSC_NAVIGATEFORWARD(1),
  /**
   * <p>
   * Navigate Back
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  CSC_NAVIGATEBACK(2),
  ;

  private final int value;
  CommandStateChangeConstants(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
