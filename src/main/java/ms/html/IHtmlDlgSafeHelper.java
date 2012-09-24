package ms.html  ;

import com4j.*;

@IID("{3050F81A-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHtmlDlgSafeHelper extends Com4jObject {
  // Methods:
  /**
   * @param initColor Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object choosecolordlg(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object initColor);


  /**
   * @param fontName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getCharset(
    java.lang.String fontName);


  /**
   * <p>
   * Getter method for the COM property "fonts"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject fonts();


  /**
   * <p>
   * Getter method for the COM property "BlockFormats"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject blockFormats();


  // Properties:
}
