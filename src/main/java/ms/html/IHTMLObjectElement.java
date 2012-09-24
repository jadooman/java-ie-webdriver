package ms.html  ;

import com4j.*;

@IID("{3050F24F-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLObjectElement extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "object"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147415111) //= 0x80010bb9. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject object();


  /**
   * <p>
   * Getter method for the COM property "classid"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147415110) //= 0x80010bba. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String classid();


  /**
   * <p>
   * Getter method for the COM property "data"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147415109) //= 0x80010bbb. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String data();


  /**
   * <p>
   * Setter method for the COM property "recordset"
   * </p>
   * @param p Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-2147415107) //= 0x80010bbd. The runtime will prefer the VTID if present
  @VTID(10)
  void recordset(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject p);


  /**
   * <p>
   * Getter method for the COM property "recordset"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147415107) //= 0x80010bbd. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject recordset();


  /**
   * <p>
   * Setter method for the COM property "align"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418039) //= 0x80010049. The runtime will prefer the VTID if present
  @VTID(12)
  void align(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "align"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418039) //= 0x80010049. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String align();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(14)
  void name(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "codeBase"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147415106) //= 0x80010bbe. The runtime will prefer the VTID if present
  @VTID(16)
  void codeBase(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "codeBase"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147415106) //= 0x80010bbe. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String codeBase();


  /**
   * <p>
   * Setter method for the COM property "codeType"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147415105) //= 0x80010bbf. The runtime will prefer the VTID if present
  @VTID(18)
  void codeType(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "codeType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147415105) //= 0x80010bbf. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String codeType();


  /**
   * <p>
   * Setter method for the COM property "code"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147415104) //= 0x80010bc0. The runtime will prefer the VTID if present
  @VTID(20)
  void code(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "code"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147415104) //= 0x80010bc0. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String code();


  /**
   * <p>
   * Getter method for the COM property "BaseHref"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418110) //= 0x80010002. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String baseHref();


  /**
   * <p>
   * Setter method for the COM property "type"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147415103) //= 0x80010bc1. The runtime will prefer the VTID if present
  @VTID(23)
  void type(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147415103) //= 0x80010bc1. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String type();


  /**
   * <p>
   * Getter method for the COM property "form"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLFormElement
   */

  @DISPID(-2147416108) //= 0x800107d4. The runtime will prefer the VTID if present
  @VTID(25)
  ms.html.IHTMLFormElement form();


  @VTID(25)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={ms.html.IHTMLFormElement.class})
  com4j.Com4jObject form(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Setter method for the COM property "width"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(26)
  void width(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418107) //= 0x80010005. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object width();


  /**
   * <p>
   * Setter method for the COM property "height"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(28)
  void height(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418106) //= 0x80010006. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object height();


  /**
   * <p>
   * Getter method for the COM property "readyState"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147415102) //= 0x80010bc2. The runtime will prefer the VTID if present
  @VTID(30)
  int readyState();


  /**
   * <p>
   * Setter method for the COM property "onreadystatechange"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(31)
  void onreadystatechange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onreadystatechange"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412087) //= 0x80011789. The runtime will prefer the VTID if present
  @VTID(32)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onreadystatechange();


  /**
   * <p>
   * Setter method for the COM property "onerror"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(33)
  void onerror(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "onerror"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412083) //= 0x8001178d. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object onerror();


  /**
   * <p>
   * Setter method for the COM property "altHtml"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147415101) //= 0x80010bc3. The runtime will prefer the VTID if present
  @VTID(35)
  void altHtml(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "altHtml"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147415101) //= 0x80010bc3. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.String altHtml();


  /**
   * <p>
   * Setter method for the COM property "vspace"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147415100) //= 0x80010bc4. The runtime will prefer the VTID if present
  @VTID(37)
  void vspace(
    int p);


  /**
   * <p>
   * Getter method for the COM property "vspace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147415100) //= 0x80010bc4. The runtime will prefer the VTID if present
  @VTID(38)
  int vspace();


  /**
   * <p>
   * Setter method for the COM property "hspace"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147415099) //= 0x80010bc5. The runtime will prefer the VTID if present
  @VTID(39)
  void hspace(
    int p);


  /**
   * <p>
   * Getter method for the COM property "hspace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147415099) //= 0x80010bc5. The runtime will prefer the VTID if present
  @VTID(40)
  int hspace();


  // Properties:
}
