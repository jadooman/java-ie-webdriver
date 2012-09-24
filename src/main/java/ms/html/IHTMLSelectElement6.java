package ms.html  ;

import com4j.*;

@IID("{30510760-98B6-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLSelectElement6 extends Com4jObject {
  // Methods:
  /**
   * @param pElem Mandatory ms.html.IHTMLOptionElement parameter.
   * @param pvarBefore Mandatory java.lang.Object parameter.
   */

  @DISPID(1151) //= 0x47f. The runtime will prefer the VTID if present
  @VTID(7)
  void add(
    ms.html.IHTMLOptionElement pElem,
    java.lang.Object pvarBefore);


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1152) //= 0x480. The runtime will prefer the VTID if present
  @VTID(8)
  void value(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1152) //= 0x480. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String value();


  // Properties:
}
