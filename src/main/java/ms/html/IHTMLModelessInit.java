package ms.html  ;

import com4j.*;

@IID("{3050F5E4-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLModelessInit extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "parameters"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(25000) //= 0x61a8. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object parameters();


  /**
   * <p>
   * Getter method for the COM property "optionString"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(25001) //= 0x61a9. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object optionString();


  /**
   * <p>
   * Getter method for the COM property "moniker"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(25006) //= 0x61ae. The runtime will prefer the VTID if present
  @VTID(9)
  com4j.Com4jObject moniker();


  /**
   * <p>
   * Getter method for the COM property "document"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(25007) //= 0x61af. The runtime will prefer the VTID if present
  @VTID(10)
  com4j.Com4jObject document();


  // Properties:
}
