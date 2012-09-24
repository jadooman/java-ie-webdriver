package ms.html  ;

import com4j.*;

@IID("{3050F4EE-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IElementBehaviorSiteCategory extends Com4jObject {
  // Methods:
  /**
   * @param lDirection Mandatory int parameter.
   * @param pchCategory Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IEnumUnknown
   */

  @VTID(3)
  ms.html.IEnumUnknown getRelatedBehaviors(
    int lDirection,
    @MarshalAs(NativeType.Unicode) java.lang.String pchCategory);


  // Properties:
}
