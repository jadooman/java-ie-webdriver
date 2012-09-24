package ms.html  ;

import com4j.*;

@IID("{3050F817-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLRuleStyle4 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "textOverflow"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412903) //= 0x80011459. The runtime will prefer the VTID if present
  @VTID(7)
  void textOverflow(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textOverflow"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412903) //= 0x80011459. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String textOverflow();


  /**
   * <p>
   * Setter method for the COM property "minHeight"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412901) //= 0x8001145b. The runtime will prefer the VTID if present
  @VTID(9)
  void minHeight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "minHeight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412901) //= 0x8001145b. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object minHeight();


  // Properties:
}
