package ms.html  ;

import com4j.*;

@IID("{305106E2-98B5-11CF-BB82-00AA00BDCE0B}")
public interface ISurfacePresenter extends Com4jObject {
  // Methods:
    /**
     * @param backBufferIndex Mandatory int parameter.
     * @param riid Mandatory GUID parameter.
     * @return  Returns a value of type java.nio.Buffer
     */

    @VTID(4)
    java.nio.Buffer getBuffer(
      int backBufferIndex,
      GUID riid);


    /**
     * @return  Returns a value of type int
     */

    @VTID(5)
    int isCurrent();


    // Properties:
  }
