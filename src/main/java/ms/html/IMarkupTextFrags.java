package ms.html  ;

import com4j.*;

@IID("{3050F5FA-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IMarkupTextFrags extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type int
   */

  @VTID(3)
  int getTextFragCount();


  /**
   * @param iFrag Mandatory int parameter.
   * @param pPointerFrag Mandatory ms.html.IMarkupPointer parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(4)
  @ReturnValue(index=1)
  java.lang.String getTextFrag(
    int iFrag,
    ms.html.IMarkupPointer pPointerFrag);


  /**
   * @param iFrag Mandatory int parameter.
   */

  @VTID(5)
  void removeTextFrag(
    int iFrag);


  /**
   * @param iFrag Mandatory int parameter.
   * @param bstrInsert Mandatory java.lang.String parameter.
   * @param pPointerInsert Mandatory ms.html.IMarkupPointer parameter.
   */

  @VTID(6)
  void insertTextFrag(
    int iFrag,
    java.lang.String bstrInsert,
    ms.html.IMarkupPointer pPointerInsert);


  /**
   * @param pPointerFind Mandatory ms.html.IMarkupPointer parameter.
   * @param piFrag Mandatory Holder<Integer> parameter.
   * @param pfFragFound Mandatory Holder<Integer> parameter.
   */

  @VTID(7)
  void findTextFragFromMarkupPointer(
    ms.html.IMarkupPointer pPointerFind,
    Holder<Integer> piFrag,
    Holder<Integer> pfFragFound);


  // Properties:
}
