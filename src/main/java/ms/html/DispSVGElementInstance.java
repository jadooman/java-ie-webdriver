package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispSVGElementInstance extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "correspondingElement"
   * </p>
   */

  @DISPID(1000)
  @PropGet
  ms.html.ISVGElement correspondingElement();


  /**
   * <p>
   * Getter method for the COM property "correspondingUseElement"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  ms.html.ISVGUseElement correspondingUseElement();


  /**
   * <p>
   * Getter method for the COM property "parentNode"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  ms.html.ISVGElementInstance parentNode();


  /**
   * <p>
   * Getter method for the COM property "childNodes"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  ms.html.ISVGElementInstanceList childNodes();


  /**
   * <p>
   * Getter method for the COM property "firstChild"
   * </p>
   */

  @DISPID(1004)
  @PropGet
  ms.html.ISVGElementInstance firstChild();


  /**
   * <p>
   * Getter method for the COM property "lastChild"
   * </p>
   */

  @DISPID(1005)
  @PropGet
  ms.html.ISVGElementInstance lastChild();


  /**
   * <p>
   * Getter method for the COM property "previousSibling"
   * </p>
   */

  @DISPID(1006)
  @PropGet
  ms.html.ISVGElementInstance previousSibling();


  /**
   * <p>
   * Getter method for the COM property "nextSibling"
   * </p>
   */

  @DISPID(1007)
  @PropGet
  ms.html.ISVGElementInstance nextSibling();


  /**
   * @param type Mandatory java.lang.String parameter.
   * @param listener Mandatory com4j.Com4jObject parameter.
   * @param useCapture Mandatory boolean parameter.
   */

  @DISPID(-2147417602)
  void addEventListener(
    java.lang.String type,
    com4j.Com4jObject listener,
    boolean useCapture);


  /**
   * @param type Mandatory java.lang.String parameter.
   * @param listener Mandatory com4j.Com4jObject parameter.
   * @param useCapture Mandatory boolean parameter.
   */

  @DISPID(-2147417601)
  void removeEventListener(
    java.lang.String type,
    com4j.Com4jObject listener,
    boolean useCapture);


  /**
   * @param evt Mandatory ms.html.IDOMEvent parameter.
   */

  @DISPID(-2147417600)
  boolean dispatchEvent(
    ms.html.IDOMEvent evt);


  // Properties:
}
