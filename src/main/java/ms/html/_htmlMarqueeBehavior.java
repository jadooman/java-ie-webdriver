package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlMarqueeBehavior implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlMarqueeBehaviorscroll(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  htmlMarqueeBehaviorslide(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlMarqueeBehavioralternate(3),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlMarqueeBehavior_Max(2147483647),
  ;

  private final int value;
  _htmlMarqueeBehavior(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
