package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlInput implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  htmlInputNotSet(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlInputButton(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlInputCheckbox(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlInputFile(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  htmlInputHidden(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  htmlInputImage(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  htmlInputPassword(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  htmlInputRadio(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  htmlInputReset(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  htmlInputSelectOne(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  htmlInputSelectMultiple(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  htmlInputSubmit(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  htmlInputText(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  htmlInputTextarea(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  htmlInputRichtext(14),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlInput_Max(2147483647),
  ;

  private final int value;
  _htmlInput(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
