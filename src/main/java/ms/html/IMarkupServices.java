package ms.html  ;

import com4j.*;

@IID("{3050F4A0-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IMarkupServices extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type ms.html.IMarkupPointer
   */

  @VTID(3)
  ms.html.IMarkupPointer createMarkupPointer();


  /**
   * @return  Returns a value of type ms.html.IMarkupContainer
   */

  @VTID(4)
  ms.html.IMarkupContainer createMarkupContainer();


  /**
   * @param tagID Mandatory ms.html._ELEMENT_TAG_ID parameter.
   * @param pchAttributes Mandatory Holder<Short> parameter.
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @VTID(5)
  ms.html.IHTMLElement createElement(
    ms.html._ELEMENT_TAG_ID tagID,
    Holder<Short> pchAttributes);


  /**
   * @param pElemCloneThis Mandatory ms.html.IHTMLElement parameter.
   * @return  Returns a value of type ms.html.IHTMLElement
   */

  @VTID(6)
  ms.html.IHTMLElement cloneElement(
    ms.html.IHTMLElement pElemCloneThis);


  /**
   * @param pElementInsert Mandatory ms.html.IHTMLElement parameter.
   * @param pPointerStart Mandatory ms.html.IMarkupPointer parameter.
   * @param pPointerFinish Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(7)
  void insertElement(
    ms.html.IHTMLElement pElementInsert,
    ms.html.IMarkupPointer pPointerStart,
    ms.html.IMarkupPointer pPointerFinish);


  /**
   * @param pElementRemove Mandatory ms.html.IHTMLElement parameter.
   */

  @VTID(8)
  void removeElement(
    ms.html.IHTMLElement pElementRemove);


  /**
   * @param pPointerStart Mandatory ms.html.IMarkupPointer parameter.
   * @param pPointerFinish Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(9)
  void remove(
    ms.html.IMarkupPointer pPointerStart,
    ms.html.IMarkupPointer pPointerFinish);


  /**
   * @param pPointerSourceStart Mandatory ms.html.IMarkupPointer parameter.
   * @param pPointerSourceFinish Mandatory ms.html.IMarkupPointer parameter.
   * @param pPointerTarget Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(10)
  void copy(
    ms.html.IMarkupPointer pPointerSourceStart,
    ms.html.IMarkupPointer pPointerSourceFinish,
    ms.html.IMarkupPointer pPointerTarget);


  /**
   * @param pPointerSourceStart Mandatory ms.html.IMarkupPointer parameter.
   * @param pPointerSourceFinish Mandatory ms.html.IMarkupPointer parameter.
   * @param pPointerTarget Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(11)
  void move(
    ms.html.IMarkupPointer pPointerSourceStart,
    ms.html.IMarkupPointer pPointerSourceFinish,
    ms.html.IMarkupPointer pPointerTarget);


  /**
   * @param pchText Mandatory Holder<Short> parameter.
   * @param cch Mandatory int parameter.
   * @param pPointerTarget Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(12)
  void insertText(
    Holder<Short> pchText,
    int cch,
    ms.html.IMarkupPointer pPointerTarget);


  /**
   * @param pchHTML Mandatory Holder<Short> parameter.
   * @param dwFlags Mandatory int parameter.
   * @param ppPointerStart Mandatory ms.html.IMarkupPointer parameter.
   * @param ppPointerFinish Mandatory ms.html.IMarkupPointer parameter.
   * @return  Returns a value of type ms.html.IMarkupContainer
   */

  @VTID(13)
  @ReturnValue(index=2)
  ms.html.IMarkupContainer parseString(
    Holder<Short> pchHTML,
    int dwFlags,
    ms.html.IMarkupPointer ppPointerStart,
    ms.html.IMarkupPointer ppPointerFinish);


    /**
     * @param pElement Mandatory ms.html.IHTMLElement parameter.
     * @return  Returns a value of type int
     */

    @VTID(15)
    int isScopedElement(
      ms.html.IHTMLElement pElement);


    /**
     * @param pElement Mandatory ms.html.IHTMLElement parameter.
     * @return  Returns a value of type ms.html._ELEMENT_TAG_ID
     */

    @VTID(16)
    ms.html._ELEMENT_TAG_ID getElementTagId(
      ms.html.IHTMLElement pElement);


    /**
     * @param bstrName Mandatory java.lang.String parameter.
     * @return  Returns a value of type ms.html._ELEMENT_TAG_ID
     */

    @VTID(17)
    ms.html._ELEMENT_TAG_ID getTagIDForName(
      java.lang.String bstrName);


    /**
     * @param tagID Mandatory ms.html._ELEMENT_TAG_ID parameter.
     * @return  Returns a value of type java.lang.String
     */

    @VTID(18)
    java.lang.String getNameForTagID(
      ms.html._ELEMENT_TAG_ID tagID);


    /**
     * @param pIRange Mandatory ms.html.IHTMLTxtRange parameter.
     * @param pPointerStart Mandatory ms.html.IMarkupPointer parameter.
     * @param pPointerFinish Mandatory ms.html.IMarkupPointer parameter.
     */

    @VTID(19)
    void movePointersToRange(
      ms.html.IHTMLTxtRange pIRange,
      ms.html.IMarkupPointer pPointerStart,
      ms.html.IMarkupPointer pPointerFinish);


    /**
     * @param pPointerStart Mandatory ms.html.IMarkupPointer parameter.
     * @param pPointerFinish Mandatory ms.html.IMarkupPointer parameter.
     * @param pIRange Mandatory ms.html.IHTMLTxtRange parameter.
     */

    @VTID(20)
    void moveRangeToPointers(
      ms.html.IMarkupPointer pPointerStart,
      ms.html.IMarkupPointer pPointerFinish,
      ms.html.IHTMLTxtRange pIRange);


    /**
     * @param pchTitle Mandatory Holder<Short> parameter.
     */

    @VTID(21)
    void beginUndoUnit(
      Holder<Short> pchTitle);


    /**
     */

    @VTID(22)
    void endUndoUnit();


    // Properties:
  }
