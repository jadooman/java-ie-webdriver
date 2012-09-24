package ms.html  ;

import com4j.*;

@IID("{30510474-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStorage extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  int length();


  /**
   * <p>
   * Getter method for the COM property "remainingSpace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(8)
  int remainingSpace();


  /**
   * @param lIndex Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String key(
    int lIndex);


  /**
   * @param bstrKey Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getItem(
    java.lang.String bstrKey);


  /**
   * @param bstrKey Mandatory java.lang.String parameter.
   * @param bstrValue Mandatory java.lang.String parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  void setItem(
    java.lang.String bstrKey,
    java.lang.String bstrValue);


  /**
   * @param bstrKey Mandatory java.lang.String parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  void removeItem(
    java.lang.String bstrKey);


  /**
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(13)
  void clear();


  // Properties:
}
