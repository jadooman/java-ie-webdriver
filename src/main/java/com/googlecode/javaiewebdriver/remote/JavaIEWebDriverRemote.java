package com.googlecode.javaiewebdriver.remote;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.openqa.selenium.remote.server.DriverServlet;

public class JavaIEWebDriverRemote
{
  /**
   * Launches this driver as a remote driver on port 3001. Point your remote
   * selenium at http://<hostname>:3001/wd.
   */
  public static void main(String args[]) throws Exception
  {
    Server server = new Server();

    ServletContextHandler handler = new ServletContextHandler();
    server.setHandler(handler);
    handler.setAttribute("org.openqa.selenium.remote.server.DriverServlet.sessions",
      new JavaIEDriverSessions());

    handler.addServlet(DriverServlet.class, "/wd/*");

    SelectChannelConnector connector = new SelectChannelConnector();
    connector.setPort(3001);
    server.addConnector(connector);

    server.start();
  }
}
