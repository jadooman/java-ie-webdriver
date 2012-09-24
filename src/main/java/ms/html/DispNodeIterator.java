package ms.html  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DispNodeIterator extends Com4jObject {
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
   */

  @DISPID(1010)
  com4j.Com4jObject nextNode();


  /**
   */

  @DISPID(1011)
  com4j.Com4jObject previousNode();


  /**
   */

  @DISPID(1012)
  void detach();


  // Properties:
}
