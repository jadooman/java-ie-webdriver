package ms.html  ;

import com4j.*;

@IID("{305104A3-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ITemplatePrinter3 extends ms.html.ITemplatePrinter2 {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "headerFooterFont"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(71)
  void headerFooterFont(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "headerFooterFont"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(72)
  java.lang.String headerFooterFont();


  /**
   * @param pageRule Mandatory com4j.Com4jObject parameter.
   * @param pageWidth Mandatory int parameter.
   * @param pageHeight Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(73)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getPageMarginTop(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pageRule,
    int pageWidth,
    int pageHeight);


  /**
   * @param pageRule Mandatory com4j.Com4jObject parameter.
   * @param pageWidth Mandatory int parameter.
   * @param pageHeight Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(74)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getPageMarginRight(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pageRule,
    int pageWidth,
    int pageHeight);


  /**
   * @param pageRule Mandatory com4j.Com4jObject parameter.
   * @param pageWidth Mandatory int parameter.
   * @param pageHeight Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(75)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getPageMarginBottom(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pageRule,
    int pageWidth,
    int pageHeight);


  /**
   * @param pageRule Mandatory com4j.Com4jObject parameter.
   * @param pageWidth Mandatory int parameter.
   * @param pageHeight Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(76)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getPageMarginLeft(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pageRule,
    int pageWidth,
    int pageHeight);


  /**
   * @param pageRule Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(77)
  boolean getPageMarginTopImportant(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pageRule);


  /**
   * @param pageRule Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(78)
  boolean getPageMarginRightImportant(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pageRule);


  /**
   * @param pageRule Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(79)
  boolean getPageMarginBottomImportant(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pageRule);


  /**
   * @param pageRule Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(80)
  boolean getPageMarginLeftImportant(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pageRule);


  // Properties:
}
