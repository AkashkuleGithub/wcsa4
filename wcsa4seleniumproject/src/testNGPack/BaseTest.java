package testNGPack;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BaseTest {
      static WebDriver driver;
	@Test
  public void setup()
 {
	 System.setProperty("webdriver/chrome.driver","./drivers/chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://127.0.0.1/login.do");
 }
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
}
 
  }	
