package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLDivPosition extends Com4jObject {
  // Methods:
  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param attributeValue Mandatory java.lang.Object parameter.
   * @param lFlags Optional parameter. Default value is 1
   */

  @DISPID(-2147417611)
  void setAttribute(
    java.lang.String strAttributeName,
    java.lang.Object attributeValue,
    @Optional @DefaultValue("1") int lFlags);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param lFlags Optional parameter. Default value is 0
   */

  @DISPID(-2147417610)
  java.lang.Object getAttribute(
    java.lang.String strAttributeName,
    @Optional @DefaultValue("0") int lFlags);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param lFlags Optional parameter. Default value is 1
   */

  @DISPID(-2147417609)
  boolean removeAttribute(
    java.lang.String strAttributeName,
    @Optional @DefaultValue("1") int lFlags);


  /**
   * <p>
   * Setter method for the COM property "className"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417111)
  @PropPut
  void className(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "className"
   * </p>
   */

  @DISPID(-2147417111)
  @PropGet
  java.lang.String className();


  /**
   * <p>
   * Setter method for the COM property "id"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417110)
  @PropPut
  void id(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "id"
   * </p>
   */

  @DISPID(-2147417110)
  @PropGet
  java.lang.String id();


  /**
   * <p>
   * Getter method for the COM property "tagName"
   * </p>
   */

  @DISPID(-2147417108)
  @PropGet
  java.lang.String tagName();


  /**
   * <p>
   * Getter method for the COM property "parentElement"
   * </p>
   */

  @DISPID(-2147418104)
  @PropGet
  ms.html.IHTMLElement parentElement();


  /**
   * <p>
   * Getter method for the COM property "style"
   * </p>
   */

  @DISPID(-2147418038)
  @PropGet
  ms.html.IHTMLStyle style();


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
   * Getter method for the COM property "document"
   * </p>
   */

  @DISPID(-2147417094)
  @PropGet
  com4j.Com4jObject document();


  /**
   * <p>
   * Setter method for the COM property "title"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418043)
  @PropPut
  void title(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "title"
   * </p>
   */

  @DISPID(-2147418043)
  @PropGet
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "language"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413012)
  @PropPut
  void language(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "language"
   * </p>
   */

  @DISPID(-2147413012)
  @PropGet
  java.lang.String language();


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
   * @param varargStart Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-2147417093)
  void scrollIntoView(
    @Optional java.lang.Object varargStart);


  /**
   * @param pChild Mandatory ms.html.IHTMLElement parameter.
   */

  @DISPID(-2147417092)
  boolean contains(
    ms.html.IHTMLElement pChild);


  /**
   * <p>
   * Getter method for the COM property "sourceIndex"
   * </p>
   */

  @DISPID(-2147417088)
  @PropGet
  int sourceIndex();


  /**
   * <p>
   * Getter method for the COM property "recordNumber"
   * </p>
   */

  @DISPID(-2147417087)
  @PropGet
  java.lang.Object recordNumber();


  /**
   * <p>
   * Setter method for the COM property "lang"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413103)
  @PropPut
  void lang(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "lang"
   * </p>
   */

  @DISPID(-2147413103)
  @PropGet
  java.lang.String lang();


  /**
   * <p>
   * Getter method for the COM property "offsetLeft"
   * </p>
   */

  @DISPID(-2147417104)
  @PropGet
  int offsetLeft();


  /**
   * <p>
   * Getter method for the COM property "offsetTop"
   * </p>
   */

  @DISPID(-2147417103)
  @PropGet
  int offsetTop();


  /**
   * <p>
   * Getter method for the COM property "offsetWidth"
   * </p>
   */

  @DISPID(-2147417102)
  @PropGet
  int offsetWidth();


  /**
   * <p>
   * Getter method for the COM property "offsetHeight"
   * </p>
   */

  @DISPID(-2147417101)
  @PropGet
  int offsetHeight();


  /**
   * <p>
   * Getter method for the COM property "offsetParent"
   * </p>
   */

  @DISPID(-2147417100)
  @PropGet
  ms.html.IHTMLElement offsetParent();


  /**
   * <p>
   * Setter method for the COM property "innerHTML"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417086)
  @PropPut
  void innerHTML(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "innerHTML"
   * </p>
   */

  @DISPID(-2147417086)
  @PropGet
  java.lang.String innerHTML();


  /**
   * <p>
   * Setter method for the COM property "innerText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417085)
  @PropPut
  void innerText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "innerText"
   * </p>
   */

  @DISPID(-2147417085)
  @PropGet
  java.lang.String innerText();


  /**
   * <p>
   * Setter method for the COM property "outerHTML"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417084)
  @PropPut
  void outerHTML(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "outerHTML"
   * </p>
   */

  @DISPID(-2147417084)
  @PropGet
  java.lang.String outerHTML();


  /**
   * <p>
   * Setter method for the COM property "outerText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417083)
  @PropPut
  void outerText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "outerText"
   * </p>
   */

  @DISPID(-2147417083)
  @PropGet
  java.lang.String outerText();


  /**
   * @param where Mandatory java.lang.String parameter.
   * @param html Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417082)
  void insertAdjacentHTML(
    java.lang.String where,
    java.lang.String html);


  /**
   * @param where Mandatory java.lang.String parameter.
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417081)
  void insertAdjacentText(
    java.lang.String where,
    java.lang.String text);


  /**
   * <p>
   * Getter method for the COM property "parentTextEdit"
   * </p>
   */

  @DISPID(-2147417080)
  @PropGet
  ms.html.IHTMLElement parentTextEdit();


  /**
   * <p>
   * Getter method for the COM property "isTextEdit"
   * </p>
   */

  @DISPID(-2147417078)
  @PropGet
  boolean isTextEdit();


  /**
   */

  @DISPID(-2147417079)
  void click();


  /**
   * <p>
   * Getter method for the COM property "filters"
   * </p>
   */

  @DISPID(-2147417077)
  @PropGet
  ms.html.IHTMLFiltersCollection filters();


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
   */

  @DISPID(-2147417076)
  java.lang.String toString_();


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
   * Setter method for the COM property "onfilterchange"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412069)
  @PropPut
  void onfilterchange(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onfilterchange"
   * </p>
   */

  @DISPID(-2147412069)
  @PropGet
  java.lang.Object onfilterchange();


  /**
   * <p>
   * Getter method for the COM property "children"
   * </p>
   */

  @DISPID(-2147417075)
  @PropGet
  com4j.Com4jObject children();


  /**
   * <p>
   * Getter method for the COM property "all"
   * </p>
   */

  @DISPID(-2147417074)
  @PropGet
  com4j.Com4jObject all();


  /**
   * <p>
   * Getter method for the COM property "scopeName"
   * </p>
   */

  @DISPID(-2147417073)
  @PropGet
  java.lang.String scopeName();


  /**
   * @param containerCapture Optional parameter. Default value is false
   */

  @DISPID(-2147417072)
  void setCapture(
    @Optional @DefaultValue("-1") boolean containerCapture);


  /**
   */

  @DISPID(-2147417071)
  void releaseCapture();


  /**
   * <p>
   * Setter method for the COM property "onlosecapture"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412066)
  @PropPut
  void onlosecapture(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onlosecapture"
   * </p>
   */

  @DISPID(-2147412066)
  @PropGet
  java.lang.Object onlosecapture();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(-2147417070)
  java.lang.String componentFromPoint(
    int x,
    int y);


  /**
   * @param component Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-2147417069)
  void doScroll(
    @Optional java.lang.Object component);


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
   * Setter method for the COM property "onbeforecut"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412054)
  @PropPut
  void onbeforecut(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onbeforecut"
   * </p>
   */

  @DISPID(-2147412054)
  @PropGet
  java.lang.Object onbeforecut();


  /**
   * <p>
   * Setter method for the COM property "oncut"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412057)
  @PropPut
  void oncut(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "oncut"
   * </p>
   */

  @DISPID(-2147412057)
  @PropGet
  java.lang.Object oncut();


  /**
   * <p>
   * Setter method for the COM property "onbeforecopy"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412053)
  @PropPut
  void onbeforecopy(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onbeforecopy"
   * </p>
   */

  @DISPID(-2147412053)
  @PropGet
  java.lang.Object onbeforecopy();


  /**
   * <p>
   * Setter method for the COM property "oncopy"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412056)
  @PropPut
  void oncopy(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "oncopy"
   * </p>
   */

  @DISPID(-2147412056)
  @PropGet
  java.lang.Object oncopy();


  /**
   * <p>
   * Setter method for the COM property "onbeforepaste"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412052)
  @PropPut
  void onbeforepaste(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onbeforepaste"
   * </p>
   */

  @DISPID(-2147412052)
  @PropGet
  java.lang.Object onbeforepaste();


  /**
   * <p>
   * Setter method for the COM property "onpaste"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412055)
  @PropPut
  void onpaste(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onpaste"
   * </p>
   */

  @DISPID(-2147412055)
  @PropGet
  java.lang.Object onpaste();


  /**
   * <p>
   * Getter method for the COM property "currentStyle"
   * </p>
   */

  @DISPID(-2147417105)
  @PropGet
  ms.html.IHTMLCurrentStyle currentStyle();


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
   */

  @DISPID(-2147417068)
  ms.html.IHTMLRectCollection getClientRects();


  /**
   */

  @DISPID(-2147417067)
  ms.html.IHTMLRect getBoundingClientRect();


  /**
   * @param propname Mandatory java.lang.String parameter.
   * @param expression Mandatory java.lang.String parameter.
   * @param language Optional parameter. Default value is ""
   */

  @DISPID(-2147417608)
  void setExpression(
    java.lang.String propname,
    java.lang.String expression,
    @Optional @DefaultValue("") java.lang.String language);


  /**
   * @param propname Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417607)
  java.lang.Object getExpression(
    java.lang.String propname);


  /**
   * @param propname Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417606)
  boolean removeExpression(
    java.lang.String propname);


  /**
   * <p>
   * Setter method for the COM property "tabIndex"
   * </p>
   * @param rhs Mandatory short parameter.
   */

  @DISPID(-2147418097)
  @PropPut
  void tabIndex(
    short rhs);


  /**
   * <p>
   * Getter method for the COM property "tabIndex"
   * </p>
   */

  @DISPID(-2147418097)
  @PropGet
  short tabIndex();


  /**
   */

  @DISPID(-2147416112)
  void focus();


  /**
   * <p>
   * Setter method for the COM property "accessKey"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416107)
  @PropPut
  void accessKey(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "accessKey"
   * </p>
   */

  @DISPID(-2147416107)
  @PropGet
  java.lang.String accessKey();


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
   */

  @DISPID(-2147416110)
  void blur();


  /**
   * @param pUnk Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147416095)
  void addFilter(
    com4j.Com4jObject pUnk);


  /**
   * @param pUnk Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147416094)
  void removeFilter(
    com4j.Com4jObject pUnk);


  /**
   * <p>
   * Getter method for the COM property "clientHeight"
   * </p>
   */

  @DISPID(-2147416093)
  @PropGet
  int clientHeight();


  /**
   * <p>
   * Getter method for the COM property "clientWidth"
   * </p>
   */

  @DISPID(-2147416092)
  @PropGet
  int clientWidth();


  /**
   * <p>
   * Getter method for the COM property "clientTop"
   * </p>
   */

  @DISPID(-2147416091)
  @PropGet
  int clientTop();


  /**
   * <p>
   * Getter method for the COM property "clientLeft"
   * </p>
   */

  @DISPID(-2147416090)
  @PropGet
  int clientLeft();


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
   * Getter method for the COM property "readyState"
   * </p>
   */

  @DISPID(-2147412996)
  @PropGet
  java.lang.Object readyState();


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
   */

  @DISPID(-2147417056)
  com4j.Com4jObject createControlRange();


  /**
   * <p>
   * Getter method for the COM property "scrollHeight"
   * </p>
   */

  @DISPID(-2147417055)
  @PropGet
  int scrollHeight();


  /**
   * <p>
   * Getter method for the COM property "scrollWidth"
   * </p>
   */

  @DISPID(-2147417054)
  @PropGet
  int scrollWidth();


  /**
   * <p>
   * Setter method for the COM property "scrollTop"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(-2147417053)
  @PropPut
  void scrollTop(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "scrollTop"
   * </p>
   */

  @DISPID(-2147417053)
  @PropGet
  int scrollTop();


  /**
   * <p>
   * Setter method for the COM property "scrollLeft"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(-2147417052)
  @PropPut
  void scrollLeft(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "scrollLeft"
   * </p>
   */

  @DISPID(-2147417052)
  @PropGet
  int scrollLeft();


  /**
   */

  @DISPID(-2147417050)
  void clearAttributes();


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
   * @param where Mandatory java.lang.String parameter.
   * @param insertedElement Mandatory ms.html.IHTMLElement parameter.
   */

  @DISPID(-2147417043)
  ms.html.IHTMLElement insertAdjacentElement(
    java.lang.String where,
    ms.html.IHTMLElement insertedElement);


  /**
   * @param apply Mandatory ms.html.IHTMLElement parameter.
   * @param where Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417047)
  ms.html.IHTMLElement applyElement(
    ms.html.IHTMLElement apply,
    java.lang.String where);


  /**
   * @param where Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417042)
  java.lang.String getAdjacentText(
    java.lang.String where);


  /**
   * @param where Mandatory java.lang.String parameter.
   * @param newText Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417041)
  java.lang.String replaceAdjacentText(
    java.lang.String where,
    java.lang.String newText);


  /**
   * <p>
   * Getter method for the COM property "canHaveChildren"
   * </p>
   */

  @DISPID(-2147417040)
  @PropGet
  boolean canHaveChildren();


  /**
   * @param bstrURL Mandatory java.lang.String parameter.
   * @param pvarFactory Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-2147417032)
  int addBehavior(
    java.lang.String bstrURL,
    @Optional java.lang.Object pvarFactory);


  /**
   * @param cookie Mandatory int parameter.
   */

  @DISPID(-2147417031)
  boolean removeBehavior(
    int cookie);


  /**
   * <p>
   * Getter method for the COM property "runtimeStyle"
   * </p>
   */

  @DISPID(-2147417048)
  @PropGet
  ms.html.IHTMLStyle runtimeStyle();


  /**
   * <p>
   * Getter method for the COM property "behaviorUrns"
   * </p>
   */

  @DISPID(-2147417030)
  @PropGet
  com4j.Com4jObject behaviorUrns();


  /**
   * <p>
   * Setter method for the COM property "tagUrn"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417029)
  @PropPut
  void tagUrn(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "tagUrn"
   * </p>
   */

  @DISPID(-2147417029)
  @PropGet
  java.lang.String tagUrn();


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
   * <p>
   * Getter method for the COM property "readyStateValue"
   * </p>
   */

  @DISPID(-2147417028)
  @PropGet
  int readyStateValue();


  /**
   * @param v Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417027)
  ms.html.IHTMLElementCollection getElementsByTagName(
    java.lang.String v);


  /**
   * @param mergeThis Mandatory ms.html.IHTMLElement parameter.
   * @param pvarFlags Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-2147417016)
  void mergeAttributes(
    ms.html.IHTMLElement mergeThis,
    @Optional java.lang.Object pvarFlags);


  /**
   * <p>
   * Getter method for the COM property "isMultiLine"
   * </p>
   */

  @DISPID(-2147417015)
  @PropGet
  boolean isMultiLine();


  /**
   * <p>
   * Getter method for the COM property "canHaveHTML"
   * </p>
   */

  @DISPID(-2147417014)
  @PropGet
  boolean canHaveHTML();


  /**
   * <p>
   * Setter method for the COM property "onlayoutcomplete"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412039)
  @PropPut
  void onlayoutcomplete(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onlayoutcomplete"
   * </p>
   */

  @DISPID(-2147412039)
  @PropGet
  java.lang.Object onlayoutcomplete();


  /**
   * <p>
   * Setter method for the COM property "onpage"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412038)
  @PropPut
  void onpage(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onpage"
   * </p>
   */

  @DISPID(-2147412038)
  @PropGet
  java.lang.Object onpage();


  /**
   * <p>
   * Setter method for the COM property "inflateBlock"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(-2147417012)
  @PropPut
  void inflateBlock(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "inflateBlock"
   * </p>
   */

  @DISPID(-2147417012)
  @PropGet
  boolean inflateBlock();


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
   */

  @DISPID(-2147417011)
  void setActive();


  /**
   * <p>
   * Setter method for the COM property "contentEditable"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412950)
  @PropPut
  void contentEditable(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "contentEditable"
   * </p>
   */

  @DISPID(-2147412950)
  @PropGet
  java.lang.String contentEditable();


  /**
   * <p>
   * Getter method for the COM property "isContentEditable"
   * </p>
   */

  @DISPID(-2147417010)
  @PropGet
  boolean isContentEditable();


  /**
   * <p>
   * Setter method for the COM property "hideFocus"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(-2147412949)
  @PropPut
  void hideFocus(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "hideFocus"
   * </p>
   */

  @DISPID(-2147412949)
  @PropGet
  boolean hideFocus();


  /**
   * <p>
   * Setter method for the COM property "disabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(-2147418036)
  @PropPut
  void disabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "disabled"
   * </p>
   */

  @DISPID(-2147418036)
  @PropGet
  boolean disabled();


  /**
   * <p>
   * Getter method for the COM property "isDisabled"
   * </p>
   */

  @DISPID(-2147417007)
  @PropGet
  boolean isDisabled();


  /**
   * <p>
   * Setter method for the COM property "onmove"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412034)
  @PropPut
  void onmove(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmove"
   * </p>
   */

  @DISPID(-2147412034)
  @PropGet
  java.lang.Object onmove();


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
   * @param bstrEventName Mandatory java.lang.String parameter.
   * @param pvarEventObject Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-2147417006)
  boolean fireEvent(
    java.lang.String bstrEventName,
    @Optional java.lang.Object pvarEventObject);


  /**
   * <p>
   * Setter method for the COM property "onresizestart"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412029)
  @PropPut
  void onresizestart(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onresizestart"
   * </p>
   */

  @DISPID(-2147412029)
  @PropGet
  java.lang.Object onresizestart();


  /**
   * <p>
   * Setter method for the COM property "onresizeend"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412028)
  @PropPut
  void onresizeend(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onresizeend"
   * </p>
   */

  @DISPID(-2147412028)
  @PropGet
  java.lang.Object onresizeend();


  /**
   * <p>
   * Setter method for the COM property "onmovestart"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412031)
  @PropPut
  void onmovestart(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmovestart"
   * </p>
   */

  @DISPID(-2147412031)
  @PropGet
  java.lang.Object onmovestart();


  /**
   * <p>
   * Setter method for the COM property "onmoveend"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412030)
  @PropPut
  void onmoveend(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "onmoveend"
   * </p>
   */

  @DISPID(-2147412030)
  @PropGet
  java.lang.Object onmoveend();


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
   */

  @DISPID(-2147417005)
  boolean dragDrop();


  /**
   * <p>
   * Getter method for the COM property "glyphMode"
   * </p>
   */

  @DISPID(-2147417004)
  @PropGet
  int glyphMode();


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
   */

  @DISPID(-2147417000)
  void normalize();


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417003)
  ms.html.IHTMLDOMAttribute getAttributeNode(
    java.lang.String bstrName);


  /**
   * @param pattr Mandatory ms.html.IHTMLDOMAttribute parameter.
   */

  @DISPID(-2147417002)
  ms.html.IHTMLDOMAttribute setAttributeNode(
    ms.html.IHTMLDOMAttribute pattr);


  /**
   * @param pattr Mandatory ms.html.IHTMLDOMAttribute parameter.
   */

  @DISPID(-2147417001)
  ms.html.IHTMLDOMAttribute removeAttributeNode(
    ms.html.IHTMLDOMAttribute pattr);


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
   * Getter method for the COM property "uniqueNumber"
   * </p>
   */

  @DISPID(-2147417058)
  @PropGet
  int uniqueNumber();


  /**
   * <p>
   * Getter method for the COM property "uniqueID"
   * </p>
   */

  @DISPID(-2147417057)
  @PropGet
  java.lang.String uniqueID();


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
   * <p>
   * Setter method for the COM property "dataFld"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417091)
  @PropPut
  void dataFld(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "dataFld"
   * </p>
   */

  @DISPID(-2147417091)
  @PropGet
  java.lang.String dataFld();


  /**
   * <p>
   * Setter method for the COM property "dataSrc"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417090)
  @PropPut
  void dataSrc(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "dataSrc"
   * </p>
   */

  @DISPID(-2147417090)
  @PropGet
  java.lang.String dataSrc();


  /**
   * <p>
   * Setter method for the COM property "dataFormatAs"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417089)
  @PropPut
  void dataFormatAs(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "dataFormatAs"
   * </p>
   */

  @DISPID(-2147417089)
  @PropGet
  java.lang.String dataFormatAs();


  /**
   * @param bstrName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416912)
  ms.html.IHTMLDOMAttribute2 ie8_getAttributeNode(
    java.lang.String bstrName);


  /**
   * @param pattr Mandatory ms.html.IHTMLDOMAttribute2 parameter.
   */

  @DISPID(-2147416911)
  ms.html.IHTMLDOMAttribute2 ie8_setAttributeNode(
    ms.html.IHTMLDOMAttribute2 pattr);


  /**
   * @param pattr Mandatory ms.html.IHTMLDOMAttribute2 parameter.
   */

  @DISPID(-2147416910)
  ms.html.IHTMLDOMAttribute2 ie8_removeAttributeNode(
    ms.html.IHTMLDOMAttribute2 pattr);


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416909)
  boolean hasAttribute(
    java.lang.String name);


  /**
   * <p>
   * Setter method for the COM property "role"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416908)
  @PropPut
  void role(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "role"
   * </p>
   */

  @DISPID(-2147416908)
  @PropGet
  java.lang.String role();


  /**
   * <p>
   * Setter method for the COM property "ariaBusy"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416907)
  @PropPut
  void ariaBusy(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaBusy"
   * </p>
   */

  @DISPID(-2147416907)
  @PropGet
  java.lang.String ariaBusy();


  /**
   * <p>
   * Setter method for the COM property "ariaChecked"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416906)
  @PropPut
  void ariaChecked(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaChecked"
   * </p>
   */

  @DISPID(-2147416906)
  @PropGet
  java.lang.String ariaChecked();


  /**
   * <p>
   * Setter method for the COM property "ariaDisabled"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416905)
  @PropPut
  void ariaDisabled(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaDisabled"
   * </p>
   */

  @DISPID(-2147416905)
  @PropGet
  java.lang.String ariaDisabled();


  /**
   * <p>
   * Setter method for the COM property "ariaExpanded"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416904)
  @PropPut
  void ariaExpanded(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaExpanded"
   * </p>
   */

  @DISPID(-2147416904)
  @PropGet
  java.lang.String ariaExpanded();


  /**
   * <p>
   * Setter method for the COM property "ariaHaspopup"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416903)
  @PropPut
  void ariaHaspopup(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaHaspopup"
   * </p>
   */

  @DISPID(-2147416903)
  @PropGet
  java.lang.String ariaHaspopup();


  /**
   * <p>
   * Setter method for the COM property "ariaHidden"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416902)
  @PropPut
  void ariaHidden(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaHidden"
   * </p>
   */

  @DISPID(-2147416902)
  @PropGet
  java.lang.String ariaHidden();


  /**
   * <p>
   * Setter method for the COM property "ariaInvalid"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416901)
  @PropPut
  void ariaInvalid(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaInvalid"
   * </p>
   */

  @DISPID(-2147416901)
  @PropGet
  java.lang.String ariaInvalid();


  /**
   * <p>
   * Setter method for the COM property "ariaMultiselectable"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416900)
  @PropPut
  void ariaMultiselectable(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaMultiselectable"
   * </p>
   */

  @DISPID(-2147416900)
  @PropGet
  java.lang.String ariaMultiselectable();


  /**
   * <p>
   * Setter method for the COM property "ariaPressed"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416899)
  @PropPut
  void ariaPressed(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaPressed"
   * </p>
   */

  @DISPID(-2147416899)
  @PropGet
  java.lang.String ariaPressed();


  /**
   * <p>
   * Setter method for the COM property "ariaReadonly"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416898)
  @PropPut
  void ariaReadonly(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaReadonly"
   * </p>
   */

  @DISPID(-2147416898)
  @PropGet
  java.lang.String ariaReadonly();


  /**
   * <p>
   * Setter method for the COM property "ariaRequired"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416897)
  @PropPut
  void ariaRequired(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaRequired"
   * </p>
   */

  @DISPID(-2147416897)
  @PropGet
  java.lang.String ariaRequired();


  /**
   * <p>
   * Setter method for the COM property "ariaSecret"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416896)
  @PropPut
  void ariaSecret(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaSecret"
   * </p>
   */

  @DISPID(-2147416896)
  @PropGet
  java.lang.String ariaSecret();


  /**
   * <p>
   * Setter method for the COM property "ariaSelected"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416895)
  @PropPut
  void ariaSelected(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaSelected"
   * </p>
   */

  @DISPID(-2147416895)
  @PropGet
  java.lang.String ariaSelected();


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416894)
  java.lang.Object ie8_getAttribute(
    java.lang.String strAttributeName);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param attributeValue Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416893)
  void ie8_setAttribute(
    java.lang.String strAttributeName,
    java.lang.Object attributeValue);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416892)
  boolean ie8_removeAttribute(
    java.lang.String strAttributeName);


  /**
   * <p>
   * Getter method for the COM property "ie8_attributes"
   * </p>
   */

  @DISPID(-2147416891)
  @PropGet
  ms.html.IHTMLAttributeCollection3 ie8_attributes();


  /**
   * <p>
   * Setter method for the COM property "ariaValuenow"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416890)
  @PropPut
  void ariaValuenow(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaValuenow"
   * </p>
   */

  @DISPID(-2147416890)
  @PropGet
  java.lang.String ariaValuenow();


  /**
   * <p>
   * Setter method for the COM property "ariaPosinset"
   * </p>
   * @param rhs Mandatory short parameter.
   */

  @DISPID(-2147416889)
  @PropPut
  void ariaPosinset(
    short rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaPosinset"
   * </p>
   */

  @DISPID(-2147416889)
  @PropGet
  short ariaPosinset();


  /**
   * <p>
   * Setter method for the COM property "ariaSetsize"
   * </p>
   * @param rhs Mandatory short parameter.
   */

  @DISPID(-2147416888)
  @PropPut
  void ariaSetsize(
    short rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaSetsize"
   * </p>
   */

  @DISPID(-2147416888)
  @PropGet
  short ariaSetsize();


  /**
   * <p>
   * Setter method for the COM property "ariaLevel"
   * </p>
   * @param rhs Mandatory short parameter.
   */

  @DISPID(-2147416887)
  @PropPut
  void ariaLevel(
    short rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaLevel"
   * </p>
   */

  @DISPID(-2147416887)
  @PropGet
  short ariaLevel();


  /**
   * <p>
   * Setter method for the COM property "ariaValuemin"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416886)
  @PropPut
  void ariaValuemin(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaValuemin"
   * </p>
   */

  @DISPID(-2147416886)
  @PropGet
  java.lang.String ariaValuemin();


  /**
   * <p>
   * Setter method for the COM property "ariaValuemax"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416885)
  @PropPut
  void ariaValuemax(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaValuemax"
   * </p>
   */

  @DISPID(-2147416885)
  @PropGet
  java.lang.String ariaValuemax();


  /**
   * <p>
   * Setter method for the COM property "ariaControls"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416884)
  @PropPut
  void ariaControls(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaControls"
   * </p>
   */

  @DISPID(-2147416884)
  @PropGet
  java.lang.String ariaControls();


  /**
   * <p>
   * Setter method for the COM property "ariaDescribedby"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416883)
  @PropPut
  void ariaDescribedby(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaDescribedby"
   * </p>
   */

  @DISPID(-2147416883)
  @PropGet
  java.lang.String ariaDescribedby();


  /**
   * <p>
   * Setter method for the COM property "ariaFlowto"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416882)
  @PropPut
  void ariaFlowto(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaFlowto"
   * </p>
   */

  @DISPID(-2147416882)
  @PropGet
  java.lang.String ariaFlowto();


  /**
   * <p>
   * Setter method for the COM property "ariaLabelledby"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416881)
  @PropPut
  void ariaLabelledby(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaLabelledby"
   * </p>
   */

  @DISPID(-2147416881)
  @PropGet
  java.lang.String ariaLabelledby();


  /**
   * <p>
   * Setter method for the COM property "ariaActivedescendant"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416880)
  @PropPut
  void ariaActivedescendant(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaActivedescendant"
   * </p>
   */

  @DISPID(-2147416880)
  @PropGet
  java.lang.String ariaActivedescendant();


  /**
   * <p>
   * Setter method for the COM property "ariaOwns"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416879)
  @PropPut
  void ariaOwns(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaOwns"
   * </p>
   */

  @DISPID(-2147416879)
  @PropGet
  java.lang.String ariaOwns();


  /**
   */

  @DISPID(-2147416878)
  boolean hasAttributes();


  /**
   * <p>
   * Setter method for the COM property "ariaLive"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416877)
  @PropPut
  void ariaLive(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaLive"
   * </p>
   */

  @DISPID(-2147416877)
  @PropGet
  java.lang.String ariaLive();


  /**
   * <p>
   * Setter method for the COM property "ariaRelevant"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416876)
  @PropPut
  void ariaRelevant(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ariaRelevant"
   * </p>
   */

  @DISPID(-2147416876)
  @PropGet
  java.lang.String ariaRelevant();


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param strAttributeName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416859)
  java.lang.Object getAttributeNS(
    java.lang.Object pvarNS,
    java.lang.String strAttributeName);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param pvarAttributeValue Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416858)
  void setAttributeNS(
    java.lang.Object pvarNS,
    java.lang.String strAttributeName,
    java.lang.Object pvarAttributeValue);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param strAttributeName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416857)
  void removeAttributeNS(
    java.lang.Object pvarNS,
    java.lang.String strAttributeName);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param bstrName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416862)
  ms.html.IHTMLDOMAttribute2 getAttributeNodeNS(
    java.lang.Object pvarNS,
    java.lang.String bstrName);


  /**
   * @param pattr Mandatory ms.html.IHTMLDOMAttribute2 parameter.
   */

  @DISPID(-2147416861)
  ms.html.IHTMLDOMAttribute2 setAttributeNodeNS(
    ms.html.IHTMLDOMAttribute2 pattr);


  /**
   * @param pvarNS Mandatory java.lang.Object parameter.
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416860)
  boolean hasAttributeNS(
    java.lang.Object pvarNS,
    java.lang.String name);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416852)
  java.lang.Object ie9_getAttribute(
    java.lang.String strAttributeName);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   * @param pvarAttributeValue Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147416851)
  void ie9_setAttribute(
    java.lang.String strAttributeName,
    java.lang.Object pvarAttributeValue);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416850)
  void ie9_removeAttribute(
    java.lang.String strAttributeName);


  /**
   * @param strAttributeName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416856)
  ms.html.IHTMLDOMAttribute2 ie9_getAttributeNode(
    java.lang.String strAttributeName);


  /**
   * @param pattr Mandatory ms.html.IHTMLDOMAttribute2 parameter.
   */

  @DISPID(-2147416855)
  ms.html.IHTMLDOMAttribute2 ie9_setAttributeNode(
    ms.html.IHTMLDOMAttribute2 pattr);


  /**
   * @param pattr Mandatory ms.html.IHTMLDOMAttribute2 parameter.
   */

  @DISPID(-2147416854)
  ms.html.IHTMLDOMAttribute2 ie9_removeAttributeNode(
    ms.html.IHTMLDOMAttribute2 pattr);


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416853)
  boolean ie9_hasAttribute(
    java.lang.String name);


  /**
   * @param varNS Mandatory java.lang.Object parameter.
   * @param bstrLocalName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416849)
  ms.html.IHTMLElementCollection getElementsByTagNameNS(
    java.lang.Object varNS,
    java.lang.String bstrLocalName);


  /**
   * <p>
   * Getter method for the COM property "ie9_tagName"
   * </p>
   */

  @DISPID(-2147416847)
  @PropGet
  java.lang.String ie9_tagName();


  /**
   * <p>
   * Getter method for the COM property "ie9_nodeName"
   * </p>
   */

  @DISPID(-2147416846)
  @PropGet
  java.lang.String ie9_nodeName();


  /**
   * @param v Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416845)
  ms.html.IHTMLElementCollection getElementsByClassName(
    java.lang.String v);


  /**
   * @param v Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416834)
  boolean msMatchesSelector(
    java.lang.String v);


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

  @DISPID(-2147416833)
  boolean ie9_hasAttributes();


  /**
   * @param v Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416998)
  ms.html.IHTMLElement querySelector(
    java.lang.String v);


  /**
   * @param v Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416997)
  ms.html.IHTMLDOMChildrenCollection querySelectorAll(
    java.lang.String v);


  /**
   * <p>
   * Getter method for the COM property "constructor"
   * </p>
   */

  @DISPID(-2147417603)
  @PropGet
  com4j.Com4jObject constructor();


  /**
   * <p>
   * Setter method for the COM property "align"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418039)
  @PropPut
  void align(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "align"
   * </p>
   */

  @DISPID(-2147418039)
  @PropGet
  java.lang.String align();


  // Properties:
}
