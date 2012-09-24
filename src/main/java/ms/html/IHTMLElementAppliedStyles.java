package ms.html  ;

import com4j.*;

@IID("{305104BD-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLElementAppliedStyles extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type ms.html.IRulesAppliedCollection
   */

  @DISPID(-2147416996) //= 0x8001045c. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IRulesAppliedCollection msGetRulesApplied();


  @VTID(7)
  @ReturnValue(defaultPropertyThrough={ms.html.IRulesAppliedCollection.class})
  ms.html.IRulesApplied msGetRulesApplied(
    int index);

  /**
   * @param varContext Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type ms.html.IRulesAppliedCollection
   */

  @DISPID(-2147416995) //= 0x8001045d. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IRulesAppliedCollection msGetRulesAppliedWithAncestor(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varContext);


  // Properties:
}
