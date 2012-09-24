package ms.html  ;

import com4j.*;

@IID("{3050F605-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISegmentList extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type ms.html.ISegmentListIterator
   */

  @VTID(3)
  ms.html.ISegmentListIterator createIterator();


  /**
   * @return  Returns a value of type ms.html._SELECTION_TYPE
   */

  @VTID(4)
  ms.html._SELECTION_TYPE getType();


  /**
   * @return  Returns a value of type int
   */

  @VTID(5)
  int isEmpty();


  // Properties:
}
