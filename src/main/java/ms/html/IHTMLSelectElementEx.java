package ms.html  ;

import com4j.*;

@IID("{3050F2D1-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLSelectElementEx extends Com4jObject {
  // Methods:
  /**
   * @param fShow Mandatory int parameter.
   */

  @VTID(3)
  void showDropdown(
    int fShow);


  /**
   * @param lFlags Mandatory int parameter.
   */

  @VTID(4)
  void setSelectExFlags(
    int lFlags);


  /**
   * @return  Returns a value of type int
   */

  @VTID(5)
  int getSelectExFlags();


  /**
   * @return  Returns a value of type int
   */

  @VTID(6)
  int getDropdownOpen();


  // Properties:
}
