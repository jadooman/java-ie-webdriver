package ms.html  ;

import com4j.*;

/**
 */
public enum _MARKUP_CONTEXT_TYPE implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  CONTEXT_TYPE_None(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  CONTEXT_TYPE_Text(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  CONTEXT_TYPE_EnterScope(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  CONTEXT_TYPE_ExitScope(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  CONTEXT_TYPE_NoScope(4),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  MARKUP_CONTEXT_TYPE_Max(2147483647),
  ;

  private final int value;
  _MARKUP_CONTEXT_TYPE(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
