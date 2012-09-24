package ms.html  ;

import com4j.*;

@IID("{305104D3-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISVGAngle extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "unitType"
   * </p>
   * @param p Mandatory short parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  void unitType(
    short p);


  /**
   * <p>
   * Getter method for the COM property "unitType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  short unitType();


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  void value(
    float p);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  float value();


  /**
   * <p>
   * Setter method for the COM property "valueInSpecifiedUnits"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(11)
  void valueInSpecifiedUnits(
    float p);


  /**
   * <p>
   * Getter method for the COM property "valueInSpecifiedUnits"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(12)
  float valueInSpecifiedUnits();


  /**
   * <p>
   * Setter method for the COM property "valueAsString"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(13)
  void valueAsString(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "valueAsString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String valueAsString();


  /**
   * @param unitType Mandatory short parameter.
   * @param valueInSpecifiedUnits Mandatory float parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(15)
  void newValueSpecifiedUnits(
    short unitType,
    float valueInSpecifiedUnits);


  /**
   * @param unitType Mandatory short parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(16)
  void convertToSpecifiedUnits(
    short unitType);


  // Properties:
}
