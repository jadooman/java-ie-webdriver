package ms.html  ;

import com4j.*;

@IID("{3050F844-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IEnumPrivacyRecords extends Com4jObject {
  // Methods:
  /**
   */

  @VTID(3)
  void reset();


  /**
   * @return  Returns a value of type int
   */

  @VTID(4)
  int getSize();


  /**
   * @return  Returns a value of type int
   */

  @VTID(5)
  int getPrivacyImpacted();


  /**
   * @param pbstrUrl Mandatory Holder<java.lang.String> parameter.
   * @param pbstrPolicyRef Mandatory Holder<java.lang.String> parameter.
   * @param pdwReserved Mandatory Holder<Integer> parameter.
   * @param pdwPrivacyFlags Mandatory Holder<Integer> parameter.
   */

  @VTID(6)
  void next(
    Holder<java.lang.String> pbstrUrl,
    Holder<java.lang.String> pbstrPolicyRef,
    Holder<Integer> pdwReserved,
    Holder<Integer> pdwPrivacyFlags);


  // Properties:
}
