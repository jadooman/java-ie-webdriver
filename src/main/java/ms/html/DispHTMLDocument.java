package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLDocument extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Script"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  com4j.Com4jObject script();


  /**
   * <p>
   * Getter method for the COM property "all"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  ms.html.IHTMLElementCollection all();


  /**
   * <p>
   * Getter method for the COM property "body"
   * </p>
   */

  @DISPID(1004)
  @PropGet
  ms.html.IHTMLElement body();


  /**
   * <p>
   * Getter method for the COM property "activeElement"
   * </p>
   */

  @DISPID(1005)
  @PropGet
  ms.html.IHTMLElement activeElement();


  /**
   * <p>
   * Getter method for the COM property "images"
   * </p>
   */

  @DISPID(1011)
  @PropGet
  ms.html.IHTMLElementCollection images();


  /**
   * <p>
   * Getter method for the COM property "applets"
   * </p>
   */

  @DISPID(1008)
  @PropGet
  ms.html.IHTMLElementCollection applets();


  /**
   * <p>
   * Getter method for the COM property "links"
   * </p>
   */

  @DISPID(1009)
  @PropGet
  ms.html.IHTMLElementCollection links();


  /**
   * <p>
   * Getter method for the COM property "forms"
   * </p>
   */

  @DISPID(1010)
  @PropGet
  ms.html.IHTMLElementCollection forms();


  /**
   * <p>
   * Getter method for the COM property "anchors"
   * </p>
   */

  @DISPID(1007)
  @PropGet
  ms.html.IHTMLElementCollection anchors();


  /**
   * <p>
   * Setter method for the COM property "title"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1012)
  @PropPut
  void title(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "title"
   * </p>
   */

  @DISPID(1012)
  @PropGet
  java.lang.String title();


  /**
   * <p>
   * Getter method for the COM property "scripts"
   * </p>
   */

  @DISPID(1013)
  @PropGet
  ms.html.IHTMLElementCollection scripts();


  /**
   * <p>
   * Setter method for the COM property "designMode"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1014)
  @PropPut
  void designMode(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "designMode"
   * </p>
   */

  @DISPID(1014)
  @PropGet
  java.lang.String designMode();


  /**
   * <p>
   * Getter method for the COM property "selection"
   * </p>
   */

  @DISPID(1017)
  @PropGet
  ms.html.IHTMLSelectionObject selection();


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   */

  @DISPID(1018)
  @PropGet
  java.lang.String readyState();


  /**
   * <p>
   * Getter method for the COM property "frames"
   * </p>
   */

  @DISPID(1019)
  @PropGet
  ms.html.IHTMLFramesCollection2 frames();


  /**
   * <p>
   * Getter method for the COM property "embeds"
   * </p>
   */

  @DISPID(1015)
  @PropGet
  ms.html.IHTMLElementCollection embeds();


  /**
   * <p>
   * Getter method for the COM property "plugins"
   * </p>
   */

  @DISPID(1021)
  @PropGet
  ms.html.IHTMLElementCollection plugins();


  /**
   * <p>
   * Setter method for the COM property "alinkColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1022)
  @PropPut
  void alinkColor(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "alinkColor"
   * </p>
   */

  @DISPID(1022)
  @PropGet
  java.lang.Object alinkColor();


  /**
   * <p>
   * Setter method for the COM property "bgColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-501)
  @PropPut
  void bgColor(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "bgColor"
   * </p>
   */

  @DISPID(-501)
  @PropGet
  java.lang.Object bgColor();


  /**
   * <p>
   * Setter method for the COM property "fgColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413110)
  @PropPut
  void fgColor(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "fgColor"
   * </p>
   */

  @DISPID(-2147413110)
  @PropGet
  java.lang.Object fgColor();


  /**
   * <p>
   * Setter method for the COM property "linkColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1024)
  @PropPut
  void linkColor(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "linkColor"
   * </p>
   */

  @DISPID(1024)
  @PropGet
  java.lang.Object linkColor();


  /**
   * <p>
   * Setter method for the COM property "vlinkColor"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1023)
  @PropPut
  void vlinkColor(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "vlinkColor"
   * </p>
   */

  @DISPID(1023)
  @PropGet
  java.lang.Object vlinkColor();


  /**
   * <p>
   * Getter method for the COM property "referrer"
   * </p>
   */

  @DISPID(1027)
  @PropGet
  java.lang.String referrer();


  /**
   * <p>
   * Getter method for the COM property "location"
   * </p>
   */

  @DISPID(1026)
  @PropGet
  ms.html.IHTMLLocation location();


  /**
   * <p>
   * Getter method for the COM property "lastModified"
   * </p>
   */

  @DISPID(1028)
  @PropGet
  java.lang.String lastModified();


  /**
   * <p>
   * Setter method for the COM property "url"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1025)
  @PropPut
  void url(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "url"
   * </p>
   */

  @DISPID(1025)
  @PropGet
  java.lang.String url();


  /**
   * <p>
   * Setter method for the COM property "domain"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1029)
  @PropPut
  void domain(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "domain"
   * </p>
   */

  @DISPID(1029)
  @PropGet
  java.lang.String domain();


  /**
   * <p>
   * Setter method for the COM property "cookie"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1030)
  @PropPut
  void cookie(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "cookie"
   * </p>
   */

  @DISPID(1030)
  @PropGet
  java.lang.String cookie();


  /**
   * <p>
   * Setter method for the COM property "expando"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1031)
  @PropPut
  void expando(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "expando"
   * </p>
   */

  @DISPID(1031)
  @PropGet
  boolean expando();


  /**
   * <p>
   * Setter method for the COM property "charset"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1032)
  @PropPut
  void charset(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "charset"
   * </p>
   */

  @DISPID(1032)
  @PropGet
  java.lang.String charset();


  /**
   * <p>
   * Setter method for the COM property "defaultCharset"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1033)
  @PropPut
  void defaultCharset(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "defaultCharset"
   * </p>
   */

  @DISPID(1033)
  @PropGet
  java.lang.String defaultCharset();


  /**
   * <p>
   * Getter method for the COM property "mimeType"
   * </p>
   */

  @DISPID(1041)
  @PropGet
  java.lang.String mimeType();


  /**
   * <p>
   * Getter method for the COM property "fileSize"
   * </p>
   */

  @DISPID(1042)
  @PropGet
  java.lang.String fileSize();


  /**
   * <p>
   * Getter method for the COM property "fileCreatedDate"
   * </p>
   */

  @DISPID(1043)
  @PropGet
  java.lang.String fileCreatedDate();


  /**
   * <p>
   * Getter method for the COM property "fileModifiedDate"
   * </p>
   */

  @DISPID(1044)
  @PropGet
  java.lang.String fileModifiedDate();


  /**
   * <p>
   * Getter method for the COM property "fileUpdatedDate"
   * </p>
   */

  @DISPID(1045)
  @PropGet
  java.lang.String fileUpdatedDate();


  /**
   * <p>
   * Getter method for the COM property "security"
   * </p>
   */

  @DISPID(1046)
  @PropGet
  java.lang.String security();


  /**
   * <p>
   * Getter method for the COM property "protocol"
   * </p>
   */

  @DISPID(1047)
  @PropGet
  java.lang.String protocol();


  /**
   * <p>
   * Getter method for the COM property "nameProp"
   * </p>
   */

  @DISPID(1048)
  @PropGet
  java.lang.String nameProp();


  /**
   * @param psarray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1054)
  void write(
    java.lang.Object... psarray);


  /**
   * @param psarray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1055)
  void writeln(
    java.lang.Object... psarray);


  /**
   * @param url Optional parameter. Default value is "text/html"
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param features Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1056)
  com4j.Com4jObject open(
    @Optional @DefaultValue("text/html") java.lang.String url,
    @Optional java.lang.Object name,
    @Optional java.lang.Object features,
    @Optional java.lang.Object replace);


  /**
   */

  @DISPID(1057)
  void close();


  /**
   */

  @DISPID(1058)
  void clear();


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   */

  @DISPID(1059)
  boolean queryCommandSupported(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   */

  @DISPID(1060)
  boolean queryCommandEnabled(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   */

  @DISPID(1061)
  boolean queryCommandState(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   */

  @DISPID(1062)
  boolean queryCommandIndeterm(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   */

  @DISPID(1063)
  java.lang.String queryCommandText(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   */

  @DISPID(1064)
  java.lang.Object queryCommandValue(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @param showUI Optional parameter. Default value is false
   * @param value Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1065)
  boolean execCommand(
    java.lang.String cmdID,
    @Optional @DefaultValue("0") boolean showUI,
    @Optional java.lang.Object value);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   */

  @DISPID(1066)
  boolean execCommandShowHelp(
    java.lang.String cmdID);


  /**
   * @param eTag Mandatory java.lang.String parameter.
   */

  @DISPID(1067)
  ms.html.IHTMLElement createElement(
    java.lang.String eTag);


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
   * Setter method for the COM property "onafterupdate"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412090)
  @PropPut
  void onafterupdate(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onafterupdate"
   * </p>
   */

  @DISPID(-2147412090)
  @PropGet
  java.lang.Object onafterupdate();


  /**
   * <p>
   * Setter method for the COM property "onrowexit"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412094)
  @PropPut
  void onrowexit(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onrowexit"
   * </p>
   */

  @DISPID(-2147412094)
  @PropGet
  java.lang.Object onrowexit();


  /**
   * <p>
   * Setter method for the COM property "onrowenter"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412093)
  @PropPut
  void onrowenter(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onrowenter"
   * </p>
   */

  @DISPID(-2147412093)
  @PropGet
  java.lang.Object onrowenter();


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
   * Setter method for the COM property "onselectstart"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412075)
  @PropPut
  void onselectstart(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onselectstart"
   * </p>
   */

  @DISPID(-2147412075)
  @PropGet
  java.lang.Object onselectstart();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(1068)
  ms.html.IHTMLElement elementFromPoint(
    int x,
    int y);


  /**
   * <p>
   * Getter method for the COM property "parentWindow"
   * </p>
   */

  @DISPID(1034)
  @PropGet
  ms.html.IHTMLWindow2 parentWindow();


  /**
   * <p>
   * Getter method for the COM property "styleSheets"
   * </p>
   */

  @DISPID(1069)
  @PropGet
  ms.html.IHTMLStyleSheetsCollection styleSheets();


  /**
   * <p>
   * Setter method for the COM property "onbeforeupdate"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412091)
  @PropPut
  void onbeforeupdate(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onbeforeupdate"
   * </p>
   */

  @DISPID(-2147412091)
  @PropGet
  java.lang.Object onbeforeupdate();


  /**
   * <p>
   * Setter method for the COM property "onerrorupdate"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412074)
  @PropPut
  void onerrorupdate(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onerrorupdate"
   * </p>
   */

  @DISPID(-2147412074)
  @PropGet
  java.lang.Object onerrorupdate();


  /**
   */

  @DISPID(1070)
  java.lang.String toString_();


  /**
   * @param bstrHref Optional parameter. Default value is ""
   * @param lIndex Optional parameter. Default value is -1
   */

  @DISPID(1071)
  ms.html.IHTMLStyleSheet createStyleSheet(
    @Optional @DefaultValue("") java.lang.String bstrHref,
    @Optional @DefaultValue("-1") int lIndex);


  /**
   */

  @DISPID(1072)
  void releaseCapture();


  /**
   * @param fForce Optional parameter. Default value is false
   */

  @DISPID(1073)
  void recalc(
    @Optional @DefaultValue("0") boolean fForce);


  /**
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(1074)
  ms.html.IHTMLDOMNode createTextNode(
    java.lang.String text);


  /**
   * <p>
   * Getter method for the COM property "documentElement"
   * </p>
   */

  @DISPID(1075)
  @PropGet
  ms.html.IHTMLElement documentElement();


  /**
   * <p>
   * Getter method for the COM property "uniqueID"
   * </p>
   */

  @DISPID(1077)
  @PropGet
  java.lang.String uniqueID();


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
   * <p>
   * Setter method for the COM property "onrowsdelete"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412050)
  @PropPut
  void onrowsdelete(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onrowsdelete"
   * </p>
   */

  @DISPID(-2147412050)
  @PropGet
  java.lang.Object onrowsdelete();


  /**
   * <p>
   * Setter method for the COM property "onrowsinserted"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412049)
  @PropPut
  void onrowsinserted(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onrowsinserted"
   * </p>
   */

  @DISPID(-2147412049)
  @PropGet
  java.lang.Object onrowsinserted();


  /**
   * <p>
   * Setter method for the COM property "oncellchange"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412048)
  @PropPut
  void oncellchange(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "oncellchange"
   * </p>
   */

  @DISPID(-2147412048)
  @PropGet
  java.lang.Object oncellchange();


  /**
   * <p>
   * Setter method for the COM property "ondatasetchanged"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412072)
  @PropPut
  void ondatasetchanged(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ondatasetchanged"
   * </p>
   */

  @DISPID(-2147412072)
  @PropGet
  java.lang.Object ondatasetchanged();


  /**
   * <p>
   * Setter method for the COM property "ondataavailable"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412071)
  @PropPut
  void ondataavailable(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ondataavailable"
   * </p>
   */

  @DISPID(-2147412071)
  @PropGet
  java.lang.Object ondataavailable();


  /**
   * <p>
   * Setter method for the COM property "ondatasetcomplete"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412070)
  @PropPut
  void ondatasetcomplete(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ondatasetcomplete"
   * </p>
   */

  @DISPID(-2147412070)
  @PropGet
  java.lang.Object ondatasetcomplete();


  /**
   * <p>
   * Setter method for the COM property "onpropertychange"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412065)
  @PropPut
  void onpropertychange(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onpropertychange"
   * </p>
   */

  @DISPID(-2147412065)
  @PropGet
  java.lang.Object onpropertychange();


  /**
   * <p>
   * Setter method for the COM property "dir"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412995)
  @PropPut
  void dir(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "dir"
   * </p>
   */

  @DISPID(-2147412995)
  @PropGet
  java.lang.String dir();


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
   * Setter method for the COM property "onstop"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412044)
  @PropPut
  void onstop(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onstop"
   * </p>
   */

  @DISPID(-2147412044)
  @PropGet
  java.lang.Object onstop();


  /**
   */

  @DISPID(1076)
  ms.html.IHTMLDocument2 createDocumentFragment();


  /**
   * <p>
   * Getter method for the COM property "parentDocument"
   * </p>
   */

  @DISPID(1078)
  @PropGet
  ms.html.IHTMLDocument2 parentDocument();


  /**
   * <p>
   * Setter method for the COM property "enableDownload"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1079)
  @PropPut
  void enableDownload(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "enableDownload"
   * </p>
   */

  @DISPID(1079)
  @PropGet
  boolean enableDownload();


  /**
   * <p>
   * Setter method for the COM property "baseUrl"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1080)
  @PropPut
  void baseUrl(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "baseUrl"
   * </p>
   */

  @DISPID(1080)
  @PropGet
  java.lang.String baseUrl();


  /**
   * <p>
   * Setter method for the COM property "inheritStyleSheets"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1082)
  @PropPut
  void inheritStyleSheets(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "inheritStyleSheets"
   * </p>
   */

  @DISPID(1082)
  @PropGet
  boolean inheritStyleSheets();


  /**
   * <p>
   * Setter method for the COM property "onbeforeeditfocus"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412043)
  @PropPut
  void onbeforeeditfocus(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onbeforeeditfocus"
   * </p>
   */

  @DISPID(-2147412043)
  @PropGet
  java.lang.Object onbeforeeditfocus();


  /**
   * @param v Mandatory java.lang.String parameter.
   */

  @DISPID(1086)
  ms.html.IHTMLElementCollection getElementsByName(
    java.lang.String v);


  /**
   * @param v Mandatory java.lang.String parameter.
   */

  @DISPID(1088)
  ms.html.IHTMLElement getElementById(
    java.lang.String v);


  /**
   * @param v Mandatory java.lang.String parameter.
   */

  @DISPID(1087)
  ms.html.IHTMLElementCollection getElementsByTagName(
    java.lang.String v);


  /**
   */

  @DISPID(1089)
  void focus();


  /**
   */

  @DISPID(1090)
  boolean hasFocus();


  /**
   * <p>
   * Setter method for the COM property "onselectionchange"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412032)
  @PropPut
  void onselectionchange(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onselectionchange"
   * </p>
   */

  @DISPID(-2147412032)
  @PropGet
  java.lang.Object onselectionchange();


  /**
   * <p>
   * Getter method for the COM property "namespaces"
   * </p>
   */

  @DISPID(1091)
  @PropGet
  com4j.Com4jObject namespaces();


  /**
   * @param bstrURL Mandatory java.lang.String parameter.
   * @param bstrOptions Mandatory java.lang.String parameter.
   */

  @DISPID(1092)
  ms.html.IHTMLDocument2 createDocumentFromUrl(
    java.lang.String bstrURL,
    java.lang.String bstrOptions);


  /**
   * <p>
   * Setter method for the COM property "media"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1093)
  @PropPut
  void media(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "media"
   * </p>
   */

  @DISPID(1093)
  @PropGet
  java.lang.String media();


  /**
   * @param pvarEventObject Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1094)
  ms.html.IHTMLEventObj createEventObject(
    @Optional java.lang.Object pvarEventObject);


  /**
   * @param bstrEventName Mandatory java.lang.String parameter.
   * @param pvarEventObject Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1095)
  boolean fireEvent(
    java.lang.String bstrEventName,
    @Optional java.lang.Object pvarEventObject);


  /**
   * @param v Mandatory java.lang.String parameter.
   */

  @DISPID(1096)
  ms.html.IHTMLRenderStyle createRenderStyle(
    java.lang.String v);


  /**
   * <p>
   * Setter method for the COM property "oncontrolselect"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412033)
  @PropPut
  void oncontrolselect(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "oncontrolselect"
   * </p>
   */

  @DISPID(-2147412033)
  @PropGet
  java.lang.Object oncontrolselect();


  /**
   * <p>
   * Getter method for the COM property "URLUnencoded"
   * </p>
   */

  @DISPID(1097)
  @PropGet
  java.lang.String urlUnencoded();


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
   * Getter method for the COM property "doctype"
   * </p>
   */

  @DISPID(1098)
  @PropGet
  ms.html.IHTMLDOMNode doctype();


  /**
   * <p>
   * Getter method for the COM property "implementation"
   * </p>
   */

  @DISPID(1099)
  @PropGet
  ms.html.IHTMLDOMImplementation implementation();


  /**
   * @param bstrAttrName Mandatory java.lang.String parameter.
   */

  @DISPID(1100)
  ms.html.IHTMLDOMAttribute createAttribute(
    java.lang.String bstrAttrName);


  /**
   * @param bstrData Mandatory java.lang.String parameter.
   */

  @DISPID(1101)
  ms.html.IHTMLDOMNode createComment(
    java.lang.String bstrData);


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
   * Setter method for the COM property "onactivate"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412025)
  @PropPut
  void onactivate(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onactivate"
   * </p>
   */

  @DISPID(-2147412025)
  @PropGet
  java.lang.Object onactivate();


  /**
   * <p>
   * Setter method for the COM property "ondeactivate"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412024)
  @PropPut
  void ondeactivate(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ondeactivate"
   * </p>
   */

  @DISPID(-2147412024)
  @PropGet
  java.lang.Object ondeactivate();


  /**
   * <p>
   * Setter method for the COM property "onbeforeactivate"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412022)
  @PropPut
  void onbeforeactivate(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onbeforeactivate"
   * </p>
   */

  @DISPID(-2147412022)
  @PropGet
  java.lang.Object onbeforeactivate();


  /**
   * <p>
   * Setter method for the COM property "onbeforedeactivate"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412035)
  @PropPut
  void onbeforedeactivate(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onbeforedeactivate"
   * </p>
   */

  @DISPID(-2147412035)
  @PropGet
  java.lang.Object onbeforedeactivate();


  /**
   * <p>
   * Getter method for the COM property "compatMode"
   * </p>
   */

  @DISPID(1102)
  @PropGet
  java.lang.String compatMode();


  /**
   * <p>
   * Getter method for the COM property "compatible"
   * </p>
   */

  @DISPID(1103)
  @PropGet
  ms.html.IHTMLDocumentCompatibleInfoCollection compatible();


  /**
   * <p>
   * Getter method for the COM property "documentMode"
   * </p>
   */

  @DISPID(1104)
  @PropGet
  java.lang.Object documentMode();


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
   * Setter method for the COM property "onstoragecommit"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412011)
  @PropPut
  void onstoragecommit(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onstoragecommit"
   * </p>
   */

  @DISPID(-2147412011)
  @PropGet
  java.lang.Object onstoragecommit();


  /**
   * @param bstrId Mandatory java.lang.String parameter.
   */

  @DISPID(1107)
  ms.html.IHTMLElement2 ie8_getElementById(
    java.lang.String bstrId);


  /**
   */

  @DISPID(1109)
  void updateSettings();


  /**
   * <p>
   * Getter method for the COM property "defaultView"
   * </p>
   */

  @DISPID(1110)
  @PropGet
  ms.html.IHTMLWindow2 defaultView();


  /**
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(1123)
  ms.html.IHTMLDOMNode createCDATASection(
    java.lang.String text);


  /**
   */

  @DISPID(1112)
  ms.html.IHTMLSelection getSelection();


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param bstrLocalName Mandatory java.lang.String parameter.
   */

  @DISPID(1113)
  ms.html.IHTMLElementCollection getElementsByTagNameNS(
    java.lang.Object pvarNS,
    java.lang.String bstrLocalName);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param bstrTag Mandatory java.lang.String parameter.
   */

  @DISPID(1114)
  ms.html.IHTMLElement createElementNS(
    java.lang.Object pvarNS,
    java.lang.String bstrTag);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param bstrAttrName Mandatory java.lang.String parameter.
   */

  @DISPID(1115)
  ms.html.IHTMLDOMAttribute createAttributeNS(
    java.lang.Object pvarNS,
    java.lang.String bstrAttrName);


  /**
   * <p>
   * Setter method for the COM property "onmsthumbnailclick"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411991)
  @PropPut
  void onmsthumbnailclick(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmsthumbnailclick"
   * </p>
   */

  @DISPID(-2147411991)
  @PropGet
  java.lang.Object onmsthumbnailclick();


  /**
   * <p>
   * Getter method for the COM property "characterSet"
   * </p>
   */

  @DISPID(1117)
  @PropGet
  java.lang.String characterSet();


  /**
   * @param bstrTag Mandatory java.lang.String parameter.
   */

  @DISPID(1118)
  ms.html.IHTMLElement ie9_createElement(
    java.lang.String bstrTag);


  /**
   * @param bstrAttrName Mandatory java.lang.String parameter.
   */

  @DISPID(1119)
  ms.html.IHTMLDOMAttribute ie9_createAttribute(
    java.lang.String bstrAttrName);


  /**
   * @param v Mandatory java.lang.String parameter.
   */

  @DISPID(1120)
  ms.html.IHTMLElementCollection getElementsByClassName(
    java.lang.String v);


  /**
   * @param bstrTarget Mandatory java.lang.String parameter.
   * @param bstrData Mandatory java.lang.String parameter.
   */

  @DISPID(1124)
  ms.html.IDOMProcessingInstruction createProcessingInstruction(
    java.lang.String bstrTarget,
    java.lang.String bstrData);


  /**
   * @param pNodeSource Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(1125)
  ms.html.IHTMLDOMNode3 adoptNode(
    ms.html.IHTMLDOMNode pNodeSource);


  /**
   * <p>
   * Setter method for the COM property "onmssitemodejumplistitemremoved"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147411982)
  @PropPut
  void onmssitemodejumplistitemremoved(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmssitemodejumplistitemremoved"
   * </p>
   */

  @DISPID(-2147411982)
  @PropGet
  java.lang.Object onmssitemodejumplistitemremoved();


  /**
   * <p>
   * Getter method for the COM property "ie9_all"
   * </p>
   */

  @DISPID(1126)
  @PropGet
  ms.html.IHTMLElementCollection ie9_all();


  /**
   * <p>
   * Getter method for the COM property "inputEncoding"
   * </p>
   */

  @DISPID(1127)
  @PropGet
  java.lang.String inputEncoding();


  /**
   * <p>
   * Getter method for the COM property "xmlEncoding"
   * </p>
   */

  @DISPID(1128)
  @PropGet
  java.lang.String xmlEncoding();


  /**
   * <p>
   * Setter method for the COM property "xmlStandalone"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1129)
  @PropPut
  void xmlStandalone(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "xmlStandalone"
   * </p>
   */

  @DISPID(1129)
  @PropGet
  boolean xmlStandalone();


  /**
   * <p>
   * Setter method for the COM property "xmlVersion"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1130)
  @PropPut
  void xmlVersion(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "xmlVersion"
   * </p>
   */

  @DISPID(1130)
  @PropGet
  java.lang.String xmlVersion();


  /**
   */

  @DISPID(1132)
  boolean hasAttributes();


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
   */

  @DISPID(1134)
  void normalize();


  /**
   * @param pNodeSource Mandatory ms.html.IHTMLDOMNode parameter.
   * @param fDeep Mandatory boolean parameter.
   */

  @DISPID(1135)
  ms.html.IHTMLDOMNode3 importNode(
    ms.html.IHTMLDOMNode pNodeSource,
    boolean fDeep);


  /**
   * <p>
   * Getter method for the COM property "ie9_parentWindow"
   * </p>
   */

  @DISPID(1136)
  @PropGet
  ms.html.IHTMLWindow2 ie9_parentWindow();


  /**
   * <p>
   * Setter method for the COM property "ie9_body"
   * </p>
   * @param rhs Mandatory ms.html.IHTMLElement parameter.
   */

  @DISPID(1137)
  @PropPut
  void ie9_body(
    ms.html.IHTMLElement rhs);


  /**
   * <p>
   * Getter method for the COM property "ie9_body"
   * </p>
   */

  @DISPID(1137)
  @PropGet
  ms.html.IHTMLElement ie9_body();


  /**
   * <p>
   * Getter method for the COM property "head"
   * </p>
   */

  @DISPID(1138)
  @PropGet
  ms.html.IHTMLElement head();


  /**
   * <p>
   * Getter method for the COM property "nodeType"
   * </p>
   */

  @DISPID(-2147417066)
  @PropGet
  int nodeType();


  /**
   * <p>
   * Getter method for the COM property "parentNode"
   * </p>
   */

  @DISPID(-2147417065)
  @PropGet
  ms.html.IHTMLDOMNode parentNode();


  /**
   */

  @DISPID(-2147417064)
  boolean hasChildNodes();


  /**
   * <p>
   * Getter method for the COM property "childNodes"
   * </p>
   */

  @DISPID(-2147417063)
  @PropGet
  com4j.Com4jObject childNodes();


  /**
   * <p>
   * Getter method for the COM property "attributes"
   * </p>
   */

  @DISPID(-2147417062)
  @PropGet
  com4j.Com4jObject attributes();


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param refChild Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-2147417061)
  ms.html.IHTMLDOMNode insertBefore(
    ms.html.IHTMLDOMNode newChild,
    @Optional java.lang.Object refChild);


  /**
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147417060)
  ms.html.IHTMLDOMNode removeChild(
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147417059)
  ms.html.IHTMLDOMNode replaceChild(
    ms.html.IHTMLDOMNode newChild,
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param fDeep Mandatory boolean parameter.
   */

  @DISPID(-2147417051)
  ms.html.IHTMLDOMNode cloneNode(
    boolean fDeep);


  /**
   * @param fDeep Optional parameter. Default value is false
   */

  @DISPID(-2147417046)
  ms.html.IHTMLDOMNode removeNode(
    @Optional @DefaultValue("0") boolean fDeep);


  /**
   * @param otherNode Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147417044)
  ms.html.IHTMLDOMNode swapNode(
    ms.html.IHTMLDOMNode otherNode);


  /**
   * @param replacement Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147417045)
  ms.html.IHTMLDOMNode replaceNode(
    ms.html.IHTMLDOMNode replacement);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147417039)
  ms.html.IHTMLDOMNode appendChild(
    ms.html.IHTMLDOMNode newChild);


  /**
   * <p>
   * Getter method for the COM property "nodeName"
   * </p>
   */

  @DISPID(-2147417038)
  @PropGet
  java.lang.String nodeName();


  /**
   * <p>
   * Setter method for the COM property "nodeValue"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147417037)
  @PropPut
  void nodeValue(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "nodeValue"
   * </p>
   */

  @DISPID(-2147417037)
  @PropGet
  java.lang.Object nodeValue();


  /**
   * <p>
   * Getter method for the COM property "firstChild"
   * </p>
   */

  @DISPID(-2147417036)
  @PropGet
  ms.html.IHTMLDOMNode firstChild();


  /**
   * <p>
   * Getter method for the COM property "lastChild"
   * </p>
   */

  @DISPID(-2147417035)
  @PropGet
  ms.html.IHTMLDOMNode lastChild();


  /**
   * <p>
   * Getter method for the COM property "previousSibling"
   * </p>
   */

  @DISPID(-2147417034)
  @PropGet
  ms.html.IHTMLDOMNode previousSibling();


  /**
   * <p>
   * Getter method for the COM property "nextSibling"
   * </p>
   */

  @DISPID(-2147417033)
  @PropGet
  ms.html.IHTMLDOMNode nextSibling();


  /**
   * <p>
   * Getter method for the COM property "ownerDocument"
   * </p>
   */

  @DISPID(-2147416999)
  @PropGet
  com4j.Com4jObject ownerDocument();


  /**
   * <p>
   * Setter method for the COM property "prefix"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416992)
  @PropPut
  void prefix(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "prefix"
   * </p>
   */

  @DISPID(-2147416992)
  @PropGet
  java.lang.Object prefix();


  /**
   * <p>
   * Getter method for the COM property "localName"
   * </p>
   */

  @DISPID(-2147416994)
  @PropGet
  java.lang.Object localName();


  /**
   * <p>
   * Getter method for the COM property "namespaceURI"
   * </p>
   */

  @DISPID(-2147416993)
  @PropGet
  java.lang.Object namespaceURI();


  /**
   * <p>
   * Setter method for the COM property "textContent"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416985)
  @PropPut
  void textContent(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "textContent"
   * </p>
   */

  @DISPID(-2147416985)
  @PropGet
  java.lang.Object textContent();


  /**
   * @param otherNode Mandatory ms.html.IHTMLDOMNode3 parameter.
   */

  @DISPID(-2147416991)
  boolean isEqualNode(
    ms.html.IHTMLDOMNode3 otherNode);


  /**
   * @param pvarPrefix Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416990)
  java.lang.Object lookupNamespaceURI(
    java.lang.Object pvarPrefix);


  /**
   * @param pvarNamespaceURI Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416989)
  java.lang.Object lookupPrefix(
    java.lang.Object pvarNamespaceURI);


  /**
   * @param pvarNamespace Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416988)
  boolean isDefaultNamespace(
    java.lang.Object pvarNamespace);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147416844)
  ms.html.IHTMLDOMNode ie9_appendChild(
    ms.html.IHTMLDOMNode newChild);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param refChild Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-2147416843)
  ms.html.IHTMLDOMNode ie9_insertBefore(
    ms.html.IHTMLDOMNode newChild,
    @Optional java.lang.Object refChild);


  /**
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147416842)
  ms.html.IHTMLDOMNode ie9_removeChild(
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param newChild Mandatory ms.html.IHTMLDOMNode parameter.
   * @param oldChild Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147416841)
  ms.html.IHTMLDOMNode ie9_replaceChild(
    ms.html.IHTMLDOMNode newChild,
    ms.html.IHTMLDOMNode oldChild);


  /**
   * @param otherNode Mandatory ms.html.IHTMLDOMNode3 parameter.
   */

  @DISPID(-2147416987)
  boolean isSameNode(
    ms.html.IHTMLDOMNode3 otherNode);


  /**
   * @param otherNode Mandatory ms.html.IHTMLDOMNode parameter.
   */

  @DISPID(-2147416986)
  short compareDocumentPosition(
    ms.html.IHTMLDOMNode otherNode);


  /**
   * @param feature Mandatory java.lang.String parameter.
   * @param version Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416835)
  boolean isSupported(
    java.lang.String feature,
    java.lang.Object version);


  /**
   * @param v Mandatory java.lang.String parameter.
   */

  @DISPID(1105)
  ms.html.IHTMLElement querySelector(
    java.lang.String v);


  /**
   * @param v Mandatory java.lang.String parameter.
   */

  @DISPID(1106)
  ms.html.IHTMLDOMChildrenCollection querySelectorAll(
    java.lang.String v);


  /**
   * @param pRootNode Mandatory com4j.Com4jObject parameter.
   * @param ulWhatToShow Mandatory int parameter.
   * @param pFilter Mandatory java.lang.Object parameter.
   * @param fEntityReferenceExpansion Mandatory boolean parameter.
   */

  @DISPID(1121)
  ms.html.IDOMNodeIterator createNodeIterator(
    com4j.Com4jObject pRootNode,
    int ulWhatToShow,
    java.lang.Object pFilter,
    boolean fEntityReferenceExpansion);


  /**
   * @param pRootNode Mandatory com4j.Com4jObject parameter.
   * @param ulWhatToShow Mandatory int parameter.
   * @param pFilter Mandatory java.lang.Object parameter.
   * @param fEntityReferenceExpansion Mandatory boolean parameter.
   */

  @DISPID(1122)
  ms.html.IDOMTreeWalker createTreeWalker(
    com4j.Com4jObject pRootNode,
    int ulWhatToShow,
    java.lang.Object pFilter,
    boolean fEntityReferenceExpansion);


  /**
   * <p>
   * Getter method for the COM property "constructor"
   * </p>
   */

  @DISPID(-2147417603)
  @PropGet
  com4j.Com4jObject constructor();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   */

  @DISPID(1108)
  ms.html.IDOMEvent createEvent(
    java.lang.String eventType);


  /**
   */

  @DISPID(1111)
  ms.html.IHTMLDOMRange createRange();


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


  /**
   * <p>
   * Getter method for the COM property "rootElement"
   * </p>
   */

  @DISPID(1116)
  @PropGet
  ms.html.ISVGSVGElement rootElement();


  // Properties:
}
