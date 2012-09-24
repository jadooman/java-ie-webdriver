package ms.html  ;

import com4j.*;

@IID("{3050F21F-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLElementCollection extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1501) //= 0x5dd. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String toString_();


  /**
   * <p>
   * Setter method for the COM property "length"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1500) //= 0x5dc. The runtime will prefer the VTID if present
  @VTID(8)
  void length(
    int p);


  /**
   * <p>
   * Getter method for the COM property "length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1500) //= 0x5dc. The runtime will prefer the VTID if present
  @VTID(9)
  int length();


  /**
   * <p>
   * Getter method for the COM property "_newEnum"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(10)
  com4j.Com4jObject _newEnum();


  /**
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject item(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param tagName Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1502) //= 0x5de. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject tags(
    @MarshalAs(NativeType.VARIANT) java.lang.Object tagName);


  // Properties:
}
