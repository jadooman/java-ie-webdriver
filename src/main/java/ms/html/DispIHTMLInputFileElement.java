package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispIHTMLInputFileElement extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "type"
   * </p>
   */

  @DISPID(2000)
  @PropGet
  java.lang.String type();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112)
  @PropPut
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   */

  @DISPID(-2147418112)
  @PropGet
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "status"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2021)
  @PropPut
  void status(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "status"
   * </p>
   */

  @DISPID(2021)
  @PropGet
  java.lang.Object status();


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
   * Getter method for the COM property "form"
   * </p>
   */

  @DISPID(-2147416108)
  @PropGet
  ms.html.IHTMLFormElement form();


  /**
   * <p>
   * Setter method for the COM property "size"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2002)
  @PropPut
  void size(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "size"
   * </p>
   */

  @DISPID(2002)
  @PropGet
  int size();


  /**
   * <p>
   * Setter method for the COM property "maxLength"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2003)
  @PropPut
  void maxLength(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "maxLength"
   * </p>
   */

  @DISPID(2003)
  @PropGet
  int maxLength();


  /**
   */

  @DISPID(2004)
  void select();


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
   * Setter method for the COM property "value"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413011)
  @PropPut
  void value(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   */

  @DISPID(-2147413011)
  @PropGet
  java.lang.String value();


  // Properties:
}
