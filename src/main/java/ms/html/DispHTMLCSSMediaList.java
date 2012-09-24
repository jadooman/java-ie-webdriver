package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLCSSMediaList extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "mediaText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1001)
  @PropPut
  void mediaText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "mediaText"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  java.lang.String mediaText();


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  int length();


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(1003)
  java.lang.String item(
    int index);


  /**
   * @param bstrMedium Mandatory java.lang.String parameter.
   */

  @DISPID(1004)
  void appendMedium(
    java.lang.String bstrMedium);


  /**
   * @param bstrMedium Mandatory java.lang.String parameter.
   */

  @DISPID(1005)
  void deleteMedium(
    java.lang.String bstrMedium);


  // Properties:
}
