package ms.ie  ;

import com4j.*;

/**
 * Definition of interface IShellWindows
 */
@IID("{85CB6900-4D95-11CF-960C-0080C7F4EE85}")
public interface IShellWindows extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Get count of open Shell windows
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  int count();


  /**
   * <p>
   * Return the shell window for the given index
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject item(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Enumerates the figures
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Register a window with the list
   * </p>
   * @param pid Mandatory com4j.Com4jObject parameter.
   * @param hwnd Mandatory int parameter.
   * @param swClass Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  int register(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pid,
    int hwnd,
    int swClass);


  /**
   * <p>
   * Register a pending open with the list
   * </p>
   * @param lThreadId Mandatory int parameter.
   * @param pvarloc Mandatory java.lang.Object parameter.
   * @param pvarlocRoot Mandatory java.lang.Object parameter.
   * @param swClass Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int registerPending(
    int lThreadId,
    java.lang.Object pvarloc,
    java.lang.Object pvarlocRoot,
    int swClass);


  /**
   * <p>
   * Remove a window from the list
   * </p>
   * @param lCookie Mandatory int parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  void revoke(
    int lCookie);


  /**
   * <p>
   * Notifies the new location
   * </p>
   * @param lCookie Mandatory int parameter.
   * @param pvarloc Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  void onNavigate(
    int lCookie,
    java.lang.Object pvarloc);


  /**
   * <p>
   * Notifies the activation
   * </p>
   * @param lCookie Mandatory int parameter.
   * @param fActive Mandatory boolean parameter.
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  void onActivated(
    int lCookie,
    boolean fActive);


  /**
   * <p>
   * Find the window based on the location
   * </p>
   * @param pvarloc Mandatory java.lang.Object parameter.
   * @param pvarlocRoot Mandatory java.lang.Object parameter.
   * @param swClass Mandatory int parameter.
   * @param pHWND Mandatory Holder<Integer> parameter.
   * @param swfwOptions Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject findWindowSW(
    java.lang.Object pvarloc,
    java.lang.Object pvarlocRoot,
    int swClass,
    Holder<Integer> pHWND,
    int swfwOptions);


  /**
   * <p>
   * Notifies on creation and frame name set
   * </p>
   * @param lCookie Mandatory int parameter.
   * @param punk Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  void onCreated(
    int lCookie,
    com4j.Com4jObject punk);


  /**
   * <p>
   * Used by IExplore to register different processes
   * </p>
   * @param fAttach Mandatory boolean parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  void processAttachDetach(
    boolean fAttach);


  // Properties:
}
