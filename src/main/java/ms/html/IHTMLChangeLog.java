package ms.html  ;

import com4j.*;

@IID("{3050F649-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IHTMLChangeLog extends Com4jObject {
  // Methods:
  /**
   * @param pbBuffer Mandatory Holder<Byte> parameter.
   * @param nBufferSize Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(3)
  int getNextChange(
    Holder<Byte> pbBuffer,
    int nBufferSize);


  // Properties:
}
