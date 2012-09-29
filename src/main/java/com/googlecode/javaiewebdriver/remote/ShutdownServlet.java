package com.googlecode.javaiewebdriver.remote;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Handles the /shutdown url behavior. (Not a standard response for
 * DriverServlet)
 */
public class ShutdownServlet extends HttpServlet
{
  protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
    throws ServletException, IOException
  {
    Thread shutdownThread = new Thread()
      {
        public void run()
        {
          try
          {
            Thread.sleep(1500);
          }
          catch (InterruptedException e)
          {
            // ignore errors
          }
          System.exit(0);
        }
      };
    shutdownThread.start();
  }
}
