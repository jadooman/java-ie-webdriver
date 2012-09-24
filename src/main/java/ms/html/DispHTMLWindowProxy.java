package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLWindowProxy extends Com4jObject {
  // Methods:
  /**
   * @param pvarIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @DefaultMethod
  java.lang.Object item(
    java.lang.Object pvarIndex);


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  int length();


  /**
   * <p>
   * Getter method for the COM property "frames"
   * </p>
   */

  @DISPID(1100)
  @PropGet
  ms.html.IHTMLFramesCollection2 frames();


  /**
   * <p>
   * Setter method for the COM property "defaultStatus"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1101)
  @PropPut
  void defaultStatus(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "defaultStatus"
   * </p>
   */

  @DISPID(1101)
  @PropGet
  java.lang.String defaultStatus();


  /**
   * <p>
   * Setter method for the COM property "status"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1102)
  @PropPut
  void status(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "status"
   * </p>
   */

  @DISPID(1102)
  @PropGet
  java.lang.String status();


  /**
   * @param timerID Mandatory int parameter.
   */

  @DISPID(1104)
  void clearTimeout(
    int timerID);


  /**
   * @param message Optional parameter. Default value is ""
   */

  @DISPID(1105)
  void alert(
    @Optional @DefaultValue("") java.lang.String message);


  /**
   * @param message Optional parameter. Default value is ""
   */

  @DISPID(1110)
  boolean confirm(
    @Optional @DefaultValue("") java.lang.String message);


  /**
   * @param message Optional parameter. Default value is ""
   * @param defstr Optional parameter. Default value is "undefined"
   */

  @DISPID(1111)
  java.lang.Object prompt(
    @Optional @DefaultValue("") java.lang.String message,
    @Optional @DefaultValue("undefined") java.lang.String defstr);


  /**
   * <p>
   * Getter method for the COM property "location"
   * </p>
   */

  @DISPID(14)
  @PropGet
  ms.html.IHTMLLocation location();


  /**
   * <p>
   * Getter method for the COM property "history"
   * </p>
   */

  @DISPID(2)
  @PropGet
  ms.html.IOmHistory history();


  /**
   */

  @DISPID(3)
  void close();


  /**
   * <p>
   * Setter method for the COM property "opener"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(4)
  @PropPut
  void opener(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "opener"
   * </p>
   */

  @DISPID(4)
  @PropGet
  java.lang.Object opener();


  /**
   * <p>
   * Getter method for the COM property "navigator"
   * </p>
   */

  @DISPID(5)
  @PropGet
  ms.html.IOmNavigator navigator();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(11)
  @PropPut
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   */

  @DISPID(11)
  @PropGet
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "parent"
   * </p>
   */

  @DISPID(12)
  @PropGet
  ms.html.IHTMLWindow2 parent();


  /**
   * @param url Optional parameter. Default value is ""
   * @param name Optional parameter. Default value is ""
   * @param features Optional parameter. Default value is ""
   * @param replace Optional parameter. Default value is false
   */

  @DISPID(13)
  ms.html.IHTMLWindow2 open(
    @Optional @DefaultValue("") java.lang.String url,
    @Optional @DefaultValue("") java.lang.String name,
    @Optional @DefaultValue("") java.lang.String features,
    @Optional @DefaultValue("0") boolean replace);


  /**
   * <p>
   * Getter method for the COM property "self"
   * </p>
   */

  @DISPID(20)
  @PropGet
  ms.html.IHTMLWindow2 self();


  /**
   * <p>
   * Getter method for the COM property "top"
   * </p>
   */

  @DISPID(21)
  @PropGet
  ms.html.IHTMLWindow2 top();


  /**
   * <p>
   * Getter method for the COM property "window"
   * </p>
   */

  @DISPID(22)
  @PropGet
  ms.html.IHTMLWindow2 window();


  /**
   * @param url Mandatory java.lang.String parameter.
   */

  @DISPID(25)
  void navigate(
    java.lang.String url);


  /**
   * <p>
   * Setter method for the COM property "onfocus"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412098)
  @PropPut
  void onfocus(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onfocus"
   * </p>
   */

  @DISPID(-2147412098)
  @PropGet
  java.lang.Object onfocus();


  /**
   * <p>
   * Setter method for the COM property "onblur"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412097)
  @PropPut
  void onblur(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onblur"
   * </p>
   */

  @DISPID(-2147412097)
  @PropGet
  java.lang.Object onblur();


  /**
   * <p>
   * Setter method for the COM property "onload"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412080)
  @PropPut
  void onload(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onload"
   * </p>
   */

  @DISPID(-2147412080)
  @PropGet
  java.lang.Object onload();


  /**
   * <p>
   * Setter method for the COM property "onbeforeunload"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412073)
  @PropPut
  void onbeforeunload(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onbeforeunload"
   * </p>
   */

  @DISPID(-2147412073)
  @PropGet
  java.lang.Object onbeforeunload();


  /**
   * <p>
   * Setter method for the COM property "onunload"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412079)
  @PropPut
  void onunload(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onunload"
   * </p>
   */

  @DISPID(-2147412079)
  @PropGet
  java.lang.Object onunload();


  /**
   * <p>
   * Setter method for the COM property "onhelp"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412099)
  @PropPut
  void onhelp(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onhelp"
   * </p>
   */

  @DISPID(-2147412099)
  @PropGet
  java.lang.Object onhelp();


  /**
   * <p>
   * Setter method for the COM property "onerror"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412083)
  @PropPut
  void onerror(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onerror"
   * </p>
   */

  @DISPID(-2147412083)
  @PropGet
  java.lang.Object onerror();


  /**
   * <p>
   * Setter method for the COM property "onresize"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412076)
  @PropPut
  void onresize(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onresize"
   * </p>
   */

  @DISPID(-2147412076)
  @PropGet
  java.lang.Object onresize();


  /**
   * <p>
   * Setter method for the COM property "onscroll"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412081)
  @PropPut
  void onscroll(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onscroll"
   * </p>
   */

  @DISPID(-2147412081)
  @PropGet
  java.lang.Object onscroll();


  /**
   * <p>
   * Getter method for the COM property "document"
   * </p>
   */

  @DISPID(1151)
  @PropGet
  ms.html.IHTMLDocument2 document();


  /**
   * <p>
   * Getter method for the COM property "event"
   * </p>
   */

  @DISPID(1152)
  @PropGet
  ms.html.IHTMLEventObj event();


  /**
   * <p>
   * Getter method for the COM property "_newEnum"
   * </p>
   */

  @DISPID(1153)
  @PropGet
  com4j.Com4jObject _newEnum();


  /**
   * @param dialog Mandatory java.lang.String parameter.
   * @param varArgIn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varOptions Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1154)
  java.lang.Object showModalDialog(
    java.lang.String dialog,
    @Optional java.lang.Object varArgIn,
    @Optional java.lang.Object varOptions);


  /**
   * @param helpURL Mandatory java.lang.String parameter.
   * @param helpArg Optional parameter. Default value is com4j.Variant.getMissing()
   * @param features Optional parameter. Default value is ""
   */

  @DISPID(1155)
  void showHelp(
    java.lang.String helpURL,
    @Optional java.lang.Object helpArg,
    @Optional @DefaultValue("") java.lang.String features);


  /**
   * <p>
   * Getter method for the COM property "screen"
   * </p>
   */

  @DISPID(1156)
  @PropGet
  ms.html.IHTMLScreen screen();


  /**
   */

  @DISPID(1158)
  void focus();


  /**
   * <p>
   * Getter method for the COM property "closed"
   * </p>
   */

  @DISPID(23)
  @PropGet
  boolean closed();


  /**
   */

  @DISPID(1159)
  void blur();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(1160)
  void scroll(
    int x,
    int y);


  /**
   * <p>
   * Getter method for the COM property "clientInformation"
   * </p>
   */

  @DISPID(1161)
  @PropGet
  ms.html.IOmNavigator clientInformation();


  /**
   * @param timerID Mandatory int parameter.
   */

  @DISPID(1163)
  void clearInterval(
    int timerID);


  /**
   * <p>
   * Setter method for the COM property "offscreenBuffering"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1164)
  @PropPut
  void offscreenBuffering(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "offscreenBuffering"
   * </p>
   */

  @DISPID(1164)
  @PropGet
  java.lang.Object offscreenBuffering();


  /**
   * @param code Mandatory java.lang.String parameter.
   * @param language Optional parameter. Default value is "JScript"
   */

  @DISPID(1165)
  java.lang.Object execScript(
    java.lang.String code,
    @Optional @DefaultValue("JScript") java.lang.String language);


  /**
   */

  @DISPID(1166)
  java.lang.String toString_();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(1167)
  void scrollBy(
    int x,
    int y);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(1168)
  void scrollTo(
    int x,
    int y);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(6)
  void moveTo(
    int x,
    int y);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(7)
  void moveBy(
    int x,
    int y);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(9)
  void resizeTo(
    int x,
    int y);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(8)
  void resizeBy(
    int x,
    int y);


  /**
   * <p>
   * Getter method for the COM property "external"
   * </p>
   */

  @DISPID(1169)
  @PropGet
  com4j.Com4jObject external();


  /**
   * <p>
   * Getter method for the COM property "screenLeft"
   * </p>
   */

  @DISPID(1170)
  @PropGet
  int screenLeft();


  /**
   * <p>
   * Getter method for the COM property "screenTop"
   * </p>
   */

  @DISPID(1171)
  @PropGet
  int screenTop();


  /**
   * @param event Mandatory java.lang.String parameter.
   * @param pdisp Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147417605)
  boolean attachEvent(
    java.lang.String event,
    com4j.Com4jObject pdisp);


  /**
   * @param event Mandatory java.lang.String parameter.
   * @param pdisp Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147417604)
  void detachEvent(
    java.lang.String event,
    com4j.Com4jObject pdisp);


  /**
   * @param expression Mandatory java.lang.Object parameter.
   * @param msec Mandatory int parameter.
   * @param language Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1103)
  int setTimeout(
    java.lang.Object expression,
    int msec,
    @Optional java.lang.Object language);


  /**
   * @param expression Mandatory java.lang.Object parameter.
   * @param msec Mandatory int parameter.
   * @param language Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1162)
  int setInterval(
    java.lang.Object expression,
    int msec,
    @Optional java.lang.Object language);


  /**
   */

  @DISPID(1174)
  void print();


  /**
   * <p>
   * Setter method for the COM property "onbeforeprint"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412046)
  @PropPut
  void onbeforeprint(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onbeforeprint"
   * </p>
   */

  @DISPID(-2147412046)
  @PropGet
  java.lang.Object onbeforeprint();


  /**
   * <p>
   * Setter method for the COM property "onafterprint"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412045)
  @PropPut
  void onafterprint(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onafterprint"
   * </p>
   */

  @DISPID(-2147412045)
  @PropGet
  java.lang.Object onafterprint();


  /**
   * <p>
   * Getter method for the COM property "clipboardData"
   * </p>
   */

  @DISPID(1175)
  @PropGet
  ms.html.IHTMLDataTransfer clipboardData();


  /**
   * @param url Optional parameter. Default value is ""
   * @param varArgIn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param options Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1176)
  ms.html.IHTMLWindow2 showModelessDialog(
    @Optional @DefaultValue("") java.lang.String url,
    @Optional java.lang.Object varArgIn,
    @Optional java.lang.Object options);


  /**
   * @param varArgIn Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1180)
  com4j.Com4jObject createPopup(
    @Optional java.lang.Object varArgIn);


  /**
   * <p>
   * Getter method for the COM property "frameElement"
   * </p>
   */

  @DISPID(1181)
  @PropGet
  ms.html.IHTMLFrameBase frameElement();


  /**
   * <p>
   * Getter method for the COM property "sessionStorage"
   * </p>
   */

  @DISPID(1192)
  @PropGet
  ms.html.IHTMLStorage sessionStorage();


  /**
   * <p>
   * Getter method for the COM property "localStorage"
   * </p>
   */

  @DISPID(1193)
  @PropGet
  ms.html.IHTMLStorage localStorage();


  /**
   * <p>
   * Setter method for the COM property "onhashchange"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412003)
  @PropPut
  void onhashchange(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onhashchange"
   * </p>
   */

  @DISPID(-2147412003)
  @PropGet
  java.lang.Object onhashchange();


  /**
   * <p>
   * Getter method for the COM property "maxConnectionsPerServer"
   * </p>
   */

  @DISPID(1194)
  @PropGet
  int maxConnectionsPerServer();


  /**
   * @param msg Mandatory java.lang.String parameter.
   * @param targetOrigin Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1196)
  void postMessage(
    java.lang.String msg,
    @Optional java.lang.Object targetOrigin);


  /**
   * @param bstrHTML Mandatory java.lang.String parameter.
   */

  @DISPID(1197)
  java.lang.String toStaticHTML(
    java.lang.String bstrHTML);


  /**
   * <p>
   * Setter method for the COM property "onmessage"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412002)
  @PropPut
  void onmessage(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmessage"
   * </p>
   */

  @DISPID(-2147412002)
  @PropGet
  java.lang.Object onmessage();


  /**
   * @param bstrProfilerMarkName Mandatory java.lang.String parameter.
   */

  @DISPID(1198)
  void msWriteProfilerMark(
    java.lang.String bstrProfilerMarkName);


  /**
   */

  @DISPID(1199)
  ms.html.IHTMLSelection getSelection();


  /**
   * @param varArgIn Mandatory ms.html.IHTMLDOMNode parameter.
   * @param bstrPseudoElt Optional parameter. Default value is ""
   */

  @DISPID(1200)
  ms.html.IHTMLCSSStyleDeclaration getComputedStyle(
    ms.html.IHTMLDOMNode varArgIn,
    @Optional @DefaultValue("") java.lang.String bstrPseudoElt);


  /**
   * <p>
   * Getter method for the COM property "styleMedia"
   * </p>
   */

  @DISPID(1202)
  @PropGet
  ms.html.IHTMLStyleMedia styleMedia();


  /**
   * <p>
   * Setter method for the COM property "performance"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1203)
  @PropPut
  void performance(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "performance"
   * </p>
   */

  @DISPID(1203)
  @PropGet
  java.lang.Object performance();


  /**
   * <p>
   * Getter method for the COM property "innerWidth"
   * </p>
   */

  @DISPID(1204)
  @PropGet
  int innerWidth();


  /**
   * <p>
   * Getter method for the COM property "innerHeight"
   * </p>
   */

  @DISPID(1205)
  @PropGet
  int innerHeight();


  /**
   * <p>
   * Getter method for the COM property "pageXOffset"
   * </p>
   */

  @DISPID(1206)
  @PropGet
  int pageXOffset();


  /**
   * <p>
   * Getter method for the COM property "pageYOffset"
   * </p>
   */

  @DISPID(1207)
  @PropGet
  int pageYOffset();


  /**
   * <p>
   * Getter method for the COM property "screenX"
   * </p>
   */

  @DISPID(1208)
  @PropGet
  int screenX();


  /**
   * <p>
   * Getter method for the COM property "screenY"
   * </p>
   */

  @DISPID(1209)
  @PropGet
  int screenY();


  /**
   * <p>
   * Getter method for the COM property "outerWidth"
   * </p>
   */

  @DISPID(1210)
  @PropGet
  int outerWidth();


  /**
   * <p>
   * Getter method for the COM property "outerHeight"
   * </p>
   */

  @DISPID(1211)
  @PropGet
  int outerHeight();


  /**
   * <p>
   * Setter method for the COM property "onabort"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412084)
  @PropPut
  void onabort(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onabort"
   * </p>
   */

  @DISPID(-2147412084)
  @PropGet
  java.lang.Object onabort();


  /**
   * <p>
   * Setter method for the COM property "oncanplay"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411978)
  @PropPut
  void oncanplay(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "oncanplay"
   * </p>
   */

  @DISPID(-2147411978)
  @PropGet
  java.lang.Object oncanplay();


  /**
   * <p>
   * Setter method for the COM property "oncanplaythrough"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411977)
  @PropPut
  void oncanplaythrough(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "oncanplaythrough"
   * </p>
   */

  @DISPID(-2147411977)
  @PropGet
  java.lang.Object oncanplaythrough();


  /**
   * <p>
   * Setter method for the COM property "onchange"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412082)
  @PropPut
  void onchange(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onchange"
   * </p>
   */

  @DISPID(-2147412082)
  @PropGet
  java.lang.Object onchange();


  /**
   * <p>
   * Setter method for the COM property "onclick"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412104)
  @PropPut
  void onclick(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onclick"
   * </p>
   */

  @DISPID(-2147412104)
  @PropGet
  java.lang.Object onclick();


  /**
   * <p>
   * Setter method for the COM property "oncontextmenu"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412047)
  @PropPut
  void oncontextmenu(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "oncontextmenu"
   * </p>
   */

  @DISPID(-2147412047)
  @PropGet
  java.lang.Object oncontextmenu();


  /**
   * <p>
   * Setter method for the COM property "ondblclick"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412103)
  @PropPut
  void ondblclick(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ondblclick"
   * </p>
   */

  @DISPID(-2147412103)
  @PropGet
  java.lang.Object ondblclick();


  /**
   * <p>
   * Setter method for the COM property "ondrag"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412063)
  @PropPut
  void ondrag(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ondrag"
   * </p>
   */

  @DISPID(-2147412063)
  @PropGet
  java.lang.Object ondrag();


  /**
   * <p>
   * Setter method for the COM property "ondragend"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412062)
  @PropPut
  void ondragend(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ondragend"
   * </p>
   */

  @DISPID(-2147412062)
  @PropGet
  java.lang.Object ondragend();


  /**
   * <p>
   * Setter method for the COM property "ondragenter"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412061)
  @PropPut
  void ondragenter(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ondragenter"
   * </p>
   */

  @DISPID(-2147412061)
  @PropGet
  java.lang.Object ondragenter();


  /**
   * <p>
   * Setter method for the COM property "ondragleave"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412059)
  @PropPut
  void ondragleave(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ondragleave"
   * </p>
   */

  @DISPID(-2147412059)
  @PropGet
  java.lang.Object ondragleave();


  /**
   * <p>
   * Setter method for the COM property "ondragover"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412060)
  @PropPut
  void ondragover(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ondragover"
   * </p>
   */

  @DISPID(-2147412060)
  @PropGet
  java.lang.Object ondragover();


  /**
   * <p>
   * Setter method for the COM property "ondragstart"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412077)
  @PropPut
  void ondragstart(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ondragstart"
   * </p>
   */

  @DISPID(-2147412077)
  @PropGet
  java.lang.Object ondragstart();


  /**
   * <p>
   * Setter method for the COM property "ondrop"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412058)
  @PropPut
  void ondrop(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ondrop"
   * </p>
   */

  @DISPID(-2147412058)
  @PropGet
  java.lang.Object ondrop();


  /**
   * <p>
   * Setter method for the COM property "ondurationchange"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411976)
  @PropPut
  void ondurationchange(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ondurationchange"
   * </p>
   */

  @DISPID(-2147411976)
  @PropGet
  java.lang.Object ondurationchange();


  /**
   * <p>
   * Setter method for the COM property "onfocusin"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412021)
  @PropPut
  void onfocusin(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onfocusin"
   * </p>
   */

  @DISPID(-2147412021)
  @PropGet
  java.lang.Object onfocusin();


  /**
   * <p>
   * Setter method for the COM property "onfocusout"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412020)
  @PropPut
  void onfocusout(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onfocusout"
   * </p>
   */

  @DISPID(-2147412020)
  @PropGet
  java.lang.Object onfocusout();


  /**
   * <p>
   * Setter method for the COM property "oninput"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411985)
  @PropPut
  void oninput(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "oninput"
   * </p>
   */

  @DISPID(-2147411985)
  @PropGet
  java.lang.Object oninput();


  /**
   * <p>
   * Setter method for the COM property "onemptied"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411975)
  @PropPut
  void onemptied(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onemptied"
   * </p>
   */

  @DISPID(-2147411975)
  @PropGet
  java.lang.Object onemptied();


  /**
   * <p>
   * Setter method for the COM property "onended"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411974)
  @PropPut
  void onended(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onended"
   * </p>
   */

  @DISPID(-2147411974)
  @PropGet
  java.lang.Object onended();


  /**
   * <p>
   * Setter method for the COM property "onkeydown"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412107)
  @PropPut
  void onkeydown(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onkeydown"
   * </p>
   */

  @DISPID(-2147412107)
  @PropGet
  java.lang.Object onkeydown();


  /**
   * <p>
   * Setter method for the COM property "onkeypress"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412105)
  @PropPut
  void onkeypress(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onkeypress"
   * </p>
   */

  @DISPID(-2147412105)
  @PropGet
  java.lang.Object onkeypress();


  /**
   * <p>
   * Setter method for the COM property "onkeyup"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412106)
  @PropPut
  void onkeyup(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onkeyup"
   * </p>
   */

  @DISPID(-2147412106)
  @PropGet
  java.lang.Object onkeyup();


  /**
   * <p>
   * Setter method for the COM property "onloadeddata"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411973)
  @PropPut
  void onloadeddata(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onloadeddata"
   * </p>
   */

  @DISPID(-2147411973)
  @PropGet
  java.lang.Object onloadeddata();


  /**
   * <p>
   * Setter method for the COM property "onloadedmetadata"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411972)
  @PropPut
  void onloadedmetadata(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onloadedmetadata"
   * </p>
   */

  @DISPID(-2147411972)
  @PropGet
  java.lang.Object onloadedmetadata();


  /**
   * <p>
   * Setter method for the COM property "onloadstart"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411971)
  @PropPut
  void onloadstart(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onloadstart"
   * </p>
   */

  @DISPID(-2147411971)
  @PropGet
  java.lang.Object onloadstart();


  /**
   * <p>
   * Setter method for the COM property "onmousedown"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412110)
  @PropPut
  void onmousedown(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmousedown"
   * </p>
   */

  @DISPID(-2147412110)
  @PropGet
  java.lang.Object onmousedown();


  /**
   * <p>
   * Setter method for the COM property "onmouseenter"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412027)
  @PropPut
  void onmouseenter(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmouseenter"
   * </p>
   */

  @DISPID(-2147412027)
  @PropGet
  java.lang.Object onmouseenter();


  /**
   * <p>
   * Setter method for the COM property "onmouseleave"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412026)
  @PropPut
  void onmouseleave(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmouseleave"
   * </p>
   */

  @DISPID(-2147412026)
  @PropGet
  java.lang.Object onmouseleave();


  /**
   * <p>
   * Setter method for the COM property "onmousemove"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412108)
  @PropPut
  void onmousemove(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmousemove"
   * </p>
   */

  @DISPID(-2147412108)
  @PropGet
  java.lang.Object onmousemove();


  /**
   * <p>
   * Setter method for the COM property "onmouseout"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412111)
  @PropPut
  void onmouseout(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmouseout"
   * </p>
   */

  @DISPID(-2147412111)
  @PropGet
  java.lang.Object onmouseout();


  /**
   * <p>
   * Setter method for the COM property "onmouseover"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412112)
  @PropPut
  void onmouseover(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmouseover"
   * </p>
   */

  @DISPID(-2147412112)
  @PropGet
  java.lang.Object onmouseover();


  /**
   * <p>
   * Setter method for the COM property "onmouseup"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412109)
  @PropPut
  void onmouseup(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmouseup"
   * </p>
   */

  @DISPID(-2147412109)
  @PropGet
  java.lang.Object onmouseup();


  /**
   * <p>
   * Setter method for the COM property "onmousewheel"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412036)
  @PropPut
  void onmousewheel(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmousewheel"
   * </p>
   */

  @DISPID(-2147412036)
  @PropGet
  java.lang.Object onmousewheel();


  /**
   * <p>
   * Setter method for the COM property "onoffline"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412004)
  @PropPut
  void onoffline(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onoffline"
   * </p>
   */

  @DISPID(-2147412004)
  @PropGet
  java.lang.Object onoffline();


  /**
   * <p>
   * Setter method for the COM property "ononline"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412005)
  @PropPut
  void ononline(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ononline"
   * </p>
   */

  @DISPID(-2147412005)
  @PropGet
  java.lang.Object ononline();


  /**
   * <p>
   * Setter method for the COM property "onprogress"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411967)
  @PropPut
  void onprogress(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onprogress"
   * </p>
   */

  @DISPID(-2147411967)
  @PropGet
  java.lang.Object onprogress();


  /**
   * <p>
   * Setter method for the COM property "onratechange"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411966)
  @PropPut
  void onratechange(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onratechange"
   * </p>
   */

  @DISPID(-2147411966)
  @PropGet
  java.lang.Object onratechange();


  /**
   * <p>
   * Setter method for the COM property "onreadystatechange"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412087)
  @PropPut
  void onreadystatechange(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onreadystatechange"
   * </p>
   */

  @DISPID(-2147412087)
  @PropGet
  java.lang.Object onreadystatechange();


  /**
   * <p>
   * Setter method for the COM property "onreset"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412100)
  @PropPut
  void onreset(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onreset"
   * </p>
   */

  @DISPID(-2147412100)
  @PropGet
  java.lang.Object onreset();


  /**
   * <p>
   * Setter method for the COM property "onseeked"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411965)
  @PropPut
  void onseeked(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onseeked"
   * </p>
   */

  @DISPID(-2147411965)
  @PropGet
  java.lang.Object onseeked();


  /**
   * <p>
   * Setter method for the COM property "onseeking"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411964)
  @PropPut
  void onseeking(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onseeking"
   * </p>
   */

  @DISPID(-2147411964)
  @PropGet
  java.lang.Object onseeking();


  /**
   * <p>
   * Setter method for the COM property "onselect"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412102)
  @PropPut
  void onselect(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onselect"
   * </p>
   */

  @DISPID(-2147412102)
  @PropGet
  java.lang.Object onselect();


  /**
   * <p>
   * Setter method for the COM property "onstalled"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411963)
  @PropPut
  void onstalled(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onstalled"
   * </p>
   */

  @DISPID(-2147411963)
  @PropGet
  java.lang.Object onstalled();


  /**
   * <p>
   * Setter method for the COM property "onstorage"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412012)
  @PropPut
  void onstorage(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onstorage"
   * </p>
   */

  @DISPID(-2147412012)
  @PropGet
  java.lang.Object onstorage();


  /**
   * <p>
   * Setter method for the COM property "onsubmit"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412101)
  @PropPut
  void onsubmit(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onsubmit"
   * </p>
   */

  @DISPID(-2147412101)
  @PropGet
  java.lang.Object onsubmit();


  /**
   * <p>
   * Setter method for the COM property "onsuspend"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411962)
  @PropPut
  void onsuspend(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onsuspend"
   * </p>
   */

  @DISPID(-2147411962)
  @PropGet
  java.lang.Object onsuspend();


  /**
   * <p>
   * Setter method for the COM property "ontimeupdate"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411961)
  @PropPut
  void ontimeupdate(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ontimeupdate"
   * </p>
   */

  @DISPID(-2147411961)
  @PropGet
  java.lang.Object ontimeupdate();


  /**
   * <p>
   * Setter method for the COM property "onpause"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411970)
  @PropPut
  void onpause(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onpause"
   * </p>
   */

  @DISPID(-2147411970)
  @PropGet
  java.lang.Object onpause();


  /**
   * <p>
   * Setter method for the COM property "onplay"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411969)
  @PropPut
  void onplay(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onplay"
   * </p>
   */

  @DISPID(-2147411969)
  @PropGet
  java.lang.Object onplay();


  /**
   * <p>
   * Setter method for the COM property "onplaying"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411968)
  @PropPut
  void onplaying(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onplaying"
   * </p>
   */

  @DISPID(-2147411968)
  @PropGet
  java.lang.Object onplaying();


  /**
   * <p>
   * Setter method for the COM property "onvolumechange"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411960)
  @PropPut
  void onvolumechange(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onvolumechange"
   * </p>
   */

  @DISPID(-2147411960)
  @PropGet
  java.lang.Object onvolumechange();


  /**
   * <p>
   * Setter method for the COM property "onwaiting"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411959)
  @PropPut
  void onwaiting(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onwaiting"
   * </p>
   */

  @DISPID(-2147411959)
  @PropGet
  java.lang.Object onwaiting();


  /**
   * <p>
   * Getter method for the COM property "constructor"
   * </p>
   */

  @DISPID(-2147417603)
  @PropGet
  com4j.Com4jObject constructor();


  /**
   * @param type Mandatory java.lang.String parameter.
   * @param listener Mandatory com4j.Com4jObject parameter.
   * @param useCapture Mandatory boolean parameter.
   */

  @DISPID(-2147417602)
  void addEventListener(
    java.lang.String type,
    com4j.Com4jObject listener,
    boolean useCapture);


  /**
   * @param type Mandatory java.lang.String parameter.
   * @param listener Mandatory com4j.Com4jObject parameter.
   * @param useCapture Mandatory boolean parameter.
   */

  @DISPID(-2147417601)
  void removeEventListener(
    java.lang.String type,
    com4j.Com4jObject listener,
    boolean useCapture);


  /**
   * @param evt Mandatory ms.html.IDOMEvent parameter.
   */

  @DISPID(-2147417600)
  boolean dispatchEvent(
    ms.html.IDOMEvent evt);


  // Properties:
}
