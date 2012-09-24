package ms.html  ;

import com4j.*;

@IID("{3050F2C2-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLInputImage extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2000) //= 0x7d0. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String type();


  /**
   * <p>
   * Setter method for the COM property "disabled"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(8)
  void disabled(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "disabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(9)
  boolean disabled();


  /**
   * <p>
   * Setter method for the COM property "border"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(10)
  void border(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "border"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object border();


  /**
   * <p>
   * Setter method for the COM property "vspace"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(12)
  void vspace(
    int p);


  /**
   * <p>
   * Getter method for the COM property "vspace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(13)
  int vspace();


  /**
   * <p>
   * Setter method for the COM property "hspace"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(14)
  void hspace(
    int p);


  /**
   * <p>
   * Getter method for the COM property "hspace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(15)
  int hspace();


  /**
   * <p>
   * Setter method for the COM property "alt"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(16)
  void alt(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "alt"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String alt();


  /**
   * <p>
   * Setter method for the COM property "src"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(18)
  void src(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "src"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String src();


  /**
   * <p>
   * Setter method for the COM property "lowsrc"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(20)
  void lowsrc(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "lowsrc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String lowsrc();


  /**
   * <p>
   * Setter method for the COM property "vrml"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(22)
  void vrml(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "vrml"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String vrml();


  /**
   * <p>
   * Setter method for the COM property "dynsrc"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(24)
  void dynsrc(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "dynsrc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String dynsrc();


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412996) //= 0x800113fc. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String readyState();


  /**
   * <p>
   * Getter method for the COM property "complete"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(27)
  boolean complete();


  /**
   * <p>
   * Setter method for the COM property "loop"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(28)
  void loop(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "loop"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object loop();


  /**
   * <p>
   * Setter method for the COM property "align"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418039) //= 0x80010049. The runtime will prefer the VTID if present
  @VTID(30)
  void align(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "align"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418039) //= 0x80010049. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String align();


  /**
   * <p>
   * Setter method for the COM property "onload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(32)
  void onload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onload();


  /**
   * <p>
   * Setter method for the COM property "onerror"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(34)
  void onerror(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onerror"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onerror();


  /**
   * <p>
   * Setter method for the COM property "onabort"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412084) //= 0x8001178c. The runtime will prefer the VTID if present
  @VTID(36)
  void onabort(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onabort"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412084) //= 0x8001178c. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onabort();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(38)
  void name(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "width"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(40)
  void width(
    int p);


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(41)
  int width();


  /**
   * <p>
   * Setter method for the COM property "height"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(42)
  void height(
    int p);


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(43)
  int height();


  /**
   * <p>
   * Setter method for the COM property "start"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(44)
  void start(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "start"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(45)
  java.lang.String start();


  // Properties:
}
