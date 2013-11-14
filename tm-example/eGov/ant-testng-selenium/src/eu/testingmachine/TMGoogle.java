package eu.testingmachine;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TMGoogle {

  @Test
  public void testGoogle() throws Exception {
    try {
      WebDriver driver = new AndroidDriver();
    
      // And now use this to visit Google
      driver.get("http://www.google.com");
    
      // Find the text input element by its name
      WebElement element = driver.findElement(By.name("q"));
    
      // Enter something to search for
      element.sendKeys("Cheese!");
    
      // Now submit the form. WebDriver will find the form for us from the element
      element.submit();
    
      // Check the title of the page
      System.out.println("Page title is: " + driver.getTitle());
      driver.quit();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
