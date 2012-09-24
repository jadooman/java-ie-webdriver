package ms.html  ;

import com4j.*;

@IID("{3050F6A7-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLPaintSite extends Com4jObject {
  // Methods:
  /**
   */

  @VTID(3)
  void invalidatePainterInfo();


    /**
     * @param rgnInvalid Mandatory int parameter.
     */

    @VTID(5)
    void invalidateRegion(
      int rgnInvalid);


    /**
     * @return  Returns a value of type int
     */

    @VTID(9)
    int getHitTestCookie();


    // Properties:
  }
