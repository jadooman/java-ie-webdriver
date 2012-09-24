package ms.ie  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * WebBrowser Control
   */
  public static ms.ie.IWebBrowser createWebBrowser_V1() {
    return COM4J.createInstance( ms.ie.IWebBrowser.class, "{EAB22AC3-30C1-11CF-A7EB-0000C05BAE0B}" );
  }

  /**
   * WebBrowser Control
   */
  public static ms.ie.IWebBrowser2 createWebBrowser() {
    return COM4J.createInstance( ms.ie.IWebBrowser2.class, "{8856F961-340A-11D0-A96B-00C04FD705A2}" );
  }

  /**
   * Internet Explorer Application.
   */
  public static ms.ie.IWebBrowser2 createInternetExplorer() {
    return COM4J.createInstance( ms.ie.IWebBrowser2.class, "{0002DF01-0000-0000-C000-000000000046}" );
  }

  /**
   * Internet Explorer Application with default integrity of Medium
   */
  public static ms.ie.IWebBrowser2 createInternetExplorerMedium() {
    return COM4J.createInstance( ms.ie.IWebBrowser2.class, "{D5E8041D-920F-45E9-B8FB-B1DEB82C6E5E}" );
  }

  /**
   * ShellDispatch Load in Shell Context
   */
  public static ms.ie.IShellWindows createShellWindows() {
    return COM4J.createInstance( ms.ie.IShellWindows.class, "{9BA05972-F6A8-11CF-A442-00A0C90A8F39}" );
  }

  public static ms.ie.IShellUIHelper3 createShellUIHelper() {
    return COM4J.createInstance( ms.ie.IShellUIHelper3.class, "{64AB4BB7-111E-11D1-8F79-00C04FC2FBE1}" );
  }

  public static ms.ie.IShellNameSpace createShellNameSpace() {
    return COM4J.createInstance( ms.ie.IShellNameSpace.class, "{55136805-B2DE-11D1-B9F2-00A0C98BC547}" );
  }
}
