package com.ie.events;

import com4j.*;

/**
 * Web Browser Control Events (old)
 */
@IID("{EAB22AC2-30C1-11CF-A7EB-0000C05BAE0B}")
public abstract class DWebBrowserEvents {
  // Methods:
  /**
   * <p>
   * Fired when a new hyperlink is being navigated to.
   * </p>
   * @param url Mandatory java.lang.String parameter.
   * @param flags Mandatory int parameter.
   * @param targetFrameName Mandatory java.lang.String parameter.
   * @param postData Mandatory java.lang.Object parameter.
   * @param headers Mandatory java.lang.String parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(100)
  public void beforeNavigate(
    java.lang.String url,
    int flags,
    java.lang.String targetFrameName,
    java.lang.Object postData,
    java.lang.String headers,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when the document being navigated to becomes visible and enters the navigation stack.
   * </p>
   * @param url Mandatory java.lang.String parameter.
   */

  @DISPID(101)
  public void navigateComplete(
    java.lang.String url) {
        throw new UnsupportedOperationException();
  }


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
   * Download of page complete.
   * </p>
   */

  @DISPID(104)
  public void downloadComplete() {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * The enabled state of a command changed
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
   * Fired when a new window should be created.
   * </p>
   * @param url Mandatory java.lang.String parameter.
   * @param flags Mandatory int parameter.
   * @param targetFrameName Mandatory java.lang.String parameter.
   * @param postData Mandatory java.lang.Object parameter.
   * @param headers Mandatory java.lang.String parameter.
   * @param processed Mandatory Holder<Boolean> parameter.
   */

  @DISPID(107)
  public void newWindow(
    java.lang.String url,
    int flags,
    java.lang.String targetFrameName,
    java.lang.Object postData,
    java.lang.String headers,
    Holder<Boolean> processed) {
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
   * Fired when a new hyperlink is being navigated to in a frame.
   * </p>
   * @param url Mandatory java.lang.String parameter.
   * @param flags Mandatory int parameter.
   * @param targetFrameName Mandatory java.lang.String parameter.
   * @param postData Mandatory java.lang.Object parameter.
   * @param headers Mandatory java.lang.String parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(200)
  public void frameBeforeNavigate(
    java.lang.String url,
    int flags,
    java.lang.String targetFrameName,
    java.lang.Object postData,
    java.lang.String headers,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when a new hyperlink is being navigated to in a frame.
   * </p>
   * @param url Mandatory java.lang.String parameter.
   */

  @DISPID(201)
  public void frameNavigateComplete(
    java.lang.String url) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when a new window should be created.
   * </p>
   * @param url Mandatory java.lang.String parameter.
   * @param flags Mandatory int parameter.
   * @param targetFrameName Mandatory java.lang.String parameter.
   * @param postData Mandatory java.lang.Object parameter.
   * @param headers Mandatory java.lang.String parameter.
   * @param processed Mandatory Holder<Boolean> parameter.
   */

  @DISPID(204)
  public void frameNewWindow(
    java.lang.String url,
    int flags,
    java.lang.String targetFrameName,
    java.lang.Object postData,
    java.lang.String headers,
    Holder<Boolean> processed) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when application is quiting.
   * </p>
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(103)
  public void quit(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when window has been moved.
   * </p>
   */

  @DISPID(109)
  public void windowMove() {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when window has been sized.
   * </p>
   */

  @DISPID(110)
  public void windowResize() {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when window has been activated.
   * </p>
   */

  @DISPID(111)
  public void windowActivate() {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when the PutProperty method has been called.
   * </p>
   * @param property Mandatory java.lang.String parameter.
   */

  @DISPID(112)
  public void propertyChange(
    java.lang.String property) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
