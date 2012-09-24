package ms.html  ;

import com4j.*;

@IID("{30510478-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLEventObj5 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "url"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1052) //= 0x41c. The runtime will prefer the VTID if present
  @VTID(7)
  void url(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "url"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1052) //= 0x41c. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String url();


  /**
   * <p>
   * Setter method for the COM property "data"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1054) //= 0x41e. The runtime will prefer the VTID if present
  @VTID(9)
  void data(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "data"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1054) //= 0x41e. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String data();


  /**
   * <p>
   * Getter method for the COM property "source"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1055) //= 0x41f. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject source();


  /**
   * <p>
   * Setter method for the COM property "origin"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1053) //= 0x41d. The runtime will prefer the VTID if present
  @VTID(12)
  void origin(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "origin"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1053) //= 0x41d. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String origin();


  /**
   * <p>
   * Setter method for the COM property "issession"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1056) //= 0x420. The runtime will prefer the VTID if present
  @VTID(14)
  void issession(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "issession"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1056) //= 0x420. The runtime will prefer the VTID if present
  @VTID(15)
  boolean issession();


  // Properties:
}
