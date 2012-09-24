package ms.html  ;

import com4j.*;

/**
 */
public enum _BEHAVIOR_RENDER_INFO implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  BEHAVIORRENDERINFO_BEFOREBACKGROUND(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  BEHAVIORRENDERINFO_AFTERBACKGROUND(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  BEHAVIORRENDERINFO_BEFORECONTENT(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  BEHAVIORRENDERINFO_AFTERCONTENT(8),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  BEHAVIORRENDERINFO_AFTERFOREGROUND(32),
  /**
   * <p>
   * The value of this constant is 40
   * </p>
   */
  BEHAVIORRENDERINFO_ABOVECONTENT(40),
  /**
   * <p>
   * The value of this constant is 255
   * </p>
   */
  BEHAVIORRENDERINFO_ALLLAYERS(255),
  /**
   * <p>
   * The value of this constant is 256
   * </p>
   */
  BEHAVIORRENDERINFO_DISABLEBACKGROUND(256),
  /**
   * <p>
   * The value of this constant is 512
   * </p>
   */
  BEHAVIORRENDERINFO_DISABLENEGATIVEZ(512),
  /**
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  BEHAVIORRENDERINFO_DISABLECONTENT(1024),
  /**
   * <p>
   * The value of this constant is 2048
   * </p>
   */
  BEHAVIORRENDERINFO_DISABLEPOSITIVEZ(2048),
  /**
   * <p>
   * The value of this constant is 3840
   * </p>
   */
  BEHAVIORRENDERINFO_DISABLEALLLAYERS(3840),
  /**
   * <p>
   * The value of this constant is 4096
   * </p>
   */
  BEHAVIORRENDERINFO_HITTESTING(4096),
  /**
   * <p>
   * The value of this constant is 1048576
   * </p>
   */
  BEHAVIORRENDERINFO_SURFACE(1048576),
  /**
   * <p>
   * The value of this constant is 2097152
   * </p>
   */
  BEHAVIORRENDERINFO_3DSURFACE(2097152),
  /**
   * <p>
   * The value of this constant is 2147483647
   * </p>
   */
  BEHAVIOR_RENDER_INFO_Max(2147483647),
  ;

  private final int value;
  _BEHAVIOR_RENDER_INFO(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
