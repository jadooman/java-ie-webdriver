package ms.html  ;

import com4j.*;

@IID("{3050F4F6-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLFormElement2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "acceptCharset"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(7)
  void acceptCharset(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "acceptCharset"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String acceptCharset();


  /**
   * @param urn Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1505) //= 0x5e1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject urns(
    @MarshalAs(NativeType.VARIANT) java.lang.Object urn);


  // Properties:
}
