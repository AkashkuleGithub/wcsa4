package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeft {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
	    
	    
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    Thread.sleep(3000);
	  
	    
	    jse.executeScript("window.scrollBy(-5000,0)");

	}

}
