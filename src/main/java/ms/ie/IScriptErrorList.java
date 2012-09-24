package ms.ie  ;

import com4j.*;

/**
 * Script Error List Interface
 */
@IID("{F3470F24-15FD-11D2-BB2E-00805FF7EFCA}")
public interface IScriptErrorList extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(7)
  void advanceError();


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(8)
  void retreatError();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(9)
  int canAdvanceError();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(10)
  int canRetreatError();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(11)
  int getErrorLine();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(12)
  int getErrorChar();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(13)
  int getErrorCode();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String getErrorMsg();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String getErrorUrl();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(16)
  int getAlwaysShowLockState();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(17)
  int getDetailsPaneOpen();


  /**
   * @param fDetailsPaneOpen Mandatory int parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(18)
  void setDetailsPaneOpen(
    int fDetailsPaneOpen);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(19)
  int getPerErrorDisplay();


  /**
   * @param fPerErrorDisplay Mandatory int parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(20)
  void setPerErrorDisplay(
    int fPerErrorDisplay);


  // Properties:
}
