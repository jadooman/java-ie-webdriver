package ms.html  ;

import com4j.*;

@IID("{163BB1E0-6E00-11CF-837A-48DC04C10000}")
public interface IHTMLLocation extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "href"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  void href(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "href"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  java.lang.String href();


  /**
   * <p>
   * Setter method for the COM property "protocol"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  void protocol(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "protocol"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String protocol();


  /**
   * <p>
   * Setter method for the COM property "host"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void host(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "host"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String host();


  /**
   * <p>
   * Setter method for the COM property "hostname"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void hostname(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "hostname"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String hostname();


  /**
   * <p>
   * Setter method for the COM property "port"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  void port(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "port"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String port();


  /**
   * <p>
   * Setter method for the COM property "pathname"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  void pathname(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "pathname"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String pathname();


  /**
   * <p>
   * Setter method for the COM property "search"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  void search(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "search"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String search();


  /**
   * <p>
   * Setter method for the COM property "hash"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(21)
  void hash(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "hash"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String hash();


  /**
   * @param flag Optional parameter. Default value is false
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(23)
  void reload(
    @Optional @DefaultValue("0") boolean flag);


  /**
   * @param bstr Mandatory java.lang.String parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  void replace(
    java.lang.String bstr);


  /**
   * @param bstr Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void assign(
    java.lang.String bstr);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String toString_();


  // Properties:
}
