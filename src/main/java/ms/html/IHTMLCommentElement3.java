package ms.html  ;

import com4j.*;

@IID("{3051073F-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLCommentElement3 extends Com4jObject {
  // Methods:
  /**
   * @param offset Mandatory int parameter.
   * @param count Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String substringData(
    int offset,
    int count);


  /**
   * @param offset Mandatory int parameter.
   * @param bstrstring Mandatory java.lang.String parameter.
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(8)
  void insertData(
    int offset,
    java.lang.String bstrstring);


  /**
   * @param offset Mandatory int parameter.
   * @param count Mandatory int parameter.
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(9)
  void deleteData(
    int offset,
    int count);


  /**
   * @param offset Mandatory int parameter.
   * @param count Mandatory int parameter.
   * @param bstrstring Mandatory java.lang.String parameter.
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(10)
  void replaceData(
    int offset,
    int count,
    java.lang.String bstrstring);


  // Properties:
}
