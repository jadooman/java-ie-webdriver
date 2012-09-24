package ms.html  ;

import com4j.*;

@IID("{3050F425-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IElementBehavior extends Com4jObject {
  // Methods:
  /**
   * @param pBehaviorSite Mandatory ms.html.IElementBehaviorSite parameter.
   */

  @VTID(3)
  void init(
    ms.html.IElementBehaviorSite pBehaviorSite);


  /**
   * @param lEvent Mandatory int parameter.
   * @param pVar Mandatory java.lang.Object parameter.
   */

  @VTID(4)
  void notify_(
    int lEvent,
    java.lang.Object pVar);


  /**
   */

  @VTID(5)
  void detach();


  // Properties:
}
