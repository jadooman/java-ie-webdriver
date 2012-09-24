package ms.html  ;

import com4j.*;

@IID("{3050F670-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IElementNamespaceTable extends Com4jObject {
  // Methods:
  /**
   * @param bstrNamespace Mandatory java.lang.String parameter.
   * @param bstrUrn Mandatory java.lang.String parameter.
   * @param lFlags Mandatory int parameter.
   * @param pvarFactory Mandatory java.lang.Object parameter.
   */

  @VTID(3)
  void addNamespace(
    java.lang.String bstrNamespace,
    java.lang.String bstrUrn,
    int lFlags,
    java.lang.Object pvarFactory);


  // Properties:
}
