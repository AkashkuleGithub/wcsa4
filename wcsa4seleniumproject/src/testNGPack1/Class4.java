package testNGPack1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class4 {
	static WebDriver driver;
	  @Test(enabled = true)
	  
	  public void automation() 
	  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https:www.google.com");
			driver.switchTo().activeElement().sendKeys("automation");
  }
}