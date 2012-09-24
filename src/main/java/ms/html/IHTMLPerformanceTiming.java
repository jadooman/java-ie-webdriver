package ms.html  ;

import com4j.*;

@IID("{30510752-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLPerformanceTiming extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "navigationStart"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  long navigationStart();


  /**
   * <p>
   * Getter method for the COM property "unloadEventStart"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  long unloadEventStart();


  /**
   * <p>
   * Getter method for the COM property "unloadEventEnd"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  long unloadEventEnd();


  /**
   * <p>
   * Getter method for the COM property "redirectStart"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  long redirectStart();


  /**
   * <p>
   * Getter method for the COM property "redirectEnd"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  long redirectEnd();


  /**
   * <p>
   * Getter method for the COM property "fetchStart"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  long fetchStart();


  /**
   * <p>
   * Getter method for the COM property "domainLookupStart"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(13)
  long domainLookupStart();


  /**
   * <p>
   * Getter method for the COM property "domainLookupEnd"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(14)
  long domainLookupEnd();


  /**
   * <p>
   * Getter method for the COM property "connectStart"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(15)
  long connectStart();


  /**
   * <p>
   * Getter method for the COM property "connectEnd"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(16)
  long connectEnd();


  /**
   * <p>
   * Getter method for the COM property "requestStart"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(17)
  long requestStart();


  /**
   * <p>
   * Getter method for the COM property "responseStart"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(18)
  long responseStart();


  /**
   * <p>
   * Getter method for the COM property "responseEnd"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(19)
  long responseEnd();


  /**
   * <p>
   * Getter method for the COM property "domLoading"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(20)
  long domLoading();


  /**
   * <p>
   * Getter method for the COM property "domInteractive"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(21)
  long domInteractive();


  /**
   * <p>
   * Getter method for the COM property "domContentLoadedEventStart"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(22)
  long domContentLoadedEventStart();


  /**
   * <p>
   * Getter method for the COM property "domContentLoadedEventEnd"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(23)
  long domContentLoadedEventEnd();


  /**
   * <p>
   * Getter method for the COM property "domComplete"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1017) //= 0x3f9. The runtime will prefer the VTID if present
  @VTID(24)
  long domComplete();


  /**
   * <p>
   * Getter method for the COM property "loadEventStart"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1018) //= 0x3fa. The runtime will prefer the VTID if present
  @VTID(25)
  long loadEventStart();


  /**
   * <p>
   * Getter method for the COM property "loadEventEnd"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1019) //= 0x3fb. The runtime will prefer the VTID if present
  @VTID(26)
  long loadEventEnd();


  /**
   * <p>
   * Getter method for the COM property "msFirstPaint"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(27)
  long msFirstPaint();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1021) //= 0x3fd. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String toString_();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1022) //= 0x3fe. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object toJSON();


  // Properties:
}
