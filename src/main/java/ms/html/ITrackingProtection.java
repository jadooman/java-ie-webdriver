package ms.html  ;

import com4j.*;

@IID("{30510803-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ITrackingProtection extends Com4jObject {
  // Methods:
  /**
   * @param bstrURL Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @VTID(3)
  int evaluateUrl(
    java.lang.String bstrURL);


  /**
   * @return  Returns a value of type int
   */

  @VTID(4)
  int getEnabled();


  // Properties:
}
