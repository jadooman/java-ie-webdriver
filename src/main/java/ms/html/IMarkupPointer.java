package ms.html  ;

import com4j.*;

@IID("{3050F49F-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IMarkupPointer extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type ms.html.IHTMLDocument2
   */

  @VTID(3)
  ms.html.IHTMLDocument2 owningDoc();


  /**
   * @return  Returns a value of type ms.html._POINTER_GRAVITY
   */

  @VTID(4)
  ms.html._POINTER_GRAVITY gravity();


  /**
   * @param gravity Mandatory ms.html._POINTER_GRAVITY parameter.
   */

  @VTID(5)
  void setGravity(
    ms.html._POINTER_GRAVITY gravity);


  /**
   * @return  Returns a value of type int
   */

  @VTID(6)
  int cling();


  /**
   * @param fCLing Mandatory int parameter.
   */

  @VTID(7)
  void setCling(
    int fCLing);


  /**
   */

  @VTID(8)
  void unposition();


  /**
   * @return  Returns a value of type int
   */

  @VTID(9)
  int isPositioned();


  /**
   * @return  Returns a value of type ms.html.IMarkupContainer
   */

  @VTID(10)
  ms.html.IMarkupContainer getContainer();


  /**
   * @param pElement Mandatory ms.html.IHTMLElement parameter.
   * @param eAdj Mandatory ms.html._ELEMENT_ADJACENCY parameter.
   */

  @VTID(11)
  void moveAdjacentToElement(
    ms.html.IHTMLElement pElement,
    ms.html._ELEMENT_ADJACENCY eAdj);


  /**
   * @param pPointer Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(12)
  void moveToPointer(
    ms.html.IMarkupPointer pPointer);


  /**
   * @param pContainer Mandatory ms.html.IMarkupContainer parameter.
   * @param fAtStart Mandatory int parameter.
   */

  @VTID(13)
  void moveToContainer(
    ms.html.IMarkupContainer pContainer,
    int fAtStart);


  /**
   * @param fMove Mandatory int parameter.
   * @param pContext Mandatory Holder<ms.html._MARKUP_CONTEXT_TYPE> parameter.
   * @param ppElement Mandatory Holder<ms.html.IHTMLElement> parameter.
   * @param pcch Mandatory Holder<Integer> parameter.
   * @param pchText Mandatory Holder<Short> parameter.
   */

  @VTID(14)
  void left(
    int fMove,
    Holder<ms.html._MARKUP_CONTEXT_TYPE> pContext,
    Holder<ms.html.IHTMLElement> ppElement,
    Holder<Integer> pcch,
    Holder<Short> pchText);


  /**
   * @param fMove Mandatory int parameter.
   * @param pContext Mandatory Holder<ms.html._MARKUP_CONTEXT_TYPE> parameter.
   * @param ppElement Mandatory Holder<ms.html.IHTMLElement> parameter.
   * @param pcch Mandatory Holder<Integer> parameter.
   * @param pchText Mandatory Holder<Short> parameter.
   */

  @VTID(15)
  void right(
    int fMove,
    Holder<ms.html._MARKUP_CONTEXT_TYPE> pContext,
    Holder<ms.html.IHTMLElement> ppElement,
    Holder<Integer> pcch,
    Holder<Short> pchText);


  /**
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @VTID(16)
  ms.html.IHTMLElement currentScope();


  /**
   * @param pPointerThat Mandatory ms.html.IMarkupPointer parameter.
   * @return  Returns a value of type int
   */

  @VTID(17)
  int isLeftOf(
    ms.html.IMarkupPointer pPointerThat);


  /**
   * @param pPointerThat Mandatory ms.html.IMarkupPointer parameter.
   * @return  Returns a value of type int
   */

  @VTID(18)
  int isLeftOfOrEqualTo(
    ms.html.IMarkupPointer pPointerThat);


  /**
   * @param pPointerThat Mandatory ms.html.IMarkupPointer parameter.
   * @return  Returns a value of type int
   */

  @VTID(19)
  int isRightOf(
    ms.html.IMarkupPointer pPointerThat);


  /**
   * @param pPointerThat Mandatory ms.html.IMarkupPointer parameter.
   * @return  Returns a value of type int
   */

  @VTID(20)
  int isRightOfOrEqualTo(
    ms.html.IMarkupPointer pPointerThat);


  /**
   * @param pPointerThat Mandatory ms.html.IMarkupPointer parameter.
   * @return  Returns a value of type int
   */

  @VTID(21)
  int isEqualTo(
    ms.html.IMarkupPointer pPointerThat);


  /**
   * @param muAction Mandatory ms.html._MOVEUNIT_ACTION parameter.
   */

  @VTID(22)
  void moveUnit(
    ms.html._MOVEUNIT_ACTION muAction);


  /**
   * @param pchFindText Mandatory java.lang.String parameter.
   * @param dwFlags Mandatory int parameter.
   * @param pIEndMatch Mandatory ms.html.IMarkupPointer parameter.
   * @param pIEndSearch Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(23)
  void findText(
    @MarshalAs(NativeType.Unicode) java.lang.String pchFindText,
    int dwFlags,
    ms.html.IMarkupPointer pIEndMatch,
    ms.html.IMarkupPointer pIEndSearch);


  // Properties:
}
