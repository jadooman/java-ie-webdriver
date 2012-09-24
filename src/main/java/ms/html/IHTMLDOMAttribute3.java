package ms.html  ;

import com4j.*;

@IID("{30510468-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDOMAttribute3 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "nodeValue"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1153) //= 0x481. The runtime will prefer the VTID if present
  @VTID(7)
  void nodeValue(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "nodeValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1153) //= 0x481. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object nodeValue();


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1154) //= 0x482. The runtime will prefer the VTID if present
  @VTID(9)
  void value(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1154) //= 0x482. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String value();


  /**
   * <p>
   * Getter method for the COM property "specified"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1150) //= 0x47e. The runtime will prefer the VTID if present
  @VTID(11)
  boolean specified();


  /**
   * <p>
   * Getter method for the COM property "ownerElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement2
   */

  @DISPID(1151) //= 0x47f. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.IHTMLElement2 ownerElement();


  // Properties:
}
