package ms.html  ;

import com4j.*;

@IID("{3050F240-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLImgElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "isMap"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(7)
  void isMap(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "isMap"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  boolean isMap();


  /**
   * <p>
   * Setter method for the COM property "useMap"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(9)
  void useMap(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "useMap"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String useMap();


  /**
   * <p>
   * Getter method for the COM property "mimeType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String mimeType();


  /**
   * <p>
   * Getter method for the COM property "fileSize"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String fileSize();


  /**
   * <p>
   * Getter method for the COM property "fileCreatedDate"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String fileCreatedDate();


  /**
   * <p>
   * Getter method for the COM property "fileModifiedDate"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String fileModifiedDate();


  /**
   * <p>
   * Getter method for the COM property "fileUpdatedDate"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String fileUpdatedDate();


  /**
   * <p>
   * Getter method for the COM property "protocol"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String protocol();


  /**
   * <p>
   * Getter method for the COM property "href"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String href();


  /**
   * <p>
   * Getter method for the COM property "nameProp"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String nameProp();


  /**
   * <p>
   * Setter method for the COM property "border"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(19)
  void border(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "border"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object border();


  /**
   * <p>
   * Setter method for the COM property "vspace"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(21)
  void vspace(
    int p);


  /**
   * <p>
   * Getter method for the COM property "vspace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(22)
  int vspace();


  /**
   * <p>
   * Setter method for the COM property "hspace"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(23)
  void hspace(
    int p);


  /**
   * <p>
   * Getter method for the COM property "hspace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(24)
  int hspace();


  /**
   * <p>
   * Setter method for the COM property "alt"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(25)
  void alt(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "alt"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String alt();


  /**
   * <p>
   * Setter method for the COM property "src"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(27)
  void src(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "src"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String src();


  /**
   * <p>
   * Setter method for the COM property "lowsrc"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(29)
  void lowsrc(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "lowsrc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String lowsrc();


  /**
   * <p>
   * Setter method for the COM property "vrml"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(31)
  void vrml(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "vrml"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String vrml();


  /**
   * <p>
   * Setter method for the COM property "dynsrc"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(33)
  void dynsrc(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "dynsrc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String dynsrc();


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412996) //= 0x800113fc. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String readyState();


  /**
   * <p>
   * Getter method for the COM property "complete"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(36)
  boolean complete();


  /**
   * <p>
   * Setter method for the COM property "loop"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(37)
  void loop(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "loop"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(38)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object loop();


  /**
   * <p>
   * Setter method for the COM property "align"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418039) //= 0x80010049. The runtime will prefer the VTID if present
  @VTID(39)
  void align(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "align"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418039) //= 0x80010049. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String align();


  /**
   * <p>
   * Setter method for the COM property "onload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(41)
  void onload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onload();


  /**
   * <p>
   * Setter method for the COM property "onerror"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(43)
  void onerror(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onerror"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(44)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onerror();


  /**
   * <p>
   * Setter method for the COM property "onabort"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412084) //= 0x8001178c. The runtime will prefer the VTID if present
  @VTID(45)
  void onabort(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onabort"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412084) //= 0x8001178c. The runtime will prefer the VTID if present
  @VTID(46)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onabort();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(47)
  void name(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(48)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "width"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(49)
  void width(
    int p);


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(50)
  int width();


  /**
   * <p>
   * Setter method for the COM property "height"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(51)
  void height(
    int p);


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(52)
  int height();


  /**
   * <p>
   * Setter method for the COM property "start"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(53)
  void start(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "start"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1013) //= 0x3f5. The runtime will prefer the VTID if present
  @VTID(54)
  java.lang.String start();


  // Properties:
}
