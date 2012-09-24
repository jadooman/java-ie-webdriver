package ms.ie.events;

import com4j.*;

@IID("{55136806-B2DE-11D1-B9F2-00A0C98BC547}")
public abstract class DShellNameSpaceEvents {
  // Methods:
  /**
   * @param cItems Mandatory int parameter.
   * @param hItem Mandatory int parameter.
   * @param strName Mandatory java.lang.String parameter.
   * @param strUrl Mandatory java.lang.String parameter.
   * @param cVisits Mandatory int parameter.
   * @param strDate Mandatory java.lang.String parameter.
   * @param fAvailableOffline Mandatory int parameter.
   */

  @DISPID(1)
  public void favoritesSelectionChange(
    int cItems,
    int hItem,
    java.lang.String strName,
    java.lang.String strUrl,
    int cVisits,
    java.lang.String strDate,
    int fAvailableOffline) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(2)
  public void selectionChange() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(3)
  public void doubleClick() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(4)
  public void initialized() {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
