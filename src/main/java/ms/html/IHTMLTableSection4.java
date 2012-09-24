package ms.html  ;

import com4j.*;

@IID("{305106C5-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTableSection4 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "ch"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(7)
  void ch(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "ch"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String ch();


  /**
   * <p>
   * Setter method for the COM property "chOff"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(9)
  void chOff(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "chOff"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String chOff();


  /**
   * @param index Optional parameter. Default value is -1
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject insertRow(
    @Optional @DefaultValue("-1") int index);


  /**
   * @param index Optional parameter. Default value is -1
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(12)
  void deleteRow(
    @Optional @DefaultValue("-1") int index);


  // Properties:
}
