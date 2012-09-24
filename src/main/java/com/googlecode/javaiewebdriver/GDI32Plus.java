package com.googlecode.javaiewebdriver;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.GDI32;
import com.sun.jna.platform.win32.WinDef.HBITMAP;
import com.sun.jna.platform.win32.WinDef.HDC;
import com.sun.jna.platform.win32.WinDef.HRGN;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinGDI.BITMAPINFO;

/**
 * Additions to standard GDI32 API's.
 */
public interface GDI32Plus extends GDI32
{
  public static final int DIB_RGB_COLORS = 0;

  GDI32Plus INSTANCE = (GDI32Plus) Native.loadLibrary(GDI32Plus.class);

  boolean BitBlt(
    HDC hdcDest,
    int nXDest,
    int nYDest,
    int nWidth,
    int nHeight,
    HDC hdcSrc,
    int nXSrc,
    int nYSrc,
    int dwRop);

  HDC GetDC(HWND hWnd);

  HDC GetDCEx(HWND hWnd, HRGN hrgnClip, int flags);

  boolean GetDIBits(
    HDC dc,
    HBITMAP bmp,
    int startScan,
    int scanLines,
    byte[] pixels,
    BITMAPINFO bi,
    int usage);

  boolean GetDIBits(
    HDC dc,
    HBITMAP bmp,
    int startScan,
    int scanLines,
    short[] pixels,
    BITMAPINFO bi,
    int usage);

  boolean GetDIBits(
    HDC dc,
    HBITMAP bmp,
    int startScan,
    int scanLines,
    int[] pixels,
    BITMAPINFO bi,
    int usage);
  int SRCCOPY = 0xCC0020;
  int DCX_WINDOW = 0x000001;
}
