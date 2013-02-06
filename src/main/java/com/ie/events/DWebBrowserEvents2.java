package com.ie.events;

import com4j.*;

/**
 * Web Browser Control events interface
 */
@IID("{34A715A0-6587-11D0-924A-0020AFC7AC4D}")
public abstract class DWebBrowserEvents2 {
  // Methods:
  /**
   * <p>
   * Statusbar text changed.
   * </p>
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(102)
  public void statusTextChange(
    java.lang.String text) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when download progress is updated.
   * </p>
   * @param progress Mandatory int parameter.
   * @param progressMax Mandatory int parameter.
   */

  @DISPID(108)
  public void progressChange(
    int progress,
    int progressMax) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * The enabled state of a command changed.
   * </p>
   * @param command Mandatory int parameter.
   * @param enable Mandatory boolean parameter.
   */

  @DISPID(105)
  public void commandStateChange(
    int command,
    boolean enable) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Download of a page started.
   * </p>
   */

  @DISPID(106)
  public void downloadBegin() {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Download of page complete.
   * </p>
   */

  @DISPID(104)
  public void downloadComplete() {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Document title changed.
   * </p>
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(113)
  public void titleChange(
    java.lang.String text) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when the PutProperty method has been called.
   * </p>
   * @param szProperty Mandatory java.lang.String parameter.
   */

  @DISPID(112)
  public void propertyChange(
    java.lang.String szProperty) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired before navigate occurs in the given WebBrowser (window or frameset element). The processing of this navigation may be modified.
   * </p>
   * @param pDisp Mandatory com4j.Com4jObject parameter.
   * @param url Mandatory java.lang.Object parameter.
   * @param flags Mandatory java.lang.Object parameter.
   * @param targetFrameName Mandatory java.lang.Object parameter.
   * @param postData Mandatory java.lang.Object parameter.
   * @param headers Mandatory java.lang.Object parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(250)
  public void beforeNavigate2(
    com4j.Com4jObject pDisp,
    java.lang.Object url,
    java.lang.Object flags,
    java.lang.Object targetFrameName,
    java.lang.Object postData,
    java.lang.Object headers,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


    /**
     * <p>
     * Fired when the document being navigated to becomes visible and enters the navigation stack.
     * </p>
     * @param pDisp Mandatory com4j.Com4jObject parameter.
     * @param url Mandatory java.lang.Object parameter.
     */

    @DISPID(252)
    public void navigateComplete2(
      com4j.Com4jObject pDisp,
      java.lang.Object url) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when the document being navigated to reaches ReadyState_Complete.
     * </p>
     * @param pDisp Mandatory com4j.Com4jObject parameter.
     * @param url Mandatory java.lang.Object parameter.
     */

    @DISPID(259)
    public void documentComplete(
      com4j.Com4jObject pDisp,
      java.lang.Object url) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when application is quiting.
     * </p>
     */

    @DISPID(253)
    public void onQuit() {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when the window should be shown/hidden
     * </p>
     * @param visible Mandatory boolean parameter.
     */

    @DISPID(254)
    public void onVisible(
      boolean visible) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when the toolbar  should be shown/hidden
     * </p>
     * @param toolBar Mandatory boolean parameter.
     */

    @DISPID(255)
    public void onToolBar(
      boolean toolBar) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when the menubar should be shown/hidden
     * </p>
     * @param menuBar Mandatory boolean parameter.
     */

    @DISPID(256)
    public void onMenuBar(
      boolean menuBar) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when the statusbar should be shown/hidden
     * </p>
     * @param statusBar Mandatory boolean parameter.
     */

    @DISPID(257)
    public void onStatusBar(
      boolean statusBar) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when fullscreen mode should be on/off
     * </p>
     * @param fullScreen Mandatory boolean parameter.
     */

    @DISPID(258)
    public void onFullScreen(
      boolean fullScreen) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when theater mode should be on/off
     * </p>
     * @param theaterMode Mandatory boolean parameter.
     */

    @DISPID(260)
    public void onTheaterMode(
      boolean theaterMode) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when the host window should allow/disallow resizing
     * </p>
     * @param resizable Mandatory boolean parameter.
     */

    @DISPID(262)
    public void windowSetResizable(
      boolean resizable) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when the host window should change its Left coordinate
     * </p>
     * @param left Mandatory int parameter.
     */

    @DISPID(264)
    public void windowSetLeft(
      int left) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when the host window should change its Top coordinate
     * </p>
     * @param top Mandatory int parameter.
     */

    @DISPID(265)
    public void windowSetTop(
      int top) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when the host window should change its width
     * </p>
     * @param width Mandatory int parameter.
     */

    @DISPID(266)
    public void windowSetWidth(
      int width) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when the host window should change its height
     * </p>
     * @param height Mandatory int parameter.
     */

    @DISPID(267)
    public void windowSetHeight(
      int height) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when the WebBrowser is about to be closed by script
     * </p>
     * @param isChildWindow Mandatory boolean parameter.
     * @param cancel Mandatory Holder<Boolean> parameter.
     */

    @DISPID(263)
    public void windowClosing(
      boolean isChildWindow,
      Holder<Boolean> cancel) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired to request client sizes be converted to host window sizes
     * </p>
     * @param cx Mandatory Holder<Integer> parameter.
     * @param cy Mandatory Holder<Integer> parameter.
     */

    @DISPID(268)
    public void clientToHostWindow(
      Holder<Integer> cx,
      Holder<Integer> cy) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired to indicate the security level of the current web page contents
     * </p>
     * @param secureLockIcon Mandatory int parameter.
     */

    @DISPID(269)
    public void setSecureLockIcon(
      int secureLockIcon) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired to indicate the File Download dialog is opening
     * </p>
     * @param activeDocument Mandatory boolean parameter.
     * @param cancel Mandatory Holder<Boolean> parameter.
     */

    @DISPID(270)
    public void fileDownload(
      boolean activeDocument,
      Holder<Boolean> cancel) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when a binding error occurs (window or frameset element).
     * </p>
     * @param pDisp Mandatory com4j.Com4jObject parameter.
     * @param url Mandatory java.lang.Object parameter.
     * @param frame Mandatory java.lang.Object parameter.
     * @param statusCode Mandatory java.lang.Object parameter.
     * @param cancel Mandatory Holder<Boolean> parameter.
     */

    @DISPID(271)
    public void navigateError(
      com4j.Com4jObject pDisp,
      java.lang.Object url,
      java.lang.Object frame,
      java.lang.Object statusCode,
      Holder<Boolean> cancel) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when a print template is instantiated.
     * </p>
     * @param pDisp Mandatory com4j.Com4jObject parameter.
     */

    @DISPID(225)
    public void printTemplateInstantiation(
      com4j.Com4jObject pDisp) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when a print template destroyed.
     * </p>
     * @param pDisp Mandatory com4j.Com4jObject parameter.
     */

    @DISPID(226)
    public void printTemplateTeardown(
      com4j.Com4jObject pDisp) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when a page is spooled. When it is fired can be changed by a custom template.
     * </p>
     * @param pDisp Mandatory com4j.Com4jObject parameter.
     * @param nPage Mandatory java.lang.Object parameter.
     * @param fDone Mandatory java.lang.Object parameter.
     */

    @DISPID(227)
    public void updatePageStatus(
      com4j.Com4jObject pDisp,
      java.lang.Object nPage,
      java.lang.Object fDone) {
          throw new UnsupportedOperationException();
    }


    /**
     * <p>
     * Fired when the global privacy impacted state changes
     * </p>
     * @param bImpacted Mandatory boolean parameter.
     */

    @DISPID(272)
    public void privacyImpactedStateChange(
      boolean bImpacted) {
          throw new UnsupportedOperationException();
    }


      /**
       * <p>
       * Fired to indicate the progress and status of the Phishing Filter analysis of the current web page
       * </p>
       * @param phishingFilterStatus Mandatory int parameter.
       */

      @DISPID(282)
      public void setPhishingFilterStatus(
        int phishingFilterStatus) {
            throw new UnsupportedOperationException();
      }


      /**
       * <p>
       * Fired to indicate that the browser window's visibility or enabled state has changed.
       * </p>
       * @param dwWindowStateFlags Mandatory int parameter.
       * @param dwValidFlagsMask Mandatory int parameter.
       */

      @DISPID(283)
      public void windowStateChanged(
        int dwWindowStateFlags,
        int dwValidFlagsMask) {
            throw new UnsupportedOperationException();
      }


      /**
       * <p>
       * A new, hidden, non-navigated process is created to handle the navigation.
       * </p>
       * @param lCauseFlag Mandatory int parameter.
       * @param pWB2 Mandatory com4j.Com4jObject parameter.
       * @param cancel Mandatory Holder<Boolean> parameter.
       */

      @DISPID(284)
      public void newProcess(
        int lCauseFlag,
        com4j.Com4jObject pWB2,
        Holder<Boolean> cancel) {
            throw new UnsupportedOperationException();
      }


      /**
       * <p>
       * Fired when a third-party URL is blocked.
       * </p>
       * @param url Mandatory java.lang.Object parameter.
       * @param dwCount Mandatory int parameter.
       */

      @DISPID(285)
      public void thirdPartyUrlBlocked(
        java.lang.Object url,
        int dwCount) {
            throw new UnsupportedOperationException();
      }


      /**
       * <p>
       * Fired when a x-domain redirect is blocked.
       * </p>
       * @param pDisp Mandatory com4j.Com4jObject parameter.
       * @param startURL Mandatory java.lang.Object parameter.
       * @param redirectURL Mandatory java.lang.Object parameter.
       * @param frame Mandatory java.lang.Object parameter.
       * @param statusCode Mandatory java.lang.Object parameter.
       */

      @DISPID(286)
      public void redirectXDomainBlocked(
        com4j.Com4jObject pDisp,
        java.lang.Object startURL,
        java.lang.Object redirectURL,
        java.lang.Object frame,
        java.lang.Object statusCode) {
            throw new UnsupportedOperationException();
      }


      /**
       * <p>
       * Fired prior to the first script execution.
       * </p>
       * @param pDispWindow Mandatory com4j.Com4jObject parameter.
       */

      @DISPID(290)
      public void beforeScriptExecute(
        com4j.Com4jObject pDispWindow) {
            throw new UnsupportedOperationException();
      }


      /**
       * <p>
       * Fired after a Web Worker has been started.
       * </p>
       * @param dwUniqueID Mandatory int parameter.
       * @param bstrWorkerLabel Mandatory java.lang.String parameter.
       */

      @DISPID(288)
      public void webWorkerStarted(
        int dwUniqueID,
        java.lang.String bstrWorkerLabel) {
            throw new UnsupportedOperationException();
      }


      /**
       * <p>
       * Fired after a Web Worker has closed
       * </p>
       * @param dwUniqueID Mandatory int parameter.
       */

      @DISPID(289)
      public void webWorkerFinsihed(
        int dwUniqueID) {
            throw new UnsupportedOperationException();
      }


      // Properties:
    }
