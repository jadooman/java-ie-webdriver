package ms.html  ;

import com4j.*;

@IID("{3050F69E-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDisplayPointer extends Com4jObject {
  // Methods:
    /**
     * @param eMoveUnit Mandatory ms.html._DISPLAY_MOVEUNIT parameter.
     * @param lXPos Mandatory int parameter.
     */

    @VTID(4)
    void moveUnit(
      ms.html._DISPLAY_MOVEUNIT eMoveUnit,
      int lXPos);


    /**
     * @param pMarkupPointer Mandatory ms.html.IMarkupPointer parameter.
     */

    @VTID(5)
    void positionMarkupPointer(
      ms.html.IMarkupPointer pMarkupPointer);


    /**
     * @param pDispPointer Mandatory ms.html.IDisplayPointer parameter.
     */

    @VTID(6)
    void moveToPointer(
      ms.html.IDisplayPointer pDispPointer);


    /**
     * @param eGravity Mandatory ms.html._POINTER_GRAVITY parameter.
     */

    @VTID(7)
    void setPointerGravity(
      ms.html._POINTER_GRAVITY eGravity);


    /**
     * @return  Returns a value of type ms.html._POINTER_GRAVITY
     */

    @VTID(8)
    ms.html._POINTER_GRAVITY getPointerGravity();


    /**
     * @param eGravity Mandatory ms.html._DISPLAY_GRAVITY parameter.
     */

    @VTID(9)
    void setDisplayGravity(
      ms.html._DISPLAY_GRAVITY eGravity);


    /**
     * @return  Returns a value of type ms.html._DISPLAY_GRAVITY
     */

    @VTID(10)
    ms.html._DISPLAY_GRAVITY getDisplayGravity();


    /**
     * @return  Returns a value of type int
     */

    @VTID(11)
    int isPositioned();


    /**
     */

    @VTID(12)
    void unposition();


    /**
     * @param pDispPointer Mandatory ms.html.IDisplayPointer parameter.
     * @return  Returns a value of type int
     */

    @VTID(13)
    int isEqualTo(
      ms.html.IDisplayPointer pDispPointer);


    /**
     * @param pDispPointer Mandatory ms.html.IDisplayPointer parameter.
     * @return  Returns a value of type int
     */

    @VTID(14)
    int isLeftOf(
      ms.html.IDisplayPointer pDispPointer);


    /**
     * @param pDispPointer Mandatory ms.html.IDisplayPointer parameter.
     * @return  Returns a value of type int
     */

    @VTID(15)
    int isRightOf(
      ms.html.IDisplayPointer pDispPointer);


    /**
     * @return  Returns a value of type int
     */

    @VTID(16)
    int isAtBOL();


    /**
     * @param pPointer Mandatory ms.html.IMarkupPointer parameter.
     * @param pDispLineContext Mandatory ms.html.IDisplayPointer parameter.
     */

    @VTID(17)
    void moveToMarkupPointer(
      ms.html.IMarkupPointer pPointer,
      ms.html.IDisplayPointer pDispLineContext);


    /**
     */

    @VTID(18)
    void scrollIntoView();


    /**
     * @return  Returns a value of type ms.html.ILineInfo
     */

    @VTID(19)
    ms.html.ILineInfo getLineInfo();


    /**
     * @return  Returns a value of type ms.html.IHTMLElement
     */

    @VTID(20)
    ms.html.IHTMLElement getFlowElement();


    /**
     * @return  Returns a value of type int
     */

    @VTID(21)
    int queryBreaks();


    // Properties:
  }
