package ms.html  ;

import com4j.*;

/**
 */
public enum _mediaType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  mediaTypeNotSet(0),
  /**
   * <p>
   * The value of this constant is 511
   * </p>
   */
  mediaTypeAll(511),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  mediaTypeAural(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  mediaTypeBraille(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  mediaTypeEmbossed(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  mediaTypeHandheld(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  mediaTypePrint(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  mediaTypeProjection(32),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  mediaTypeScreen(64),
  /**
   * <p>
   * The value of this constant is 128
   * </p>
   */
  mediaTypeTty(128),
  /**
   * <p>
   * The value of this constant is 256
   * </p>
   */
  mediaTypeTv(256),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  mediaType_Max(2147483647),
  ;

  private final int value;
  _mediaType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
