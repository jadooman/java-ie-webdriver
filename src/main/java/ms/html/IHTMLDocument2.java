package ms.html  ;

import com4j.*;

@IID("{332C4425-26CB-11D0-B483-00C04FD90119}")
public interface IHTMLDocument2 extends ms.html.IHTMLDocument {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "all"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(8)
  ms.html.IHTMLElementCollection all();


  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject all(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "body"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(9)
  ms.html.IHTMLElement body();


  /**
   * <p>
   * Getter method for the COM property "activeElement"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(10)
  ms.html.IHTMLElement activeElement();


  /**
   * <p>
   * Getter method for the COM property "images"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(11)
  ms.html.IHTMLElementCollection images();


  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject images(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "applets"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(12)
  ms.html.IHTMLElementCollection applets();


  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject applets(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "links"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(13)
  ms.html.IHTMLElementCollection links();


  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject links(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "forms"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(14)
  ms.html.IHTMLElementCollection forms();


  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject forms(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "anchors"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(15)
  ms.html.IHTMLElementCollection anchors();


  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject anchors(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Setter method for the COM property "title"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(16)
  void title(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String title();


  /**
   * <p>
   * Getter method for the COM property "scripts"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(18)
  ms.html.IHTMLElementCollection scripts();


  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject scripts(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Setter method for the COM property "designMode"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(19)
  void designMode(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "designMode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1014) //= 0x3f6. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String designMode();


  /**
   * <p>
   * Getter method for the COM property "selection"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLSelectionObject
   */

  @DISPID(1017) //= 0x3f9. The runtime will prefer the VTID if present
  @VTID(21)
  ms.html.IHTMLSelectionObject selection();


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1018) //= 0x3fa. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String readyState();


  /**
   * <p>
   * Getter method for the COM property "frames"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLFramesCollection2
   */

  @DISPID(1019) //= 0x3fb. The runtime will prefer the VTID if present
  @VTID(23)
  ms.html.IHTMLFramesCollection2 frames();


  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={ms.html.IHTMLFramesCollection2.class})
  java.lang.Object frames(
    java.lang.Object pvarIndex);

  /**
   * <p>
   * Getter method for the COM property "embeds"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1015) //= 0x3f7. The runtime will prefer the VTID if present
  @VTID(24)
  ms.html.IHTMLElementCollection embeds();


  @VTID(24)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject embeds(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "plugins"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLElementCollection
   */

  @DISPID(1021) //= 0x3fd. The runtime will prefer the VTID if present
  @VTID(25)
  ms.html.IHTMLElementCollection plugins();


  @VTID(25)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLElementCollection.class})
  com4j.Com4jObject plugins(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Setter method for the COM property "alinkColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1022) //= 0x3fe. The runtime will prefer the VTID if present
  @VTID(26)
  void alinkColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "alinkColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1022) //= 0x3fe. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object alinkColor();


  /**
   * <p>
   * Setter method for the COM property "bgColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(28)
  void bgColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "bgColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object bgColor();


  /**
   * <p>
   * Setter method for the COM property "fgColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147413110) //= 0x8001138a. The runtime will prefer the VTID if present
  @VTID(30)
  void fgColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "fgColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147413110) //= 0x8001138a. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object fgColor();


  /**
   * <p>
   * Setter method for the COM property "linkColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(32)
  void linkColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "linkColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1024) //= 0x400. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object linkColor();


  /**
   * <p>
   * Setter method for the COM property "vlinkColor"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1023) //= 0x3ff. The runtime will prefer the VTID if present
  @VTID(34)
  void vlinkColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "vlinkColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1023) //= 0x3ff. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object vlinkColor();


  /**
   * <p>
   * Getter method for the COM property "referrer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1027) //= 0x403. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.String referrer();


  /**
   * <p>
   * Getter method for the COM property "location"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLLocation
   */

  @DISPID(1026) //= 0x402. The runtime will prefer the VTID if present
  @VTID(37)
  ms.html.IHTMLLocation location();


  /**
   * <p>
   * Getter method for the COM property "lastModified"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1028) //= 0x404. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String lastModified();


  /**
   * <p>
   * Setter method for the COM property "url"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1025) //= 0x401. The runtime will prefer the VTID if present
  @VTID(39)
  void url(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "url"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1025) //= 0x401. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String url();


  /**
   * <p>
   * Setter method for the COM property "domain"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1029) //= 0x405. The runtime will prefer the VTID if present
  @VTID(41)
  void domain(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "domain"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1029) //= 0x405. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String domain();


  /**
   * <p>
   * Setter method for the COM property "cookie"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1030) //= 0x406. The runtime will prefer the VTID if present
  @VTID(43)
  void cookie(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "cookie"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1030) //= 0x406. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String cookie();


  /**
   * <p>
   * Setter method for the COM property "expando"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(45)
  void expando(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "expando"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1031) //= 0x407. The runtime will prefer the VTID if present
  @VTID(46)
  boolean expando();


  /**
   * <p>
   * Setter method for the COM property "charset"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1032) //= 0x408. The runtime will prefer the VTID if present
  @VTID(47)
  void charset(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "charset"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1032) //= 0x408. The runtime will prefer the VTID if present
  @VTID(48)
  java.lang.String charset();


  /**
   * <p>
   * Setter method for the COM property "defaultCharset"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1033) //= 0x409. The runtime will prefer the VTID if present
  @VTID(49)
  void defaultCharset(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "defaultCharset"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1033) //= 0x409. The runtime will prefer the VTID if present
  @VTID(50)
  java.lang.String defaultCharset();


  /**
   * <p>
   * Getter method for the COM property "mimeType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1041) //= 0x411. The runtime will prefer the VTID if present
  @VTID(51)
  java.lang.String mimeType();


  /**
   * <p>
   * Getter method for the COM property "fileSize"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1042) //= 0x412. The runtime will prefer the VTID if present
  @VTID(52)
  java.lang.String fileSize();


  /**
   * <p>
   * Getter method for the COM property "fileCreatedDate"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1043) //= 0x413. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String fileCreatedDate();


  /**
   * <p>
   * Getter method for the COM property "fileModifiedDate"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1044) //= 0x414. The runtime will prefer the VTID if present
  @VTID(54)
  java.lang.String fileModifiedDate();


  /**
   * <p>
   * Getter method for the COM property "fileUpdatedDate"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1045) //= 0x415. The runtime will prefer the VTID if present
  @VTID(55)
  java.lang.String fileUpdatedDate();


  /**
   * <p>
   * Getter method for the COM property "security"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1046) //= 0x416. The runtime will prefer the VTID if present
  @VTID(56)
  java.lang.String security();


  /**
   * <p>
   * Getter method for the COM property "protocol"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1047) //= 0x417. The runtime will prefer the VTID if present
  @VTID(57)
  java.lang.String protocol();


  /**
   * <p>
   * Getter method for the COM property "nameProp"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1048) //= 0x418. The runtime will prefer the VTID if present
  @VTID(58)
  java.lang.String nameProp();


  /**
   * @param psarray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1054) //= 0x41e. The runtime will prefer the VTID if present
  @VTID(59)
  void write(
    java.lang.Object... psarray);


  /**
   * @param psarray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1055) //= 0x41f. The runtime will prefer the VTID if present
  @VTID(60)
  void writeln(
    java.lang.Object... psarray);


  /**
   * @param url Optional parameter. Default value is "text/html"
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param features Optional parameter. Default value is com4j.Variant.getMissing()
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1056) //= 0x420. The runtime will prefer the VTID if present
  @VTID(61)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject open(
    @Optional @DefaultValue("text/html") java.lang.String url,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object features,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace);


  /**
   */

  @DISPID(1057) //= 0x421. The runtime will prefer the VTID if present
  @VTID(62)
  void close();


  /**
   */

  @DISPID(1058) //= 0x422. The runtime will prefer the VTID if present
  @VTID(63)
  void clear();


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1059) //= 0x423. The runtime will prefer the VTID if present
  @VTID(64)
  boolean queryCommandSupported(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1060) //= 0x424. The runtime will prefer the VTID if present
  @VTID(65)
  boolean queryCommandEnabled(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1061) //= 0x425. The runtime will prefer the VTID if present
  @VTID(66)
  boolean queryCommandState(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1062) //= 0x426. The runtime will prefer the VTID if present
  @VTID(67)
  boolean queryCommandIndeterm(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1063) //= 0x427. The runtime will prefer the VTID if present
  @VTID(68)
  java.lang.String queryCommandText(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1064) //= 0x428. The runtime will prefer the VTID if present
  @VTID(69)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object queryCommandValue(
    java.lang.String cmdID);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @param showUI Optional parameter. Default value is false
   * @param value Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(1065) //= 0x429. The runtime will prefer the VTID if present
  @VTID(70)
  boolean execCommand(
    java.lang.String cmdID,
    @Optional @DefaultValue("0") boolean showUI,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * @param cmdID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1066) //= 0x42a. The runtime will prefer the VTID if present
  @VTID(71)
  boolean execCommandShowHelp(
    java.lang.String cmdID);


  /**
   * @param eTag Mandatory java.lang.String parameter.
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1067) //= 0x42b. The runtime will prefer the VTID if present
  @VTID(72)
  ms.html.IHTMLElement createElement(
    java.lang.String eTag);


  /**
   * <p>
   * Setter method for the COM property "onhelp"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412099) //= 0x8001177d. The runtime will prefer the VTID if present
  @VTID(73)
  void onhelp(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onhelp"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412099) //= 0x8001177d. The runtime will prefer the VTID if present
  @VTID(74)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onhelp();


  /**
   * <p>
   * Setter method for the COM property "onclick"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412104) //= 0x80011778. The runtime will prefer the VTID if present
  @VTID(75)
  void onclick(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onclick"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412104) //= 0x80011778. The runtime will prefer the VTID if present
  @VTID(76)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onclick();


  /**
   * <p>
   * Setter method for the COM property "ondblclick"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412103) //= 0x80011779. The runtime will prefer the VTID if present
  @VTID(77)
  void ondblclick(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondblclick"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412103) //= 0x80011779. The runtime will prefer the VTID if present
  @VTID(78)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondblclick();


  /**
   * <p>
   * Setter method for the COM property "onkeyup"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412106) //= 0x80011776. The runtime will prefer the VTID if present
  @VTID(79)
  void onkeyup(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onkeyup"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412106) //= 0x80011776. The runtime will prefer the VTID if present
  @VTID(80)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onkeyup();


  /**
   * <p>
   * Setter method for the COM property "onkeydown"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412107) //= 0x80011775. The runtime will prefer the VTID if present
  @VTID(81)
  void onkeydown(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onkeydown"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412107) //= 0x80011775. The runtime will prefer the VTID if present
  @VTID(82)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onkeydown();


  /**
   * <p>
   * Setter method for the COM property "onkeypress"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412105) //= 0x80011777. The runtime will prefer the VTID if present
  @VTID(83)
  void onkeypress(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onkeypress"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412105) //= 0x80011777. The runtime will prefer the VTID if present
  @VTID(84)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onkeypress();


  /**
   * <p>
   * Setter method for the COM property "onmouseup"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412109) //= 0x80011773. The runtime will prefer the VTID if present
  @VTID(85)
  void onmouseup(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmouseup"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412109) //= 0x80011773. The runtime will prefer the VTID if present
  @VTID(86)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmouseup();


  /**
   * <p>
   * Setter method for the COM property "onmousedown"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412110) //= 0x80011772. The runtime will prefer the VTID if present
  @VTID(87)
  void onmousedown(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmousedown"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412110) //= 0x80011772. The runtime will prefer the VTID if present
  @VTID(88)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmousedown();


  /**
   * <p>
   * Setter method for the COM property "onmousemove"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412108) //= 0x80011774. The runtime will prefer the VTID if present
  @VTID(89)
  void onmousemove(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmousemove"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412108) //= 0x80011774. The runtime will prefer the VTID if present
  @VTID(90)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmousemove();


  /**
   * <p>
   * Setter method for the COM property "onmouseout"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412111) //= 0x80011771. The runtime will prefer the VTID if present
  @VTID(91)
  void onmouseout(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmouseout"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412111) //= 0x80011771. The runtime will prefer the VTID if present
  @VTID(92)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmouseout();


  /**
   * <p>
   * Setter method for the COM property "onmouseover"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412112) //= 0x80011770. The runtime will prefer the VTID if present
  @VTID(93)
  void onmouseover(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onmouseover"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412112) //= 0x80011770. The runtime will prefer the VTID if present
  @VTID(94)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onmouseover();


  /**
   * <p>
   * Setter method for the COM property "onreadystatechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(95)
  void onreadystatechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onreadystatechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(96)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onreadystatechange();


  /**
   * <p>
   * Setter method for the COM property "onafterupdate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412090) //= 0x80011786. The runtime will prefer the VTID if present
  @VTID(97)
  void onafterupdate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onafterupdate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412090) //= 0x80011786. The runtime will prefer the VTID if present
  @VTID(98)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onafterupdate();


  /**
   * <p>
   * Setter method for the COM property "onrowexit"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412094) //= 0x80011782. The runtime will prefer the VTID if present
  @VTID(99)
  void onrowexit(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onrowexit"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412094) //= 0x80011782. The runtime will prefer the VTID if present
  @VTID(100)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onrowexit();


  /**
   * <p>
   * Setter method for the COM property "onrowenter"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412093) //= 0x80011783. The runtime will prefer the VTID if present
  @VTID(101)
  void onrowenter(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onrowenter"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412093) //= 0x80011783. The runtime will prefer the VTID if present
  @VTID(102)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onrowenter();


  /**
   * <p>
   * Setter method for the COM property "ondragstart"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412077) //= 0x80011793. The runtime will prefer the VTID if present
  @VTID(103)
  void ondragstart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "ondragstart"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412077) //= 0x80011793. The runtime will prefer the VTID if present
  @VTID(104)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ondragstart();


  /**
   * <p>
   * Setter method for the COM property "onselectstart"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412075) //= 0x80011795. The runtime will prefer the VTID if present
  @VTID(105)
  void onselectstart(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onselectstart"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412075) //= 0x80011795. The runtime will prefer the VTID if present
  @VTID(106)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onselectstart();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @DISPID(1068) //= 0x42c. The runtime will prefer the VTID if present
  @VTID(107)
  ms.html.IHTMLElement elementFromPoint(
    int x,
    int y);


  /**
   * <p>
   * Getter method for the COM property "parentWindow"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLWindow2
   */

  @DISPID(1034) //= 0x40a. The runtime will prefer the VTID if present
  @VTID(108)
  ms.html.IHTMLWindow2 parentWindow();


  /**
   * <p>
   * Getter method for the COM property "styleSheets"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLStyleSheetsCollection
   */

  @DISPID(1069) //= 0x42d. The runtime will prefer the VTID if present
  @VTID(109)
  ms.html.IHTMLStyleSheetsCollection styleSheets();


  @VTID(109)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={ms.html.IHTMLStyleSheetsCollection.class})
  java.lang.Object styleSheets(
    java.lang.Object pvarIndex);

  /**
   * <p>
   * Setter method for the COM property "onbeforeupdate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412091) //= 0x80011785. The runtime will prefer the VTID if present
  @VTID(110)
  void onbeforeupdate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onbeforeupdate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412091) //= 0x80011785. The runtime will prefer the VTID if present
  @VTID(111)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onbeforeupdate();


  /**
   * <p>
   * Setter method for the COM property "onerrorupdate"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412074) //= 0x80011796. The runtime will prefer the VTID if present
  @VTID(112)
  void onerrorupdate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onerrorupdate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412074) //= 0x80011796. The runtime will prefer the VTID if present
  @VTID(113)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onerrorupdate();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1070) //= 0x42e. The runtime will prefer the VTID if present
  @VTID(114)
  java.lang.String toString_();


  /**
   * @param bstrHref Optional parameter. Default value is ""
   * @param lIndex Optional parameter. Default value is -1
   * @return  Returns a value of type ms.html.IHTMLStyleSheet
   */

  @DISPID(1071) //= 0x42f. The runtime will prefer the VTID if present
  @VTID(115)
  ms.html.IHTMLStyleSheet createStyleSheet(
    @Optional @DefaultValue("") java.lang.String bstrHref,
    @Optional @DefaultValue("-1") int lIndex);


  // Properties:
}
