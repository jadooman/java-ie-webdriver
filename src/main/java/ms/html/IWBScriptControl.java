package ms.html  ;

import com4j.*;

@IID("{A5170870-0CF8-11D1-8B91-0080C744F389}")
public interface IWBScriptControl extends Com4jObject {
  // Methods:
  /**
   * @param name Mandatory java.lang.String parameter.
   * @param eventData Mandatory java.lang.Object parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void raiseEvent(
    java.lang.String name,
    @MarshalAs(NativeType.VARIANT) java.lang.Object eventData);


  /**
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void bubbleEvent();


  /**
   * @param menuItemPairs Mandatory java.lang.Object parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void setContextMenu(
    @MarshalAs(NativeType.VARIANT) java.lang.Object menuItemPairs);


  /**
   * <p>
   * Setter method for the COM property "selectableContent"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void selectableContent(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "selectableContent"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  boolean selectableContent();


  /**
   * <p>
   * Getter method for the COM property "frozen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  boolean frozen();


  /**
   * <p>
   * Setter method for the COM property "Scrollbar"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  void scrollbar(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "Scrollbar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  boolean scrollbar();


  /**
   * <p>
   * Getter method for the COM property "version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String version();


  /**
   * <p>
   * Getter method for the COM property "visibility"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(16)
  boolean visibility();


  /**
   * <p>
   * Setter method for the COM property "onvisibilitychange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  void onvisibilitychange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onvisibilitychange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onvisibilitychange();


  // Properties:
}
