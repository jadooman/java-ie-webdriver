package ms.html  ;

import com4j.*;

@IID("{3050F3EC-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ICSSFilter extends Com4jObject {
  // Methods:
  /**
   * @param pSink Mandatory ms.html.ICSSFilterSite parameter.
   */

  @VTID(3)
  void setSite(
    ms.html.ICSSFilterSite pSink);


  /**
   * @param dispid Mandatory int parameter.
   */

  @VTID(4)
  void onAmbientPropertyChange(
    int dispid);


  // Properties:
}
