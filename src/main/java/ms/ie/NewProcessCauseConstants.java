package ms.ie  ;

import com4j.*;

/**
 * <p>
 * Constants for WebBrowser NewProcess notification
 * </p>
 */
public enum NewProcessCauseConstants implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ProtectedModeRedirect(1),
  ;

  private final int value;
  NewProcessCauseConstants(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
