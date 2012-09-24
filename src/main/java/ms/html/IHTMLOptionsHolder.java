package ms.html  ;

import com4j.*;

@IID("{3050F378-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLOptionsHolder extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "document"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDocument2
   */

  @DISPID(1503) //= 0x5df. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLDocument2 document();


  /**
   * <p>
   * Getter method for the COM property "fonts"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLFontNamesCollection
   */

  @DISPID(1504) //= 0x5e0. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLFontNamesCollection fonts();


  @VTID(8)
  @ReturnValue(defaultPropertyThrough={ms.html.IHTMLFontNamesCollection.class})
  java.lang.String fonts(
    int index);

  /**
   * <p>
   * Setter method for the COM property "execArg"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1505) //= 0x5e1. The runtime will prefer the VTID if present
  @VTID(9)
  void execArg(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "execArg"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1505) //= 0x5e1. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object execArg();


  /**
   * <p>
   * Setter method for the COM property "errorLine"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1506) //= 0x5e2. The runtime will prefer the VTID if present
  @VTID(11)
  void errorLine(
    int p);


  /**
   * <p>
   * Getter method for the COM property "errorLine"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1506) //= 0x5e2. The runtime will prefer the VTID if present
  @VTID(12)
  int errorLine();


  /**
   * <p>
   * Setter method for the COM property "errorCharacter"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1507) //= 0x5e3. The runtime will prefer the VTID if present
  @VTID(13)
  void errorCharacter(
    int p);


  /**
   * <p>
   * Getter method for the COM property "errorCharacter"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1507) //= 0x5e3. The runtime will prefer the VTID if present
  @VTID(14)
  int errorCharacter();


  /**
   * <p>
   * Setter method for the COM property "errorCode"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1508) //= 0x5e4. The runtime will prefer the VTID if present
  @VTID(15)
  void errorCode(
    int p);


  /**
   * <p>
   * Getter method for the COM property "errorCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1508) //= 0x5e4. The runtime will prefer the VTID if present
  @VTID(16)
  int errorCode();


  /**
   * <p>
   * Setter method for the COM property "errorMessage"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1509) //= 0x5e5. The runtime will prefer the VTID if present
  @VTID(17)
  void errorMessage(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "errorMessage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1509) //= 0x5e5. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String errorMessage();


  /**
   * <p>
   * Setter method for the COM property "errorDebug"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1510) //= 0x5e6. The runtime will prefer the VTID if present
  @VTID(19)
  void errorDebug(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "errorDebug"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1510) //= 0x5e6. The runtime will prefer the VTID if present
  @VTID(20)
  boolean errorDebug();


  /**
   * <p>
   * Getter method for the COM property "unsecuredWindowOfDocument"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLWindow2
   */

  @DISPID(1511) //= 0x5e7. The runtime will prefer the VTID if present
  @VTID(21)
  ms.html.IHTMLWindow2 unsecuredWindowOfDocument();


  /**
   * <p>
   * Setter method for the COM property "findText"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1512) //= 0x5e8. The runtime will prefer the VTID if present
  @VTID(22)
  void findText(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "findText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1512) //= 0x5e8. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String findText();


  /**
   * <p>
   * Setter method for the COM property "anythingAfterFrameset"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1513) //= 0x5e9. The runtime will prefer the VTID if present
  @VTID(24)
  void anythingAfterFrameset(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "anythingAfterFrameset"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1513) //= 0x5e9. The runtime will prefer the VTID if present
  @VTID(25)
  boolean anythingAfterFrameset();


  /**
   * @param fontName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLFontSizesCollection
   */

  @DISPID(1514) //= 0x5ea. The runtime will prefer the VTID if present
  @VTID(26)
  ms.html.IHTMLFontSizesCollection sizes(
    java.lang.String fontName);


  /**
   * @param initFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param initDir Optional parameter. Default value is com4j.Variant.getMissing()
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1515) //= 0x5eb. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String openfiledlg(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object initFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object initDir,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object title);


  /**
   * @param initFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param initDir Optional parameter. Default value is com4j.Variant.getMissing()
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1516) //= 0x5ec. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String savefiledlg(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object initFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object initDir,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object title);


  /**
   * @param initColor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(1517) //= 0x5ed. The runtime will prefer the VTID if present
  @VTID(29)
  int choosecolordlg(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object initColor);


  /**
   */

  @DISPID(1518) //= 0x5ee. The runtime will prefer the VTID if present
  @VTID(30)
  void showSecurityInfo();


  /**
   * @param object Mandatory ms.html.IHTMLObjectElement parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1519) //= 0x5ef. The runtime will prefer the VTID if present
  @VTID(31)
  boolean isApartmentModel(
    ms.html.IHTMLObjectElement object);


  /**
   * @param fontName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1520) //= 0x5f0. The runtime will prefer the VTID if present
  @VTID(32)
  int getCharset(
    java.lang.String fontName);


  /**
   * <p>
   * Getter method for the COM property "secureConnectionInfo"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1521) //= 0x5f1. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String secureConnectionInfo();


  // Properties:
}
