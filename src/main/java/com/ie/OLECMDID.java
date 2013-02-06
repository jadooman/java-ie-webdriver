package com.ie  ;

import com4j.*;

/**
 */
public enum OLECMDID implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  OLECMDID_OPEN(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  OLECMDID_NEW(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  OLECMDID_SAVE(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  OLECMDID_SAVEAS(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  OLECMDID_SAVECOPYAS(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  OLECMDID_PRINT(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  OLECMDID_PRINTPREVIEW(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  OLECMDID_PAGESETUP(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  OLECMDID_SPELL(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  OLECMDID_PROPERTIES(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  OLECMDID_CUT(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  OLECMDID_COPY(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  OLECMDID_PASTE(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  OLECMDID_PASTESPECIAL(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  OLECMDID_UNDO(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  OLECMDID_REDO(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  OLECMDID_SELECTALL(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  OLECMDID_CLEARSELECTION(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  OLECMDID_ZOOM(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  OLECMDID_GETZOOMRANGE(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  OLECMDID_UPDATECOMMANDS(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  OLECMDID_REFRESH(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  OLECMDID_STOP(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  OLECMDID_HIDETOOLBARS(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  OLECMDID_SETPROGRESSMAX(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  OLECMDID_SETPROGRESSPOS(26),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  OLECMDID_SETPROGRESSTEXT(27),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  OLECMDID_SETTITLE(28),
  /**
   * <p>
   * The value of this constant is 29
   * </p>
   */
  OLECMDID_SETDOWNLOADSTATE(29),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  OLECMDID_STOPDOWNLOAD(30),
  /**
   * <p>
   * The value of this constant is 31
   * </p>
   */
  OLECMDID_ONTOOLBARACTIVATED(31),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  OLECMDID_FIND(32),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  OLECMDID_DELETE(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  OLECMDID_HTTPEQUIV(34),
  /**
   * <p>
   * The value of this constant is 35
   * </p>
   */
  OLECMDID_HTTPEQUIV_DONE(35),
  /**
   * <p>
   * The value of this constant is 36
   * </p>
   */
  OLECMDID_ENABLE_INTERACTION(36),
  /**
   * <p>
   * The value of this constant is 37
   * </p>
   */
  OLECMDID_ONUNLOAD(37),
  /**
   * <p>
   * The value of this constant is 38
   * </p>
   */
  OLECMDID_PROPERTYBAG2(38),
  /**
   * <p>
   * The value of this constant is 39
   * </p>
   */
  OLECMDID_PREREFRESH(39),
  /**
   * <p>
   * The value of this constant is 40
   * </p>
   */
  OLECMDID_SHOWSCRIPTERROR(40),
  /**
   * <p>
   * The value of this constant is 41
   * </p>
   */
  OLECMDID_SHOWMESSAGE(41),
  /**
   * <p>
   * The value of this constant is 42
   * </p>
   */
  OLECMDID_SHOWFIND(42),
  /**
   * <p>
   * The value of this constant is 43
   * </p>
   */
  OLECMDID_SHOWPAGESETUP(43),
  /**
   * <p>
   * The value of this constant is 44
   * </p>
   */
  OLECMDID_SHOWPRINT(44),
  /**
   * <p>
   * The value of this constant is 45
   * </p>
   */
  OLECMDID_CLOSE(45),
  /**
   * <p>
   * The value of this constant is 46
   * </p>
   */
  OLECMDID_ALLOWUILESSSAVEAS(46),
  /**
   * <p>
   * The value of this constant is 47
   * </p>
   */
  OLECMDID_DONTDOWNLOADCSS(47),
  /**
   * <p>
   * The value of this constant is 48
   * </p>
   */
  OLECMDID_UPDATEPAGESTATUS(48),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  OLECMDID_PRINT2(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  OLECMDID_PRINTPREVIEW2(50),
  /**
   * <p>
   * The value of this constant is 51
   * </p>
   */
  OLECMDID_SETPRINTTEMPLATE(51),
  /**
   * <p>
   * The value of this constant is 52
   * </p>
   */
  OLECMDID_GETPRINTTEMPLATE(52),
  /**
   * <p>
   * The value of this constant is 55
   * </p>
   */
  OLECMDID_PAGEACTIONBLOCKED(55),
  /**
   * <p>
   * The value of this constant is 56
   * </p>
   */
  OLECMDID_PAGEACTIONUIQUERY(56),
  /**
   * <p>
   * The value of this constant is 57
   * </p>
   */
  OLECMDID_FOCUSVIEWCONTROLS(57),
  /**
   * <p>
   * The value of this constant is 58
   * </p>
   */
  OLECMDID_FOCUSVIEWCONTROLSQUERY(58),
  /**
   * <p>
   * The value of this constant is 59
   * </p>
   */
  OLECMDID_SHOWPAGEACTIONMENU(59),
  /**
   * <p>
   * The value of this constant is 60
   * </p>
   */
  OLECMDID_ADDTRAVELENTRY(60),
  /**
   * <p>
   * The value of this constant is 61
   * </p>
   */
  OLECMDID_UPDATETRAVELENTRY(61),
  /**
   * <p>
   * The value of this constant is 62
   * </p>
   */
  OLECMDID_UPDATEBACKFORWARDSTATE(62),
  /**
   * <p>
   * The value of this constant is 63
   * </p>
   */
  OLECMDID_OPTICAL_ZOOM(63),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  OLECMDID_OPTICAL_GETZOOMRANGE(64),
  /**
   * <p>
   * The value of this constant is 65
   * </p>
   */
  OLECMDID_WINDOWSTATECHANGED(65),
  /**
   * <p>
   * The value of this constant is 66
   * </p>
   */
  OLECMDID_ACTIVEXINSTALLSCOPE(66),
  /**
   * <p>
   * The value of this constant is 67
   * </p>
   */
  OLECMDID_UPDATETRAVELENTRY_DATARECOVERY(67),
  /**
   * <p>
   * The value of this constant is 68
   * </p>
   */
  OLECMDID_SHOWTASKDLG(68),
  /**
   * <p>
   * The value of this constant is 69
   * </p>
   */
  OLECMDID_POPSTATEEVENT(69),
  /**
   * <p>
   * The value of this constant is 70
   * </p>
   */
  OLECMDID_VIEWPORT_MODE(70),
  /**
   * <p>
   * The value of this constant is 71
   * </p>
   */
  OLECMDID_LAYOUT_VIEWPORT_WIDTH(71),
  /**
   * <p>
   * The value of this constant is 72
   * </p>
   */
  OLECMDID_VISUAL_VIEWPORT_EXCLUDE_BOTTOM(72),
  /**
   * <p>
   * The value of this constant is 73
   * </p>
   */
  OLECMDID_USER_OPTICAL_ZOOM(73),
  /**
   * <p>
   * The value of this constant is 74
   * </p>
   */
  OLECMDID_PAGEAVAILABLE(74),
  /**
   * <p>
   * The value of this constant is 75
   * </p>
   */
  OLECMDID_GETUSERSCALABLE(75),
  /**
   * <p>
   * The value of this constant is 76
   * </p>
   */
  OLECMDID_UPDATE_CARET(76),
  /**
   * <p>
   * The value of this constant is 77
   * </p>
   */
  OLECMDID_ENABLE_VISIBILITY(77),
  ;

  private final int value;
  OLECMDID(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
