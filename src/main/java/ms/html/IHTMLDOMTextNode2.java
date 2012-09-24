package ms.html  ;

import com4j.*;

@IID("{3050F809-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDOMTextNode2 extends Com4jObject {
  // Methods:
  /**
   * @param offset Mandatory int parameter.
   * @param count Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String substringData(
    int offset,
    int count);


  /**
   * @param bstrstring Mandatory java.lang.String parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(8)
  void appendData(
    java.lang.String bstrstring);


  /**
   * @param offset Mandatory int parameter.
   * @param bstrstring Mandatory java.lang.String parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(9)
  void insertData(
    int offset,
    java.lang.String bstrstring);


  /**
   * @param offset Mandatory int parameter.
   * @param count Mandatory int parameter.
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(10)
  void deleteData(
    int offset,
    int count);


  /**
   * @param offset Mandatory int parameter.
   * @param count Mandatory int parameter.
   * @param bstrstring Mandatory java.lang.String parameter.
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(11)
  void replaceData(
    int offset,
    int count,
    java.lang.String bstrstring);


  // Properties:
}
