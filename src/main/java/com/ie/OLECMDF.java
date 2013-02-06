package com.ie  ;

import com4j.*;

/**
 */
public enum OLECMDF implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  OLECMDF_SUPPORTED(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  OLECMDF_ENABLED(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  OLECMDF_LATCHED(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  OLECMDF_NINCHED(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  OLECMDF_INVISIBLE(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  OLECMDF_DEFHIDEONCTXTMENU(32),
  ;

  private final int value;
  OLECMDF(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
