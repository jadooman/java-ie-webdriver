package ms.html  ;

import com4j.*;

@IID("{3050F69D-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDisplayServices extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type ms.html.IDisplayPointer
   */

  @VTID(3)
  ms.html.IDisplayPointer createDisplayPointer();


      /**
       * @return  Returns a value of type ms.html.IHTMLCaret
       */

      @VTID(6)
      ms.html.IHTMLCaret getCaret();


      /**
       * @param pPointer Mandatory ms.html.IMarkupPointer parameter.
       * @return  Returns a value of type ms.html.IHTMLComputedStyle
       */

      @VTID(7)
      ms.html.IHTMLComputedStyle getComputedStyle(
        ms.html.IMarkupPointer pPointer);


        /**
         * @param pIElement Mandatory ms.html.IHTMLElement parameter.
         * @return  Returns a value of type int
         */

        @VTID(9)
        int hasFlowLayout(
          ms.html.IHTMLElement pIElement);


        // Properties:
      }
