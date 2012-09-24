package ms.html  ;

import com4j.*;

/**
 */
public enum _ELEMENTDESCRIPTOR_FLAGS implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ELEMENTDESCRIPTORFLAGS_LITERAL(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ELEMENTDESCRIPTORFLAGS_NESTED_LITERAL(2),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  ELEMENTDESCRIPTOR_FLAGS_Max(2147483647),
  ;

  private final int value;
  _ELEMENTDESCRIPTOR_FLAGS(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
