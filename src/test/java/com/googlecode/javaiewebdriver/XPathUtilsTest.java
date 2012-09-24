package com.googlecode.javaiewebdriver;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class XPathUtilsTest
{
  @Test
  public void testTags() {
    assertEquals("//SPAN[text()=\"Test Value1\"]", XPathUtils.convertXPath("//span[text()=\"Test Value1\"]"));
    assertEquals("//A/B", XPathUtils.convertXPath("//a/b"));
    assertEquals("//SPAN", XPathUtils.convertXPath("//span"));
    assertEquals("//DIV", XPathUtils.convertXPath("//div"));
    assertEquals("//H4", XPathUtils.convertXPath("//h4"));
    assertEquals("//A", XPathUtils.convertXPath("//a"));
    assertEquals("//LI", XPathUtils.convertXPath("//li"));
    assertEquals("//INPUT", XPathUtils.convertXPath("//input"));
    assertEquals("//BUTTON", XPathUtils.convertXPath("//button"));
    assertEquals("//SELECT", XPathUtils.convertXPath("//select"));
    assertEquals("//OPTION", XPathUtils.convertXPath("//option"));
    assertEquals("//DIV[@id='ruleSteps']/DIV/H4/INPUT", XPathUtils.convertXPath("//div[@id='ruleSteps']/div/h4/input"));
    assertEquals("//SPAN[contains(text(), 'Cancel')]", XPathUtils.convertXPath("//span[contains(text(), 'Cancel')]"));
  }
}
