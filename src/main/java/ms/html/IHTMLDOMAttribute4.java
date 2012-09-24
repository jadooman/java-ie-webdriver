package ms.html  ;

import com4j.*;

@IID("{305106F9-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDOMAttribute4 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "nodeValue"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1159) //= 0x487. The runtime will prefer the VTID if present
  @VTID(7)
  void nodeValue(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "nodeValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1159) //= 0x487. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object nodeValue();


  /**
   * <p>
   * Getter method for the COM property "nodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1160) //= 0x488. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String nodeName();


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1161) //= 0x489. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1162) //= 0x48a. The runtime will prefer the VTID if present
  @VTID(11)
  void value(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1162) //= 0x48a. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String value();


  /**
   * <p>
   * Getter method for the COM property "firstChild"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1163) //= 0x48b. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.IHTMLDOMNode firstChild();


  /**
   * <p>
   * Getter method for the COM property "lastChild"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDOMNode
   */

  @DISPID(1164) //= 0x48c. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.IHTMLDOMNode lastChild();


  /**
   * <p>
   * Getter method for the COM property "childNodes"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1165) //= 0x48d. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject childNodes();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1166) //= 0x48e. The runtime will prefer the VTID if present
  @VTID(16)
  boolean hasAttributes();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1167) //= 0x48f. The runtime will prefer the VTID if present
  @VTID(17)
  boolean hasChildNodes();


  /**
   */

  @DISPID(1170) //= 0x492. The runtime will prefer the VTID if present
  @VTID(18)
  void normalize();


  /**
   * <p>
   * Getter method for the COM property "specified"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1171) //= 0x493. The runtime will prefer the VTID if present
  @VTID(19)
  boolean specified();


  // Properties:
}
