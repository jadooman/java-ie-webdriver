package ms.html  ;

import com4j.*;

@IID("{3050F6DF-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLPainterEventInfo extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type int
   */

  @VTID(3)
  int getEventInfoFlags();


  /**
   * @param ppElement Mandatory Holder<ms.html.IHTMLElement> parameter.
   */

  @VTID(4)
  void getEventTarget(
    Holder<ms.html.IHTMLElement> ppElement);


  /**
   * @param lPartID Mandatory int parameter.
   */

  @VTID(5)
  void setCursor(
    int lPartID);


  /**
   * @param lPartID Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(6)
  java.lang.String stringFromPartID(
    int lPartID);


  // Properties:
}
