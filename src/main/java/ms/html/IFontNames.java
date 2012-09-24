package ms.html  ;

import com4j.*;

@IID("{3050F839-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IFontNames extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_newEnum"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(7)
  com4j.Com4jObject _newEnum();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(8)
  int count();


  /**
   * @param pvarIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(9)
  @DefaultMethod
  java.lang.String item(
    java.lang.Object pvarIndex);


  // Properties:
}
