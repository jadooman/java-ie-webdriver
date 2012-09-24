package ms.html  ;

import com4j.*;

@IID("{30510422-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLBodyElement3 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "background"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1150) //= 0x47e. The runtime will prefer the VTID if present
  @VTID(7)
  void background(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "background"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1150) //= 0x47e. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String background();


  /**
   * <p>
   * Setter method for the COM property "ononline"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412005) //= 0x800117db. The runtime will prefer the VTID if present
  @VTID(9)
  void ononline(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ononline"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412005) //= 0x800117db. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ononline();


  /**
   * <p>
   * Setter method for the COM property "onoffline"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412004) //= 0x800117dc. The runtime will prefer the VTID if present
  @VTID(11)
  void onoffline(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onoffline"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412004) //= 0x800117dc. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onoffline();


  /**
   * <p>
   * Setter method for the COM property "onhashchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412003) //= 0x800117dd. The runtime will prefer the VTID if present
  @VTID(13)
  void onhashchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onhashchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412003) //= 0x800117dd. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onhashchange();


  // Properties:
}
