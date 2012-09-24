package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlUnit implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlUnitCharacter(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlUnitWord(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlUnitSentence(3),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  htmlUnitTextEdit(6),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlUnit_Max(2147483647),
  ;

  private final int value;
  _htmlUnit(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
