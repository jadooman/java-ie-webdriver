package ms.html  ;

import com4j.*;

@IID("{305106C2-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTable4 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "tHead"
   * </p>
   * @param p Mandatory ms.html.IHTMLTableSection parameter.
   */

  @DISPID(1040) //= 0x410. The runtime will prefer the VTID if present
  @VTID(7)
  void tHead(
    ms.html.IHTMLTableSection p);


  /**
   * <p>
   * Getter method for the COM property "tHead"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLTableSection
   */

  @DISPID(1040) //= 0x410. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLTableSection tHead();


  /**
   * <p>
   * Setter method for the COM property "tFoot"
   * </p>
   * @param p Mandatory ms.html.IHTMLTableSection parameter.
   */

  @DISPID(1041) //= 0x411. The runtime will prefer the VTID if present
  @VTID(9)
  void tFoot(
    ms.html.IHTMLTableSection p);


  /**
   * <p>
   * Getter method for the COM property "tFoot"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLTableSection
   */

  @DISPID(1041) //= 0x411. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLTableSection tFoot();


  /**
   * <p>
   * Setter method for the COM property "caption"
   * </p>
   * @param p Mandatory ms.html.IHTMLTableCaption parameter.
   */

  @DISPID(1042) //= 0x412. The runtime will prefer the VTID if present
  @VTID(11)
  void caption(
    ms.html.IHTMLTableCaption p);


  /**
   * <p>
   * Getter method for the COM property "caption"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLTableCaption
   */

  @DISPID(1042) //= 0x412. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.IHTMLTableCaption caption();


  /**
   * @param index Optional parameter. Default value is -1
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1043) //= 0x413. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject insertRow(
    @Optional @DefaultValue("-1") int index);


  /**
   * @param index Optional parameter. Default value is -1
   */

  @DISPID(1044) //= 0x414. The runtime will prefer the VTID if present
  @VTID(14)
  void deleteRow(
    @Optional @DefaultValue("-1") int index);


  /**
   * @return  Returns a value of type ms.html.IHTMLTableSection
   */

  @DISPID(1045) //= 0x415. The runtime will prefer the VTID if present
  @VTID(15)
  ms.html.IHTMLTableSection createTBody();


  // Properties:
}
