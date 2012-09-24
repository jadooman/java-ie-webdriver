package ms.html  ;

import com4j.*;

@IID("{3050F5D2-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLInputElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "type"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2000) //= 0x7d0. The runtime will prefer the VTID if present
  @VTID(7)
  void type(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2000) //= 0x7d0. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String type();


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413011) //= 0x800113ed. The runtime will prefer the VTID if present
  @VTID(9)
  void value(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413011) //= 0x800113ed. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(11)
  void name(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "status"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(13)
  void status(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "status"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(14)
  boolean status();


  /**
   * <p>
   * Setter method for the COM property "disabled"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(15)
  void disabled(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "disabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147418036) //= 0x8001004c. The runtime will prefer the VTID if present
  @VTID(16)
  boolean disabled();


  /**
   * <p>
   * Getter method for the COM property "form"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLFormElement
   */

  @DISPID(-2147416108) //= 0x800107d4. The runtime will prefer the VTID if present
  @VTID(17)
  ms.html.IHTMLFormElement form();


  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLFormElement.class})
  com4j.Com4jObject form(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Setter method for the COM property "size"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(18)
  void size(
    int p);


  /**
   * <p>
   * Getter method for the COM property "size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(19)
  int size();


  /**
   * <p>
   * Setter method for the COM property "maxLength"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(20)
  void maxLength(
    int p);


  /**
   * <p>
   * Getter method for the COM property "maxLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(21)
  int maxLength();


  /**
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(22)
  void select();


  /**
   * <p>
   * Setter method for the COM property "onchange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(23)
  void onchange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onchange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412082) //= 0x8001178e. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onchange();


  /**
   * <p>
   * Setter method for the COM property "onselect"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412102) //= 0x8001177a. The runtime will prefer the VTID if present
  @VTID(25)
  void onselect(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onselect"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412102) //= 0x8001177a. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onselect();


  /**
   * <p>
   * Setter method for the COM property "defaultValue"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413029) //= 0x800113db. The runtime will prefer the VTID if present
  @VTID(27)
  void defaultValue(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "defaultValue"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413029) //= 0x800113db. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String defaultValue();


  /**
   * <p>
   * Setter method for the COM property "readOnly"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(29)
  void readOnly(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "readOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(30)
  boolean readOnly();


  /**
   * @return  Returns a value of type ms.html.IHTMLTxtRange
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(31)
  ms.html.IHTMLTxtRange createTextRange();


  /**
   * <p>
   * Setter method for the COM property "indeterminate"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(32)
  void indeterminate(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "indeterminate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(33)
  boolean indeterminate();


  /**
   * <p>
   * Setter method for the COM property "defaultChecked"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(34)
  void defaultChecked(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "defaultChecked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(35)
  boolean defaultChecked();


  /**
   * <p>
   * Setter method for the COM property "checked"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(36)
  void checked(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "checked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(37)
  boolean checked();


  /**
   * <p>
   * Setter method for the COM property "border"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(38)
  void border(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "border"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(39)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object border();


  /**
   * <p>
   * Setter method for the COM property "vspace"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(40)
  void vspace(
    int p);


  /**
   * <p>
   * Getter method for the COM property "vspace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(41)
  int vspace();


  /**
   * <p>
   * Setter method for the COM property "hspace"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(42)
  void hspace(
    int p);


  /**
   * <p>
   * Getter method for the COM property "hspace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(43)
  int hspace();


  /**
   * <p>
   * Setter method for the COM property "alt"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(44)
  void alt(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "alt"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(45)
  java.lang.String alt();


  /**
   * <p>
   * Setter method for the COM property "src"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(46)
  void src(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "src"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String src();


  /**
   * <p>
   * Setter method for the COM property "lowsrc"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(48)
  void lowsrc(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "lowsrc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(49)
  java.lang.String lowsrc();


  /**
   * <p>
   * Setter method for the COM property "vrml"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(50)
  void vrml(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "vrml"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(51)
  java.lang.String vrml();


  /**
   * <p>
   * Setter method for the COM property "dynsrc"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(52)
  void dynsrc(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "dynsrc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String dynsrc();


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412996) //= 0x800113fc. The runtime will prefer the VTID if present
  @VTID(54)
  java.lang.String readyState();


  /**
   * <p>
   * Getter method for the COM property "complete"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(55)
  boolean complete();


  /**
   * <p>
   * Setter method for the COM property "loop"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(56)
  void loop(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "loop"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(57)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object loop();


  /**
   * <p>
   * Setter method for the COM property "align"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418039) //= 0x80010049. The runtime will prefer the VTID if present
  @VTID(58)
  void align(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "align"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418039) //= 0x80010049. The runtime will prefer the VTID if present
  @VTID(59)
  java.lang.String align();


  /**
   * <p>
   * Setter method for the COM property "onload"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(60)
  void onload(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onload"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412080) //= 0x80011790. The runtime will prefer the VTID if present
  @VTID(61)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onload();


  /**
   * <p>
   * Setter method for the COM property "onerror"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(62)
  void onerror(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onerror"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(63)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onerror();


  /**
   * <p>
   * Setter method for the COM property "onabort"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412084) //= 0x8001178c. The runtime will prefer the VTID if present
  @VTID(64)
  void onabort(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onabort"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412084) //= 0x8001178c. The runtime will prefer the VTID if present
  @VTID(65)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onabort();


  /**
   * <p>
   * Setter method for the COM property "width"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(66)
  void width(
    int p);


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(67)
  int width();


  /**
   * <p>
   * Setter method for the COM property "height"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(68)
  void height(
    int p);


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(69)
  int height();


  /**
   * <p>
   * Setter method for the COM property "start"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(70)
  void start(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "start"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(71)
  java.lang.String start();


  // Properties:
}
