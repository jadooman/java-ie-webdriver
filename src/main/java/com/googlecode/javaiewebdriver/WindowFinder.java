package com.googlecode.javaiewebdriver;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser.WNDENUMPROC;

public class WindowFinder implements WNDENUMPROC
{
  private HWND hwnd;
  private String atomClass;

  public WindowFinder(String atomClass)
  {
    this.atomClass = atomClass;
  }

  private static String toJavaString(char[] text)
  {
    StringBuffer buffer = new StringBuffer();
    for (int i = 0; i < text.length; i++)
    {
      if (text[i] != 0)
      {
        buffer.append(text[i]);
      }
      else
      {
        break;
      }
    }
    return buffer.toString();
  }

  @Override
  public boolean callback(HWND hwnd, Pointer data)
  {
    char buffer[] = new char[50];
    User32.INSTANCE.GetClassName(hwnd, buffer, buffer.length);
    String windowAtomClass = this.toJavaString(buffer);
    if (windowAtomClass.equals(atomClass))
    {
      this.hwnd = hwnd;
      return false;
    }
    return true;
  }

  public HWND getHwnd()
  {
    return hwnd;
  }
}
