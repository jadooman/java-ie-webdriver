package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLStorage extends Com4jObject {
  // Methods:
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
   * Getter method for the COM property "length"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  int length();


  /**
   * <p>
   * Getter method for the COM property "remainingSpace"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  int remainingSpace();


  /**
   * @param lIndex Mandatory int parameter.
   */

  @DISPID(1006)
  java.lang.String key(
    int lIndex);


  /**
   * @param bstrKey Mandatory java.lang.String parameter.
   */

  @DISPID(1003)
  java.lang.Object getItem(
    java.lang.String bstrKey);


  /**
   * @param bstrKey Mandatory java.lang.String parameter.
   * @param bstrValue Mandatory java.lang.String parameter.
   */

  @DISPID(1004)
  void setItem(
    java.lang.String bstrKey,
    java.lang.String bstrValue);


  /**
   * @param bstrKey Mandatory java.lang.String parameter.
   */

  @DISPID(1005)
  void removeItem(
    java.lang.String bstrKey);


  /**
   */

  @DISPID(1007)
  void clear();


  /**
   * @param bstrKey Mandatory java.lang.String parameter.
   * @param bstrValue Mandatory java.lang.String parameter.
   */

  @DISPID(1008)
  void ie9_setItem(
    java.lang.String bstrKey,
    java.lang.String bstrValue);


  // Properties:
}
