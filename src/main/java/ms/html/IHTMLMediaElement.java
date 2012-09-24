package ms.html  ;

import com4j.*;

@IID("{30510706-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLMediaElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "error"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLMediaError
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLMediaError error();


  /**
   * <p>
   * Setter method for the COM property "src"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  void src(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "src"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String src();


  /**
   * <p>
   * Getter method for the COM property "currentSrc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String currentSrc();


  /**
   * <p>
   * Getter method for the COM property "networkState"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(11)
  short networkState();


  /**
   * <p>
   * Setter method for the COM property "preload"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(12)
  void preload(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "preload"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String preload();


  /**
   * <p>
   * Getter method for the COM property "buffered"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLTimeRanges
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.IHTMLTimeRanges buffered();


  /**
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(15)
  void load();


  /**
   * @param type Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String canPlayType(
    java.lang.String type);


  /**
   * <p>
   * Getter method for the COM property "seeking"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(17)
  boolean seeking();


  /**
   * <p>
   * Setter method for the COM property "currentTime"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(18)
  void currentTime(
    float p);


  /**
   * <p>
   * Getter method for the COM property "currentTime"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(19)
  float currentTime();


  /**
   * <p>
   * Getter method for the COM property "initialTime"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(20)
  float initialTime();


  /**
   * <p>
   * Getter method for the COM property "duration"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(21)
  float duration();


  /**
   * <p>
   * Getter method for the COM property "paused"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(22)
  boolean paused();


  /**
   * <p>
   * Setter method for the COM property "defaultPlaybackRate"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(23)
  void defaultPlaybackRate(
    float p);


  /**
   * <p>
   * Getter method for the COM property "defaultPlaybackRate"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(24)
  float defaultPlaybackRate();


  /**
   * <p>
   * Setter method for the COM property "playbackRate"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(25)
  void playbackRate(
    float p);


  /**
   * <p>
   * Getter method for the COM property "playbackRate"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(26)
  float playbackRate();


  /**
   * <p>
   * Getter method for the COM property "played"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLTimeRanges
   */

  @DISPID(1016) //= 0x3f8. The runtime will prefer the VTID if present
  @VTID(27)
  ms.html.IHTMLTimeRanges played();


  /**
   * <p>
   * Getter method for the COM property "seekable"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLTimeRanges
   */

  @DISPID(1017) //= 0x3f9. The runtime will prefer the VTID if present
  @VTID(28)
  ms.html.IHTMLTimeRanges seekable();


  /**
   * <p>
   * Getter method for the COM property "ended"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1018) //= 0x3fa. The runtime will prefer the VTID if present
  @VTID(29)
  boolean ended();


  /**
   * <p>
   * Setter method for the COM property "autoplay"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1019) //= 0x3fb. The runtime will prefer the VTID if present
  @VTID(30)
  void autoplay(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "autoplay"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1019) //= 0x3fb. The runtime will prefer the VTID if present
  @VTID(31)
  boolean autoplay();


  /**
   * <p>
   * Setter method for the COM property "loop"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(32)
  void loop(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "loop"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1020) //= 0x3fc. The runtime will prefer the VTID if present
  @VTID(33)
  boolean loop();


  /**
   */

  @DISPID(1021) //= 0x3fd. The runtime will prefer the VTID if present
  @VTID(34)
  void play();


  /**
   */

  @DISPID(1022) //= 0x3fe. The runtime will prefer the VTID if present
  @VTID(35)
  void pause();


  /**
   * <p>
   * Setter method for the COM property "controls"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1023) //= 0x3ff. The runtime will prefer the VTID if present
  @VTID(36)
  void controls(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "controls"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1023) //= 0x3ff. The runtime will prefer the VTID if present
  @VTID(37)
  boolean controls();


  /**
   * <p>
   * Setter method for the COM property "volume"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(38)
  void volume(
    float p);


  /**
   * <p>
   * Getter method for the COM property "volume"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(39)
  float volume();


  /**
   * <p>
   * Setter method for the COM property "muted"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1025) //= 0x401. The runtime will prefer the VTID if present
  @VTID(40)
  void muted(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "muted"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1025) //= 0x401. The runtime will prefer the VTID if present
  @VTID(41)
  boolean muted();


  /**
   * <p>
   * Setter method for the COM property "autobuffer"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1026) //= 0x402. The runtime will prefer the VTID if present
  @VTID(42)
  void autobuffer(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "autobuffer"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1026) //= 0x402. The runtime will prefer the VTID if present
  @VTID(43)
  boolean autobuffer();


  // Properties:
}
