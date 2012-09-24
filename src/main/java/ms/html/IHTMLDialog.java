package ms.html  ;

import com4j.*;

@IID("{3050F216-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDialog extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "dialogTop"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418108) //= 0x80010004. The runtime will prefer the VTID if present
  @VTID(7)
  void dialogTop(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "dialogTop"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418108) //= 0x80010004. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dialogTop();


  /**
   * <p>
   * Setter method for the COM property "dialogLeft"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418109) //= 0x80010003. The runtime will prefer the VTID if present
  @VTID(9)
  void dialogLeft(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "dialogLeft"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418109) //= 0x80010003. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dialogLeft();


  /**
   * <p>
   * Setter method for the COM property "dialogWidth"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(11)
  void dialogWidth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "dialogWidth"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dialogWidth();


  /**
   * <p>
   * Setter method for the COM property "dialogHeight"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(13)
  void dialogHeight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "dialogHeight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dialogHeight();


  /**
   * <p>
   * Getter method for the COM property "dialogArguments"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(25000) //= 0x61a8. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dialogArguments();


  /**
   * <p>
   * Getter method for the COM property "menuArguments"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(25013) //= 0x61b5. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object menuArguments();


  /**
   * <p>
   * Setter method for the COM property "returnValue"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(25001) //= 0x61a9. The runtime will prefer the VTID if present
  @VTID(17)
  void returnValue(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "returnValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(25001) //= 0x61a9. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object returnValue();


  /**
   */

  @DISPID(25011) //= 0x61b3. The runtime will prefer the VTID if present
  @VTID(19)
  void close();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(25012) //= 0x61b4. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String toString_();


  // Properties:
}
