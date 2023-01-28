package testNGParallelExection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser 
{
	WebDriver driver;
  @Test
  @Parameters("Browser")
  public void openBrowser(String browservalue) {
  
  if(browservalue.equals("chrome") )
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
  }
  
  else  
  {
  Reporter.log("Enter valid Browser",true);
           }
       }
}
  
