package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLDefaults extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "style"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  ms.html.IHTMLStyle style();


  /**
   * <p>
   * Setter method for the COM property "tabStop"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1002)
  @PropPut
  void tabStop(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "tabStop"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  boolean tabStop();


  /**
   * <p>
   * Setter method for the COM property "viewInheritStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(-2147412913)
  @PropPut
  void viewInheritStyle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "viewInheritStyle"
   * </p>
   */

  @DISPID(-2147412913)
  @PropGet
  boolean viewInheritStyle();


  /**
   * <p>
   * Setter method for the COM property "viewMasterTab"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1006)
  @PropPut
  void viewMasterTab(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "viewMasterTab"
   * </p>
   */

  @DISPID(1006)
  @PropGet
  boolean viewMasterTab();


  /**
   * <p>
   * Setter method for the COM property "scrollSegmentX"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1003)
  @PropPut
  void scrollSegmentX(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "scrollSegmentX"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  int scrollSegmentX();


  /**
   * <p>
   * Setter method for the COM property "scrollSegmentY"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1004)
  @PropPut
  void scrollSegmentY(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "scrollSegmentY"
   * </p>
   */

  @DISPID(1004)
  @PropGet
  int scrollSegmentY();


  /**
   * <p>
   * Setter method for the COM property "isMultiLine"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1008)
  @PropPut
  void isMultiLine(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "isMultiLine"
   * </p>
   */

  @DISPID(1008)
  @PropGet
  boolean isMultiLine();


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
   * Setter method for the COM property "canHaveHTML"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1009)
  @PropPut
  void canHaveHTML(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "canHaveHTML"
   * </p>
   */

  @DISPID(1009)
  @PropGet
  boolean canHaveHTML();


  /**
   * <p>
   * Setter method for the COM property "viewLink"
   * </p>
   * @param rhs Mandatory ms.html.IHTMLDocument parameter.
   */

  @DISPID(1011)
  @PropPut
  void viewLink(
    ms.html.IHTMLDocument rhs);


  /**
   * <p>
   * Getter method for the COM property "viewLink"
   * </p>
   */

  @DISPID(1011)
  @PropGet
  ms.html.IHTMLDocument viewLink();


  /**
   * <p>
   * Setter method for the COM property "frozen"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(-2147412914)
  @PropPut
  void frozen(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "frozen"
   * </p>
   */

  @DISPID(-2147412914)
  @PropGet
  boolean frozen();


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
