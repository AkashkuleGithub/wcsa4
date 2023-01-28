package testNGPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	WebDriver driver;

  @Test
  @Parameters({"browservalue","url"})
  public void openBrowser(String browser,String url) {
	  
	if (browser.equals("chrome"));
		 {
			 System.setProperty("webdriver/chrome.driver","./drivers/chromedriver.exe");
				driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get(url);
  }
		 
			 
		 if(browser.equals("firefox"))
		 {
			 System.setProperty("webdriver/gecko.driver","./drivers/geckodriver.exe");
				driver =new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(url);
				
                         }
			 else
			 {
				 Reporter.log("enter valid browservalue",true);
			           }
         }
}
