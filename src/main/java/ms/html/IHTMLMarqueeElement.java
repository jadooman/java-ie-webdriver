package ms.html  ;

import com4j.*;

@IID("{3050F2B5-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLMarqueeElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "bgColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(7)
  void bgColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "bgColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object bgColor();


  /**
   * <p>
   * Setter method for the COM property "scrollDelay"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(6000) //= 0x1770. The runtime will prefer the VTID if present
  @VTID(9)
  void scrollDelay(
    int p);


  /**
   * <p>
   * Getter method for the COM property "scrollDelay"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6000) //= 0x1770. The runtime will prefer the VTID if present
  @VTID(10)
  int scrollDelay();


  /**
   * <p>
   * Setter method for the COM property "direction"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(6001) //= 0x1771. The runtime will prefer the VTID if present
  @VTID(11)
  void direction(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "direction"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6001) //= 0x1771. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String direction();


  /**
   * <p>
   * Setter method for the COM property "behavior"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(6002) //= 0x1772. The runtime will prefer the VTID if present
  @VTID(13)
  void behavior(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "behavior"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6002) //= 0x1772. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String behavior();


  /**
   * <p>
   * Setter method for the COM property "scrollAmount"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(6003) //= 0x1773. The runtime will prefer the VTID if present
  @VTID(15)
  void scrollAmount(
    int p);


  /**
   * <p>
   * Getter method for the COM property "scrollAmount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6003) //= 0x1773. The runtime will prefer the VTID if present
  @VTID(16)
  int scrollAmount();


  /**
   * <p>
   * Setter method for the COM property "loop"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(6004) //= 0x1774. The runtime will prefer the VTID if present
  @VTID(17)
  void loop(
    int p);


  /**
   * <p>
   * Getter method for the COM property "loop"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6004) //= 0x1774. The runtime will prefer the VTID if present
  @VTID(18)
  int loop();


  /**
   * <p>
   * Setter method for the COM property "vspace"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(6005) //= 0x1775. The runtime will prefer the VTID if present
  @VTID(19)
  void vspace(
    int p);


  /**
   * <p>
   * Getter method for the COM property "vspace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6005) //= 0x1775. The runtime will prefer the VTID if present
  @VTID(20)
  int vspace();


  /**
   * <p>
   * Setter method for the COM property "hspace"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(6006) //= 0x1776. The runtime will prefer the VTID if present
  @VTID(21)
  void hspace(
    int p);


  /**
   * <p>
   * Getter method for the COM property "hspace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6006) //= 0x1776. The runtime will prefer the VTID if present
  @VTID(22)
  int hspace();


  /**
   * <p>
   * Setter method for the COM property "onfinish"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412086) //= 0x8001178a. The runtime will prefer the VTID if present
  @VTID(23)
  void onfinish(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onfinish"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412086) //= 0x8001178a. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onfinish();


  /**
   * <p>
   * Setter method for the COM property "onstart"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412085) //= 0x8001178b. The runtime will prefer the VTID if present
  @VTID(25)
  void onstart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onstart"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412085) //= 0x8001178b. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onstart();


  /**
   * <p>
   * Setter method for the COM property "onbounce"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412092) //= 0x80011784. The runtime will prefer the VTID if present
  @VTID(27)
  void onbounce(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbounce"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412092) //= 0x80011784. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbounce();


  /**
   * <p>
   * Setter method for the COM property "width"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(29)
  void width(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object width();


  /**
   * <p>
   * Setter method for the COM property "height"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(31)
  void height(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(32)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object height();


  /**
   * <p>
   * Setter method for the COM property "trueSpeed"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(6007) //= 0x1777. The runtime will prefer the VTID if present
  @VTID(33)
  void trueSpeed(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "trueSpeed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(6007) //= 0x1777. The runtime will prefer the VTID if present
  @VTID(34)
  boolean trueSpeed();


  /**
   */

  @DISPID(6010) //= 0x177a. The runtime will prefer the VTID if present
  @VTID(35)
  void start();


  /**
   */

  @DISPID(6011) //= 0x177b. The runtime will prefer the VTID if present
  @VTID(36)
  void stop();


  // Properties:
}
