package ms.html  ;

import com4j.*;

@IID("{3050F4CD-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLObjectElement2 extends Com4jObject {
  // Methods:
  /**
   * @param dataMember Mandatory java.lang.String parameter.
   * @param hierarchy Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147415098) //= 0x80010bc6. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject namedRecordset(
    java.lang.String dataMember,
    @Optional java.lang.Object hierarchy);


  /**
   * <p>
   * Setter method for the COM property "classid"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147415110) //= 0x80010bba. The runtime will prefer the VTID if present
  @VTID(8)
  void classid(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "classid"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147415110) //= 0x80010bba. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String classid();


  /**
   * <p>
   * Setter method for the COM property "data"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147415109) //= 0x80010bbb. The runtime will prefer the VTID if present
  @VTID(10)
  void data(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "data"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147415109) //= 0x80010bbb. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String data();


  // Properties:
}
