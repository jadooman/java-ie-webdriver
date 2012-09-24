package ms.html  ;

import com4j.*;

/**
 */
public enum _HTML_PAINTER implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HTMLPAINTER_OPAQUE(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  HTMLPAINTER_TRANSPARENT(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  HTMLPAINTER_ALPHA(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  HTMLPAINTER_COMPLEX(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  HTMLPAINTER_OVERLAY(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  HTMLPAINTER_HITTEST(32),
  /**
   * <p>
   * The value of this constant is 256
   * </p>
   */
  HTMLPAINTER_SURFACE(256),
  /**
   * <p>
   * The value of this constant is 512
   * </p>
   */
  HTMLPAINTER_3DSURFACE(512),
  /**
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  HTMLPAINTER_NOBAND(1024),
  /**
   * <p>
   * The value of this constant is 4096
   * </p>
   */
  HTMLPAINTER_NODC(4096),
  /**
   * <p>
   * The value of this constant is 8192
   * </p>
   */
  HTMLPAINTER_NOPHYSICALCLIP(8192),
  /**
   * <p>
   * The value of this constant is 16384
   * </p>
   */
  HTMLPAINTER_NOSAVEDC(16384),
  /**
   * <p>
   * The value of this constant is 32768
   * </p>
   */
  HTMLPAINTER_SUPPORTS_XFORM(32768),
  /**
   * <p>
   * The value of this constant is 65536
   * </p>
   */
  HTMLPAINTER_EXPAND(65536),
  /**
   * <p>
   * The value of this constant is 131072
   * </p>
   */
  HTMLPAINTER_NOSCROLLBITS(131072),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  HTML_PAINTER_Max(2147483647),
  ;

  private final int value;
  _HTML_PAINTER(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
