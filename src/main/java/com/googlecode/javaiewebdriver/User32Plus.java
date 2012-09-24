package com.googlecode.javaiewebdriver;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.W32APIOptions;

/**
 * Additions to standard User32 API's.
 */
public interface User32Plus extends User32
{
  User32Plus INSTANCE = (User32Plus) Native.loadLibrary(User32Plus.class,
    W32APIOptions.UNICODE_OPTIONS);

  class HWINSTA extends PointerType
  {
    public HWINSTA()
    {
    }

    public HWINSTA(Pointer pointer)
    {
      super(pointer);
    }
  }

  HWINSTA CreateWindowStation(
    String winsta,
    int flags,
    int desiredAccess,
    SECURITY_ATTRIBUTES securityAttributes);

  boolean SetProcessWindowStation(HWINSTA windowStation);

  HWINSTA GetProcessWindowStation();

  class HDESK extends PointerType
  {
    public HDESK()
    {
    }

    public HDESK(Pointer pointer)
    {
      super(pointer);
    }
  }

  HDESK CreateDesktop(
    String desktop,
    String device,
    Pointer devmode,
    int flags,
    int desiredAccess,
    SECURITY_ATTRIBUTES securityAttributes);

  boolean CloseDesktop(HDESK hDesktop);

  boolean SetThreadDesktop(HDESK desktop);

  boolean SwitchDesktop(HDESK desktop);

  HDESK GetThreadDesktop(int threadId);

  class SECURITY_ATTRIBUTES extends Structure
  {
    int length;
    Pointer securityDescriptor;
    boolean inheritHandle;
  }

  int GetLastError();

  boolean PrintWindow(WinDef.HWND hwnd, WinDef.HDC hdcBlt, int nFlags);

  boolean IsIconic(HWND hwnd);

  WinDef.HWND GetDesktopWindow();
}
