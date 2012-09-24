package ms.html  ;

import com4j.*;

@IID("{305106C6-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTableRow4 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "ch"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(7)
  void ch(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "ch"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String ch();


  /**
   * <p>
   * Setter method for the COM property "chOff"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(9)
  void chOff(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "chOff"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String chOff();


  /**
   * @param index Optional parameter. Default value is -1
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject insertCell(
    @Optional @DefaultValue("-1") int index);


  /**
   * @param index Optional parameter. Default value is -1
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(12)
  void deleteCell(
    @Optional @DefaultValue("-1") int index);


  // Properties:
}
