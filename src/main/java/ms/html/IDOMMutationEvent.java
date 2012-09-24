package ms.html  ;

import com4j.*;

@IID("{305106DA-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMMutationEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "relatedNode"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1226) //= 0x4ca. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject relatedNode();


  /**
   * <p>
   * Getter method for the COM property "prevValue"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1227) //= 0x4cb. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String prevValue();


  /**
   * <p>
   * Getter method for the COM property "newValue"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1228) //= 0x4cc. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String newValue();


  /**
   * <p>
   * Getter method for the COM property "attrName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1229) //= 0x4cd. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String attrName();


  /**
   * <p>
   * Getter method for the COM property "attrChange"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1230) //= 0x4ce. The runtime will prefer the VTID if present
  @VTID(11)
  short attrChange();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   * @param relatedNodeArg Mandatory com4j.Com4jObject parameter.
   * @param prevValueArg Mandatory java.lang.String parameter.
   * @param newValueArg Mandatory java.lang.String parameter.
   * @param attrNameArg Mandatory java.lang.String parameter.
   * @param attrChangeArg Mandatory short parameter.
   */

  @DISPID(1231) //= 0x4cf. The runtime will prefer the VTID if present
  @VTID(12)
  void initMutationEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject relatedNodeArg,
    java.lang.String prevValueArg,
    java.lang.String newValueArg,
    java.lang.String attrNameArg,
    short attrChangeArg);


  // Properties:
}
