package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLCurrentStyle extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   */

  @DISPID(-2147413611)
  @PropGet
  int length();


  /**
   * <p>
   * Getter method for the COM property "parentRule"
   * </p>
   */

  @DISPID(-2147413610)
  @PropGet
  java.lang.Object parentRule();


  /**
   * @param bstrPropertyName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413609)
  java.lang.String getPropertyValue(
    java.lang.String bstrPropertyName);


  /**
   * @param bstrPropertyName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413608)
  java.lang.String getPropertyPriority(
    java.lang.String bstrPropertyName);


  /**
   * @param bstrPropertyName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413607)
  java.lang.String removeProperty(
    java.lang.String bstrPropertyName);


  /**
   * @param bstrPropertyName Mandatory java.lang.String parameter.
   * @param pvarPropertyValue Mandatory java.lang.Object parameter.
   * @param pvarPropertyPriority Optional parameter. Default value is ""
   */

  @DISPID(-2147413606)
  void setProperty(
    java.lang.String bstrPropertyName,
    java.lang.Object pvarPropertyValue,
    @Optional @DefaultValue("") java.lang.Object pvarPropertyPriority);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(0)
  @DefaultMethod
  java.lang.String item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "position"
   * </p>
   */

  @DISPID(-2147413022)
  @PropGet
  java.lang.String position();


  /**
   * <p>
   * Getter method for the COM property "styleFloat"
   * </p>
   */

  @DISPID(-2147413042)
  @PropGet
  java.lang.String styleFloat();


  /**
   * <p>
   * Getter method for the COM property "color"
   * </p>
   */

  @DISPID(-2147413110)
  @PropGet
  java.lang.Object color();


  /**
   * <p>
   * Getter method for the COM property "backgroundColor"
   * </p>
   */

  @DISPID(-501)
  @PropGet
  java.lang.Object backgroundColor();


  /**
   * <p>
   * Getter method for the COM property "fontFamily"
   * </p>
   */

  @DISPID(-2147413094)
  @PropGet
  java.lang.String fontFamily();


  /**
   * <p>
   * Getter method for the COM property "fontStyle"
   * </p>
   */

  @DISPID(-2147413088)
  @PropGet
  java.lang.String fontStyle();


  /**
   * <p>
   * Getter method for the COM property "fontVariant"
   * </p>
   */

  @DISPID(-2147413087)
  @PropGet
  java.lang.String fontVariant();


  /**
   * <p>
   * Getter method for the COM property "fontWeight"
   * </p>
   */

  @DISPID(-2147413085)
  @PropGet
  java.lang.Object fontWeight();


  /**
   * <p>
   * Getter method for the COM property "fontSize"
   * </p>
   */

  @DISPID(-2147413093)
  @PropGet
  java.lang.Object fontSize();


  /**
   * <p>
   * Getter method for the COM property "backgroundImage"
   * </p>
   */

  @DISPID(-2147413111)
  @PropGet
  java.lang.String backgroundImage();


  /**
   * <p>
   * Getter method for the COM property "backgroundPositionX"
   * </p>
   */

  @DISPID(-2147413079)
  @PropGet
  java.lang.Object backgroundPositionX();


  /**
   * <p>
   * Getter method for the COM property "backgroundPositionY"
   * </p>
   */

  @DISPID(-2147413078)
  @PropGet
  java.lang.Object backgroundPositionY();


  /**
   * <p>
   * Getter method for the COM property "backgroundRepeat"
   * </p>
   */

  @DISPID(-2147413068)
  @PropGet
  java.lang.String backgroundRepeat();


  /**
   * <p>
   * Getter method for the COM property "borderLeftColor"
   * </p>
   */

  @DISPID(-2147413054)
  @PropGet
  java.lang.Object borderLeftColor();


  /**
   * <p>
   * Getter method for the COM property "borderTopColor"
   * </p>
   */

  @DISPID(-2147413057)
  @PropGet
  java.lang.Object borderTopColor();


  /**
   * <p>
   * Getter method for the COM property "borderRightColor"
   * </p>
   */

  @DISPID(-2147413056)
  @PropGet
  java.lang.Object borderRightColor();


  /**
   * <p>
   * Getter method for the COM property "borderBottomColor"
   * </p>
   */

  @DISPID(-2147413055)
  @PropGet
  java.lang.Object borderBottomColor();


  /**
   * <p>
   * Getter method for the COM property "borderTopStyle"
   * </p>
   */

  @DISPID(-2147413047)
  @PropGet
  java.lang.String borderTopStyle();


  /**
   * <p>
   * Getter method for the COM property "borderRightStyle"
   * </p>
   */

  @DISPID(-2147413046)
  @PropGet
  java.lang.String borderRightStyle();


  /**
   * <p>
   * Getter method for the COM property "borderBottomStyle"
   * </p>
   */

  @DISPID(-2147413045)
  @PropGet
  java.lang.String borderBottomStyle();


  /**
   * <p>
   * Getter method for the COM property "borderLeftStyle"
   * </p>
   */

  @DISPID(-2147413044)
  @PropGet
  java.lang.String borderLeftStyle();


  /**
   * <p>
   * Getter method for the COM property "borderTopWidth"
   * </p>
   */

  @DISPID(-2147413052)
  @PropGet
  java.lang.Object borderTopWidth();


  /**
   * <p>
   * Getter method for the COM property "borderRightWidth"
   * </p>
   */

  @DISPID(-2147413051)
  @PropGet
  java.lang.Object borderRightWidth();


  /**
   * <p>
   * Getter method for the COM property "borderBottomWidth"
   * </p>
   */

  @DISPID(-2147413050)
  @PropGet
  java.lang.Object borderBottomWidth();


  /**
   * <p>
   * Getter method for the COM property "borderLeftWidth"
   * </p>
   */

  @DISPID(-2147413049)
  @PropGet
  java.lang.Object borderLeftWidth();


  /**
   * <p>
   * Getter method for the COM property "left"
   * </p>
   */

  @DISPID(-2147418109)
  @PropGet
  java.lang.Object left();


  /**
   * <p>
   * Getter method for the COM property "top"
   * </p>
   */

  @DISPID(-2147418108)
  @PropGet
  java.lang.Object top();


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   */

  @DISPID(-2147418107)
  @PropGet
  java.lang.Object width();


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   */

  @DISPID(-2147418106)
  @PropGet
  java.lang.Object height();


  /**
   * <p>
   * Getter method for the COM property "paddingLeft"
   * </p>
   */

  @DISPID(-2147413097)
  @PropGet
  java.lang.Object paddingLeft();


  /**
   * <p>
   * Getter method for the COM property "paddingTop"
   * </p>
   */

  @DISPID(-2147413100)
  @PropGet
  java.lang.Object paddingTop();


  /**
   * <p>
   * Getter method for the COM property "paddingRight"
   * </p>
   */

  @DISPID(-2147413099)
  @PropGet
  java.lang.Object paddingRight();


  /**
   * <p>
   * Getter method for the COM property "paddingBottom"
   * </p>
   */

  @DISPID(-2147413098)
  @PropGet
  java.lang.Object paddingBottom();


  /**
   * <p>
   * Getter method for the COM property "textAlign"
   * </p>
   */

  @DISPID(-2147418040)
  @PropGet
  java.lang.String textAlign();


  /**
   * <p>
   * Getter method for the COM property "textDecoration"
   * </p>
   */

  @DISPID(-2147413077)
  @PropGet
  java.lang.String textDecoration();


  /**
   * <p>
   * Getter method for the COM property "display"
   * </p>
   */

  @DISPID(-2147413041)
  @PropGet
  java.lang.String display();


  /**
   * <p>
   * Getter method for the COM property "visibility"
   * </p>
   */

  @DISPID(-2147413032)
  @PropGet
  java.lang.String visibility();


  /**
   * <p>
   * Getter method for the COM property "zIndex"
   * </p>
   */

  @DISPID(-2147413021)
  @PropGet
  java.lang.Object zIndex();


  /**
   * <p>
   * Getter method for the COM property "letterSpacing"
   * </p>
   */

  @DISPID(-2147413104)
  @PropGet
  java.lang.Object letterSpacing();


  /**
   * <p>
   * Getter method for the COM property "lineHeight"
   * </p>
   */

  @DISPID(-2147413106)
  @PropGet
  java.lang.Object lineHeight();


  /**
   * <p>
   * Getter method for the COM property "textIndent"
   * </p>
   */

  @DISPID(-2147413105)
  @PropGet
  java.lang.Object textIndent();


  /**
   * <p>
   * Getter method for the COM property "verticalAlign"
   * </p>
   */

  @DISPID(-2147413064)
  @PropGet
  java.lang.Object verticalAlign();


  /**
   * <p>
   * Getter method for the COM property "backgroundAttachment"
   * </p>
   */

  @DISPID(-2147413067)
  @PropGet
  java.lang.String backgroundAttachment();


  /**
   * <p>
   * Getter method for the COM property "marginTop"
   * </p>
   */

  @DISPID(-2147413075)
  @PropGet
  java.lang.Object marginTop();


  /**
   * <p>
   * Getter method for the COM property "marginRight"
   * </p>
   */

  @DISPID(-2147413074)
  @PropGet
  java.lang.Object marginRight();


  /**
   * <p>
   * Getter method for the COM property "marginBottom"
   * </p>
   */

  @DISPID(-2147413073)
  @PropGet
  java.lang.Object marginBottom();


  /**
   * <p>
   * Getter method for the COM property "marginLeft"
   * </p>
   */

  @DISPID(-2147413072)
  @PropGet
  java.lang.Object marginLeft();


  /**
   * <p>
   * Getter method for the COM property "clear"
   * </p>
   */

  @DISPID(-2147413096)
  @PropGet
  java.lang.String clear();


  /**
   * <p>
   * Getter method for the COM property "listStyleType"
   * </p>
   */

  @DISPID(-2147413040)
  @PropGet
  java.lang.String listStyleType();


  /**
   * <p>
   * Getter method for the COM property "listStylePosition"
   * </p>
   */

  @DISPID(-2147413039)
  @PropGet
  java.lang.String listStylePosition();


  /**
   * <p>
   * Getter method for the COM property "listStyleImage"
   * </p>
   */

  @DISPID(-2147413038)
  @PropGet
  java.lang.String listStyleImage();


  /**
   * <p>
   * Getter method for the COM property "clipTop"
   * </p>
   */

  @DISPID(-2147413019)
  @PropGet
  java.lang.Object clipTop();


  /**
   * <p>
   * Getter method for the COM property "clipRight"
   * </p>
   */

  @DISPID(-2147413018)
  @PropGet
  java.lang.Object clipRight();


  /**
   * <p>
   * Getter method for the COM property "clipBottom"
   * </p>
   */

  @DISPID(-2147413017)
  @PropGet
  java.lang.Object clipBottom();


  /**
   * <p>
   * Getter method for the COM property "clipLeft"
   * </p>
   */

  @DISPID(-2147413016)
  @PropGet
  java.lang.Object clipLeft();


  /**
   * <p>
   * Getter method for the COM property "overflow"
   * </p>
   */

  @DISPID(-2147413102)
  @PropGet
  java.lang.String overflow();


  /**
   * <p>
   * Getter method for the COM property "pageBreakBefore"
   * </p>
   */

  @DISPID(-2147413035)
  @PropGet
  java.lang.String pageBreakBefore();


  /**
   * <p>
   * Getter method for the COM property "pageBreakAfter"
   * </p>
   */

  @DISPID(-2147413034)
  @PropGet
  java.lang.String pageBreakAfter();


  /**
   * <p>
   * Getter method for the COM property "cursor"
   * </p>
   */

  @DISPID(-2147413010)
  @PropGet
  java.lang.String cursor();


  /**
   * <p>
   * Getter method for the COM property "tableLayout"
   * </p>
   */

  @DISPID(-2147413014)
  @PropGet
  java.lang.String tableLayout();


  /**
   * <p>
   * Getter method for the COM property "borderCollapse"
   * </p>
   */

  @DISPID(-2147413028)
  @PropGet
  java.lang.String borderCollapse();


  /**
   * <p>
   * Getter method for the COM property "direction"
   * </p>
   */

  @DISPID(-2147412993)
  @PropGet
  java.lang.String direction();


  /**
   * <p>
   * Getter method for the COM property "behavior"
   * </p>
   */

  @DISPID(-2147412997)
  @PropGet
  java.lang.String behavior();


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param lFlags Optional parameter. Default value is 0
   */

  @DISPID(-2147417610)
  java.lang.Object getAttribute(
    java.lang.String strAttributeName,
    @Optional @DefaultValue("0") int lFlags);


  /**
   * <p>
   * Getter method for the COM property "unicodeBidi"
   * </p>
   */

  @DISPID(-2147412994)
  @PropGet
  java.lang.String unicodeBidi();


  /**
   * <p>
   * Getter method for the COM property "right"
   * </p>
   */

  @DISPID(-2147418035)
  @PropGet
  java.lang.Object right();


  /**
   * <p>
   * Getter method for the COM property "bottom"
   * </p>
   */

  @DISPID(-2147418034)
  @PropGet
  java.lang.Object bottom();


  /**
   * <p>
   * Getter method for the COM property "imeMode"
   * </p>
   */

  @DISPID(-2147412992)
  @PropGet
  java.lang.String imeMode();


  /**
   * <p>
   * Getter method for the COM property "rubyAlign"
   * </p>
   */

  @DISPID(-2147412991)
  @PropGet
  java.lang.String rubyAlign();


  /**
   * <p>
   * Getter method for the COM property "rubyPosition"
   * </p>
   */

  @DISPID(-2147412990)
  @PropGet
  java.lang.String rubyPosition();


  /**
   * <p>
   * Getter method for the COM property "rubyOverhang"
   * </p>
   */

  @DISPID(-2147412989)
  @PropGet
  java.lang.String rubyOverhang();


  /**
   * <p>
   * Getter method for the COM property "textAutospace"
   * </p>
   */

  @DISPID(-2147412980)
  @PropGet
  java.lang.String textAutospace();


  /**
   * <p>
   * Getter method for the COM property "lineBreak"
   * </p>
   */

  @DISPID(-2147412979)
  @PropGet
  java.lang.String lineBreak();


  /**
   * <p>
   * Getter method for the COM property "wordBreak"
   * </p>
   */

  @DISPID(-2147412978)
  @PropGet
  java.lang.String wordBreak();


  /**
   * <p>
   * Getter method for the COM property "textJustify"
   * </p>
   */

  @DISPID(-2147412977)
  @PropGet
  java.lang.String textJustify();


  /**
   * <p>
   * Getter method for the COM property "textJustifyTrim"
   * </p>
   */

  @DISPID(-2147412976)
  @PropGet
  java.lang.String textJustifyTrim();


  /**
   * <p>
   * Getter method for the COM property "textKashida"
   * </p>
   */

  @DISPID(-2147412975)
  @PropGet
  java.lang.Object textKashida();


  /**
   * <p>
   * Getter method for the COM property "blockDirection"
   * </p>
   */

  @DISPID(-2147412995)
  @PropGet
  java.lang.String blockDirection();


  /**
   * <p>
   * Getter method for the COM property "layoutGridChar"
   * </p>
   */

  @DISPID(-2147412985)
  @PropGet
  java.lang.Object layoutGridChar();


  /**
   * <p>
   * Getter method for the COM property "layoutGridLine"
   * </p>
   */

  @DISPID(-2147412984)
  @PropGet
  java.lang.Object layoutGridLine();


  /**
   * <p>
   * Getter method for the COM property "layoutGridMode"
   * </p>
   */

  @DISPID(-2147412983)
  @PropGet
  java.lang.String layoutGridMode();


  /**
   * <p>
   * Getter method for the COM property "layoutGridType"
   * </p>
   */

  @DISPID(-2147412982)
  @PropGet
  java.lang.String layoutGridType();


  /**
   * <p>
   * Getter method for the COM property "borderStyle"
   * </p>
   */

  @DISPID(-2147413048)
  @PropGet
  java.lang.String borderStyle();


  /**
   * <p>
   * Getter method for the COM property "borderColor"
   * </p>
   */

  @DISPID(-2147413058)
  @PropGet
  java.lang.String borderColor();


  /**
   * <p>
   * Getter method for the COM property "borderWidth"
   * </p>
   */

  @DISPID(-2147413053)
  @PropGet
  java.lang.String borderWidth();


  /**
   * <p>
   * Getter method for the COM property "padding"
   * </p>
   */

  @DISPID(-2147413101)
  @PropGet
  java.lang.String padding();


  /**
   * <p>
   * Getter method for the COM property "margin"
   * </p>
   */

  @DISPID(-2147413076)
  @PropGet
  java.lang.String margin();


  /**
   * <p>
   * Getter method for the COM property "accelerator"
   * </p>
   */

  @DISPID(-2147412965)
  @PropGet
  java.lang.String accelerator();


  /**
   * <p>
   * Getter method for the COM property "overflowX"
   * </p>
   */

  @DISPID(-2147412973)
  @PropGet
  java.lang.String overflowX();


  /**
   * <p>
   * Getter method for the COM property "overflowY"
   * </p>
   */

  @DISPID(-2147412972)
  @PropGet
  java.lang.String overflowY();


  /**
   * <p>
   * Getter method for the COM property "textTransform"
   * </p>
   */

  @DISPID(-2147413108)
  @PropGet
  java.lang.String textTransform();


  /**
   * <p>
   * Getter method for the COM property "layoutFlow"
   * </p>
   */

  @DISPID(-2147412957)
  @PropGet
  java.lang.String layoutFlow();


  /**
   * <p>
   * Getter method for the COM property "wordWrap"
   * </p>
   */

  @DISPID(-2147412954)
  @PropGet
  java.lang.String wordWrap();


  /**
   * <p>
   * Getter method for the COM property "textUnderlinePosition"
   * </p>
   */

  @DISPID(-2147412953)
  @PropGet
  java.lang.String textUnderlinePosition();


  /**
   * <p>
   * Getter method for the COM property "hasLayout"
   * </p>
   */

  @DISPID(-2147412952)
  @PropGet
  boolean hasLayout();


  /**
   * <p>
   * Getter method for the COM property "scrollbarBaseColor"
   * </p>
   */

  @DISPID(-2147412932)
  @PropGet
  java.lang.Object scrollbarBaseColor();


  /**
   * <p>
   * Getter method for the COM property "scrollbarFaceColor"
   * </p>
   */

  @DISPID(-2147412931)
  @PropGet
  java.lang.Object scrollbarFaceColor();


  /**
   * <p>
   * Getter method for the COM property "scrollbar3dLightColor"
   * </p>
   */

  @DISPID(-2147412930)
  @PropGet
  java.lang.Object scrollbar3dLightColor();


  /**
   * <p>
   * Getter method for the COM property "scrollbarShadowColor"
   * </p>
   */

  @DISPID(-2147412929)
  @PropGet
  java.lang.Object scrollbarShadowColor();


  /**
   * <p>
   * Getter method for the COM property "scrollbarHighlightColor"
   * </p>
   */

  @DISPID(-2147412928)
  @PropGet
  java.lang.Object scrollbarHighlightColor();


  /**
   * <p>
   * Getter method for the COM property "scrollbarDarkShadowColor"
   * </p>
   */

  @DISPID(-2147412927)
  @PropGet
  java.lang.Object scrollbarDarkShadowColor();


  /**
   * <p>
   * Getter method for the COM property "scrollbarArrowColor"
   * </p>
   */

  @DISPID(-2147412926)
  @PropGet
  java.lang.Object scrollbarArrowColor();


  /**
   * <p>
   * Getter method for the COM property "scrollbarTrackColor"
   * </p>
   */

  @DISPID(-2147412916)
  @PropGet
  java.lang.Object scrollbarTrackColor();


  /**
   * <p>
   * Getter method for the COM property "writingMode"
   * </p>
   */

  @DISPID(-2147412920)
  @PropGet
  java.lang.String writingMode();


  /**
   * <p>
   * Getter method for the COM property "zoom"
   * </p>
   */

  @DISPID(-2147412959)
  @PropGet
  java.lang.Object zoom();


  /**
   * <p>
   * Getter method for the COM property "filter"
   * </p>
   */

  @DISPID(-2147413030)
  @PropGet
  java.lang.String filter();


  /**
   * <p>
   * Getter method for the COM property "textAlignLast"
   * </p>
   */

  @DISPID(-2147412909)
  @PropGet
  java.lang.String textAlignLast();


  /**
   * <p>
   * Getter method for the COM property "textKashidaSpace"
   * </p>
   */

  @DISPID(-2147412908)
  @PropGet
  java.lang.Object textKashidaSpace();


  /**
   * <p>
   * Getter method for the COM property "isBlock"
   * </p>
   */

  @DISPID(-2147412904)
  @PropGet
  boolean isBlock();


  /**
   * <p>
   * Getter method for the COM property "textOverflow"
   * </p>
   */

  @DISPID(-2147412903)
  @PropGet
  java.lang.String textOverflow();


  /**
   * <p>
   * Getter method for the COM property "minHeight"
   * </p>
   */

  @DISPID(-2147412901)
  @PropGet
  java.lang.Object minHeight();


  /**
   * <p>
   * Getter method for the COM property "wordSpacing"
   * </p>
   */

  @DISPID(-2147413065)
  @PropGet
  java.lang.Object wordSpacing();


  /**
   * <p>
   * Getter method for the COM property "whiteSpace"
   * </p>
   */

  @DISPID(-2147413036)
  @PropGet
  java.lang.String whiteSpace();


  /**
   * <p>
   * Getter method for the COM property "msInterpolationMode"
   * </p>
   */

  @DISPID(-2147412899)
  @PropGet
  java.lang.String msInterpolationMode();


  /**
   * <p>
   * Getter method for the COM property "maxHeight"
   * </p>
   */

  @DISPID(-2147412898)
  @PropGet
  java.lang.Object maxHeight();


  /**
   * <p>
   * Getter method for the COM property "minWidth"
   * </p>
   */

  @DISPID(-2147412897)
  @PropGet
  java.lang.Object minWidth();


  /**
   * <p>
   * Getter method for the COM property "maxWidth"
   * </p>
   */

  @DISPID(-2147412896)
  @PropGet
  java.lang.Object maxWidth();


  /**
   * <p>
   * Getter method for the COM property "captionSide"
   * </p>
   */

  @DISPID(-2147412893)
  @PropGet
  java.lang.String captionSide();


  /**
   * <p>
   * Getter method for the COM property "outline"
   * </p>
   */

  @DISPID(-2147412890)
  @PropGet
  java.lang.String outline();


  /**
   * <p>
   * Getter method for the COM property "outlineWidth"
   * </p>
   */

  @DISPID(-2147412889)
  @PropGet
  java.lang.Object outlineWidth();


  /**
   * <p>
   * Getter method for the COM property "outlineStyle"
   * </p>
   */

  @DISPID(-2147412888)
  @PropGet
  java.lang.String outlineStyle();


  /**
   * <p>
   * Getter method for the COM property "outlineColor"
   * </p>
   */

  @DISPID(-2147412887)
  @PropGet
  java.lang.Object outlineColor();


  /**
   * <p>
   * Getter method for the COM property "boxSizing"
   * </p>
   */

  @DISPID(-2147412886)
  @PropGet
  java.lang.String boxSizing();


  /**
   * <p>
   * Getter method for the COM property "borderSpacing"
   * </p>
   */

  @DISPID(-2147412885)
  @PropGet
  java.lang.String borderSpacing();


  /**
   * <p>
   * Getter method for the COM property "orphans"
   * </p>
   */

  @DISPID(-2147412884)
  @PropGet
  java.lang.Object orphans();


  /**
   * <p>
   * Getter method for the COM property "widows"
   * </p>
   */

  @DISPID(-2147412883)
  @PropGet
  java.lang.Object widows();


  /**
   * <p>
   * Getter method for the COM property "pageBreakInside"
   * </p>
   */

  @DISPID(-2147412882)
  @PropGet
  java.lang.String pageBreakInside();


  /**
   * <p>
   * Getter method for the COM property "emptyCells"
   * </p>
   */

  @DISPID(-2147412862)
  @PropGet
  java.lang.String emptyCells();


  /**
   * <p>
   * Getter method for the COM property "msBlockProgression"
   * </p>
   */

  @DISPID(-2147412861)
  @PropGet
  java.lang.String msBlockProgression();


  /**
   * <p>
   * Getter method for the COM property "quotes"
   * </p>
   */

  @DISPID(-2147412860)
  @PropGet
  java.lang.String quotes();


  /**
   * <p>
   * Getter method for the COM property "constructor"
   * </p>
   */

  @DISPID(-2147417603)
  @PropGet
  com4j.Com4jObject constructor();


  // Properties:
}
