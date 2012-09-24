package ms.html  ;

import com4j.*;

@IID("{3050F4B3-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDataTransfer extends Com4jObject {
  // Methods:
  /**
   * @param format Mandatory java.lang.String parameter.
   * @param data Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  boolean setData(
    java.lang.String format,
    java.lang.Object data);


  /**
   * @param format Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getData(
    java.lang.String format);


  /**
   * @param format Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(9)
  boolean clearData(
    java.lang.String format);


  /**
   * <p>
   * Setter method for the COM property "dropEffect"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(10)
  void dropEffect(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "dropEffect"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String dropEffect();


  /**
   * <p>
   * Setter method for the COM property "effectAllowed"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  void effectAllowed(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "effectAllowed"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String effectAllowed();


  // Properties:
}
