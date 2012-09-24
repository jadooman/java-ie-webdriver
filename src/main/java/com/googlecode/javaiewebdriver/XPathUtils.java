package com.googlecode.javaiewebdriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XPathUtils
{
  private static final Pattern p = Pattern.compile("\\/[\\w]*|[^\\/]*|\\/");
  /**
   * Converts the given xpath express to uppercase tags. All tags in IE are
   * returned as upper case and if the xpath isn't converted, no tags will match
   * the xpath.
   */
  protected static String convertXPath(String xpath)
  {
    Matcher matcher = p.matcher(xpath);
    StringBuffer buffer = new StringBuffer();
    while (matcher.find())
    {
      String group = matcher.group();
      if (group.matches("\\/[\\w]*"))
      {
        buffer.append(group.toUpperCase());
      }
      else
      {
        buffer.append(group);
      }
    }
    return buffer.toString();
  }
}
