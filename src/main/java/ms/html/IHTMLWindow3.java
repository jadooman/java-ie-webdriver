package ms.html  ;

import com4j.*;

@IID("{3050F4AE-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLWindow3 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "screenLeft"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1170) //= 0x492. The runtime will prefer the VTID if present
  @VTID(7)
  int screenLeft();


  /**
   * <p>
   * Getter method for the COM property "screenTop"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1171) //= 0x493. The runtime will prefer the VTID if present
  @VTID(8)
  int screenTop();


  /**
   * @param event Mandatory java.lang.String parameter.
   * @param pdisp Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417605) //= 0x800101fb. The runtime will prefer the VTID if present
  @VTID(9)
  boolean attachEvent(
    java.lang.String event,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pdisp);


  /**
   * @param event Mandatory java.lang.String parameter.
   * @param pdisp Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147417604) //= 0x800101fc. The runtime will prefer the VTID if present
  @VTID(10)
  void detachEvent(
    java.lang.String event,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pdisp);


  /**
   * @param expression Mandatory java.lang.Object parameter.
   * @param msec Mandatory int parameter.
   * @param language Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(1103) //= 0x44f. The runtime will prefer the VTID if present
  @VTID(11)
  int setTimeout(
    java.lang.Object expression,
    int msec,
    @Optional java.lang.Object language);


  /**
   * @param expression Mandatory java.lang.Object parameter.
   * @param msec Mandatory int parameter.
   * @param language Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(1162) //= 0x48a. The runtime will prefer the VTID if present
  @VTID(12)
  int setInterval(
    java.lang.Object expression,
    int msec,
    @Optional java.lang.Object language);


  /**
   */

  @DISPID(1174) //= 0x496. The runtime will prefer the VTID if present
  @VTID(13)
  void print();


  /**
   * <p>
   * Setter method for the COM property "onbeforeprint"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412046) //= 0x800117b2. The runtime will prefer the VTID if present
  @VTID(14)
  void onbeforeprint(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforeprint"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412046) //= 0x800117b2. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforeprint();


  /**
   * <p>
   * Setter method for the COM property "onafterprint"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412045) //= 0x800117b3. The runtime will prefer the VTID if present
  @VTID(16)
  void onafterprint(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onafterprint"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412045) //= 0x800117b3. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onafterprint();


  /**
   * <p>
   * Getter method for the COM property "clipboardData"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDataTransfer
   */

  @DISPID(1175) //= 0x497. The runtime will prefer the VTID if present
  @VTID(18)
  ms.html.IHTMLDataTransfer clipboardData();


  /**
   * @param url Optional parameter. Default value is ""
   * @param varArgIn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param options Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type ms.html.IHTMLWindow2
   */

  @DISPID(1176) //= 0x498. The runtime will prefer the VTID if present
  @VTID(19)
  ms.html.IHTMLWindow2 showModelessDialog(
    @Optional @DefaultValue("") java.lang.String url,
    @Optional java.lang.Object varArgIn,
    @Optional java.lang.Object options);


  // Properties:
}
