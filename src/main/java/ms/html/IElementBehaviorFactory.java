package ms.html  ;

import com4j.*;

@IID("{3050F429-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IElementBehaviorFactory extends Com4jObject {
  // Methods:
  /**
   * @param bstrBehavior Mandatory java.lang.String parameter.
   * @param bstrBehaviorUrl Mandatory java.lang.String parameter.
   * @param pSite Mandatory ms.html.IElementBehaviorSite parameter.
   * @return  Returns a value of type ms.html.IElementBehavior
   */

  @VTID(3)
  ms.html.IElementBehavior findBehavior(
    java.lang.String bstrBehavior,
    java.lang.String bstrBehaviorUrl,
    ms.html.IElementBehaviorSite pSite);


  // Properties:
}
