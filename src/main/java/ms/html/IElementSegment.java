package ms.html  ;

import com4j.*;

@IID("{3050F68F-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IElementSegment extends ms.html.ISegment {
  // Methods:
  /**
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @VTID(4)
  ms.html.IHTMLElement getElement();


  /**
   * @param fPrimary Mandatory int parameter.
   */

  @VTID(5)
  void setPrimary(
    int fPrimary);


  /**
   * @return  Returns a value of type int
   */

  @VTID(6)
  int isPrimary();


  // Properties:
}
