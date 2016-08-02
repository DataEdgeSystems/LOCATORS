package com.dataedge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsExample 
{
	@Test
  public void JenkinsTest()
  {
	  System.out.println("welcome to JENKINS world");
  
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    
    driver.get("www.facebook.com");
    System.out.println("title: "+driver.getTitle());
    
    driver.quit();
  
  }
}
