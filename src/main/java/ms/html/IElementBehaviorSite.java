package ms.html  ;

import com4j.*;

@IID("{3050F427-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IElementBehaviorSite extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @VTID(3)
  ms.html.IHTMLElement getElement();


  /**
   * @param lEvent Mandatory int parameter.
   */

  @VTID(4)
  void registerNotification(
    int lEvent);


  // Properties:
}
