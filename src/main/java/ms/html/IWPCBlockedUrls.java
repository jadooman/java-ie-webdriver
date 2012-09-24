package ms.html  ;

import com4j.*;

@IID("{30510413-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IWPCBlockedUrls extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type int
   */

  @VTID(3)
  int getCount();


  /**
   * @param dwIdx Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(4)
  java.lang.String getUrl(
    int dwIdx);


  // Properties:
}
