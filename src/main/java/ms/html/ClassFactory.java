package ms.html  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  public static ms.html.DispHTMLWindowProxy createHTMLWindowProxy() {
    return COM4J.createInstance( ms.html.DispHTMLWindowProxy.class, "{3050F391-98B5-11CF-BB82-00AA00BDCE0B}" );
  }

  public static ms.html.DispHTMLDocument createHTMLDocument() {
    return COM4J.createInstance( ms.html.DispHTMLDocument.class, "{25336920-03F9-11CF-8FD0-00AA00686F13}" );
  }

  public static ms.html.IWebBridge createScriptlet() {
    return COM4J.createInstance( ms.html.IWebBridge.class, "{AE24FDAE-03C6-11D1-8B76-0080C744F389}" );
  }

  public static ms.html.ITemplatePrinter3 createCTemplatePrinter() {
    return COM4J.createInstance( ms.html.ITemplatePrinter3.class, "{3050F6B3-98B5-11CF-BB82-00AA00BDCE0B}" );
  }

  public static ms.html.IClientCaps createCClientCaps() {
    return COM4J.createInstance( ms.html.IClientCaps.class, "{7E8BC44E-AEFF-11D1-89C2-00C04FB6BFC4}" );
  }

  public static ms.html.DispHTMLPopup createHTMLPopup() {
    return COM4J.createInstance( ms.html.DispHTMLPopup.class, "{3050F667-98B5-11CF-BB82-00AA00BDCE0B}" );
  }
}
