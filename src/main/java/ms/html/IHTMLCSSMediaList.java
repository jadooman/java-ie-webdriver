package ms.html  ;

import com4j.*;

@IID("{30510731-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLCSSMediaList extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "mediaText"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  void mediaText(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "mediaText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String mediaText();


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  int length();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String item(
    int index);


  /**
   * @param bstrMedium Mandatory java.lang.String parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  void appendMedium(
    java.lang.String bstrMedium);


  /**
   * @param bstrMedium Mandatory java.lang.String parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  void deleteMedium(
    java.lang.String bstrMedium);


  // Properties:
}
