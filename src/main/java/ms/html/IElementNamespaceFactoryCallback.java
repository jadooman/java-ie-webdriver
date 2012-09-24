package ms.html  ;

import com4j.*;

@IID("{3050F7FD-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IElementNamespaceFactoryCallback extends Com4jObject {
  // Methods:
  /**
   * @param bstrNamespace Mandatory java.lang.String parameter.
   * @param bstrTagName Mandatory java.lang.String parameter.
   * @param bstrAttrs Mandatory java.lang.String parameter.
   * @param pNamespace Mandatory ms.html.IElementNamespace parameter.
   */

  @VTID(3)
  void resolve(
    java.lang.String bstrNamespace,
    java.lang.String bstrTagName,
    java.lang.String bstrAttrs,
    ms.html.IElementNamespace pNamespace);


  // Properties:
}
