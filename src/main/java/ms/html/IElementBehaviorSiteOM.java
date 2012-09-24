package ms.html  ;

import com4j.*;

@IID("{3050F489-98B5-11CF-BB82-00AA00BDCE0B}")
public interface IElementBehaviorSiteOM extends Com4jObject {
  // Methods:
  /**
   * @param pchEvent Mandatory java.lang.String parameter.
   * @param lFlags Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(3)
  int registerEvent(
    @MarshalAs(NativeType.Unicode) java.lang.String pchEvent,
    int lFlags);


  /**
   * @param pchEvent Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @VTID(4)
  int getEventCookie(
    @MarshalAs(NativeType.Unicode) java.lang.String pchEvent);


  /**
   * @param lCookie Mandatory int parameter.
   * @param pEventObject Mandatory ms.html.IHTMLEventObj parameter.
   */

  @VTID(5)
  void fireEvent(
    int lCookie,
    ms.html.IHTMLEventObj pEventObject);


  /**
   * @return  Returns a value of type ms.html.IHTMLEventObj
   */

  @VTID(6)
  ms.html.IHTMLEventObj createEventObject();


  /**
   * @param pchName Mandatory java.lang.String parameter.
   */

  @VTID(7)
  void registerName(
    @MarshalAs(NativeType.Unicode) java.lang.String pchName);


  /**
   * @param pchUrn Mandatory java.lang.String parameter.
   */

  @VTID(8)
  void registerUrn(
    @MarshalAs(NativeType.Unicode) java.lang.String pchUrn);


  // Properties:
}
