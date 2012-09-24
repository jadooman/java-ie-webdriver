package ms.html  ;

import com4j.*;

@IID("{3050F645-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLSubmitData extends Com4jObject {
  // Methods:
  /**
   * @param name Optional parameter. Default value is ""
   * @param value Optional parameter. Default value is ""
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(7)
  void appendNameValuePair(
    @Optional @DefaultValue("") java.lang.String name,
    @Optional @DefaultValue("") java.lang.String value);


  /**
   * @param name Optional parameter. Default value is ""
   * @param filename Optional parameter. Default value is ""
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(8)
  void appendNameFilePair(
    @Optional @DefaultValue("") java.lang.String name,
    @Optional @DefaultValue("") java.lang.String filename);


  /**
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(9)
  void appendItemSeparator();


  // Properties:
}
