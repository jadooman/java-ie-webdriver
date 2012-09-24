package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispHTMLLocation extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "href"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(0)
  @PropPut
  @DefaultMethod
  void href(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "href"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.String href();


  /**
   * <p>
   * Setter method for the COM property "protocol"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1)
  @PropPut
  void protocol(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "protocol"
   * </p>
   */

  @DISPID(1)
  @PropGet
  java.lang.String protocol();


  /**
   * <p>
   * Setter method for the COM property "host"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2)
  @PropPut
  void host(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "host"
   * </p>
   */

  @DISPID(2)
  @PropGet
  java.lang.String host();


  /**
   * <p>
   * Setter method for the COM property "hostname"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(3)
  @PropPut
  void hostname(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "hostname"
   * </p>
   */

  @DISPID(3)
  @PropGet
  java.lang.String hostname();


  /**
   * <p>
   * Setter method for the COM property "port"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(4)
  @PropPut
  void port(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "port"
   * </p>
   */

  @DISPID(4)
  @PropGet
  java.lang.String port();


  /**
   * <p>
   * Setter method for the COM property "pathname"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(5)
  @PropPut
  void pathname(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "pathname"
   * </p>
   */

  @DISPID(5)
  @PropGet
  java.lang.String pathname();


  /**
   * <p>
   * Setter method for the COM property "search"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(6)
  @PropPut
  void search(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "search"
   * </p>
   */

  @DISPID(6)
  @PropGet
  java.lang.String search();


  /**
   * <p>
   * Setter method for the COM property "hash"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(7)
  @PropPut
  void hash(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "hash"
   * </p>
   */

  @DISPID(7)
  @PropGet
  java.lang.String hash();


  /**
   * @param flag Optional parameter. Default value is false
   */

  @DISPID(8)
  void reload(
    @Optional @DefaultValue("0") boolean flag);


  /**
   * @param bstr Mandatory java.lang.String parameter.
   */

  @DISPID(9)
  void replace(
    java.lang.String bstr);


  /**
   * @param bstr Mandatory java.lang.String parameter.
   */

  @DISPID(10)
  void assign(
    java.lang.String bstr);


  /**
   */

  @DISPID(11)
  java.lang.String toString_();


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
