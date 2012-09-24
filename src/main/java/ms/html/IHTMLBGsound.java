package ms.html  ;

import com4j.*;

@IID("{3050F369-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLBGsound extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "src"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(7)
  void src(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "src"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String src();


  /**
   * <p>
   * Setter method for the COM property "loop"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  void loop(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "loop"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object loop();


  /**
   * <p>
   * Setter method for the COM property "volume"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(11)
  void volume(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "volume"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object volume();


  /**
   * <p>
   * Setter method for the COM property "balance"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(13)
  void balance(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "balance"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object balance();


  // Properties:
}
