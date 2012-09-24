package ms.html  ;

import com4j.*;

@IID("{30510761-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IDOMDragEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "dataTransfer"
   * </p>
   * @return  Returns a value of type ms.html.IHTMLDataTransfer
   */

  @DISPID(1401) //= 0x579. The runtime will prefer the VTID if present
  @VTID(7)
  ms.html.IHTMLDataTransfer dataTransfer();


  /**
   * @param eventType Mandatory java.lang.String parameter.
   * @param canBubble Mandatory boolean parameter.
   * @param cancelable Mandatory boolean parameter.
   * @param viewArg Mandatory ms.html.IHTMLWindow2 parameter.
   * @param detailArg Mandatory int parameter.
   * @param screenXArg Mandatory int parameter.
   * @param screenYArg Mandatory int parameter.
   * @param clientXArg Mandatory int parameter.
   * @param clientYArg Mandatory int parameter.
   * @param ctrlKeyArg Mandatory boolean parameter.
   * @param altKeyArg Mandatory boolean parameter.
   * @param shiftKeyArg Mandatory boolean parameter.
   * @param metaKeyArg Mandatory boolean parameter.
   * @param buttonArg Mandatory short parameter.
   * @param relatedTargetArg Mandatory ms.html.IEventTarget parameter.
   * @param dataTransferArg Mandatory ms.html.IHTMLDataTransfer parameter.
   */

  @DISPID(1402) //= 0x57a. The runtime will prefer the VTID if present
  @VTID(8)
  void initDragEvent(
    java.lang.String eventType,
    boolean canBubble,
    boolean cancelable,
    ms.html.IHTMLWindow2 viewArg,
    int detailArg,
    int screenXArg,
    int screenYArg,
    int clientXArg,
    int clientYArg,
    boolean ctrlKeyArg,
    boolean altKeyArg,
    boolean shiftKeyArg,
    boolean metaKeyArg,
    short buttonArg,
    ms.html.IEventTarget relatedTargetArg,
    ms.html.IHTMLDataTransfer dataTransferArg);


  // Properties:
}
