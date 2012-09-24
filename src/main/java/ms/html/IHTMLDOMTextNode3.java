package ms.html  ;

import com4j.*;

@IID("{3051073E-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDOMTextNode3 extends Com4jObject {
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


  /**
   * @param offset Mandatory int parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.IHTMLDOMNode splitText(
    int offset);


  /**
   * <p>
   * Getter method for the COM property "wholeText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String wholeText();


  /**
   * @param bstrText Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.IHTMLDOMNode replaceWholeText(
    java.lang.String bstrText);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1017) //= 0x3f9. The runtime will prefer the VTID if present
  @VTID(14)
  boolean hasAttributes();


  /**
   */

  @DISPID(1019) //= 0x3fb. The runtime will prefer the VTID if present
  @VTID(15)
  void normalize();


  // Properties:
}
