package ms.html  ;

import com4j.*;

@IID("{30510417-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDocument6 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "compatible"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDocumentCompatibleInfoCollection
   */

  @DISPID(1103) //= 0x44f. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLDocumentCompatibleInfoCollection compatible();


  @VTID(7)
  @ReturnValue(defaultPropertyThrough={ms.html.IHTMLDocumentCompatibleInfoCollection.class})
  ms.html.IHTMLDocumentCompatibleInfo compatible(
    int index);

  /**
   * <p>
   * Getter method for the COM property "documentMode"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1104) //= 0x450. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object documentMode();


  /**
   * <p>
   * Setter method for the COM property "onstorage"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412012) //= 0x800117d4. The runtime will prefer the VTID if present
  @VTID(9)
  void onstorage(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onstorage"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412012) //= 0x800117d4. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onstorage();


  /**
   * <p>
   * Setter method for the COM property "onstoragecommit"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412011) //= 0x800117d5. The runtime will prefer the VTID if present
  @VTID(11)
  void onstoragecommit(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onstoragecommit"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412011) //= 0x800117d5. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onstoragecommit();


  /**
   * @param bstrId Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElement2
   */

  @DISPID(1107) //= 0x453. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.IHTMLElement2 getElementById(
    java.lang.String bstrId);


  /**
   */

  @DISPID(1109) //= 0x455. The runtime will prefer the VTID if present
  @VTID(14)
  void updateSettings();


  // Properties:
}
