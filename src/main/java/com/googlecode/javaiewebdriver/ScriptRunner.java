package com.googlecode.javaiewebdriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

public class ScriptRunner
{
  private static Logger logger = Logger.getLogger(ScriptRunner.class);

  static
  {
    try
    {
      File scriptFile = new File("file_ok.exe");
      if (!scriptFile.exists())
      {
        InputStream in = ScriptRunner.class.getResourceAsStream("file_ok.exe");
        FileOutputStream out = new FileOutputStream("file_ok.exe");
        IOUtils.copy(in, out);
        IOUtils.closeQuietly(out);
      }
    }
    catch (FileNotFoundException e)
    {
      throw new RuntimeException(e.getMessage(), e);
    }
    catch (IOException e)
    {
      throw new RuntimeException(e.getMessage(), e);
    }
  }

  protected static void runFileOkScript(String file)
  {
    try
    {
      String windowTitle = "Choose File to Upload";
      String script = "file_ok.exe";
      String exec = script + " \"" + windowTitle + "\" \"" + file + "\"";
      logger.info("Running script: " + exec);
      Runtime.getRuntime().exec(exec);
    }
    catch (IOException e)
    {
      throw new RuntimeException("Error running file_ok.exe.", e);
    }
  }
}
