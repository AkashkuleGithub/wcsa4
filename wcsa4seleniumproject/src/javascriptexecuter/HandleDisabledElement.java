package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///C:/Automation/wcsa4%20new/disabledweblement.html");
	    
	    
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    Thread.sleep(3000);
	  
	    
	    jse.executeScript("document.getElementById('i2').value='manager')");

	}

}
