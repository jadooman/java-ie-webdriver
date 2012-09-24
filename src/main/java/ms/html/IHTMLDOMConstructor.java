package ms.html  ;

import com4j.*;

@IID("{3051049B-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLDOMConstructor extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "constructor"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147417603) //= 0x800101fd. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject constructor();


  /**
   * @param propname Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object lookupGetter(
    java.lang.String propname);


  /**
   * @param propname Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object lookupSetter(
    java.lang.String propname);


  /**
   * @param propname Mandatory java.lang.String parameter.
   * @param pdispHandler Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  void defineGetter(
    java.lang.String propname,
    java.lang.Object pdispHandler);


  /**
   * @param propname Mandatory java.lang.String parameter.
   * @param pdispHandler Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void defineSetter(
    java.lang.String propname,
    java.lang.Object pdispHandler);


  // Properties:
}
