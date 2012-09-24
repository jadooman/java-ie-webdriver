package ms.html  ;

import com4j.*;

/**
 */
public enum _SELECTION_TYPE implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  SELECTION_TYPE_None(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  SELECTION_TYPE_Caret(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  SELECTION_TYPE_Text(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  SELECTION_TYPE_Control(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  SELECTION_TYPE_Max(2147483647),
  ;

  private final int value;
  _SELECTION_TYPE(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
