package com.googlecode.javaiewebdriver.remote;

import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.openqa.grid.selenium.GridLauncher;
import org.openqa.selenium.remote.server.DriverServlet;

public class JavaIEWebDriverRemote
{
  private static Logger logger = Logger.getLogger(JavaIEWebDriverRemote.class);

  /**
   * Launches this driver as a remote driver on port 3001. Point your remote
   * selenium at http://<hostname>:3001/wd.
   */
  public static void main(String args[]) throws Exception
  {
    boolean startGrid = false;
    for (int i = 0; i < args.length; i++)
    {
      if (args[i] != null && "-role".equals(args[i]))
      {
        startGrid = true;
      }
    }
    if (startGrid)
    {
      GridLauncher.main(args);
    }
    else
    {
      logger.warn("Grid parameters not found, launching stand-alone IE Driver Server");

      int port = 3001;
      for (int i = 0; i < args.length; i++)
      {
        if (args[i] != null && args[i].startsWith("--port="))
        {
          String portParam = args[i];
          int equals = portParam.indexOf('=');
          port = Integer.parseInt(args[i].substring(equals + 1, portParam.length()));
        }
      }

      final Server server = new Server();
      final JavaIEDriverSessions sessions = new JavaIEDriverSessions();

      Runtime.getRuntime().addShutdownHook(new Thread()
        {
          public void run()
          {
            try
            {
              server.stop();
            }
            catch (Exception e)
            {
              // ignore exceptions
            }
          }
        });

      ServletContextHandler handler = new ServletContextHandler();
      server.setHandler(handler);
      handler.setAttribute("org.openqa.selenium.remote.server.DriverServlet.sessions", sessions);

      handler.addServlet(DriverServlet.class, "/*");
      handler.addServlet(ShutdownServlet.class, "/shutdown");

      SelectChannelConnector connector = new SelectChannelConnector();
      connector.setPort(port);
      server.addConnector(connector);
      server.setGracefulShutdown(500);
      server.start();
    }
  }
}
