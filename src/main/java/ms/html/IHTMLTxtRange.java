package ms.html  ;

import com4j.*;

@IID("{3050F220-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTxtRange extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "htmlText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String htmlText();


  /**
   * <p>
   * Setter method for the COM property "text"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(8)
  void text(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String text();


  /**
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLElement parentElement();


  /**
   * @return  Returns a value of type ms.html.IHTMLTxtRange
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.IHTMLTxtRange duplicate();


  /**
   * @param range Mandatory ms.html.IHTMLTxtRange parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(12)
  boolean inRange(
    ms.html.IHTMLTxtRange range);


  /**
   * @param range Mandatory ms.html.IHTMLTxtRange parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(13)
  boolean isEqual(
    ms.html.IHTMLTxtRange range);


  /**
   * @param fStart Optional parameter. Default value is false
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(14)
  void scrollIntoView(
    @Optional @DefaultValue("-1") boolean fStart);


  /**
   * @param start Optional parameter. Default value is false
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(15)
  void collapse(
    @Optional @DefaultValue("-1") boolean start);


  /**
   * @param unit Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(16)
  boolean expand(
    java.lang.String unit);


  /**
   * @param unit Mandatory java.lang.String parameter.
   * @param count Optional parameter. Default value is 1
   * @return  Returns a value of type int
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(17)
  int move(
    java.lang.String unit,
    @Optional @DefaultValue("1") int count);


  /**
   * @param unit Mandatory java.lang.String parameter.
   * @param count Optional parameter. Default value is 1
   * @return  Returns a value of type int
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(18)
  int moveStart(
    java.lang.String unit,
    @Optional @DefaultValue("1") int count);


  /**
   * @param unit Mandatory java.lang.String parameter.
   * @param count Optional parameter. Default value is 1
   * @return  Returns a value of type int
   */

  @DISPID(1017) //= 0x3f9. The runtime will prefer the VTID if present
  @VTID(19)
  int moveEnd(
    java.lang.String unit,
    @Optional @DefaultValue("1") int count);


  /**
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(20)
  void select();


  /**
   * @param html Mandatory java.lang.String parameter.
   */

  @DISPID(1026) //= 0x402. The runtime will prefer the VTID if present
  @VTID(21)
  void pasteHTML(
    java.lang.String html);


  /**
   * @param element Mandatory ms.html.IHTMLElement parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(22)
  void moveToElementText(
    ms.html.IHTMLElement element);


  /**
   * @param how Mandatory java.lang.String parameter.
   * @param sourceRange Mandatory ms.html.IHTMLTxtRange parameter.
   */

  @DISPID(1025) //= 0x401. The runtime will prefer the VTID if present
  @VTID(23)
  void setEndPoint(
    java.lang.String how,
    ms.html.IHTMLTxtRange sourceRange);


  /**
   * @param how Mandatory java.lang.String parameter.
   * @param sourceRange Mandatory ms.html.IHTMLTxtRange parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1018) //= 0x3fa. The runtime will prefer the VTID if present
  @VTID(24)
  int compareEndPoints(
    java.lang.String how,
    ms.html.IHTMLTxtRange sourceRange);


  /**
   * @param string Mandatory java.lang.String parameter.
   * @param count Optional parameter. Default value is 1073741823
   * @param flags Optional parameter. Default value is 0
   * @return  Returns a value of type boolean
   */

  @DISPID(1019) //= 0x3fb. The runtime will prefer the VTID if present
  @VTID(25)
  boolean findText(
    java.lang.String string,
    @Optional @DefaultValue("1073741823") int count,
    @Optional @DefaultValue("0") int flags);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(26)
  void moveToPoint(
    int x,
    int y);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1021) //= 0x3fd. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String getBookmark();


  /**
   * @param bookmark Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(28)
  boolean moveToBookmark(
    java.lang.String bookmark);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1027) //= 0x403. The runtime will prefer the VTID if present
  @VTID(29)
  boolean queryCommandSupported(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1028) //= 0x404. The runtime will prefer the VTID if present
  @VTID(30)
  boolean queryCommandEnabled(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1029) //= 0x405. The runtime will prefer the VTID if present
  @VTID(31)
  boolean queryCommandState(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1030) //= 0x406. The runtime will prefer the VTID if present
  @VTID(32)
  boolean queryCommandIndeterm(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String queryCommandText(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1032) //= 0x408. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object queryCommandValue(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @param showUI Optional parameter. Default value is false
   * @param value Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(1033) //= 0x409. The runtime will prefer the VTID if present
  @VTID(35)
  boolean execCommand(
    java.lang.String cmdID,
    @Optional @DefaultValue("0") boolean showUI,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1034) //= 0x40a. The runtime will prefer the VTID if present
  @VTID(36)
  boolean execCommandShowHelp(
    java.lang.String cmdID);


  // Properties:
}
