package ms.html  ;

import com4j.*;

@IID("{30510738-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMDocumentType extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "entities"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject entities();


  /**
   * <p>
   * Getter method for the COM property "notations"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject notations();


  /**
   * <p>
   * Getter method for the COM property "publicId"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object publicId();


  /**
   * <p>
   * Getter method for the COM property "systemId"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object systemId();


  /**
   * <p>
   * Getter method for the COM property "internalSubset"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object internalSubset();


  // Properties:
}
