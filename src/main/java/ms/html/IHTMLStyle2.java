package ms.html  ;

import com4j.*;

@IID("{3050F4A2-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLStyle2 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "tableLayout"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413014) //= 0x800113ea. The runtime will prefer the VTID if present
  @VTID(7)
  void tableLayout(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "tableLayout"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413014) //= 0x800113ea. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String tableLayout();


  /**
   * <p>
   * Setter method for the COM property "borderCollapse"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413028) //= 0x800113dc. The runtime will prefer the VTID if present
  @VTID(9)
  void borderCollapse(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "borderCollapse"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413028) //= 0x800113dc. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String borderCollapse();


  /**
   * <p>
   * Setter method for the COM property "direction"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412993) //= 0x800113ff. The runtime will prefer the VTID if present
  @VTID(11)
  void direction(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "direction"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412993) //= 0x800113ff. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String direction();


  /**
   * <p>
   * Setter method for the COM property "behavior"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412997) //= 0x800113fb. The runtime will prefer the VTID if present
  @VTID(13)
  void behavior(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "behavior"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412997) //= 0x800113fb. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String behavior();


  /**
   * @param propname Mandatory java.lang.String parameter.
   * @param expression Mandatory java.lang.String parameter.
   * @param language Optional parameter. Default value is ""
   */

  @DISPID(-2147417608) //= 0x800101f8. The runtime will prefer the VTID if present
  @VTID(15)
  void setExpression(
    java.lang.String propname,
    java.lang.String expression,
    @Optional @DefaultValue("") java.lang.String language);


  /**
   * @param propname Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147417607) //= 0x800101f9. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getExpression(
    java.lang.String propname);


  /**
   * @param propname Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147417606) //= 0x800101fa. The runtime will prefer the VTID if present
  @VTID(17)
  boolean removeExpression(
    java.lang.String propname);


  /**
   * <p>
   * Setter method for the COM property "position"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147413022) //= 0x800113e2. The runtime will prefer the VTID if present
  @VTID(18)
  void position(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "position"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147413022) //= 0x800113e2. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String position();


  /**
   * <p>
   * Setter method for the COM property "unicodeBidi"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412994) //= 0x800113fe. The runtime will prefer the VTID if present
  @VTID(20)
  void unicodeBidi(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "unicodeBidi"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412994) //= 0x800113fe. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String unicodeBidi();


  /**
   * <p>
   * Setter method for the COM property "bottom"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418034) //= 0x8001004e. The runtime will prefer the VTID if present
  @VTID(22)
  void bottom(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "bottom"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418034) //= 0x8001004e. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object bottom();


  /**
   * <p>
   * Setter method for the COM property "right"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147418035) //= 0x8001004d. The runtime will prefer the VTID if present
  @VTID(24)
  void right(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "right"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147418035) //= 0x8001004d. The runtime will prefer the VTID if present
  @VTID(25)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object right();


  /**
   * <p>
   * Setter method for the COM property "pixelBottom"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147414103) //= 0x80010fa9. The runtime will prefer the VTID if present
  @VTID(26)
  void pixelBottom(
    int p);


  /**
   * <p>
   * Getter method for the COM property "pixelBottom"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147414103) //= 0x80010fa9. The runtime will prefer the VTID if present
  @VTID(27)
  int pixelBottom();


  /**
   * <p>
   * Setter method for the COM property "pixelRight"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(-2147414102) //= 0x80010faa. The runtime will prefer the VTID if present
  @VTID(28)
  void pixelRight(
    int p);


  /**
   * <p>
   * Getter method for the COM property "pixelRight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147414102) //= 0x80010faa. The runtime will prefer the VTID if present
  @VTID(29)
  int pixelRight();


  /**
   * <p>
   * Setter method for the COM property "posBottom"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(-2147414101) //= 0x80010fab. The runtime will prefer the VTID if present
  @VTID(30)
  void posBottom(
    float p);


  /**
   * <p>
   * Getter method for the COM property "posBottom"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(-2147414101) //= 0x80010fab. The runtime will prefer the VTID if present
  @VTID(31)
  float posBottom();


  /**
   * <p>
   * Setter method for the COM property "posRight"
   * </p>
   * @param p Mandatory float parameter.
   */

  @DISPID(-2147414100) //= 0x80010fac. The runtime will prefer the VTID if present
  @VTID(32)
  void posRight(
    float p);


  /**
   * <p>
   * Getter method for the COM property "posRight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(-2147414100) //= 0x80010fac. The runtime will prefer the VTID if present
  @VTID(33)
  float posRight();


  /**
   * <p>
   * Setter method for the COM property "imeMode"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412992) //= 0x80011400. The runtime will prefer the VTID if present
  @VTID(34)
  void imeMode(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "imeMode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412992) //= 0x80011400. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String imeMode();


  /**
   * <p>
   * Setter method for the COM property "rubyAlign"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412991) //= 0x80011401. The runtime will prefer the VTID if present
  @VTID(36)
  void rubyAlign(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "rubyAlign"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412991) //= 0x80011401. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String rubyAlign();


  /**
   * <p>
   * Setter method for the COM property "rubyPosition"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412990) //= 0x80011402. The runtime will prefer the VTID if present
  @VTID(38)
  void rubyPosition(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "rubyPosition"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412990) //= 0x80011402. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String rubyPosition();


  /**
   * <p>
   * Setter method for the COM property "rubyOverhang"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412989) //= 0x80011403. The runtime will prefer the VTID if present
  @VTID(40)
  void rubyOverhang(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "rubyOverhang"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412989) //= 0x80011403. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String rubyOverhang();


  /**
   * <p>
   * Setter method for the COM property "layoutGridChar"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412985) //= 0x80011407. The runtime will prefer the VTID if present
  @VTID(42)
  void layoutGridChar(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "layoutGridChar"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412985) //= 0x80011407. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object layoutGridChar();


  /**
   * <p>
   * Setter method for the COM property "layoutGridLine"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412984) //= 0x80011408. The runtime will prefer the VTID if present
  @VTID(44)
  void layoutGridLine(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "layoutGridLine"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412984) //= 0x80011408. The runtime will prefer the VTID if present
  @VTID(45)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object layoutGridLine();


  /**
   * <p>
   * Setter method for the COM property "layoutGridMode"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412983) //= 0x80011409. The runtime will prefer the VTID if present
  @VTID(46)
  void layoutGridMode(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "layoutGridMode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412983) //= 0x80011409. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String layoutGridMode();


  /**
   * <p>
   * Setter method for the COM property "layoutGridType"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412982) //= 0x8001140a. The runtime will prefer the VTID if present
  @VTID(48)
  void layoutGridType(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "layoutGridType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412982) //= 0x8001140a. The runtime will prefer the VTID if present
  @VTID(49)
  java.lang.String layoutGridType();


  /**
   * <p>
   * Setter method for the COM property "layoutGrid"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412981) //= 0x8001140b. The runtime will prefer the VTID if present
  @VTID(50)
  void layoutGrid(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "layoutGrid"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412981) //= 0x8001140b. The runtime will prefer the VTID if present
  @VTID(51)
  java.lang.String layoutGrid();


  /**
   * <p>
   * Setter method for the COM property "wordBreak"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412978) //= 0x8001140e. The runtime will prefer the VTID if present
  @VTID(52)
  void wordBreak(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "wordBreak"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412978) //= 0x8001140e. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String wordBreak();


  /**
   * <p>
   * Setter method for the COM property "lineBreak"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412979) //= 0x8001140d. The runtime will prefer the VTID if present
  @VTID(54)
  void lineBreak(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "lineBreak"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412979) //= 0x8001140d. The runtime will prefer the VTID if present
  @VTID(55)
  java.lang.String lineBreak();


  /**
   * <p>
   * Setter method for the COM property "textJustify"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412977) //= 0x8001140f. The runtime will prefer the VTID if present
  @VTID(56)
  void textJustify(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textJustify"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412977) //= 0x8001140f. The runtime will prefer the VTID if present
  @VTID(57)
  java.lang.String textJustify();


  /**
   * <p>
   * Setter method for the COM property "textJustifyTrim"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412976) //= 0x80011410. The runtime will prefer the VTID if present
  @VTID(58)
  void textJustifyTrim(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textJustifyTrim"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412976) //= 0x80011410. The runtime will prefer the VTID if present
  @VTID(59)
  java.lang.String textJustifyTrim();


  /**
   * <p>
   * Setter method for the COM property "textKashida"
   * </p>
   * @param p Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147412975) //= 0x80011411. The runtime will prefer the VTID if present
  @VTID(60)
  void textKashida(
    @MarshalAs(NativeType.VARIANT) java.lang.Object p);


  /**
   * <p>
   * Getter method for the COM property "textKashida"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(-2147412975) //= 0x80011411. The runtime will prefer the VTID if present
  @VTID(61)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object textKashida();


  /**
   * <p>
   * Setter method for the COM property "textAutospace"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412980) //= 0x8001140c. The runtime will prefer the VTID if present
  @VTID(62)
  void textAutospace(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "textAutospace"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412980) //= 0x8001140c. The runtime will prefer the VTID if present
  @VTID(63)
  java.lang.String textAutospace();


  /**
   * <p>
   * Setter method for the COM property "overflowX"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412973) //= 0x80011413. The runtime will prefer the VTID if present
  @VTID(64)
  void overflowX(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "overflowX"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412973) //= 0x80011413. The runtime will prefer the VTID if present
  @VTID(65)
  java.lang.String overflowX();


  /**
   * <p>
   * Setter method for the COM property "overflowY"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412972) //= 0x80011414. The runtime will prefer the VTID if present
  @VTID(66)
  void overflowY(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "overflowY"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412972) //= 0x80011414. The runtime will prefer the VTID if present
  @VTID(67)
  java.lang.String overflowY();


  /**
   * <p>
   * Setter method for the COM property "accelerator"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(-2147412965) //= 0x8001141b. The runtime will prefer the VTID if present
  @VTID(68)
  void accelerator(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "accelerator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147412965) //= 0x8001141b. The runtime will prefer the VTID if present
  @VTID(69)
  java.lang.String accelerator();


  // Properties:
}
