package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispTreeWalker extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "root"
   * </p>
   */

  @DISPID(1000)
  @PropGet
  com4j.Com4jObject root();


  /**
   * <p>
   * Getter method for the COM property "whatToShow"
   * </p>
   */

  @DISPID(1001)
  @PropGet
  int whatToShow();


  /**
   * <p>
   * Getter method for the COM property "filter"
   * </p>
   */

  @DISPID(1002)
  @PropGet
  com4j.Com4jObject filter();


  /**
   * <p>
   * Getter method for the COM property "expandEntityReferences"
   * </p>
   */

  @DISPID(1003)
  @PropGet
  boolean expandEntityReferences();


  /**
   * <p>
   * Setter method for the COM property "currentNode"
   * </p>
   * @param rhs Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1020)
  @PropPut
  void currentNode(
    com4j.Com4jObject rhs);


  /**
   * <p>
   * Getter method for the COM property "currentNode"
   * </p>
   */

  @DISPID(1020)
  @PropGet
  com4j.Com4jObject currentNode();


  /**
   */

  @DISPID(1021)
  com4j.Com4jObject parentNode();


  /**
   */

  @DISPID(1022)
  com4j.Com4jObject firstChild();


  /**
   */

  @DISPID(1023)
  com4j.Com4jObject lastChild();


  /**
   */

  @DISPID(1024)
  com4j.Com4jObject previousSibling();


  /**
   */

  @DISPID(1025)
  com4j.Com4jObject nextSibling();


  /**
   */

  @DISPID(1026)
  com4j.Com4jObject previousNode();


  /**
   */

  @DISPID(1027)
  com4j.Com4jObject nextNode();


  // Properties:
}
