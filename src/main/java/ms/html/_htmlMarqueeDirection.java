package ms.html  ;

import com4j.*;

/**
 */
public enum _htmlMarqueeDirection implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  htmlMarqueeDirectionleft(1),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  htmlMarqueeDirectionright(3),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  htmlMarqueeDirectionup(5),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  htmlMarqueeDirectiondown(7),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  htmlMarqueeDirection_Max(2147483647),
  ;

  private final int value;
  _htmlMarqueeDirection(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
