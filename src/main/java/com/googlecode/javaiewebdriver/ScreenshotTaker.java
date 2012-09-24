package com.googlecode.javaiewebdriver;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;
import java.awt.image.DataBufferUShort;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

import org.apache.log4j.Logger;

import com.sun.jna.platform.win32.WinDef.HBITMAP;
import com.sun.jna.platform.win32.WinDef.HDC;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.RECT;
import com.sun.jna.platform.win32.WinGDI.BITMAPINFO;
import com.sun.jna.platform.win32.WinGDI.BITMAPINFOHEADER;
import com.sun.jna.platform.win32.WinNT.HANDLE;

/**
 * Utility that takes window screenshots via the win32 API. This screenshot
 * taker works even if the window is obscured.
 */
public class ScreenshotTaker
{
  private Logger logger = Logger.getLogger(ScreenshotTaker.class);
  private GDI32Plus gdi32 = GDI32Plus.INSTANCE;
  private User32Plus user32 = User32Plus.INSTANCE;

  public BufferedImage getScreenshot(HWND hwnd)
  {
    RECT winRect = new RECT();
    user32.GetWindowRect(hwnd, winRect);
    HDC windowDC = gdi32.GetDCEx(hwnd, null, GDI32Plus.DCX_WINDOW);
    Rectangle bounds = winRect.toRectangle();
    HBITMAP outputBitmap = gdi32.CreateCompatibleBitmap(windowDC, bounds.width, bounds.height);
    try
    {
      HDC blitDC = gdi32.CreateCompatibleDC(windowDC);
      try
      {
        HANDLE oldBitmap = gdi32.SelectObject(blitDC, outputBitmap);
        try
        {
          boolean success = user32.PrintWindow(hwnd, blitDC, 0);
          if (!success)
          {
            logger.error("Screenshot failed");
          }
        }
        finally
        {
          gdi32.SelectObject(blitDC, oldBitmap);
        }
        BITMAPINFO bi = new BITMAPINFO(40);
        bi.bmiHeader.biSize = 40;
        boolean ok = gdi32.GetDIBits(blitDC, outputBitmap, 0, bounds.height, (byte[]) null, bi,
          GDI32Plus.DIB_RGB_COLORS);
        if (ok)
        {
          BITMAPINFOHEADER bih = bi.bmiHeader;
          bih.biHeight = -Math.abs(bih.biHeight);
          bi.bmiHeader.biCompression = 0;
          return bufferedImageFromBitmap(blitDC, outputBitmap, bi);
        }
        else
        {
          return null;
        }
      }
      finally
      {
        gdi32.DeleteObject(blitDC);
      }
    }
    finally
    {
      gdi32.DeleteObject(outputBitmap);
    }
  }

  private BufferedImage bufferedImageFromBitmap(HDC blitDC, HBITMAP outputBitmap, BITMAPINFO bi)
  {
    BITMAPINFOHEADER bih = bi.bmiHeader;
    int height = Math.abs(bih.biHeight);
    final ColorModel cm;
    final DataBuffer buffer;
    final WritableRaster raster;
    int strideBits = (bih.biWidth * bih.biBitCount);
    int strideBytesAligned = (((strideBits - 1) | 0x1F) + 1) >> 3;
    final int strideElementsAligned;
    switch (bih.biBitCount)
    {
      case 16 :
        strideElementsAligned = strideBytesAligned / 2;
        cm = new DirectColorModel(16, 0x7C00, 0x3E0, 0x1F);
        buffer = new DataBufferUShort(strideElementsAligned * height);
        raster = Raster.createPackedRaster(buffer, bih.biWidth, height, strideElementsAligned,
          ((DirectColorModel) cm).getMasks(), null);
        break;
      case 32 :
        strideElementsAligned = strideBytesAligned / 4;
        cm = new DirectColorModel(32, 0xFF0000, 0xFF00, 0xFF);
        buffer = new DataBufferInt(strideElementsAligned * height);
        raster = Raster.createPackedRaster(buffer, bih.biWidth, height, strideElementsAligned,
          ((DirectColorModel) cm).getMasks(), null);
        break;
      default :
        throw new IllegalArgumentException("Unsupported bit count: " + bih.biBitCount);
    }
    final boolean ok;
    switch (buffer.getDataType())
    {
      case DataBuffer.TYPE_INT :
      {
        int[] pixels = ((DataBufferInt) buffer).getData();
        ok = gdi32.GetDIBits(blitDC, outputBitmap, 0, raster.getHeight(), pixels, bi, 0);
      }
        break;
      case DataBuffer.TYPE_USHORT :
      {
        short[] pixels = ((DataBufferUShort) buffer).getData();
        ok = gdi32.GetDIBits(blitDC, outputBitmap, 0, raster.getHeight(), pixels, bi, 0);
      }
        break;
      default :
        throw new AssertionError("Unexpected buffer element type: " + buffer.getDataType());
    }
    if (ok)
    {
      return new BufferedImage(cm, raster, false, null);
    }
    else
    {
      return null;
    }
  }
}
