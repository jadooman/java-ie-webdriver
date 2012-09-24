package ms.html  ;

import com4j.*;

@IID("{3050F6B4-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ITemplatePrinter extends Com4jObject {
  // Methods:
  /**
   * @param bstrTitle Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  boolean startDoc(
    java.lang.String bstrTitle);


  /**
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void stopDoc();


  /**
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void printBlankPage();


  /**
   * @param pElemDisp Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void printPage(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pElemDisp);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  boolean ensurePrintDialogDefaults();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  boolean showPrintDialog();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  boolean showPageSetupDialog();


  /**
   * @param pMarkup Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  boolean printNonNative(
    com4j.Com4jObject pMarkup);


  /**
   * @param pMarkup Mandatory com4j.Com4jObject parameter.
   * @param fActiveFrame Mandatory boolean parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  void printNonNativeFrames(
    com4j.Com4jObject pMarkup,
    boolean fActiveFrame);


  /**
   * <p>
   * Setter method for the COM property "framesetDocument"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  void framesetDocument(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "framesetDocument"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  boolean framesetDocument();


  /**
   * <p>
   * Setter method for the COM property "frameActive"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(18)
  void frameActive(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "frameActive"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(19)
  boolean frameActive();


  /**
   * <p>
   * Setter method for the COM property "frameAsShown"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(20)
  void frameAsShown(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "frameAsShown"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(21)
  boolean frameAsShown();


  /**
   * <p>
   * Setter method for the COM property "selection"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(22)
  void selection(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "selection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(23)
  boolean selection();


  /**
   * <p>
   * Setter method for the COM property "selectedPages"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(24)
  void selectedPages(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "selectedPages"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(25)
  boolean selectedPages();


  /**
   * <p>
   * Setter method for the COM property "currentPage"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(26)
  void currentPage(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "currentPage"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(27)
  boolean currentPage();


  /**
   * <p>
   * Setter method for the COM property "currentPageAvail"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(28)
  void currentPageAvail(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "currentPageAvail"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(29)
  boolean currentPageAvail();


  /**
   * <p>
   * Setter method for the COM property "collate"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(30)
  void collate(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "collate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(31)
  boolean collate();


  /**
   * <p>
   * Getter method for the COM property "duplex"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(32)
  boolean duplex();


  /**
   * <p>
   * Setter method for the COM property "copies"
   * </p>
   * @param p Mandatory short parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(33)
  void copies(
    short p);


  /**
   * <p>
   * Getter method for the COM property "copies"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(34)
  short copies();


  /**
   * <p>
   * Setter method for the COM property "pageFrom"
   * </p>
   * @param p Mandatory short parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(35)
  void pageFrom(
    short p);


  /**
   * <p>
   * Getter method for the COM property "pageFrom"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(36)
  short pageFrom();


  /**
   * <p>
   * Setter method for the COM property "pageTo"
   * </p>
   * @param p Mandatory short parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(37)
  void pageTo(
    short p);


  /**
   * <p>
   * Getter method for the COM property "pageTo"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(38)
  short pageTo();


  /**
   * <p>
   * Setter method for the COM property "tableOfLinks"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(39)
  void tableOfLinks(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "tableOfLinks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(40)
  boolean tableOfLinks();


  /**
   * <p>
   * Setter method for the COM property "allLinkedDocuments"
   * </p>
   * @param p Mandatory boolean parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(41)
  void allLinkedDocuments(
    boolean p);


  /**
   * <p>
   * Getter method for the COM property "allLinkedDocuments"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(42)
  boolean allLinkedDocuments();


  /**
   * <p>
   * Setter method for the COM property "header"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(43)
  void header(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "header"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String header();


  /**
   * <p>
   * Setter method for the COM property "footer"
   * </p>
   * @param p Mandatory java.lang.String parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(45)
  void footer(
    java.lang.String p);


  /**
   * <p>
   * Getter method for the COM property "footer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(46)
  java.lang.String footer();


  /**
   * <p>
   * Setter method for the COM property "marginLeft"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(47)
  void marginLeft(
    int p);


  /**
   * <p>
   * Getter method for the COM property "marginLeft"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(48)
  int marginLeft();


  /**
   * <p>
   * Setter method for the COM property "marginRight"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(49)
  void marginRight(
    int p);


  /**
   * <p>
   * Getter method for the COM property "marginRight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(50)
  int marginRight();


  /**
   * <p>
   * Setter method for the COM property "marginTop"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(51)
  void marginTop(
    int p);


  /**
   * <p>
   * Getter method for the COM property "marginTop"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(52)
  int marginTop();


  /**
   * <p>
   * Setter method for the COM property "marginBottom"
   * </p>
   * @param p Mandatory int parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(53)
  void marginBottom(
    int p);


  /**
   * <p>
   * Getter method for the COM property "marginBottom"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(54)
  int marginBottom();


  /**
   * <p>
   * Getter method for the COM property "pageWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(55)
  int pageWidth();


  /**
   * <p>
   * Getter method for the COM property "pageHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(56)
  int pageHeight();


  /**
   * <p>
   * Getter method for the COM property "unprintableLeft"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(57)
  int unprintableLeft();


  /**
   * <p>
   * Getter method for the COM property "unprintableTop"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(58)
  int unprintableTop();


  /**
   * <p>
   * Getter method for the COM property "unprintableRight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(59)
  int unprintableRight();


  /**
   * <p>
   * Getter method for the COM property "unprintableBottom"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(60)
  int unprintableBottom();


  /**
   * @param p Mandatory Holder<Integer> parameter.
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(61)
  void updatePageStatus(
    Holder<Integer> p);


  // Properties:
}
