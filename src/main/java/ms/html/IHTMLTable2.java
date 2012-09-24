package ms.html  ;

import com4j.*;

@IID("{3050F4AD-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLTable2 extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(1035) //= 0x40b. The runtime will prefer the VTID if present
  @VTID(7)
  void firstPage();


  /**
   */

  @DISPID(1036) //= 0x40c. The runtime will prefer the VTID if present
  @VTID(8)
  void lastPage();


  /**
   * <p>
   * Getter method for the COM property "cells"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1037) //= 0x40d. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLElementCollection cells();


  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject cells(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param indexFrom Optional parameter. Default value is -1
   * @param indexTo Optional parameter. Default value is -1
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1038) //= 0x40e. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject moveRow(
    @Optional @DefaultValue("-1") int indexFrom,
    @Optional @DefaultValue("-1") int indexTo);


  // Properties:
}
