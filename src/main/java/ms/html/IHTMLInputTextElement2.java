package ms.html  ;

import com4j.*;

@IID("{3050F2D2-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLInputTextElement2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "selectionStart"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(7)
  void selectionStart(
    int p);


  /**
   * <p>
   * Getter method for the COM property "selectionStart"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(8)
  int selectionStart();


  /**
   * <p>
   * Setter method for the COM property "selectionEnd"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(9)
  void selectionEnd(
    int p);


  /**
   * <p>
   * Getter method for the COM property "selectionEnd"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2026) //= 0x7ea. The runtime will prefer the VTID if present
  @VTID(10)
  int selectionEnd();


  /**
   * @param start Mandatory int parameter.
   * @param end Mandatory int parameter.
   */

  @DISPID(2027) //= 0x7eb. The runtime will prefer the VTID if present
  @VTID(11)
  void setSelectionRange(
    int start,
    int end);


  // Properties:
}
