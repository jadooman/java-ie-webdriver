package ms.html  ;

import com4j.*;

@IID("{305104B9-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IEventTarget extends Com4jObject {
  // Methods:
  /**
   * @param type Mandatory java.lang.String parameter.
   * @param listener Mandatory com4j.Com4jObject parameter.
   * @param useCapture Mandatory boolean parameter.
   */

  @DISPID(-2147417602) //= 0x800101fe. The runtime will prefer the VTID if present
  @VTID(7)
  void addEventListener(
    java.lang.String type,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject listener,
    boolean useCapture);


  /**
   * @param type Mandatory java.lang.String parameter.
   * @param listener Mandatory com4j.Com4jObject parameter.
   * @param useCapture Mandatory boolean parameter.
   */

  @DISPID(-2147417601) //= 0x800101ff. The runtime will prefer the VTID if present
  @VTID(8)
  void removeEventListener(
    java.lang.String type,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject listener,
    boolean useCapture);


  /**
   * @param evt Mandatory ms.html.IDOMEvent parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417600) //= 0x80010200. The runtime will prefer the VTID if present
  @VTID(9)
  boolean dispatchEvent(
    ms.html.IDOMEvent evt);


  // Properties:
}
