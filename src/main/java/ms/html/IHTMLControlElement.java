package ms.html  ;

import com4j.*;

@IID("{3050F4E9-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLControlElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "tabIndex"
   * </p>
   * @param p Mandatory short parameter.
   */

  @DISPID(-2147418097) //= 0x8001000f. The runtime will prefer the VTID if present
  @VTID(7)
  void tabIndex(
    short p);


  /**
   * <p>
   * Getter method for the COM property "tabIndex"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(-2147418097) //= 0x8001000f. The runtime will prefer the VTID if present
  @VTID(8)
  short tabIndex();


  /**
   */

  @DISPID(-2147416112) //= 0x800107d0. The runtime will prefer the VTID if present
  @VTID(9)
  void focus();


  /**
   * <p>
   * Setter method for the COM property "accessKey"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416107) //= 0x800107d5. The runtime will prefer the VTID if present
  @VTID(10)
  void accessKey(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "accessKey"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147416107) //= 0x800107d5. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String accessKey();


  /**
   * <p>
   * Setter method for the COM property "onblur"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412097) //= 0x8001177f. The runtime will prefer the VTID if present
  @VTID(12)
  void onblur(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onblur"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412097) //= 0x8001177f. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onblur();


  /**
   * <p>
   * Setter method for the COM property "onfocus"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412098) //= 0x8001177e. The runtime will prefer the VTID if present
  @VTID(14)
  void onfocus(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onfocus"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412098) //= 0x8001177e. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onfocus();


  /**
   * <p>
   * Setter method for the COM property "onresize"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412076) //= 0x80011794. The runtime will prefer the VTID if present
  @VTID(16)
  void onresize(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onresize"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412076) //= 0x80011794. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onresize();


  /**
   */

  @DISPID(-2147416110) //= 0x800107d2. The runtime will prefer the VTID if present
  @VTID(18)
  void blur();


  /**
   * @param pUnk Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147416095) //= 0x800107e1. The runtime will prefer the VTID if present
  @VTID(19)
  void addFilter(
    com4j.Com4jObject pUnk);


  /**
   * @param pUnk Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147416094) //= 0x800107e2. The runtime will prefer the VTID if present
  @VTID(20)
  void removeFilter(
    com4j.Com4jObject pUnk);


  /**
   * <p>
   * Getter method for the COM property "clientHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147416093) //= 0x800107e3. The runtime will prefer the VTID if present
  @VTID(21)
  int clientHeight();


  /**
   * <p>
   * Getter method for the COM property "clientWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147416092) //= 0x800107e4. The runtime will prefer the VTID if present
  @VTID(22)
  int clientWidth();


  /**
   * <p>
   * Getter method for the COM property "clientTop"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147416091) //= 0x800107e5. The runtime will prefer the VTID if present
  @VTID(23)
  int clientTop();


  /**
   * <p>
   * Getter method for the COM property "clientLeft"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147416090) //= 0x800107e6. The runtime will prefer the VTID if present
  @VTID(24)
  int clientLeft();


  // Properties:
}
