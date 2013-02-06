package com.ie  ;

import com4j.*;

/**
 * IShellNameSpace Interface
 */
@IID("{E572D3C9-37BE-4AE2-825D-D521763E3108}")
public interface IShellNameSpace extends com.ie.IShellFavoritesNameSpace {
  // Methods:
  /**
   * <p>
   * options 
   * </p>
   * <p>
   * Getter method for the COM property "EnumOptions"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  int enumOptions();


  /**
   * <p>
   * options 
   * </p>
   * <p>
   * Setter method for the COM property "EnumOptions"
   * </p>
   * @param pgrfEnumFlags Mandatory int parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(21)
  void enumOptions(
    int pgrfEnumFlags);


  /**
   * <p>
   * get the selected item
   * </p>
   * <p>
   * Getter method for the COM property "SelectedItem"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject selectedItem();


  /**
   * <p>
   * get the selected item
   * </p>
   * <p>
   * Setter method for the COM property "SelectedItem"
   * </p>
   * @param pItem Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(23)
  void selectedItem(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pItem);


  /**
   * <p>
   * get the root item
   * </p>
   * <p>
   * Getter method for the COM property "Root"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object root();


  /**
   * <p>
   * get the root item
   * </p>
   * <p>
   * Setter method for the COM property "Root"
   * </p>
   * @param pvar Mandatory java.lang.Object parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(25)
  void root(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pvar);


  /**
   * <p>
   * Getter method for the COM property "Depth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(26)
  int depth();


  /**
   * <p>
   * Setter method for the COM property "Depth"
   * </p>
   * @param piDepth Mandatory int parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(27)
  void depth(
    int piDepth);


  /**
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(28)
  int mode();


  /**
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param puMode Mandatory int parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(29)
  void mode(
    int puMode);


  /**
   * <p>
   * Getter method for the COM property "Flags"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(30)
  int flags();


  /**
   * <p>
   * Setter method for the COM property "Flags"
   * </p>
   * @param pdwFlags Mandatory int parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(31)
  void flags(
    int pdwFlags);


  /**
   * <p>
   * Setter method for the COM property "TVFlags"
   * </p>
   * @param dwFlags Mandatory int parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(32)
  void tvFlags(
    int dwFlags);


  /**
   * <p>
   * Getter method for the COM property "TVFlags"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(33)
  int tvFlags();


  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String columns();


  /**
   * <p>
   * Setter method for the COM property "Columns"
   * </p>
   * @param bstrColumns Mandatory java.lang.String parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(35)
  void columns(
    java.lang.String bstrColumns);


  /**
   * <p>
   * number of view types
   * </p>
   * <p>
   * Getter method for the COM property "CountViewTypes"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(36)
  int countViewTypes();


  /**
   * <p>
   * set view type
   * </p>
   * @param iType Mandatory int parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(37)
  void setViewType(
    int iType);


  /**
   * <p>
   * collection of selected items
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(38)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject selectedItems();


  /**
   * <p>
   * expands item specified depth
   * </p>
   * @param var Mandatory java.lang.Object parameter.
   * @param iDepth Mandatory int parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(39)
  void expand(
    @MarshalAs(NativeType.VARIANT) java.lang.Object var,
    int iDepth);


  /**
   * <p>
   * unselects all items
   * </p>
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(40)
  void unselectAll();


  // Properties:
}
