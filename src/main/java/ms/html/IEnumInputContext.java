package ms.html  ;

import com4j.*;

@IID("{09B5EAB0-F997-11D1-93D4-0060B067B86E}")
public interface IEnumInputContext extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type ms.html.IEnumInputContext
   */

  @VTID(3)
  ms.html.IEnumInputContext clone();


  /**
   * @param ulCount Mandatory int parameter.
   * @param rgInputContext Mandatory Holder<Integer> parameter.
   * @param pcFetched Mandatory Holder<Integer> parameter.
   */

  @VTID(4)
  void next(
    int ulCount,
    Holder<Integer> rgInputContext,
    Holder<Integer> pcFetched);


  /**
   */

  @VTID(5)
  void reset();


  /**
   * @param ulCount Mandatory int parameter.
   */

  @VTID(6)
  void skip(
    int ulCount);


  // Properties:
}
