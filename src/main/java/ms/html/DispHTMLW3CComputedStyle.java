package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLW3CComputedStyle extends Com4jObject {
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
   * Setter method for the COM property "fontFamily"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413094)
  @PropPut
  void fontFamily(
    java.lang.String rhs);


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
   * Setter method for the COM property "fontStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413088)
  @PropPut
  void fontStyle(
    java.lang.String rhs);


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
   * Setter method for the COM property "fontVariant"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413087)
  @PropPut
  void fontVariant(
    java.lang.String rhs);


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
   * Setter method for the COM property "fontWeight"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413085)
  @PropPut
  void fontWeight(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "fontWeight"
   * </p>
   */

  @DISPID(-2147413085)
  @PropGet
  java.lang.String fontWeight();


  /**
   * <p>
   * Setter method for the COM property "fontSize"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413093)
  @PropPut
  void fontSize(
    java.lang.Object rhs);


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
   * Setter method for the COM property "font"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413071)
  @PropPut
  void font(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "font"
   * </p>
   */

  @DISPID(-2147413071)
  @PropGet
  java.lang.String font();


  /**
   * <p>
   * Setter method for the COM property "color"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413110)
  @PropPut
  void color(
    java.lang.Object rhs);


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
   * Setter method for the COM property "background"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413080)
  @PropPut
  void background(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "background"
   * </p>
   */

  @DISPID(-2147413080)
  @PropGet
  java.lang.String background();


  /**
   * <p>
   * Setter method for the COM property "backgroundColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-501)
  @PropPut
  void backgroundColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "backgroundImage"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413111)
  @PropPut
  void backgroundImage(
    java.lang.String rhs);


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
   * Setter method for the COM property "backgroundRepeat"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413068)
  @PropPut
  void backgroundRepeat(
    java.lang.String rhs);


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
   * Setter method for the COM property "backgroundAttachment"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413067)
  @PropPut
  void backgroundAttachment(
    java.lang.String rhs);


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
   * Setter method for the COM property "backgroundPosition"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413066)
  @PropPut
  void backgroundPosition(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "backgroundPosition"
   * </p>
   */

  @DISPID(-2147413066)
  @PropGet
  java.lang.String backgroundPosition();


  /**
   * <p>
   * Setter method for the COM property "backgroundPositionX"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413079)
  @PropPut
  void backgroundPositionX(
    java.lang.Object rhs);


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
   * Setter method for the COM property "backgroundPositionY"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413078)
  @PropPut
  void backgroundPositionY(
    java.lang.Object rhs);


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
   * Setter method for the COM property "wordSpacing"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413065)
  @PropPut
  void wordSpacing(
    java.lang.Object rhs);


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
   * Setter method for the COM property "letterSpacing"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413104)
  @PropPut
  void letterSpacing(
    java.lang.Object rhs);


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
   * Setter method for the COM property "textDecoration"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413077)
  @PropPut
  void textDecoration(
    java.lang.String rhs);


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
   * Setter method for the COM property "verticalAlign"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413064)
  @PropPut
  void verticalAlign(
    java.lang.Object rhs);


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
   * Setter method for the COM property "textTransform"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413108)
  @PropPut
  void textTransform(
    java.lang.String rhs);


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
   * Setter method for the COM property "textAlign"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418040)
  @PropPut
  void textAlign(
    java.lang.String rhs);


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
   * Setter method for the COM property "textIndent"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413105)
  @PropPut
  void textIndent(
    java.lang.Object rhs);


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
   * Setter method for the COM property "lineHeight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413106)
  @PropPut
  void lineHeight(
    java.lang.Object rhs);


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
   * Setter method for the COM property "marginTop"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413075)
  @PropPut
  void marginTop(
    java.lang.Object rhs);


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
   * Setter method for the COM property "marginRight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413074)
  @PropPut
  void marginRight(
    java.lang.Object rhs);


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
   * Setter method for the COM property "marginBottom"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413073)
  @PropPut
  void marginBottom(
    java.lang.Object rhs);


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
   * Setter method for the COM property "marginLeft"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413072)
  @PropPut
  void marginLeft(
    java.lang.Object rhs);


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
   * Setter method for the COM property "margin"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413076)
  @PropPut
  void margin(
    java.lang.String rhs);


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
   * Setter method for the COM property "paddingTop"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413100)
  @PropPut
  void paddingTop(
    java.lang.Object rhs);


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
   * Setter method for the COM property "paddingRight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413099)
  @PropPut
  void paddingRight(
    java.lang.Object rhs);


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
   * Setter method for the COM property "paddingBottom"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413098)
  @PropPut
  void paddingBottom(
    java.lang.Object rhs);


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
   * Setter method for the COM property "paddingLeft"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413097)
  @PropPut
  void paddingLeft(
    java.lang.Object rhs);


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
   * Setter method for the COM property "padding"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413101)
  @PropPut
  void padding(
    java.lang.String rhs);


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
   * Setter method for the COM property "border"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413063)
  @PropPut
  void border(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "border"
   * </p>
   */

  @DISPID(-2147413063)
  @PropGet
  java.lang.String border();


  /**
   * <p>
   * Setter method for the COM property "borderTop"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413062)
  @PropPut
  void borderTop(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "borderTop"
   * </p>
   */

  @DISPID(-2147413062)
  @PropGet
  java.lang.String borderTop();


  /**
   * <p>
   * Setter method for the COM property "borderRight"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413061)
  @PropPut
  void borderRight(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "borderRight"
   * </p>
   */

  @DISPID(-2147413061)
  @PropGet
  java.lang.String borderRight();


  /**
   * <p>
   * Setter method for the COM property "borderBottom"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413060)
  @PropPut
  void borderBottom(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "borderBottom"
   * </p>
   */

  @DISPID(-2147413060)
  @PropGet
  java.lang.String borderBottom();


  /**
   * <p>
   * Setter method for the COM property "borderLeft"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413059)
  @PropPut
  void borderLeft(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "borderLeft"
   * </p>
   */

  @DISPID(-2147413059)
  @PropGet
  java.lang.String borderLeft();


  /**
   * <p>
   * Setter method for the COM property "borderColor"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413058)
  @PropPut
  void borderColor(
    java.lang.String rhs);


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
   * Setter method for the COM property "borderTopColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413057)
  @PropPut
  void borderTopColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "borderRightColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413056)
  @PropPut
  void borderRightColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "borderBottomColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413055)
  @PropPut
  void borderBottomColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "borderLeftColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413054)
  @PropPut
  void borderLeftColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "borderWidth"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413053)
  @PropPut
  void borderWidth(
    java.lang.String rhs);


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
   * Setter method for the COM property "borderTopWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413052)
  @PropPut
  void borderTopWidth(
    java.lang.Object rhs);


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
   * Setter method for the COM property "borderRightWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413051)
  @PropPut
  void borderRightWidth(
    java.lang.Object rhs);


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
   * Setter method for the COM property "borderBottomWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413050)
  @PropPut
  void borderBottomWidth(
    java.lang.Object rhs);


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
   * Setter method for the COM property "borderLeftWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413049)
  @PropPut
  void borderLeftWidth(
    java.lang.Object rhs);


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
   * Setter method for the COM property "borderStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413048)
  @PropPut
  void borderStyle(
    java.lang.String rhs);


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
   * Setter method for the COM property "borderTopStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413047)
  @PropPut
  void borderTopStyle(
    java.lang.String rhs);


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
   * Setter method for the COM property "borderRightStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413046)
  @PropPut
  void borderRightStyle(
    java.lang.String rhs);


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
   * Setter method for the COM property "borderBottomStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413045)
  @PropPut
  void borderBottomStyle(
    java.lang.String rhs);


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
   * Setter method for the COM property "borderLeftStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413044)
  @PropPut
  void borderLeftStyle(
    java.lang.String rhs);


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
   * Setter method for the COM property "width"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418107)
  @PropPut
  void width(
    java.lang.Object rhs);


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
   * Setter method for the COM property "height"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418106)
  @PropPut
  void height(
    java.lang.Object rhs);


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
   * Setter method for the COM property "styleFloat"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413042)
  @PropPut
  void styleFloat(
    java.lang.String rhs);


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
   * Setter method for the COM property "clear"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413096)
  @PropPut
  void clear(
    java.lang.String rhs);


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
   * Setter method for the COM property "display"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413041)
  @PropPut
  void display(
    java.lang.String rhs);


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
   * Setter method for the COM property "visibility"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413032)
  @PropPut
  void visibility(
    java.lang.String rhs);


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
   * Setter method for the COM property "listStyleType"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413040)
  @PropPut
  void listStyleType(
    java.lang.String rhs);


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
   * Setter method for the COM property "listStylePosition"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413039)
  @PropPut
  void listStylePosition(
    java.lang.String rhs);


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
   * Setter method for the COM property "listStyleImage"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413038)
  @PropPut
  void listStyleImage(
    java.lang.String rhs);


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
   * Setter method for the COM property "listStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413037)
  @PropPut
  void listStyle(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "listStyle"
   * </p>
   */

  @DISPID(-2147413037)
  @PropGet
  java.lang.String listStyle();


  /**
   * <p>
   * Setter method for the COM property "whiteSpace"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413036)
  @PropPut
  void whiteSpace(
    java.lang.String rhs);


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
   * Setter method for the COM property "top"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418108)
  @PropPut
  void top(
    java.lang.Object rhs);


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
   * Setter method for the COM property "left"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418109)
  @PropPut
  void left(
    java.lang.Object rhs);


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
   * Setter method for the COM property "zIndex"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413021)
  @PropPut
  void zIndex(
    java.lang.Object rhs);


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
   * Setter method for the COM property "overflow"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413102)
  @PropPut
  void overflow(
    java.lang.String rhs);


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
   * Setter method for the COM property "pageBreakBefore"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413035)
  @PropPut
  void pageBreakBefore(
    java.lang.String rhs);


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
   * Setter method for the COM property "pageBreakAfter"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413034)
  @PropPut
  void pageBreakAfter(
    java.lang.String rhs);


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
   * Setter method for the COM property "cssText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413013)
  @PropPut
  void cssText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "cssText"
   * </p>
   */

  @DISPID(-2147413013)
  @PropGet
  java.lang.String cssText();


  /**
   * <p>
   * Setter method for the COM property "cursor"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413010)
  @PropPut
  void cursor(
    java.lang.String rhs);


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
   * Setter method for the COM property "clip"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413020)
  @PropPut
  void clip(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "clip"
   * </p>
   */

  @DISPID(-2147413020)
  @PropGet
  java.lang.String clip();


  /**
   * <p>
   * Setter method for the COM property "filter"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413030)
  @PropPut
  void filter(
    java.lang.String rhs);


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
   * Setter method for the COM property "tableLayout"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413014)
  @PropPut
  void tableLayout(
    java.lang.String rhs);


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
   * Setter method for the COM property "borderCollapse"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413028)
  @PropPut
  void borderCollapse(
    java.lang.String rhs);


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
   * Setter method for the COM property "direction"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412993)
  @PropPut
  void direction(
    java.lang.String rhs);


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
   * Setter method for the COM property "behavior"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412997)
  @PropPut
  void behavior(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "behavior"
   * </p>
   */

  @DISPID(-2147412997)
  @PropGet
  java.lang.String behavior();


  /**
   * <p>
   * Setter method for the COM property "position"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413022)
  @PropPut
  void position(
    java.lang.String rhs);


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
   * Setter method for the COM property "unicodeBidi"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412994)
  @PropPut
  void unicodeBidi(
    java.lang.String rhs);


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
   * Setter method for the COM property "bottom"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418034)
  @PropPut
  void bottom(
    java.lang.Object rhs);


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
   * Setter method for the COM property "right"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418035)
  @PropPut
  void right(
    java.lang.Object rhs);


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
   * Setter method for the COM property "imeMode"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412992)
  @PropPut
  void imeMode(
    java.lang.String rhs);


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
   * Setter method for the COM property "rubyAlign"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412991)
  @PropPut
  void rubyAlign(
    java.lang.String rhs);


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
   * Setter method for the COM property "rubyPosition"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412990)
  @PropPut
  void rubyPosition(
    java.lang.String rhs);


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
   * Setter method for the COM property "rubyOverhang"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412989)
  @PropPut
  void rubyOverhang(
    java.lang.String rhs);


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
   * Setter method for the COM property "layoutGridChar"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412985)
  @PropPut
  void layoutGridChar(
    java.lang.Object rhs);


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
   * Setter method for the COM property "layoutGridLine"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412984)
  @PropPut
  void layoutGridLine(
    java.lang.Object rhs);


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
   * Setter method for the COM property "layoutGridMode"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412983)
  @PropPut
  void layoutGridMode(
    java.lang.String rhs);


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
   * Setter method for the COM property "layoutGridType"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412982)
  @PropPut
  void layoutGridType(
    java.lang.String rhs);


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
   * Setter method for the COM property "layoutGrid"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412981)
  @PropPut
  void layoutGrid(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "layoutGrid"
   * </p>
   */

  @DISPID(-2147412981)
  @PropGet
  java.lang.String layoutGrid();


  /**
   * <p>
   * Setter method for the COM property "textAutospace"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412980)
  @PropPut
  void textAutospace(
    java.lang.String rhs);


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
   * Setter method for the COM property "wordBreak"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412978)
  @PropPut
  void wordBreak(
    java.lang.String rhs);


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
   * Setter method for the COM property "lineBreak"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412979)
  @PropPut
  void lineBreak(
    java.lang.String rhs);


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
   * Setter method for the COM property "textJustify"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412977)
  @PropPut
  void textJustify(
    java.lang.String rhs);


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
   * Setter method for the COM property "textJustifyTrim"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412976)
  @PropPut
  void textJustifyTrim(
    java.lang.String rhs);


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
   * Setter method for the COM property "textKashida"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412975)
  @PropPut
  void textKashida(
    java.lang.Object rhs);


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
   * Setter method for the COM property "overflowX"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412973)
  @PropPut
  void overflowX(
    java.lang.String rhs);


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
   * Setter method for the COM property "overflowY"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412972)
  @PropPut
  void overflowY(
    java.lang.String rhs);


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
   * Setter method for the COM property "accelerator"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412965)
  @PropPut
  void accelerator(
    java.lang.String rhs);


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
   * Setter method for the COM property "layoutFlow"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412957)
  @PropPut
  void layoutFlow(
    java.lang.String rhs);


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
   * Setter method for the COM property "zoom"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412959)
  @PropPut
  void zoom(
    java.lang.Object rhs);


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
   * Setter method for the COM property "wordWrap"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412954)
  @PropPut
  void wordWrap(
    java.lang.String rhs);


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
   * Setter method for the COM property "textUnderlinePosition"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412953)
  @PropPut
  void textUnderlinePosition(
    java.lang.String rhs);


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
   * Setter method for the COM property "scrollbarBaseColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412932)
  @PropPut
  void scrollbarBaseColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "scrollbarFaceColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412931)
  @PropPut
  void scrollbarFaceColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "scrollbar3dLightColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412930)
  @PropPut
  void scrollbar3dLightColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "scrollbarShadowColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412929)
  @PropPut
  void scrollbarShadowColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "scrollbarHighlightColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412928)
  @PropPut
  void scrollbarHighlightColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "scrollbarDarkShadowColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412927)
  @PropPut
  void scrollbarDarkShadowColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "scrollbarArrowColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412926)
  @PropPut
  void scrollbarArrowColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "scrollbarTrackColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412916)
  @PropPut
  void scrollbarTrackColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "writingMode"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412920)
  @PropPut
  void writingMode(
    java.lang.String rhs);


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
   * Setter method for the COM property "textAlignLast"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412909)
  @PropPut
  void textAlignLast(
    java.lang.String rhs);


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
   * Setter method for the COM property "textKashidaSpace"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412908)
  @PropPut
  void textKashidaSpace(
    java.lang.Object rhs);


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
   * Setter method for the COM property "textOverflow"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412903)
  @PropPut
  void textOverflow(
    java.lang.String rhs);


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
   * Setter method for the COM property "minHeight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412901)
  @PropPut
  void minHeight(
    java.lang.Object rhs);


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
   * Setter method for the COM property "msInterpolationMode"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412899)
  @PropPut
  void msInterpolationMode(
    java.lang.String rhs);


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
   * Setter method for the COM property "maxHeight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412898)
  @PropPut
  void maxHeight(
    java.lang.Object rhs);


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
   * Setter method for the COM property "minWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412897)
  @PropPut
  void minWidth(
    java.lang.Object rhs);


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
   * Setter method for the COM property "maxWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412896)
  @PropPut
  void maxWidth(
    java.lang.Object rhs);


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
   * Setter method for the COM property "content"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412894)
  @PropPut
  void content(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "content"
   * </p>
   */

  @DISPID(-2147412894)
  @PropGet
  java.lang.String content();


  /**
   * <p>
   * Setter method for the COM property "captionSide"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412893)
  @PropPut
  void captionSide(
    java.lang.String rhs);


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
   * Setter method for the COM property "counterIncrement"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412892)
  @PropPut
  void counterIncrement(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "counterIncrement"
   * </p>
   */

  @DISPID(-2147412892)
  @PropGet
  java.lang.String counterIncrement();


  /**
   * <p>
   * Setter method for the COM property "counterReset"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412891)
  @PropPut
  void counterReset(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "counterReset"
   * </p>
   */

  @DISPID(-2147412891)
  @PropGet
  java.lang.String counterReset();


  /**
   * <p>
   * Setter method for the COM property "outline"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412890)
  @PropPut
  void outline(
    java.lang.String rhs);


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
   * Setter method for the COM property "outlineWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412889)
  @PropPut
  void outlineWidth(
    java.lang.Object rhs);


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
   * Setter method for the COM property "outlineStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412888)
  @PropPut
  void outlineStyle(
    java.lang.String rhs);


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
   * Setter method for the COM property "outlineColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412887)
  @PropPut
  void outlineColor(
    java.lang.Object rhs);


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
   * Setter method for the COM property "boxSizing"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412886)
  @PropPut
  void boxSizing(
    java.lang.String rhs);


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
   * Setter method for the COM property "borderSpacing"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412885)
  @PropPut
  void borderSpacing(
    java.lang.String rhs);


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
   * Setter method for the COM property "orphans"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412884)
  @PropPut
  void orphans(
    java.lang.Object rhs);


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
   * Setter method for the COM property "widows"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412883)
  @PropPut
  void widows(
    java.lang.Object rhs);


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
   * Setter method for the COM property "pageBreakInside"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412882)
  @PropPut
  void pageBreakInside(
    java.lang.String rhs);


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
   * Setter method for the COM property "emptyCells"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412862)
  @PropPut
  void emptyCells(
    java.lang.String rhs);


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
   * Setter method for the COM property "msBlockProgression"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412861)
  @PropPut
  void msBlockProgression(
    java.lang.String rhs);


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
   * Setter method for the COM property "quotes"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412860)
  @PropPut
  void quotes(
    java.lang.String rhs);


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
   * Setter method for the COM property "alignmentBaseline"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412834)
  @PropPut
  void alignmentBaseline(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "alignmentBaseline"
   * </p>
   */

  @DISPID(-2147412834)
  @PropGet
  java.lang.String alignmentBaseline();


  /**
   * <p>
   * Setter method for the COM property "baselineShift"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412833)
  @PropPut
  void baselineShift(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "baselineShift"
   * </p>
   */

  @DISPID(-2147412833)
  @PropGet
  java.lang.Object baselineShift();


  /**
   * <p>
   * Setter method for the COM property "dominantBaseline"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412832)
  @PropPut
  void dominantBaseline(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "dominantBaseline"
   * </p>
   */

  @DISPID(-2147412832)
  @PropGet
  java.lang.String dominantBaseline();


  /**
   * <p>
   * Setter method for the COM property "fontSizeAdjust"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412831)
  @PropPut
  void fontSizeAdjust(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "fontSizeAdjust"
   * </p>
   */

  @DISPID(-2147412831)
  @PropGet
  java.lang.Object fontSizeAdjust();


  /**
   * <p>
   * Setter method for the COM property "fontStretch"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412830)
  @PropPut
  void fontStretch(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "fontStretch"
   * </p>
   */

  @DISPID(-2147412830)
  @PropGet
  java.lang.String fontStretch();


  /**
   * <p>
   * Setter method for the COM property "opacity"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412829)
  @PropPut
  void opacity(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "opacity"
   * </p>
   */

  @DISPID(-2147412829)
  @PropGet
  java.lang.Object opacity();


  /**
   * <p>
   * Setter method for the COM property "clipPath"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412828)
  @PropPut
  void clipPath(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "clipPath"
   * </p>
   */

  @DISPID(-2147412828)
  @PropGet
  java.lang.String clipPath();


  /**
   * <p>
   * Setter method for the COM property "clipRule"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412827)
  @PropPut
  void clipRule(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "clipRule"
   * </p>
   */

  @DISPID(-2147412827)
  @PropGet
  java.lang.String clipRule();


  /**
   * <p>
   * Setter method for the COM property "fill"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412826)
  @PropPut
  void fill(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "fill"
   * </p>
   */

  @DISPID(-2147412826)
  @PropGet
  java.lang.String fill();


  /**
   * <p>
   * Setter method for the COM property "fillOpacity"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412825)
  @PropPut
  void fillOpacity(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "fillOpacity"
   * </p>
   */

  @DISPID(-2147412825)
  @PropGet
  java.lang.Object fillOpacity();


  /**
   * <p>
   * Setter method for the COM property "fillRule"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412824)
  @PropPut
  void fillRule(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "fillRule"
   * </p>
   */

  @DISPID(-2147412824)
  @PropGet
  java.lang.String fillRule();


  /**
   * <p>
   * Setter method for the COM property "kerning"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412823)
  @PropPut
  void kerning(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "kerning"
   * </p>
   */

  @DISPID(-2147412823)
  @PropGet
  java.lang.Object kerning();


  /**
   * <p>
   * Setter method for the COM property "marker"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412822)
  @PropPut
  void marker(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "marker"
   * </p>
   */

  @DISPID(-2147412822)
  @PropGet
  java.lang.String marker();


  /**
   * <p>
   * Setter method for the COM property "markerEnd"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412821)
  @PropPut
  void markerEnd(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "markerEnd"
   * </p>
   */

  @DISPID(-2147412821)
  @PropGet
  java.lang.String markerEnd();


  /**
   * <p>
   * Setter method for the COM property "markerMid"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412820)
  @PropPut
  void markerMid(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "markerMid"
   * </p>
   */

  @DISPID(-2147412820)
  @PropGet
  java.lang.String markerMid();


  /**
   * <p>
   * Setter method for the COM property "markerStart"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412819)
  @PropPut
  void markerStart(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "markerStart"
   * </p>
   */

  @DISPID(-2147412819)
  @PropGet
  java.lang.String markerStart();


  /**
   * <p>
   * Setter method for the COM property "mask"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412818)
  @PropPut
  void mask(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "mask"
   * </p>
   */

  @DISPID(-2147412818)
  @PropGet
  java.lang.String mask();


  /**
   * <p>
   * Setter method for the COM property "pointerEvents"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412817)
  @PropPut
  void pointerEvents(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "pointerEvents"
   * </p>
   */

  @DISPID(-2147412817)
  @PropGet
  java.lang.String pointerEvents();


  /**
   * <p>
   * Setter method for the COM property "stopColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412816)
  @PropPut
  void stopColor(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "stopColor"
   * </p>
   */

  @DISPID(-2147412816)
  @PropGet
  java.lang.Object stopColor();


  /**
   * <p>
   * Setter method for the COM property "stopOpacity"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412815)
  @PropPut
  void stopOpacity(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "stopOpacity"
   * </p>
   */

  @DISPID(-2147412815)
  @PropGet
  java.lang.Object stopOpacity();


  /**
   * <p>
   * Setter method for the COM property "stroke"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412814)
  @PropPut
  void stroke(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "stroke"
   * </p>
   */

  @DISPID(-2147412814)
  @PropGet
  java.lang.String stroke();


  /**
   * <p>
   * Setter method for the COM property "strokeDasharray"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412813)
  @PropPut
  void strokeDasharray(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "strokeDasharray"
   * </p>
   */

  @DISPID(-2147412813)
  @PropGet
  java.lang.String strokeDasharray();


  /**
   * <p>
   * Setter method for the COM property "strokeDashoffset"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412812)
  @PropPut
  void strokeDashoffset(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "strokeDashoffset"
   * </p>
   */

  @DISPID(-2147412812)
  @PropGet
  java.lang.Object strokeDashoffset();


  /**
   * <p>
   * Setter method for the COM property "strokeLinecap"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412811)
  @PropPut
  void strokeLinecap(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "strokeLinecap"
   * </p>
   */

  @DISPID(-2147412811)
  @PropGet
  java.lang.String strokeLinecap();


  /**
   * <p>
   * Setter method for the COM property "strokeLinejoin"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412810)
  @PropPut
  void strokeLinejoin(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "strokeLinejoin"
   * </p>
   */

  @DISPID(-2147412810)
  @PropGet
  java.lang.String strokeLinejoin();


  /**
   * <p>
   * Setter method for the COM property "strokeMiterlimit"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412809)
  @PropPut
  void strokeMiterlimit(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "strokeMiterlimit"
   * </p>
   */

  @DISPID(-2147412809)
  @PropGet
  java.lang.Object strokeMiterlimit();


  /**
   * <p>
   * Setter method for the COM property "strokeOpacity"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412808)
  @PropPut
  void strokeOpacity(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "strokeOpacity"
   * </p>
   */

  @DISPID(-2147412808)
  @PropGet
  java.lang.Object strokeOpacity();


  /**
   * <p>
   * Setter method for the COM property "strokeWidth"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412807)
  @PropPut
  void strokeWidth(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "strokeWidth"
   * </p>
   */

  @DISPID(-2147412807)
  @PropGet
  java.lang.Object strokeWidth();


  /**
   * <p>
   * Setter method for the COM property "textAnchor"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412806)
  @PropPut
  void textAnchor(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "textAnchor"
   * </p>
   */

  @DISPID(-2147412806)
  @PropGet
  java.lang.String textAnchor();


  /**
   * <p>
   * Setter method for the COM property "glyphOrientationHorizontal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412805)
  @PropPut
  void glyphOrientationHorizontal(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "glyphOrientationHorizontal"
   * </p>
   */

  @DISPID(-2147412805)
  @PropGet
  java.lang.Object glyphOrientationHorizontal();


  /**
   * <p>
   * Setter method for the COM property "glyphOrientationVertical"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412804)
  @PropPut
  void glyphOrientationVertical(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "glyphOrientationVertical"
   * </p>
   */

  @DISPID(-2147412804)
  @PropGet
  java.lang.Object glyphOrientationVertical();


  /**
   * <p>
   * Setter method for the COM property "borderRadius"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412802)
  @PropPut
  void borderRadius(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "borderRadius"
   * </p>
   */

  @DISPID(-2147412802)
  @PropGet
  java.lang.String borderRadius();


  /**
   * <p>
   * Setter method for the COM property "borderTopLeftRadius"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412801)
  @PropPut
  void borderTopLeftRadius(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "borderTopLeftRadius"
   * </p>
   */

  @DISPID(-2147412801)
  @PropGet
  java.lang.String borderTopLeftRadius();


  /**
   * <p>
   * Setter method for the COM property "borderTopRightRadius"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412800)
  @PropPut
  void borderTopRightRadius(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "borderTopRightRadius"
   * </p>
   */

  @DISPID(-2147412800)
  @PropGet
  java.lang.String borderTopRightRadius();


  /**
   * <p>
   * Setter method for the COM property "borderBottomRightRadius"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412799)
  @PropPut
  void borderBottomRightRadius(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "borderBottomRightRadius"
   * </p>
   */

  @DISPID(-2147412799)
  @PropGet
  java.lang.String borderBottomRightRadius();


  /**
   * <p>
   * Setter method for the COM property "borderBottomLeftRadius"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412798)
  @PropPut
  void borderBottomLeftRadius(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "borderBottomLeftRadius"
   * </p>
   */

  @DISPID(-2147412798)
  @PropGet
  java.lang.String borderBottomLeftRadius();


  /**
   * <p>
   * Setter method for the COM property "clipTop"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413019)
  @PropPut
  void clipTop(
    java.lang.Object rhs);


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
   * Setter method for the COM property "clipRight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413018)
  @PropPut
  void clipRight(
    java.lang.Object rhs);


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
   * Setter method for the COM property "clipLeft"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413016)
  @PropPut
  void clipLeft(
    java.lang.Object rhs);


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
   * Setter method for the COM property "cssFloat"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412803)
  @PropPut
  void cssFloat(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "cssFloat"
   * </p>
   */

  @DISPID(-2147412803)
  @PropGet
  java.lang.String cssFloat();


  /**
   * <p>
   * Setter method for the COM property "backgroundClip"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412796)
  @PropPut
  void backgroundClip(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "backgroundClip"
   * </p>
   */

  @DISPID(-2147412796)
  @PropGet
  java.lang.String backgroundClip();


  /**
   * <p>
   * Setter method for the COM property "backgroundOrigin"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412795)
  @PropPut
  void backgroundOrigin(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "backgroundOrigin"
   * </p>
   */

  @DISPID(-2147412795)
  @PropGet
  java.lang.String backgroundOrigin();


  /**
   * <p>
   * Setter method for the COM property "backgroundSize"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412794)
  @PropPut
  void backgroundSize(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "backgroundSize"
   * </p>
   */

  @DISPID(-2147412794)
  @PropGet
  java.lang.String backgroundSize();


  /**
   * <p>
   * Setter method for the COM property "boxShadow"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412793)
  @PropPut
  void boxShadow(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "boxShadow"
   * </p>
   */

  @DISPID(-2147412793)
  @PropGet
  java.lang.String boxShadow();


  /**
   * <p>
   * Setter method for the COM property "msTransform"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412797)
  @PropPut
  void msTransform(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "msTransform"
   * </p>
   */

  @DISPID(-2147412797)
  @PropGet
  java.lang.String msTransform();


  /**
   * <p>
   * Setter method for the COM property "msTransformOrigin"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412787)
  @PropPut
  void msTransformOrigin(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "msTransformOrigin"
   * </p>
   */

  @DISPID(-2147412787)
  @PropGet
  java.lang.String msTransformOrigin();


  // Properties:
}
