package ms.html  ;

import com4j.*;

@IID("{305106E1-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IViewObjectPresentSite extends Com4jObject {
  // Methods:
  /**
   * @param pDevice Mandatory com4j.Com4jObject parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @param backBufferCount Mandatory int parameter.
   * @param format Mandatory ms.html.DXGI_FORMAT parameter.
   * @param mode Mandatory ms.html._VIEW_OBJECT_ALPHA_MODE parameter.
   * @return  Returns a value of type ms.html.ISurfacePresenter
   */

  @VTID(3)
  ms.html.ISurfacePresenter createSurfacePresenter(
    com4j.Com4jObject pDevice,
    int width,
    int height,
    int backBufferCount,
    ms.html.DXGI_FORMAT format,
    ms.html._VIEW_OBJECT_ALPHA_MODE mode);


  /**
   * @return  Returns a value of type int
   */

  @VTID(4)
  int isHardwareComposition();


  /**
   * @param mode Mandatory ms.html._VIEW_OBJECT_COMPOSITION_MODE parameter.
   */

  @VTID(5)
  void setCompositionMode(
    ms.html._VIEW_OBJECT_COMPOSITION_MODE mode);


  // Properties:
}
