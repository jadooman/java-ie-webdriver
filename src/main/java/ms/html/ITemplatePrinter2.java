package ms.html  ;

import com4j.*;

@IID("{3050F83F-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ITemplatePrinter2 extends ms.html.ITemplatePrinter {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "selectionEnabled"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(62)
  void selectionEnabled(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "selectionEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(63)
  boolean selectionEnabled();


  /**
   * <p>
   * Setter method for the COM property "frameActiveEnabled"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(64)
  void frameActiveEnabled(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "frameActiveEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(65)
  boolean frameActiveEnabled();


  /**
   * <p>
   * Setter method for the COM property "orientation"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(66)
  void orientation(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "orientation"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(67)
  java.lang.String orientation();


  /**
   * <p>
   * Setter method for the COM property "usePrinterCopyCollate"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(68)
  void usePrinterCopyCollate(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "usePrinterCopyCollate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(69)
  boolean usePrinterCopyCollate();


  /**
   * @param bstrProperty Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(70)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object deviceSupports(
    java.lang.String bstrProperty);


  // Properties:
}
