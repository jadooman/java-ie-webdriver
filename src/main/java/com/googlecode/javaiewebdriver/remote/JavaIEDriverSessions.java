package com.googlecode.javaiewebdriver.remote;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.remote.server.DefaultDriverFactory;
import org.openqa.selenium.remote.server.DefaultSession;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.remote.server.DriverSessions;
import org.openqa.selenium.remote.server.Session;

import com.googlecode.javaiewebdriver.JavaIEDriver;

/**
 * Copied directly from DefaultDriverSessions and modified to instantiate the
 * JavaIEDriver for ie.
 */
public class JavaIEDriverSessions implements DriverSessions
{
  private final DriverFactory factory;

  // TODO(simon): Replace with an actual factory. Or UUIDs.
  private static final AtomicLong sessionKeyFactory = new AtomicLong(System.currentTimeMillis());

  private final Map<SessionId, Session> sessionIdToDriver = new ConcurrentHashMap<SessionId, Session>();

  private static Map<Capabilities, String> defaultDrivers = new HashMap<Capabilities, String>()
    {
      {
        put(DesiredCapabilities.firefox(), FirefoxDriver.class.getName());
        put(DesiredCapabilities.chrome(), ChromeDriver.class.getName());
        put(DesiredCapabilities.internetExplorer(), JavaIEDriver.class.getName());
      }
    };

  public JavaIEDriverSessions()
  {
    this(Platform.getCurrent(), new DefaultDriverFactory());
  }

  protected JavaIEDriverSessions(Platform runningOn, DriverFactory factory)
  {
    this.factory = factory;
    registerDefaults(runningOn);
  }

  private void registerDefaults(Platform current)
  {
    for (Map.Entry<Capabilities, String> entry : defaultDrivers.entrySet())
    {
      Capabilities caps = entry.getKey();
      if (caps.getPlatform() != null && caps.getPlatform().is(current))
      {
        registerDriver(caps, entry.getValue());
      }
      else if (caps.getPlatform() == null)
      {
        registerDriver(caps, entry.getValue());
      }
    }
  }

  private void registerDriver(Capabilities caps, String className)
  {
    try
    {
      registerDriver(caps, Class.forName(className).asSubclass(WebDriver.class));
    }
    catch (ClassNotFoundException e)
    {
      // OK. Fall through. We just won't be able to create these
    }
    catch (NoClassDefFoundError e)
    {
      // OK. Missing a dependency, which is obviously a Bad Thing
      // TODO(simon): Log this!
    }
  }

  public SessionId newSession(Capabilities desiredCapabilities) throws Exception
  {
    SessionId sessionId = new SessionId(String.valueOf(sessionKeyFactory.getAndIncrement()));
    Session session = DefaultSession.createSession(factory, sessionId, desiredCapabilities);

    sessionIdToDriver.put(sessionId, session);

    return sessionId;
  }

  public Session get(SessionId sessionId)
  {
    return sessionIdToDriver.get(sessionId);
  }

  public void deleteSession(SessionId sessionId)
  {
    final Session removedSession = sessionIdToDriver.remove(sessionId);
    if (removedSession != null)
    {
      removedSession.close();
    }
  }

  public void registerDriver(Capabilities capabilities, Class<? extends WebDriver> implementation)
  {
    factory.registerDriver(capabilities, implementation);
  }

  public Set<SessionId> getSessions()
  {
    return Collections.unmodifiableSet(sessionIdToDriver.keySet());
  }
}
