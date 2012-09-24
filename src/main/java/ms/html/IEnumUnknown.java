package ms.html  ;

import com4j.*;

@IID("{00000100-0000-0000-C000-000000000046}")
public interface IEnumUnknown extends Com4jObject {
  // Methods:
  /**
   * @param celt Mandatory int parameter.
   * @param rgelt Mandatory Holder<com4j.Com4jObject> parameter.
   * @param pceltFetched Mandatory Holder<Integer> parameter.
   */

  @VTID(3)
  void remoteNext(
    int celt,
    Holder<com4j.Com4jObject> rgelt,
    Holder<Integer> pceltFetched);


  /**
   * @param celt Mandatory int parameter.
   */

  @VTID(4)
  void skip(
    int celt);


  /**
   */

  @VTID(5)
  void reset();


  /**
   * @return  Returns a value of type ms.html.IEnumUnknown
   */

  @VTID(6)
  ms.html.IEnumUnknown clone();


  // Properties:
}
